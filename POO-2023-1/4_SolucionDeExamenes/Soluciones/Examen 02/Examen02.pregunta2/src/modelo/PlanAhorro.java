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
public class PlanAhorro extends Producto {

    private int tiempoDeDevolucionEnMeses;
    private double tasaAnual;
    
    public PlanAhorro(int codigo, String nombre, double costoBaseAnual, 
                        double costoAdministrativo, int tiempoDeDevolucionEnMeses) {
        super(codigo, nombre, costoBaseAnual, costoAdministrativo);
        
        this.tiempoDeDevolucionEnMeses = tiempoDeDevolucionEnMeses;
        this.tasaAnual = 0;
    }
    
    @Override
    public double calcularPrimaReferencia() {
        
        double tiempoDevolcionAnios = this.tiempoDeDevolucionEnMeses / 12;
        
        if (tiempoDevolcionAnios > 15) {
            this.tasaAnual = this.tasaAnual / 2;
        } else if (tiempoDevolcionAnios >= 0 && tiempoDevolcionAnios < 10) {
            this.tasaAnual = this.tasaAnual * 2;
      } 
         
        return super.calcularPrimaReferencia() * (1 + this.tasaAnual);
    }
}
