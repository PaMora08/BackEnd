/*package com.argpro.back.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Setter
@Getter
@Entity
public class Educacion {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long idEdu;
    private String nombre;
    private String titulo;
    private String imgEdu;
    private Date fechaInicioEdu;
    private Date fechaFinEdu;

    public Educacion() {
    }

    public Educacion(String nombre, String titulo, String imgEdu, Date fechaInicioEdu, Date fechaFinEdu) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.imgEdu = imgEdu;
        this.fechaInicioEdu = fechaInicioEdu;
        this.fechaFinEdu = fechaFinEdu;
    }
}
*/