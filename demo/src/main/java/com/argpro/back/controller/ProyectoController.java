package com.argpro.back.controller;

import com.argpro.back.Dto.dtoEducacion;
import com.argpro.back.Dto.dtoProyecto;
import com.argpro.back.model.Educacion;
import com.argpro.back.model.Proyecto;
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
    public ResponseEntity<?> update(@PathVariable Long idProyecto, @RequestBody dtoProyecto dtoProy){
        if(!proyServ.existsById(idProyecto)) //Valida si existe el id
            return new ResponseEntity<>(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);

        if(proyServ.existsByNombreProy(dtoProy.getNombreProy())&&
                proyServ.getByNombreProyecto(dtoProy.getNombreProy()).get().getIdProyecto() != idProyecto)
            return new ResponseEntity<>(new Mensaje("Ese proyecto ya existe"), HttpStatus.BAD_REQUEST);

        if(StringUtils.isBlank(dtoProy.getNombreProy()))
            return new ResponseEntity<>(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        Proyecto proy = proyServ.getOne(idProyecto).get();
        proy.setNombreProy(dtoProy.getNombreProy());
        proy.setDescripcion(dtoProy.getDescripcion());
        proy.setUrlProyecto(dtoProy.getUrlProyecto());
        proyServ.save(proy);
        return new ResponseEntity<>(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idProyecto}")

    public String deleteProyecto(@PathVariable Long idProyecto ) {
        if (proyServ.existsById(idProyecto)) {//Valida si existe el id
            proyServ.delete(idProyecto);
            return "Proyecto eliminado";}

        return "El id no existe";

    }

}
