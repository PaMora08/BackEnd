package com.argpro.back.controller;

import com.argpro.back.Dto.dtoSkill;
import com.argpro.back.model.Experiencia;
import com.argpro.back.model.Skill;
import com.argpro.back.repository.SkillRepo;
import com.argpro.back.security.Security.Controller.Mensaje;
import com.argpro.back.service.ServiSkill;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/skill")
@CrossOrigin(origins = "https://portfoliopamorales.web.app")
public class SkillController {

    @Autowired
    SkillRepo skillRepo;
    @Autowired
    ServiSkill serviSkill;

    @GetMapping("/list")
    @ResponseBody
    public Iterable<Skill> buscarSkill(){
        return serviSkill.list();
    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> create(@RequestBody dtoSkill skillDto){
        if(StringUtils.isBlank(skillDto.getNombreSkill()))
            return new ResponseEntity<>(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        if(serviSkill.existsByNombreSkill(skillDto.getNombreSkill()))
            return new ResponseEntity<>(new Mensaje("Esa skill ya existe"), HttpStatus.BAD_REQUEST);

        Skill skill = new Skill(skillDto.getNombreSkill(), skillDto.getImgSkill());
        serviSkill.save(skill);
        return new ResponseEntity<>(new Mensaje("Skill agregada"), HttpStatus.OK);
    }

    @PutMapping("/update")
    @ResponseBody
    public ResponseEntity<Skill> actualizarSkill(@RequestBody Skill skill){
        Skill editSkill = skillRepo.save(skill);
        return new ResponseEntity<>(editSkill, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{idSkill}")
    @ResponseBody
    public ResponseEntity<?> deleteSkill(@PathVariable Long idSkill ) {
        if (serviSkill.existsById(idSkill)) {//Valida si existe el id
            serviSkill.delete(idSkill);
            return new ResponseEntity<>(new Mensaje("proyecto eliminado"), HttpStatus.OK);}

        return new ResponseEntity<>(new Mensaje("no existe ese proyecto"), HttpStatus.NOT_FOUND);
    }

    @GetMapping("/detail/{idSkill}")
    public ResponseEntity<Skill> getById(@PathVariable("idSkill") Long idSkill){
        if(!serviSkill.existsById(idSkill))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Skill skill = serviSkill.getOne(idSkill).get();
        return new ResponseEntity(skill, HttpStatus.OK);
    }

}
