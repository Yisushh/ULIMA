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
public class ItemBoleta {
    public String descripcion;
    public float cantidad;
    public float precio;
    public float igv;
    
    public ItemBoleta(String descripcion, float cantidad, float precio) {
        this.igv = precio * 0.18f;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public float getIgv() {
        return igv;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setIgv(float igv) {
        this.igv = igv;
    }
    
    public float calcularPrecioTotal() {
        return this.cantidad * (this.precio + this.igv);
    }
    
    public float calcularPrecioTotalDescuento() {
        float porcDescuento = 0.0f;
        
        if (this.cantidad < 3) {
            porcDescuento = 0.05f;
        } else if (this.cantidad >= 4 && this.cantidad <=10) {
            porcDescuento = 0.20f;
        } else if (this.cantidad > 10) {
            porcDescuento = 0.30f;
        }
        
        //float total = this.cantidad * (this.precio + this.igv);
        
        float total = this.calcularPrecioTotal();
        
        float descuento = total * porcDescuento;
        
        return total - descuento;
    }
    
    public String getDatos() {
        return "Descripción: " + this.descripcion + ", " +
                "Cantidad: " + this.cantidad + ", " +
                "Precio: " +  this.precio + ", " + 
                "IGV: " + this.igv ;
    }
}
