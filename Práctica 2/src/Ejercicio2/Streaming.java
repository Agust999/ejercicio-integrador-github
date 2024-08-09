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
public class Streaming extends Usuario implements Reproductor {
    
    public Streaming (int reproducir, int pausar, int detener){
        super (reproducir, pausar, detener);
    }
    @Override
    public int reprodusir(){
        return 1;
    }
    @Override
    public int pausar(){
        return 0;
    }
    @Override
    public int detener (){
        return -1;
    }
    
}
