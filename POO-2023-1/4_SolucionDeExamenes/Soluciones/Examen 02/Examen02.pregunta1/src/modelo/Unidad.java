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
public class Unidad {
    protected int codigo;
    protected String nombre;
    protected int puntosDeVida;
    protected int armadura;
    protected int ataqueFisico;
    protected int ataqueEspecial;
    protected int velocidadDeMovimiento;

    public Unidad(int codigo, String nombre, int puntosDeVida, int armadura, int ataqueFisico, int ataqueEspecial, int velocidadDeMovimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.armadura = armadura;
        this.ataqueFisico = ataqueFisico;
        this.ataqueEspecial = ataqueEspecial;
        this.velocidadDeMovimiento = velocidadDeMovimiento;
    }

    
    
}
