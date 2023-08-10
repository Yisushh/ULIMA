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
public class Docente extends Persona {
    
    private double sueldo;
    
    public Docente(String nombre, String apellido, String dni, double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }
    
}
