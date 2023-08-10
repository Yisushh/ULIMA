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
public class Araña extends Animal {

    public Araña(int patas) {
        super(patas);
    }

    @Override
    public void comer() {
        System.out.println("Yo como lo que atrapo en mi telaraña");
    }
    
}
