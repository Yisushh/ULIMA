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
public class Empleado {
    protected String nombreCompleto;
    protected String direccion;
    protected double sueldoBasico;
    protected String tipo;

    public Empleado(String nombreCompleto, String direccion, double sueldoBasico) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.sueldoBasico = sueldoBasico;
    }
    
    public double calcularSueldo() {
        return this.sueldoBasico;
    }
    
}
