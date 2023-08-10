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
public class Producto {
    protected String codigoProducto;
    protected String fechaInicio;
    protected String fechaFin;
    protected double montoSeguro;
    protected double montoProducto;
    protected int cantidadPersonas;

    public Producto(String codigoProducto, String fechaInicio, String fechaFin, double montoSeguro, double montoProducto, int cantidadPersonas) {
        this.codigoProducto = codigoProducto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoSeguro = montoSeguro;
        this.montoProducto = montoProducto;
        this.cantidadPersonas = cantidadPersonas;
    }
    
    protected double calcularDescuento() {
        return 0;
    }
    
    public double calcularMontoAPagar() {
        return this.montoProducto - calcularDescuento();
    }
}
