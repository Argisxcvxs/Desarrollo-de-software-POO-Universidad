/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

/**
 *
 * @author augus
 */

import java.util.Scanner;

public class POO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        parqueadero p = new parqueadero("MiParqueadero", 10, 10);

        while (true) {
            System.out.println("¿Que accion deseas realizar?");
            System.out.println("1. Ingresar carro");
            System.out.println("2. Ingresar moto");
            System.out.println("3. Sacar carro");
            System.out.println("4. Sacar moto");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            String placa;

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingresa la placa del carro:");
                    placa = scanner.next();
                    p.ingresarc(placa);
                }
                case 2 -> {
                    System.out.println("Ingresa la placa de la moto:");
                    placa = scanner.next();
                    p.ingresarm(placa);
                }
                case 3 -> {
                    System.out.println("Ingresa la placa del carro a sacar:");
                    placa = scanner.next();
                    p.sacarc(placa);
                }
                case 4 -> {
                    System.out.println("Ingresa la placa de la moto a sacar:");
                    placa = scanner.next();
                    p.sacarm(placa);
                }
                case 5 -> {
                    System.out.println("Saliendo del programa...");
                    return;
                }
                default -> System.out.println("Opción no valida.");
            }
        }
    }
}
