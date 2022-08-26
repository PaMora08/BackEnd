package com.argpro.back.controller;

import com.argpro.back.Dto.dtoExperiencia;
import com.argpro.back.model.Experiencia;
import com.argpro.back.security.Security.Controller.Mensaje;
import com.argpro.back.service.SExperiencia;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/laboral")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired
    SExperiencia sExperiencia;
    @GetMapping("/listaExperiencia")
    @ResponseBody
    public List<Experiencia> list(){
        return sExperiencia.list();
    }

    @PostMapping("/createExperiencia")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoExpe){
        if(StringUtils.isBlank(dtoExpe.getNombreExp()))
            return new ResponseEntity<>(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        if(sExperiencia.existsByNombreExp(dtoExpe.getNombreExp()))
           return new ResponseEntity<>(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);

        Experiencia experiencia = new Experiencia(dtoExpe.getNombreExp(), dtoExpe.getFechaInicioExp(), dtoExpe.getFechaFinExp(),
        dtoExpe.getDescripcionExp());
        sExperiencia.save(experiencia);
        return new ResponseEntity<>(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<?> update( @RequestBody Experiencia experiencia){
    Experiencia actualizarExp = sExperiencia.editarExperiencia(experiencia);
    return new ResponseEntity<>(actualizarExp, HttpStatus.OK);

    }
    @DeleteMapping("/delete/{idExp}")

    public String deleteExperiencia(@PathVariable Long idExp ) {
        if (sExperiencia.existsById(idExp)) {//Valida si existe el id
            sExperiencia.delete(idExp);
            return "Experiencia eliminada";}

        return "El id no existe";

    }

}
