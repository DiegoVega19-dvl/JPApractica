/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.Date;

/**
 *
 * @author diego
 */
public class JPAprueba {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        Alumno alu = new Alumno(02, "Luisina", "todocode", 30, new Date());

        control.crearAlumno(alu);

    }
}
