package com.argpro.back.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Setter
@Getter
@Entity
public class Educacion {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long idEdu;
    @NotBlank
    private String nombreInst;
    @NotBlank
    private String tituloEdu;
    private String imgEdu;
    private Date fechaInicioEdu;
    private Date fechaFinEdu;

    public Educacion() {
    }

    public Educacion(String nombreInst, String tituloEdu, String imgEdu, Date fechaInicioEdu, Date fechaFinEdu) {
        this.nombreInst = nombreInst;
        this.tituloEdu = tituloEdu;
        this.imgEdu = imgEdu;
        this.fechaInicioEdu = fechaInicioEdu;
        this.fechaFinEdu = fechaFinEdu;
    }
}
