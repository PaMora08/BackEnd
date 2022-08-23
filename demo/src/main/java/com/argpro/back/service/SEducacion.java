/*package com.argpro.back.service;

import com.argpro.back.model.Educacion;
import com.argpro.back.model.Experiencia;
import com.argpro.back.repository.EducacionRepo;
import com.argpro.back.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class SEducacion {

    @Autowired
    EducacionRepo eduRepo;

    public List<Educacion> list(){
        return eduRepo.findAll();
    }
    public Optional<Educacion> getOne(Long idEdu){
        return eduRepo.findById(idEdu);
    }
    public  Optional<Educacion> getByNombreEdu(String nombreEdu){
        return eduRepo.findByNombreEdu(nombreEdu);
    }
    public void save(Educacion educacion){
        eduRepo.save(educacion);
    }
    public void delete(Long idEdu){
        eduRepo.deleteById(idEdu);
    }
    public boolean existsByNombreEdu(String nombreEdu){
        return eduRepo.existsByNombreEdu(nombreEdu);
    }
    public  boolean existsById(Long idEdu){
        return eduRepo.existsById(idEdu);
    }
}
*/

