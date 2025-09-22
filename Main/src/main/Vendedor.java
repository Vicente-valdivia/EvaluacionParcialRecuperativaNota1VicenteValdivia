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
public class Vendedor {
    String rut;
    String nroVendedor;
    String nombre;
    LocalDate fechaIngreso;
    Zona zona;

    public Vendedor(String rut, String nroVendedor, String nombre, LocalDate fechaIngreso, Zona zona) {
        this.rut = rut;
        this.nroVendedor = nroVendedor;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.zona = zona;
    }

    public boolean esValido() {
        return nombre != null && !nombre.equals("") && !fechaIngreso.isAfter(LocalDate.now());
    }

    boolean esValido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}   

