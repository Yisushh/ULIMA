/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaitemboleta;

/**
 *
 * @author otro3
 */
public class ProgramaItemBoleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ItemBoleta objItem1 = new ItemBoleta("Aceite Vegetal", 1, 20);
        System.out.println(objItem1.getDatos());
        System.out.println("El precio final es: " + objItem1.calcularPrecioTotal());
        System.out.println("El precio con descuento es: " + objItem1.calcularPrecioTotalDescuento());
        
        ItemBoleta objItem2 = new ItemBoleta("Leche Gloria", 4, 6.90f);
        System.out.println(objItem2.getDatos());
        System.out.println("El precio final es: " + objItem2.calcularPrecioTotal());
        System.out.println("El precio con descuento es: " + objItem2.calcularPrecioTotalDescuento());
        
        ItemBoleta objItem3 = new ItemBoleta("Chocolate", 30, 1.50f);
        System.out.println(objItem3.getDatos());
        System.out.println("El precio final es: " + objItem3.calcularPrecioTotal());
        System.out.println("El precio con descuento es: " + objItem3.calcularPrecioTotalDescuento());
    }
    
}
