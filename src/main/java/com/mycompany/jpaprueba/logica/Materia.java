/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author diego
 */

@Entity
public class Materia implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    private String nombre;
    private String tipo;
    
    @ManyToOne
    private Carrera carr;

    public Materia() {
    }

    public Materia(int id, String nombre, String tipo, Carrera carr) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.carr = carr;
    }

    public Carrera getCarr() {
        return carr;
    }

    public void setCarr(Carrera carr) {
        this.carr = carr;
    }
    
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
