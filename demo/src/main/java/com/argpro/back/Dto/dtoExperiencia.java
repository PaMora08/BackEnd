package com.argpro.back.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Getter
@Setter
public class dtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String descripcionExp;
    private Date fechaInicioExp;
    private Date fechaFinExp;
    private String imagenExp;

    //Constructores


    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String descripcionExp, Date fechaInicioExp, Date fechaFinExp, String imagenExp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
        this.fechaInicioExp = fechaInicioExp;
        this.fechaFinExp = fechaFinExp;
        this.imagenExp = imagenExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public Date getFechaInicioExp() {
        return fechaInicioExp;
    }

    public Date getFechaFinExp() {
        return fechaFinExp;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

    public void setFechaInicioExp(Date fechaInicioExp) {
        this.fechaInicioExp = fechaInicioExp;
    }

    public void setFechaFinExp(Date fechaFinExp) {
        this.fechaFinExp = fechaFinExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }
}
