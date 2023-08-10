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
public class Soldado extends Unidad {

    private int ataqueBomba;
    
    public Soldado(int codigo, String nombre, int puntosDeVida, int armadura, 
                    int ataqueFisico, int ataqueEspecial, 
                    int velocidadDeMovimiento, int ataqueBomba) {
        super(codigo, nombre, puntosDeVida, armadura, ataqueFisico, ataqueEspecial, velocidadDeMovimiento);
        this.ataqueBomba = ataqueBomba;
    }
    
}
