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
public class Postre extends Producto{
    private double peso;
    public Postre(String nombre,double precioSinIGV,double peso) {
        super(nombre,precioSinIGV);
        this.peso=peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double calcularPrecio() {
       return this.precioSinIGV*1.18+(this.peso/100);
    }
    @Override
    public String strDatos() {
        return "Nombre: "+this.nombre+"\n"+
                "Peso: "+this.peso+"\n"+
                "Precio: "+this.precioSinIGV+"\n\n";
    }
}
