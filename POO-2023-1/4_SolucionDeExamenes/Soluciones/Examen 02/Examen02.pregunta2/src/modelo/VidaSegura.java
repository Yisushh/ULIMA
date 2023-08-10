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
public class VidaSegura extends Producto{

    private int edadMaximaCobertura;
    private double montoAdicionalPorEdad;
       
    public VidaSegura(int codigo, String nombre, double costoBaseAnual, 
                        double costoAdministrativo, int edadMaximaCobertura) {
        super(codigo, nombre, costoBaseAnual, costoAdministrativo);
        
        this.edadMaximaCobertura = edadMaximaCobertura;
        this.montoAdicionalPorEdad = 0;
    }
    
    @Override
    public double calcularPrimaReferencia() {
        
        if (this.edadMaximaCobertura > 75){
            this.montoAdicionalPorEdad = 1000;
        } else if (this.edadMaximaCobertura >= 50 && this.edadMaximaCobertura < 74) {
            this.montoAdicionalPorEdad = 750;
        } else {
            this.montoAdicionalPorEdad = Math.random() * (500 - 400) + 400;
        }
        
        return super.calcularPrimaReferencia() + montoAdicionalPorEdad;
    }
    
}
