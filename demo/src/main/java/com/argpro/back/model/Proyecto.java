package com.argpro.back.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long idProyecto;
    public String nombreProy;
    public String descripcion;
    public String urlProyecto;
    public String imgProyecto;

    public Proyecto() {
    }

    public Proyecto(String nombreProy, String descripcion, String urlProyecto, String imgProyecto) {
        this.nombreProy = nombreProy;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
        this.imgProyecto = imgProyecto;
    }
}
