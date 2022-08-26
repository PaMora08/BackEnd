package com.argpro.back.service;

import com.argpro.back.model.Educacion;
import com.argpro.back.model.Proyecto;
import com.argpro.back.repository.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SProyecto {
    @Autowired
    ProyectoRepo proyRepo;
    public List<Proyecto> list(){
        return proyRepo.findAll();
    }
    public Optional<Proyecto> getOne(Long idProyecto){
        return proyRepo.findById(idProyecto);
    }
    public  Optional<Proyecto> getByNombreProyecto(String nombreProy){
        return proyRepo.findByNombreProy(nombreProy);
    }
    public void save(Proyecto proy){
        proyRepo.save(proy);
    }
    public void delete(Long idProyecto){
        proyRepo.deleteById(idProyecto);
    }
    public boolean existsByNombreProy(String nombreProy){
        return proyRepo.existsByNombreProy(nombreProy);
    }
    public boolean existsById(Long idProyecto) {
        return proyRepo.existsById(idProyecto);
    }
}
