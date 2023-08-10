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
public class Paquete extends Producto {
    private int diasTotales;
    private int cantidadPaises;

    public Paquete(int diasTotales, int cantidadPaises, String codigoProducto, String fechaInicio, String fechaFin, double montoSeguro, double montoProducto, int cantidadPersonas) {
        super(codigoProducto, fechaInicio, fechaFin, montoSeguro, montoProducto, cantidadPersonas);
        this.diasTotales = diasTotales;
        this.cantidadPaises = cantidadPaises;
    }
    
    @Override
    protected double calcularDescuento() {
        
        if (this.diasTotales < 3) {
            return 0;
        } else if (this.diasTotales >= 4 && this.diasTotales <= 8) {
            return Math.random()*(450-250+1)+250;
        } else if (this.diasTotales > 8) {
            return this.montoProducto * 0.35;
        }
        
        return 0;
    }
}
