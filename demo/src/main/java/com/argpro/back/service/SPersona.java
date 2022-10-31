package com.argpro.back.service;


import com.argpro.back.model.Persona;
import com.argpro.back.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SPersona {

    @Autowired
    PersonaRepo personaRepo;

    public Persona agregarPersona(Persona persona){
        return personaRepo.save(persona);
    }
    public Persona actualizarPersona(Persona persona){
        return personaRepo.save(persona);
    }

    public void delete(Long idPersona){
        personaRepo.deleteById(idPersona);
    }

    public  boolean existsById(Long idPersona){
        return personaRepo.existsById(idPersona);
    }

    public boolean existsByName(String nombre){
        return personaRepo.existsByNombre(nombre);
    }

  public Iterable<Persona> buscarPersona(){
      return personaRepo.findAll();
  }

}
