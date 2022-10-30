package com.argpro.back.service;

import com.argpro.back.model.Skill;
import com.argpro.back.repository.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Transactional
public class ServiSkill {
    @Autowired
    SkillRepo skillRepo;

    public Iterable<Skill> list(){
        return skillRepo.findAll();
    }


    public void delete(Long idSkill){
        skillRepo.deleteById(idSkill);
    }

    public  boolean existsById(Long idSkill){
        return skillRepo.existsById(idSkill);
    }

    public boolean existsByNombreSkill(String nombreSkill) {
        return skillRepo.existsByNombreSkill(nombreSkill);
    }

    public void save(Skill skill) {
        skillRepo.save(skill);
    }

    public Optional<Skill> getOne(Long idSkill) { return skillRepo.findById(idSkill);
    }
}
