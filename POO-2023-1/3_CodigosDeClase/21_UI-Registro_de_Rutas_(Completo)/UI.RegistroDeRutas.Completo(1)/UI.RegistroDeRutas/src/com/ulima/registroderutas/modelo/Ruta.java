/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulima.registroderutas.modelo;

/**
 *
 * @author otro3
 */
public class Ruta {
    private int id;
    private String nombre;
    private String via;
    private String distrito;
    private Provincia provincia;

    public Ruta(String nombre, String via, String distrito, Provincia provincia) {
        this.nombre = nombre;
        this.via = via;
        this.distrito = distrito;
        this.provincia = provincia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVia() {
        return via;
    }

    public String getDistrito() {
        return distrito;
    }

    public Provincia getProvincia() {
        return provincia;
    }
    
    
}
