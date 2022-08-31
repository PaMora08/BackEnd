package com.argpro.back.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPersona;
    private String nombre;
    private String imgFondo;
    private String imgPerfil;
    private String posicion;
    private String ubicacion;
    private String acercaDe;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> expList;
   /* @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skills> skillList;*/
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> eduList;

    //Constructores


    public Persona() {
    }

    public Persona(String nombre, String imgFondo, String imgPerfil, String posicion, String ubicacion, String acercaDe) {
        this.nombre = nombre;
        this.imgFondo = imgFondo;
        this.imgPerfil = imgPerfil;
        this.posicion = posicion;
        this.ubicacion = ubicacion;
        this.acercaDe = acercaDe;
    }
}
