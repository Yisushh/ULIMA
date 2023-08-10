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
public abstract class Animal {
    protected int patas;

    public Animal(int patas) {
        this.patas = patas;
    }
    
    public abstract void comer();
}
