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
public class Inmueble{
    
    private double area;
    private double precioBase;

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getArea() {
        return area;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Inmueble(double area) {
        this.area = area;
    }
    
    public double calcularPrecioFinal(){
        return this.precioBase;
    }
    
    
    
}
