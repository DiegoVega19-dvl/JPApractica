/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.Date;

/**
 *
 * @author diego
 */
public class JPAprueba {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        Carrera carre = new Carrera(01, "sistemas");
        control.crearCarrera(carre);

        Alumno alu2 = new Alumno(06, "Luisina", "todocode", 30, new Date(), carre);
        control.crearAlumno(alu2);

        Alumno al = control.traerAlumno(06);

        System.out.println("-----------------------------------");
        System.out.println("------- DATOS DEL ALUMNO ----------");
        System.out.println("Alumno: " + al.getNombre() + " " + al.getApellido());
        System.out.println("Carrera en curso: " + al.getCarrera().getNombre());

    }
}
