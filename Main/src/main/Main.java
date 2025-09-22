/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author vicen
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = null;
        Vendedor vendedor = null;
        Producto producto = null;
        Zona zona = null;

        int opcion;
        do {
            System.out.println("=== SISTEMA DE PEDIDOS DE EQUIPAJE Y ACCESORIOS DE VIAJE ===");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Vendedor");
            System.out.println("3. Ingresar Producto");
            System.out.println("4. Generar Pedido");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ingrese su rut: ");
                    String rutC = sc.nextLine();
                    System.out.print("ingrese su nombre: ");
                    String nombreC = sc.nextLine();
                    System.out.print("ingrese su edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ingrese su fecha nacimiento (AAAA-MM-DD): ");
                    LocalDate fechaN = LocalDate.parse(sc.nextLine());
                    cliente = new Cliente(rutC, nombreC, edad, fechaN);
                    System.out.println("Cliente registrado.\n");
                    break;

                case 2:
                    System.out.print("ingrese su rut: ");
                    String rutV = sc.nextLine();
                    System.out.print("ingrese su nro Vendedor: ");
                    String nroV = sc.nextLine();
                    System.out.print("ingrese su nombre: ");
                    String nombreV = sc.nextLine();
                    System.out.print("Ingrese su fecha ingreso (AAAA-MM-DD): ");
                    LocalDate fechaI = LocalDate.parse(sc.nextLine());
                    System.out.print("ingrese su nro zona: ");
                    String nroZ = sc.nextLine();
                    System.out.print("ingrese nombre zona: ");
                    String nomZ = sc.nextLine();
                    System.out.print("ingrese su ciudad Principal: ");
                    String ciudadZ = sc.nextLine();
                    zona = new Zona(nroZ, nomZ, ciudadZ);
                    vendedor = new Vendedor(rutV, nroV, nombreV, fechaI, zona);
                    System.out.println("Vendedor registrado.\n");
                    break;

                case 3:
                    System.out.print("ingrese su código: ");
                    String codP = sc.nextLine();
                    System.out.print("ingrese su nombre: ");
                    String nomP = sc.nextLine();
                    System.out.print("Tipo (Maleta/Mochila/Bolso): ");
                    String tipoP = sc.nextLine();
                    System.out.print("Precio unitario: ");
                    int precioP = sc.nextInt();
                    sc.nextLine();
                    producto = new Producto(codP, nomP, tipoP, precioP);
                    System.out.println("Producto registrado.\n");
                    break;

                case 4:
                    if (cliente != null && vendedor != null && producto != null) {
                        System.out.print("Cantidad: ");
                        int cantidad = sc.nextInt();
                        sc.nextLine();
                        Pedido pedido = new Pedido(cliente, producto, vendedor, cantidad, LocalDate.now());

                        System.out.println("Total Bruto: " + pedido.calcularTotalBruto());
                        System.out.println("Descuento: " + pedido.calcularDescuento());
                        System.out.println("Total Neto: " + pedido.calcularTotalNeto());
                        System.out.println("Estado: " + pedido.estadoPedido());
                        System.out.println();
                    } else {
                        System.out.println("Debe ingresar Cliente, Vendedor y Producto primero.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
