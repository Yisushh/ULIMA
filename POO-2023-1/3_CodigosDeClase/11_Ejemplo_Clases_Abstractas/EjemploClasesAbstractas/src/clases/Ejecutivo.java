/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author otro3
 */
public class Ejecutivo extends Empleado {

    public Ejecutivo(String nombres, String genero, String cargo, int numeroGrados, int aniosServicio, float sueldoBasico, float bonificacion, float sueldoTotal) {
        super(nombres, genero, cargo, numeroGrados, aniosServicio, sueldoBasico, bonificacion, sueldoTotal);
    }

    @Override
    public void calcularBonificacion() {
        this.bonificacion = 0.02f * this.sueldoBasico;
    }
    
}
