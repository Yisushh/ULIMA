/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author L33229
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pedido1
        Producto gaseosa = new Bebida("CocaCola",2.5);
        Producto triple = new Sandwich("Triple Vegano",4);
        Pedido pedido1 = new Pedido("1122");
        pedido1.agregarProducto(gaseosa);
        pedido1.agregarProducto(triple);
        // Pedido2
        Producto postre = new Postre("Chifon de Charo",8,100);
        Producto energizante = new Bebida("Gatorade",2);
        Producto sanguche = new Sandwich("Pollo desilachado",8);
        Pedido pedido2 = new Pedido("9669");
        pedido2.agregarProducto(postre);
        pedido2.agregarProducto(energizante);
        pedido2.agregarProducto(sanguche);
        
        
        //Restaurante
        Restaurante rest = new Restaurante("El gran pollón",new ArrayList<Pedido>(Arrays.asList(pedido1,pedido2)));
        rest.imprimirInformacion();
    }
    
}
