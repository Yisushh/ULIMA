/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author otro3
 */
public class Producto {
    protected int codigo;
    protected String nombre;
    protected double costoBaseAnual;
    protected double costoAdministrativo;

    public Producto(int codigo, String nombre, double costoBaseAnual, double costoAdministrativo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costoBaseAnual = costoBaseAnual;
        this.costoAdministrativo = costoAdministrativo;
    }
    
    public double calcularPrimaReferencia() {
        return this.costoBaseAnual + this.costoAdministrativo;
    }
}
