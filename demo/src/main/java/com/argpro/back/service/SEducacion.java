package com.argpro.back.service;

import com.argpro.back.model.Educacion;
import com.argpro.back.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class SEducacion {

    @Autowired
    EducacionRepo eduRepo;

    public List<Educacion> list(){
        return eduRepo.findAll();
    }
    public Optional<Educacion> getOne(Long idEdu){
        return eduRepo.findById(idEdu);
    }
    public  Optional<Educacion> getByNombreIns(String nombreInst){
        return eduRepo.findByNombreInst(nombreInst);
    }
    public void save(Educacion educacion){
        eduRepo.save(educacion);
    }
    public void delete(Long idEdu){
        eduRepo.deleteById(idEdu);
    }
    /*public boolean existsByTituloEdu(String titulo){
        return eduRepo.existsByTituloEdu(titulo);
    }*/
    public  boolean existsById(Long idEdu){
        return eduRepo.existsById(idEdu);
    }

    public boolean existsByTituloEdu(String tituloEdu) {
        return eduRepo.existsByTituloEdu(tituloEdu);
    }
}


