/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;

/**
 *
 * @author vicen
 */
public class Cliente {
    String rut;
    String nombre;
    int edad;
    LocalDate fechaNacimiento;

    public Cliente(String rut, String nombre, int edad, LocalDate fechaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean esValido() {
        return nombre != null && !nombre.equals("") && edad >= 18 && edad < 80;
    }
}

