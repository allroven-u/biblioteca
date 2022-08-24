package com.cenfotec.biblioteca.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Padre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String cedula;
    private String dirección;
    private String teléfonoPrimario;
    private String telefonoSecundario;


    @OneToMany( mappedBy="padre")
    private List<Hijo> hijos;

    public Padre() {
    }

    public Padre(long id, String nombre, String cedula, String dirección, String teléfonoPrimario, String telefonoSecundario) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.dirección = dirección;
        this.teléfonoPrimario = teléfonoPrimario;
        this.telefonoSecundario = telefonoSecundario;
    }

    public List<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(List<Hijo> hijos) {
        this.hijos = hijos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfonoPrimario() {
        return teléfonoPrimario;
    }

    public void setTeléfonoPrimario(String teléfonoPrimario) {
        this.teléfonoPrimario = teléfonoPrimario;
    }

    public String getTelefonoSecundario() {
        return telefonoSecundario;
    }

    public void setTelefonoSecundario(String telefonoSecundario) {
        this.telefonoSecundario = telefonoSecundario;
    }
}
