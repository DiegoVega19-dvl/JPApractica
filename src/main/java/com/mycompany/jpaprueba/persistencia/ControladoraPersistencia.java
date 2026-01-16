/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class ControladoraPersistencia {

    AlumnoJpaController alujpa = new AlumnoJpaController();
    CarreraJpaController carrejpa = new CarreraJpaController();

    public void crearAlumno(Alumno alu) {
        alujpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        alujpa.destroy(id);

    }

    public void editarAlumno(Alumno alu) {

        try {
            alujpa.edit(alu);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    public Alumno traerAlumno(int id) {
        return alujpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumno() {
        List<Alumno> lista = alujpa.findMiEntidadEntities();
        ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>(lista);

        return listaAlumno;
    }

    // metodos de carrera
    public void crearCarrera(Carrera carr) {
        carrejpa.create(carr);
    }

    public void eliminarCarrera(int id) {
        carrejpa.destroy(id);

    }

    public void editarCarrera(Carrera carr) {

        try {
            carrejpa.edit(carr);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    public Carrera traerCarrera(int id) {
        return carrejpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarrera() {
        List<Carrera> lista = carrejpa.findMiCarreraEntities();
        ArrayList<Carrera> listaCarrera = new ArrayList<Carrera>(lista);

        return listaCarrera;
    }

}
