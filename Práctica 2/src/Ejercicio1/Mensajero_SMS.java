/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio1;

/**
 *
 * @author Agustin
 */
public class Mensajero_SMS extends Cliente implements Mensajero {
    private Cliente mensaje;
    
    public Mensajero_SMS (Cliente mensaje, String sms){
        super (sms);
        this.mensaje = mensaje;
    }

    public Cliente getMensaje() {
        return mensaje;
    }

    public void setMensaje(Cliente mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public String enviarMensaje (){
        return "Mensaje enviado";
    }
}
