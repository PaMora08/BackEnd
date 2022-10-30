package com.argpro.back.controller;

import com.argpro.back.Dto.dtoProyecto;
import com.argpro.back.model.Proyecto;
import com.argpro.back.model.Skill;
import com.argpro.back.security.Security.Controller.Mensaje;
import com.argpro.back.service.SProyecto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/proyectos")
@CrossOrigin (origins = "http://localhost:4200")
public class ProyectoController {
    @Autowired
    SProyecto proyServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> list(){
        return proyServ.list();
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyecto dtoProy){
        if(StringUtils.isBlank(dtoProy.getNombreProy()))
            return new ResponseEntity<>(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        if(proyServ.existsByNombreProy(dtoProy.getNombreProy()))
            return new ResponseEntity<>(new Mensaje("Ese proyecto ya existe"), HttpStatus.BAD_REQUEST);

        Proyecto proy = new Proyecto(dtoProy.getNombreProy(), dtoProy.getDescripcion(),dtoProy.getUrlProyecto(), dtoProy.getImgProyecto());
        proyServ.save(proy);
        return new ResponseEntity<>(new Mensaje("Proyecto agregado"), HttpStatus.OK);
    }

    @PutMapping("/update/{idProyecto}")
    public ResponseEntity<?> update(@RequestBody Proyecto proy){
            Proyecto editProy = proyServ.editarProy(proy);
            return new ResponseEntity<>(editProy, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{idProyecto}")

    public ResponseEntity<?> deleteProyecto(@PathVariable Long idProy ) {
        if(!proyServ.existsById(idProy))
            return new ResponseEntity<>(new Mensaje("no existe ese proyecto"), HttpStatus.NOT_FOUND);

        proyServ.delete(idProy);
        return new ResponseEntity<>(new Mensaje("proyecto eliminado"), HttpStatus.OK);
    }

    @GetMapping("/detail/{idProyecto}")
    public ResponseEntity<Proyecto> getById(@PathVariable("idProyecto") Long idProyecto){
        if(!proyServ.existsById(idProyecto))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Proyecto proy = proyServ.getOne(idProyecto).get();
        return new ResponseEntity(proy, HttpStatus.OK);
    }

}
