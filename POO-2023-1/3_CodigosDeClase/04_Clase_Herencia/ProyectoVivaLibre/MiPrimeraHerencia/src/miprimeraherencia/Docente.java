/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraherencia;

/**
 *
 * @author profl3302
 */
public class Docente extends Persona {
    
    public Docente(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        
        super.getDatos();
    }
    
}
