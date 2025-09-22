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
public class Pedido {
    Cliente cliente;
    Producto producto;
    Vendedor vendedor;
    int cantidad;
    LocalDate fechaPedido;

    public Pedido(Cliente cliente, Producto producto, Vendedor vendedor, int cantidad, LocalDate fechaPedido) {
        this.cliente = cliente;
        this.producto = producto;
        this.vendedor = vendedor;
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
    }

    public int calcularTotalBruto() {
        return cantidad * producto.precioUnitario;
    }

    public double calcularDescuento() {
        int bruto = calcularTotalBruto();
        double descuento = 0;

        // descuento por edad
        if (cliente.edad > 65) {
            descuento = bruto * 0.5;
            bruto -= descuento;
        }

        // descuentos por monto
        if (bruto > 120000) {
            descuento += bruto * 0.25;
        } else if (bruto > 60000) {
            descuento += bruto * 0.15;
        }

        return descuento;
    }

    public double calcularTotalNeto() {
        return calcularTotalBruto() - calcularDescuento();
    }

    public String estadoPedido() {
        if (cliente.esValido() && vendedor.esValido() && producto.esValido()) {
            return "Confirmado";
        }
        return "Pendiente";
    }
}
