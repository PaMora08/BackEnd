package com.argpro.back.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class dtoSkill {
    private Long idSkill;
    private String nombreSkill;
    private String imgSkill;

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getImgSkill() {
        return imgSkill;
    }

    public void setImgSkill(String imgSkill) {
        this.imgSkill = imgSkill;
    }
}
