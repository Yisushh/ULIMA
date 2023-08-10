/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author otro3
 */
public class MensajeProtegido extends Mensaje{

    public MensajeProtegido(String nombreRemitente, 
                            String usuarioRemitente, String usuarioReceptor, 
                            String mensaje, String fecha) {
        super(nombreRemitente, usuarioRemitente, usuarioReceptor, mensaje, fecha);
    }
    
    @Override
    public String toString() {
        return "De: " + this.usuarioRemitente + " - Fecha: " + this.fecha + "\n" + this.mensaje;
    }
    
}
