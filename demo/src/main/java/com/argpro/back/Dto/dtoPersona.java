package com.argpro.back.Dto;


import com.argpro.back.model.Educacion;
import com.argpro.back.model.Experiencia;
import com.argpro.back.model.Skill;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
public class dtoPersona {
    private String nombre;
    private String imgFondo;
    private String imgPerfil;
    private String posicion;
    private String ubicacion;
    private String acercaDe;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> expList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> eduList;
}
