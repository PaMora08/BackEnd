package com.argpro.back.controller;


import com.argpro.back.model.Persona;
import com.argpro.back.service.SPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired
    private SPersona sPersona;

    @GetMapping("/traer")
    @ResponseBody
    public List<Persona> buscarPersona(){
        return sPersona.buscarPersona();
    }

    @PutMapping("/editar")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Persona> actualizarPersona(@RequestBody Persona persona){
        Persona editPersona = sPersona.actualizarPersona(persona);
        return new ResponseEntity<>(editPersona, HttpStatus.OK);
    }

}
