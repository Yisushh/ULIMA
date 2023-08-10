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
public class Mensaje {
    protected int identicador;
    protected String nombreRemitente;
    protected String usuarioRemitente;
    protected String usuarioReceptor;
    protected String mensaje;
    protected String fecha;

    public Mensaje(String nombreRemitente, String usuarioRemitente, String usuarioReceptor, String mensaje, String fecha) {
        
        this.identicador = (int)(Math.random() * (1000 - 1) + 1);
        this.nombreRemitente = nombreRemitente;
        this.usuarioRemitente = usuarioRemitente;
        this.usuarioReceptor = usuarioReceptor;
        this.mensaje = mensaje;
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return "De: " + this.nombreRemitente + " (" + this.usuarioRemitente + ") - Para: (" + this.usuarioReceptor + ") - " + this.fecha + 
                "\n" + this.mensaje;
    }
}
