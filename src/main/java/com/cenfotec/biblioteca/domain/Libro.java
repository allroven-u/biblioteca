package com.cenfotec.biblioteca.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "autor", nullable = false)
    private String autor;

    @Column(name = "estado", nullable = false)
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
