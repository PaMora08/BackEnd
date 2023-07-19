package com.argpro.back.Dto;

import lombok.Setter;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    @NotBlank
    @Getter @Setter public String nombreProy;
    @NotBlank
    @Getter @Setter public String descripcion;
    @NotBlank
    @Getter @Setter public String urlProyecto;
    @Getter @Setter public String imgProyecto;


    public dtoProyecto() {
    }

    public dtoProyecto(String nombreProy, String descripcion, String urlProyecto, String imgProyecto) {
        this.nombreProy = nombreProy;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
        this.imgProyecto = imgProyecto;
    }
    
}
