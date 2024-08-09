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
public class Aparatos_Adultos extends Aparato {
    double tiempoDeDuracion;
    int indiceDePeligrosidad;

    public Aparatos_Adultos(double tiempoDeDuracion, int indiceDePeligrosidad, int capacidadDePersonas, double precio, String nombre, boolean pareja) {
        super(capacidadDePersonas, precio, nombre, pareja);
        this.tiempoDeDuracion = tiempoDeDuracion;
        this.indiceDePeligrosidad = indiceDePeligrosidad;
    }

    public double getTiempoDeDuracion() {
        return tiempoDeDuracion;
    }

    public void setTiempoDeDuracion(double tiempoDeDuracion) {
        this.tiempoDeDuracion = tiempoDeDuracion;
    }

    public int getIndiceDePeligrosidad() {
        return indiceDePeligrosidad;
    }

    public void setIndiceDePeligrosidad(int indiceDePeligrosidad) {
        this.indiceDePeligrosidad = indiceDePeligrosidad;
    }
    @Override
    public double precios (){
        return tiempoDeDuracion * 1/2 - indiceDePeligrosidad * tiempoDeDuracion;
    }
}
