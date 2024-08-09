/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio5;

/**
 *
 * @author Agustin
 */
public abstract class Aparato {
    int capacidadDePersonas;
    double precio;
    String nombre;
    boolean pareja;

    public Aparato(int capacidadDePersonas, double precio, String nombre, boolean pareja) {
        this.capacidadDePersonas = capacidadDePersonas;
        this.precio = precio;
        this.nombre = nombre;
        this.pareja = pareja;
    }

    public int getCapacidadDePersonas() {
        return capacidadDePersonas;
    }

    public void setCapacidadDePersonas(int capacidadDePersonas) {
        this.capacidadDePersonas = capacidadDePersonas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPareja() {
        return pareja;
    }

    public void setPareja(boolean pareja) {
        this.pareja = pareja;
    }
    public abstract double precios();
    
}
