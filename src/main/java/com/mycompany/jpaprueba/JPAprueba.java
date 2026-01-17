/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class JPAprueba {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();

        Carrera carre1 = new Carrera(02, "ingenieria de software", listaMaterias);
        control.crearCarrera(carre1);

        Materia mate1 = new Materia(01, "matematicas 1", "semestral", carre1);
        Materia mate2 = new Materia(02, "programacion 1", "semestral", carre1);
        Materia mate3 = new Materia(03, "estructuras de datos", "semestral", carre1);

        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);

        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);

        carre1.setListaMaterias(listaMaterias);
        control.editarCarrera(carre1);

        Alumno alu = new Alumno(06, "Luisina", "todocode", 30, new Date(), carre1);
        control.crearAlumno(alu);

        Alumno al = control.traerAlumno(06);

        System.out.println("-----------------------------------");
        System.out.println("------- DATOS DEL ALUMNO ----------");
        System.out.println("Alumno: " + al.getNombre() + " " + al.getApellido());
        System.out.println("Carrera en curso: " + al.getCarrera().getNombre());

    }
}
