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
public class Accesorio {
    private int id;
    private String descripcion;
    private String marca;

    public Accesorio(int id, String descripcion, String marca) {
        this.id = id;
        this.descripcion = descripcion;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }
    
    
}
