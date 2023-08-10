/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulima.profesores.modelo;

/**
 *
 * @author otro3
 */
public class Profesor {
    private int id;
    private String nombre;
    private String apellido;
    private Categoria categoria;
    private Grado grado;

    public Profesor(int id, String nombre, String apellido, Categoria categoria, Grado grado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.grado = grado;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }
    
    
    
    @Override
    public String toString() {
        return "ID: " + this.id + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido;
    }
    
    
}
