/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author profl3302
 */
public class Pollo {
    private String nombre;
    private int peso;
    private int tiempoEnDias;

    public Pollo(String nombre, int peso, int tiempoEnDias) {
        this.nombre = nombre;
        this.peso = peso;
        this.tiempoEnDias = tiempoEnDias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public int getTiempoEnDias() {
        return tiempoEnDias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTiempoEnDias(int tiempoEnDias) {
        this.tiempoEnDias = tiempoEnDias;
    }
    
    public String toString() {
        return this.nombre + " " + this.peso + " " + this.tiempoEnDias;
    }
    
    
}
