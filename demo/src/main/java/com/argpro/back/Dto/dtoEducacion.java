package com.argpro.back.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

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
    private int fechaInicioEdu;
    private int fechaFinEdu;


    //Contructores


    public dtoEducacion() {
    }

    public dtoEducacion(String nombreInst, String tituloEdu, String imgEdu, int fechaInicioEdu, int fechaFinEdu) {
        this.nombreInst = nombreInst;
        this.tituloEdu = tituloEdu;
        this.imgEdu = imgEdu;
        this.fechaInicioEdu = fechaInicioEdu;
        this.fechaFinEdu = fechaFinEdu;
    }
    public String getTituloEdu() {
        return tituloEdu;
    }

    public int getFechaInicioEdu() {
        return fechaInicioEdu;
    }

    public int getFechaFinEdu() {
        return fechaFinEdu;
    }

    public String getImagenEdu() {
        return imgEdu;
    }

    public void setTituloEdu(String titulo) {
        this.tituloEdu = titulo;
    }


    public void setFechaInicioEdu(int fechaInicioEdu) {
        this.fechaInicioEdu = fechaInicioEdu;
    }

    public void setFechaFinEdu(int fechaFinEdu) {
        this.fechaFinEdu = fechaFinEdu;
    }

    public void setImagenEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

    public String getNombreInst() {return nombreInst; }
    public void setNombreInst() { this.nombreInst = nombreInst; }

}


