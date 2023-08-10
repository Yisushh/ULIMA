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
public class Aereo extends Unidad {

    protected int velocidadMovimientoAereo;
    protected int ataqueMisil;
    
    public Aereo(int codigo, String nombre, int puntosDeVida, 
                int armadura, int ataqueFisico, int ataqueEspecial, 
                int velocidadDeMovimiento, int velocidadMovimientoAereo,
                int ataqueMisil) {
        super(codigo, nombre, puntosDeVida, armadura, ataqueFisico, ataqueEspecial, velocidadDeMovimiento);
        this.velocidadMovimientoAereo = velocidadMovimientoAereo;
        this.ataqueMisil = ataqueMisil;
    }
    
}
