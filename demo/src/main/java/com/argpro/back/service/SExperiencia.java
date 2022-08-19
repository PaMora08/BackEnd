package com.argpro.back.service;


import com.argpro.back.model.Experiencia;
import com.argpro.back.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    ExperienciaRepo rExperiencia;

    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
    public Optional<Experiencia> getOne(Long idExp){
        return rExperiencia.findById(idExp);
    }
    public  Optional<Experiencia> getByNombreExp(String nombreExp){
        return rExperiencia.findByNombreExp(nombreExp);
    }
    public void save(Experiencia experiencia){
        rExperiencia.save(experiencia);
    }
    public void delete(Long idExp){
        rExperiencia.deleteById(idExp);
    }
    public boolean existsByNombreExp(String nombreExp){
        return rExperiencia.existsByNombreExp(nombreExp);
    }
    public  boolean existsById(Long idExp){
        return rExperiencia.existsById(idExp);
    }
}
