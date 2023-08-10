/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author profl3302
 */
public class Estudiante extends Persona {
    
    private double montoPension;
    
    public Estudiante(String nombre, String apellido, String dni, double montoPension) {
        super(nombre, apellido, dni);
        this.montoPension = montoPension;
    }
    
}
