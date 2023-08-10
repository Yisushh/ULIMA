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
public class Gerente extends Empleado {

    public Gerente(String nombres, String genero, String cargo, int numeroGrados, int aniosServicio, float sueldoBasico, float bonificacion, float sueldoTotal) {
        super(nombres, genero, cargo, numeroGrados, aniosServicio, sueldoBasico, bonificacion, sueldoTotal);
    }
 
    @Override
    public void calcularBonificacion() {
        
        int nroGrados = this.numeroGrados <= 5 ? this.numeroGrados : 5;
        
//        if (this.numeroGrados <= 5) {
//            nroGrados = this.numeroGrados;
//        } else {
//            nroGrados = 5;
//        }
        
        this.bonificacion = 0.045f * this.sueldoBasico * nroGrados;
    }
    
}
