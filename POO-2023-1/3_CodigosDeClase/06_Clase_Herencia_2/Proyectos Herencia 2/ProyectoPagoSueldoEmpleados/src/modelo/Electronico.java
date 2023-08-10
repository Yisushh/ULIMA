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
public class Electronico extends Empleado {
    private int aniosDeAntiguedad;

    public Electronico(String nombreCompleto, String direccion, double sueldoBasico, int aniosDeAntiguedad) {
        super(nombreCompleto, direccion, sueldoBasico);
        this.tipo = "E";
        this.aniosDeAntiguedad = aniosDeAntiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        
        double porcentajeBono = 0;
        
        if (this.aniosDeAntiguedad < 3) {
            porcentajeBono = 1.005;
        } else if (this.aniosDeAntiguedad >= 3 && this.aniosDeAntiguedad < 5) {
            porcentajeBono = 1.05;
        } else if (this.aniosDeAntiguedad >=5 && this.aniosDeAntiguedad < 7) {
            porcentajeBono = 1.07;
        } else if (this.aniosDeAntiguedad >= 7) {
            porcentajeBono = 1.11;
        }
        
        return super.calcularSueldo() * porcentajeBono;
    }
}
