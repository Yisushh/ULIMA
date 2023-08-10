/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninventario.gestion;
import gestioninventario.clases.Vestimenta;
import gestioninventario.helper.HelperAleatorio;

/**
 *
 * @author profo1601
 */
public class GestionInventario {
    private final int MAXX_INV = 300;
    private Vestimenta[] productos;
    private int nroProductos;

    public GestionInventario() {
        
        this.productos = new Vestimenta[this.MAXX_INV];
        this.nroProductos = 0;
    }
    
    public void ingresar(Vestimenta producto) {
        if (producto != null &&
                nroProductos < MAXX_INV) {
            
            if (producto.getCantidad() >= 200) {
                int cantidad = producto.getCantidad();
                
                int nuevaCantidad = cantidad / HelperAleatorio.getNumeroAleatorioPar(10, 20);
                
                producto.setCantidad(nuevaCantidad);
               
            }
            
            productos[nroProductos] = producto;
            nroProductos++;
            
        } else {
            System.out.println("Producto no es válido, o "
                    + "no queda espacio en el arreglo");
        }
        
        
    }
    
    public void calcularInventario() {
        for(Vestimenta producto: productos) {
            producto.calcularInventario();
        }
    }
    
    public void printProductos() {
        for(Vestimenta producto: productos) {
            System.out.println(producto.getDatos());
        }
    }
    
    public void ordenar() {
        for(int i = 0; i < this.productos.length - 1; i++){
            for (int j = i+1; j < this.productos.length - 1; j++ ) {
                if (this.productos[j].getCantidad() > this.productos[i].getCantidad()){
                    Vestimenta temp = productos[i];
                    productos[i] = productos[j];
                    productos[j] = temp;
                    
                }
            }
        }
        
        System.out.println("Ordenamiento terminado!");
    }
    
    
    
    
}
