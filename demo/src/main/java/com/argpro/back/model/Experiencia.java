
package com.argpro.back.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Getter
@Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idExp;
    private String nombreExp;
    private Date fechaInicioExp;
    private Date fechaFinExp;
    private String descripcionExp;

    public Experiencia() {
    }

    public Experiencia(String nombreExp, Date fechaInicioExp, Date fechaFinExp, String descripcionExp) {
        this.nombreExp = nombreExp;
        this.fechaInicioExp = fechaInicioExp;
        this.fechaFinExp = fechaFinExp;
        this.descripcionExp = descripcionExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public Date getFechaInicioExp() {
        return fechaInicioExp;
    }

    public void setFechaInicioExp(Date fechaInicioExp) {
        this.fechaInicioExp = fechaInicioExp;
    }

    public Date getFechaFinExp() {
        return fechaFinExp;
    }

    public void setFechaFinExp(Date fechaFinExp) {
        this.fechaFinExp = fechaFinExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

}
