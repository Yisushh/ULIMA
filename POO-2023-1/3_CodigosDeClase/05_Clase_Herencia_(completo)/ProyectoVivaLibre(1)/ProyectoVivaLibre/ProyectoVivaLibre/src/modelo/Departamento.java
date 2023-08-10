/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author profl3302
 */
public class Departamento extends Inmueble {
    private double porcentajeImpuestoPrecioBase = 1.25;
    private double porcentajeDescuento = 0.07;
    
    private int piso;

    public Departamento(double area, double precioBase) {
        super(area);
        
       if (area > 170) {
           precioBase = precioBase * 1.15;
       }
       
       super.setPrecioBase(precioBase);
          
    }
    
    @Override
    public double calcularPrecioFinal() {
        double montoMasImpuesto = this.getPrecioBase() * this.porcentajeImpuestoPrecioBase;
        double descuento = 0;
        
        if (piso >= 3 ) {
            descuento = montoMasImpuesto * porcentajeDescuento;
        }
        
        return montoMasImpuesto - descuento;
    }
}
