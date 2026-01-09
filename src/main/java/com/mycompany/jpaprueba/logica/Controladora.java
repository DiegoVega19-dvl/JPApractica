/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearAlumno(Alumno alu) {

        controlPersis.crearAlumno(alu);
    }

    public void eliminarAlumno(int id) {

        controlPersis.eliminarAlumno(id);

    }

    public void editarAlumno(Alumno alu) {

        controlPersis.editarAlumno(alu);

    }

    public Alumno traerAlumno(int id) {

        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList <Alumno> traerListaAlumno(){
    
        return controlPersis.traerListaAlumno();
    
    }
;

}
