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
public class Restaurante {
    public String nombre;
    private ArrayList<Pedido> pedidos;
    private double costoTotal;

    public Restaurante(String nombre,ArrayList<Pedido> pedidos) {
        this.nombre=nombre;
        this.pedidos = pedidos;
        this.costoTotal = this.calcularCosto();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }


    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public double calcularCosto(){
        double costo=0;
        for(Pedido p:this.pedidos){
            costo+=p.getCostoTotal();
        }
        return costo;
    }
    
    public void imprimirInformacion(){
        
        System.out.println(this.nombre);
        for(Pedido p:this.pedidos){
            System.out.print(p.strDatosPedido());
        }
        System.out.println("COSTO TOTAL: "+this.costoTotal);
    
    }
    
}
