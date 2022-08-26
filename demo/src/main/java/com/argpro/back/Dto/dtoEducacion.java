package com.argpro.back.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Getter
@Setter
public class dtoEducacion {
    @NotBlank
    private String nombreInst;
    @NotBlank
    private String tituloEdu;
    @NotBlank
    private String imgEdu;
    @NotBlank
    private Date fechaInicioEdu;
    private Date fechaFinEdu;


    //Contructores


    public dtoEducacion() {
    }

    public dtoEducacion(String nombreInst, String tituloEdu, String imgEdu, Date fechaInicioEdu, Date fechaFinEdu) {
        this.nombreInst = nombreInst;
        this.tituloEdu = tituloEdu;
        this.imgEdu = imgEdu;
        this.fechaInicioEdu = fechaInicioEdu;
        this.fechaFinEdu = fechaFinEdu;
    }
    public String getTituloEdu() {
        return tituloEdu;
    }

    public Date getFechaInicioEdu() {
        return fechaInicioEdu;
    }

    public Date getFechaFinEdu() {
        return fechaFinEdu;
    }

    public String getImagenEdu() {
        return imgEdu;
    }

    public void setTituloEdu(String titulo) {
        this.tituloEdu = titulo;
    }


    public void setFechaInicioEdu(Date fechaInicioEdu) {
        this.fechaInicioEdu = fechaInicioEdu;
    }

    public void setFechaFinEdu(Date fechaFinEdu) {
        this.fechaFinEdu = fechaFinEdu;
    }

    public void setImagenEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

    public String getNombreInst() {return nombreInst; }
    public void setNombreInst() { this.nombreInst = nombreInst; }

}


