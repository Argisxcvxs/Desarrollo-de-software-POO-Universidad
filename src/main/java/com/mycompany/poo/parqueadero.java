
package com.mycompany.poo;

import java.util.ArrayList;
import java.util.List;

public class parqueadero {
    private String nombre;
    private int espacioscarros;
    private int espaciosmotos;
    private final List<carro> carrosestacionados;
    private final List<moto> motosestacionadas;

    // Constructor
    public parqueadero(String nombre, int espacioscarros, int espaciosmotos) {
        this.nombre = nombre;
        this.espacioscarros = espacioscarros;
        this.espaciosmotos = espaciosmotos;
        this.carrosestacionados = new ArrayList<>();
        this.motosestacionadas = new ArrayList<>();
    }
    
    // Métodos para ingresar y sacar vehículos
    public void ingresarc(String placa) {
        if (carrosestacionados.size() < espacioscarros) {
            carro carro = new carro(placa);
            carrosestacionados.add(carro);
            System.out.println("Vehiculo carro ingresado al parqueadero.");
        } else {
            System.out.println("No hay espacio disponible para carros.");
        }
    }

    public void ingresarm(String placa) {
        if (motosestacionadas.size() < espaciosmotos) {
            moto moto = new moto(placa);
            motosestacionadas.add(moto);
            System.out.println("Vehiculo moto ingresado al parqueadero.");
        } else {
            System.out.println("No hay espacio disponible para motos.");
        }
    }

    public void sacarc(String placa) {
        for (carro carro : carrosestacionados) {
            if (carro.getplaca().equals(placa)) {
                carrosestacionados.remove(carro);
                System.out.println("Vehiculo carro salio del parqueadero.");
                return;
            }
        }
        System.out.println("El vehiculo carro no está estacionado en este parqueadero.");
    }

    public void sacarm(String placa) {
        for (moto moto : motosestacionadas) {
            if (moto.getplaca().equals(placa)) {
                motosestacionadas.remove(moto);
                System.out.println("Vehiculo moto salio del parqueadero.");
                return;
            }
        }
        System.out.println("El vehiculo moto no está estacionado en este parqueadero.");
    }

    // Getters y setters
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getespacioscarros() {
        return espacioscarros;
    }

    public void setespacioscarros(int espacioscarros) {
        this.espacioscarros = espacioscarros;
    }

    public int getespaciosmotos() {
        return espaciosmotos;
    }

    public void setespaciosmotos(int espaciosmotos) {
        this.espaciosmotos = espaciosmotos;
    }
}
