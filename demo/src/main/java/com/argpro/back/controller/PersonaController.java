package com.argpro.back.controller;


import com.argpro.back.model.Persona;
import com.argpro.back.service.SPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/persona")
//@CrossOrigin
public class PersonaController {
    @Autowired
    private SPersona sPersona;

    @GetMapping("persona/id/{id}")
    public ResponseEntity<Persona> buscarPersonaPorId(@PathVariable Long id){
        return new ResponseEntity<>(sPersona.buscarPersonaPorId(id), HttpStatus.OK);
    }

    @PutMapping("persona/editar")
    public ResponseEntity<Persona> actualizarPersona(@RequestBody Persona persona){
        Persona editPersona = sPersona.actualizarPersona(persona);
        return new ResponseEntity<>(editPersona, HttpStatus.OK);
    }

}
