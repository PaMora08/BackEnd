package com.argpro.back.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Setter
@Getter
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idSkill;
    @NotBlank
    private String nombreSkill;
    @NotBlank
    private String imgSkill;

    public Skill() {
    }

    public Skill(String nombreSkill, String imgSkill) {
        this.nombreSkill = nombreSkill;
        this.imgSkill = imgSkill;
    }
}
