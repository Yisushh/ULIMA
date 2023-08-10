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
public class AereoDeCarga extends Aereo{

    private int capacidadDeCarga;
    
    public AereoDeCarga(int codigo, String nombre, int puntosDeVida, 
                        int armadura, int ataqueFisico, int ataqueEspecial, 
                        int velocidadDeMovimiento, int velocidadMovimientoAereo, 
                        int ataqueMisil, int capacidadDeCarga) {
        super(codigo, nombre, puntosDeVida, armadura, ataqueFisico, ataqueEspecial, velocidadDeMovimiento, velocidadMovimientoAereo, ataqueMisil);
        this.capacidadDeCarga = capacidadDeCarga;
    }
    
}
