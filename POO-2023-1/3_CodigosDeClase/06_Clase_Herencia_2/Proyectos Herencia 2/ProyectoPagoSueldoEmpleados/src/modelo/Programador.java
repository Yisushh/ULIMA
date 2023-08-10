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
public class Programador extends Empleado {
    
    public String[] especialidades;
    public int gradoProfesion;

    public Programador(String nombreCompleto, String direccion, double sueldoBasico, String [] especialidades, int gradoProfesion) {
        super(nombreCompleto, direccion, sueldoBasico);
        this.tipo = "P";
        this.gradoProfesion = gradoProfesion;
        this.especialidades = especialidades;
    }
    
    @Override
    public double calcularSueldo() {
    
        double bono = 0 ;
        
        switch(this.gradoProfesion) {
            case 0:
                bono = 50;
                break;
            case 1:
                bono = 100;
                break;
            case 2:
                bono = 250;
                break;
            case 3:
                bono = 500;
                break;
        }
        
        return super.calcularSueldo() + bono;
    }
    
    
    
}
