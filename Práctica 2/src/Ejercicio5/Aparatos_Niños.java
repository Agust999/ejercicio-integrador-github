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
public class Aparatos_Niños extends Aparato {
    String nombreDeLaCancion;
    boolean premio;
    int edadMinima;
    
    public Aparatos_Niños (int capacidadDePersonas, double precio, String nombre, boolean pareja, String nombreDeLaCancion, boolean premio, int edadMinima){
        super (capacidadDePersonas, precio, nombre, pareja);
        this.nombreDeLaCancion = nombreDeLaCancion;
        this.precio = precio;
        this.edadMinima = edadMinima;
    }

    public String getNombreDeLaCancion() {
        return nombreDeLaCancion;
    }

    public void setNombreDeLaCancion(String nombreDeLaCancion) {
        this.nombreDeLaCancion = nombreDeLaCancion;
    }

    public boolean isPremio() {
        return premio;
    }

    public void setPremio(boolean premio) {
        this.premio = premio;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    @Override
    public double precios (){
        return edadMinima/3 + ((premio)? 1 : 0)* 5;
    }
        
}
