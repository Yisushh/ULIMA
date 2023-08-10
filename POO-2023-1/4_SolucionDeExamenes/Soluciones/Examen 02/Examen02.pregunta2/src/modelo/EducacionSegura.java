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
public class EducacionSegura extends Producto {

    private int aniosCobertura;
    private double montoMaximoCobertura;
    
    public EducacionSegura(int codigo, String nombre, 
                        double costoBaseAnual, double costoAdministrativo,
                        int aniosCobertura, double montoMaximoCobertura) {
        
        super(codigo, nombre, costoBaseAnual, costoAdministrativo);
        this.aniosCobertura = aniosCobertura;
        this.montoMaximoCobertura = montoMaximoCobertura;
    }
    
}
