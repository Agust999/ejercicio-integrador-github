/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio2;

/**
 *
 * @author Agustin
 */
public class Usuario {
    protected int reproducir;
    protected int pausar;
    protected int detener;
    
    public Usuario (int reproducir, int pausar, int detener){
        this.reproducir = reproducir;
        this.pausar = pausar;
        this.detener = detener;
    }

    public int getReproducir() {
        return reproducir;
    }

    public void setReproducir(int reproducir) {
        this.reproducir = reproducir;
    }

    public int getPausar() {
        return pausar;
    }

    public void setPausar(int pausar) {
        this.pausar = pausar;
    }

    public int getDetener() {
        return detener;
    }

    public void setDetener(int detener) {
        this.detener = detener;
    }
        
}
