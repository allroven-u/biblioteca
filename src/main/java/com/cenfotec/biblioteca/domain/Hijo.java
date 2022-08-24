package com.cenfotec.biblioteca.domain;

import javax.persistence.*;

@Entity
public class Hijo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nombre;
    private String tipoPlan;
    private String alergias;

    public Hijo() {
    }

    @ManyToOne
    private Padre padre;

    public Padre getPadre() {
        return padre;
    }
    public void setPadre(Padre padre) {
        this.padre = padre;
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

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}
