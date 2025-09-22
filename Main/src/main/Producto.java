/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author vicen
 */
public class Producto {
    String codigo;
    String nombre;
    String tipo; 
    int precioUnitario;

    public Producto(String codigo, String nombre, String tipo, int precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioUnitario = precioUnitario;
    }

    public boolean esValido() {
        return tipo.equals("Maleta") || tipo.equals("Mochila") || tipo.equals("Bolso");
    }    
}
