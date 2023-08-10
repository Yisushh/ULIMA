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
public class Cruceros extends Producto {
    private int diasEnAltamar;
    private int diasEnPuerto;

    public Cruceros(int diasEnAltamar, int diasEnPuerto, String codigoProducto, String fechaInicio, String fechaFin, double montoSeguro, double montoProducto, int cantidadPersonas) {
        super(codigoProducto, fechaInicio, fechaFin, montoSeguro, montoProducto, cantidadPersonas);
        this.diasEnAltamar = diasEnAltamar;
        this.diasEnPuerto = diasEnPuerto;
    }

    
    @Override
    protected double calcularDescuento() {
        double aleatorio = Math.random()*(450-350+1)+350;
        
        double promedio = (diasEnAltamar + diasEnPuerto) /2;
        
        return aleatorio * promedio;
    }
}
