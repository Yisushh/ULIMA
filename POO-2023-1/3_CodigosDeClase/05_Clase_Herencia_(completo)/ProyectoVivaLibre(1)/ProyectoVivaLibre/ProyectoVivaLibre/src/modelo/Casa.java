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
public class Casa extends Inmueble {
    private double porcentajePorMantenimiento = 1.20;
    private double preciom2;

    public Casa(double area, double preciom2) {
        super(area);
        
        if (area > 170) {
            preciom2 = preciom2 * 1.07;
        }
        
        super.setPrecioBase(preciom2 * area);
        
        this.preciom2 = preciom2;
    }
    
    @Override
    public double calcularPrecioFinal() {
      return this.getPrecioBase() * this.porcentajePorMantenimiento;
    }
}
