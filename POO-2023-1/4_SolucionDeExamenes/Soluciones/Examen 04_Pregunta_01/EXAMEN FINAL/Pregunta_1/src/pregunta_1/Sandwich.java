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
public class Sandwich extends Producto{

    public Sandwich(String nombre,double precioSinIGV) {
        super(nombre,precioSinIGV);
        this.precioSinIGV=this.calcularPrecio();
    }

    @Override
    public double calcularPrecio() {
        return this.precioSinIGV*1.18+5;
    }
    @Override
    public String strDatos() {
        return "Nombre: "+this.nombre+"\n"+
                "Precio: "+this.precioSinIGV+"\n";
    }
}
