package com.sinensia.alumnos.modelo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "ALUMNOS")
public class Alumno {

    @Id
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int nota;

    public Alumno() {

    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", nota=" + nota +
                '}';
    }
}
