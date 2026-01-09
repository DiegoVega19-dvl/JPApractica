/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diego
 */
public class JPAprueba {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        //Alumno alu = new Alumno(03, "Ana", "todocode", 25, new Date());
        //control.crearAlumno(alu);
        //control.eliminarAlumno(1);
        /*alu.setApellido("de Paula");
        control.editarAlumno(alu);*/
        Alumno alu = control.traerAlumno(2);
        System.out.println("busqueda individual");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        System.out.println("el alumno es: " + alu.toString());
        
        System.out.println("-------------------------------------------------");

        System.out.println("busqueda grupal");
        ArrayList<Alumno> listaAlumno = control.traerListaAlumno();

        for (Alumno lis : listaAlumno) {

            System.out.println(lis.toString());
        }

    }
}
