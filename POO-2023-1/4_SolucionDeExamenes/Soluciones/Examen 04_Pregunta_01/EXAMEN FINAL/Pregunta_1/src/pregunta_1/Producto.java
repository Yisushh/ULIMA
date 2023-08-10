/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta_1;

/**
 *
 * @author L33229
 */
public abstract class Producto {
    protected String nombre;
    protected double precioSinIGV;

    public Producto(String nombre,double precioSinIGV) {
        this.nombre=nombre;
        this.precioSinIGV = precioSinIGV;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioSinIGV() {
        return precioSinIGV;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioSinIGV(double precioSinIGV) {
        this.precioSinIGV = precioSinIGV;
    }
    
    public abstract double calcularPrecio();
    public abstract String strDatos();
}
