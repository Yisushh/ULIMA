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
public class Motorizado extends Unidad {

    private int escudo;
    private int velocidadMovimientoTurbo;
    
    public Motorizado(int codigo, String nombre, int puntosDeVida, 
                        int armadura, int ataqueFisico, int ataqueEspecial, 
                        int velocidadDeMovimiento, int escudo,
                        int velocidadMovimientoTurbo) {
        super(codigo, nombre, puntosDeVida, armadura, ataqueFisico, ataqueEspecial, velocidadDeMovimiento);
        
        this.escudo = escudo;
        this.velocidadMovimientoTurbo = velocidadMovimientoTurbo;
    
    }
    
}
