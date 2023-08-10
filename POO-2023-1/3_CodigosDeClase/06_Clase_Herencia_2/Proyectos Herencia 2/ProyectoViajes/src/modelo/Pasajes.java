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
public class Pasajes extends Producto {
    private String lineaAerea;
    private String aeropuertoLlegada;
    private boolean esLineaAereaNacional;

    public Pasajes(String lineaAerea, String aeropuertoLlegada, boolean nacionalidadAeroLinea, String codigoProducto, String fechaInicio, String fechaFin, double montoSeguro, double montoProducto, int cantidadPersonas) {
        super(codigoProducto, fechaInicio, fechaFin, montoSeguro, montoProducto, cantidadPersonas);
        this.lineaAerea = lineaAerea;
        this.aeropuertoLlegada = aeropuertoLlegada;
        this.esLineaAereaNacional = false;
    }
    
    @Override
    protected double calcularDescuento() {
        if (this.esLineaAereaNacional == true) {
            return Math.random()*(350-200+1)+200;
        }
        else 
            return 0;
    }
}
