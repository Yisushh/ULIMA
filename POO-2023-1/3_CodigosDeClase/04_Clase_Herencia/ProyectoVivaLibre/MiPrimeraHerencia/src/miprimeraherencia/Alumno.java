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
public class Alumno extends Persona {
    
    private int codigo;
    
    public Alumno(String nombre, String apellido, int dni, int codigo) {
        super(nombre, apellido, dni);
        
        this.codigo = codigo;
    }
    
    @Override
    public String getDatos() {
        return super.getDatos() + " " + this.codigo;
    }
    
    
    
}
