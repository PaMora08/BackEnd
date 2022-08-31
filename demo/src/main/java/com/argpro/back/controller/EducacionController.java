package com.argpro.back.controller;

import com.argpro.back.Dto.dtoEducacion;
import com.argpro.back.model.Educacion;
import com.argpro.back.security.Security.Controller.Mensaje;
import com.argpro.back.service.SEducacion;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/edu")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    @Autowired
    SEducacion sEdu;

    @GetMapping("/lista")
    @ResponseBody
    public List<Educacion> list(){
        return sEdu.list();
    }

    @PostMapping("/createEducacion")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoEdu){
        if(StringUtils.isBlank(dtoEdu.getTituloEdu()))
            return new ResponseEntity<>(new Mensaje("El título es obligatorio"), HttpStatus.BAD_REQUEST);

        if(sEdu.existsByTituloEdu(dtoEdu.getTituloEdu()))
            return new ResponseEntity<>(new Mensaje("Esa educación ya existe"), HttpStatus.BAD_REQUEST);

        Educacion educacion = new Educacion(dtoEdu.getNombreInst(), dtoEdu.getTituloEdu(),dtoEdu.getImagenEdu(),
                dtoEdu.getFechaInicioEdu(), dtoEdu.getFechaFinEdu());
        sEdu.save(educacion);
        return new ResponseEntity<>(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Educacion> update(@RequestBody Educacion edu){
        Educacion actualizarEdu = sEdu.save(edu);
        return new ResponseEntity<>(actualizarEdu, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{idEdu}")

    public String deleteEducacion(@PathVariable ("idEdu") Long idEdu ) {
        if (sEdu.existsById(idEdu)) {//Valida si existe el id
            sEdu.delete(idEdu);
            return "Educación eliminada";}

        return "El id no existe";

    }


}
