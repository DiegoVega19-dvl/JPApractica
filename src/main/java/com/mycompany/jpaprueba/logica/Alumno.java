/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.logica;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author diego
 */
@Entity
public class Alumno {
    
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private Date fechaNaci;
    
    public Alumno(){
        
    }

    public Alumno(int id,String nombre, String apellido, int edad, Date fechaNaci) {
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNaci = fechaNaci;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(Date fechaNaci) {
        this.fechaNaci = fechaNaci;
    }
    
    
}
