/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Agustin
 */
public class Parque {
    private List<Aparato>aparatos = new ArrayList<Aparato>();
    
    public void addAparato (Aparato a){
       aparatos.add(a);
    }
    
    public double dineroRecaudadoTotal (){
        double dineroRecaudado = 0;
        for (Aparato a : aparatos) {
            dineroRecaudado+=a.precio;
        }
        return dineroRecaudado;
    }
    public Map<String,Integer> ipMasPredominante (){
        Map<String,Integer>mp = new HashMap<>();
        int countMedia = 0;
        int countAlta = 0;
        for (Aparato a : aparatos) {
            if (a instanceof Aparatos_Adultos) {
                Aparatos_Adultos aa = (Aparatos_Adultos)a;
                if (aa.indiceDePeligrosidad >= 3 && aa.indiceDePeligrosidad <= 6 ) {
                    ++countMedia;
                }
                if (aa.indiceDePeligrosidad >= 6 && aa.indiceDePeligrosidad <= 10) {
                    ++countAlta;
                }
            }
        }
       mp.put("Peligrosidad Media", countMedia);
       mp.put("Peligrosidad Alta", countAlta);
       return mp;
    }
    public Map<String,Integer> ip (double tiempoDeDuracion){
        Map<String,Integer>mp = new HashMap<>();
        int countAlta = 0;
        for (Aparato a : aparatos) {
            if (a instanceof Aparatos_Adultos) {
                Aparatos_Adultos aa = (Aparatos_Adultos)a;
                if (aa.indiceDePeligrosidad >= 6 && aa.indiceDePeligrosidad <= 10&& aa.tiempoDeDuracion > tiempoDeDuracion) {
                    ++countAlta;
                }
            }
        }
       mp.put("Peligrosidad Alta", countAlta);
       return mp;
    }
}
