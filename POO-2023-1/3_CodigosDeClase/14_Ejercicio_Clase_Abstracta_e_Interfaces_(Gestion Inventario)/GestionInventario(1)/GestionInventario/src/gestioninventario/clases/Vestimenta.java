/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninventario.clases;
import gestioninventario.helper.HelperAleatorio;

/**
 *
 * @author profo1601
 */
public abstract class Vestimenta {
    
    protected String talla;
    protected String color;
    protected String codigo;
    protected int cantidad;

    public Vestimenta(String talla, String color) {
        this.talla = talla;
        this.color = color;
        this.codigo = this.generarCodigoInventario();
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    private String generarCodigoInventario() {
    
        int random = HelperAleatorio.getNumeroAleatorio(80,140);
        
        return "INV-" + random;
    }
    
    public String getDatos() {
        return "CÓDIGO: " + this.codigo
                + ", TALLA: " + this.talla + ""
                + ", COLOR: " + this.color + ""
                + ", CANTIDAD: " + this.cantidad;
    }
    
    
    public abstract void calcularInventario();
    
    
}
