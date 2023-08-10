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
public class Pedido {
    private ArrayList<Producto> productos = new ArrayList<Producto>(Arrays.asList());
    private double costoTotal;
    private String codigoPedido;
    
    public Pedido(String codigoPedido) {
        this.codigoPedido=codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }
    
    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
        this.costoTotal=this.calcularCostoPedido();
    }
    public String strDatosPedido(){
        
        String str="-------\n";
        str+="Productos de Pedido "+this.codigoPedido+"\n";
        for(Producto p:this.productos){
            str=str+p.strDatos();
        }
        str+="Costo Total del pedido: "+this.costoTotal+"\n\n";
        return str;
    }
    
    public double calcularCostoPedido(){
        double costo=0;
        for(Producto p:this.productos){
            costo = costo + p.precioSinIGV;
        }
        return costo;
    }
}
