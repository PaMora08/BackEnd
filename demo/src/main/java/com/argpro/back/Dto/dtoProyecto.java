package com.argpro.back.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
public class dtoProyecto {
    @NotBlank
    public String nombreProy;
    @NotBlank
    public String descripcion;
    @NotBlank
    public String urlProyecto;
    public String imgProyecto;


    public dtoProyecto() {
    }

    public dtoProyecto(String nombreProy, String descripcion, String urlProyecto, String imgProyecto) {
        this.nombreProy = nombreProy;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
        this.imgProyecto = imgProyecto;
    }
}
