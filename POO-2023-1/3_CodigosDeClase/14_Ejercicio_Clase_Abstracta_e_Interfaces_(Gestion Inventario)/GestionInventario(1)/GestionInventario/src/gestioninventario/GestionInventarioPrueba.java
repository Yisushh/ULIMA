/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninventario;
import gestioninventario.gestion.GestionInventario;
import gestioninventario.clases.Terno;
import gestioninventario.clases.VestidoParaDama;
import gestioninventario.clases.RopaParaAdolescente;
import gestioninventario.clases.Vestimenta;
import gestioninventario.clases.CalculadorDeCostos;
/**
 *
 * @author profo1601
 */
public class GestionInventarioPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestionInventario inventario = new GestionInventario();
        
        for(int i = 0; i<100; i++) {
            Vestimenta objVestimenta1 = new Terno("S","Gris");
            inventario.ingresar(objVestimenta1);
        }
        
        for(int i = 100; i<151; i++) {
            Vestimenta objVestimenta1 = new VestidoParaDama("S","Azul Marino");
            inventario.ingresar(objVestimenta1);
        }
        
        for(int i = 151; i<200; i++) {
            Vestimenta objVestimenta1 = new VestidoParaDama("L","Rojo");
            inventario.ingresar(objVestimenta1);
        }
        
        for(int i = 200; i<300; i++) {
            Vestimenta objVestimenta1 = new RopaParaAdolescente("M","Verde");
            inventario.ingresar(objVestimenta1);
        }

        inventario.calcularInventario();
        
        inventario.printProductos();
    }
    
}
