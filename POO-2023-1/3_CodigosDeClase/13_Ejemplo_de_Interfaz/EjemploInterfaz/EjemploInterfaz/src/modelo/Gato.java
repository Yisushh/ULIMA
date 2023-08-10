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
public class Gato extends Animal implements Mascota {

    private String nombre;
    
    public Gato(int patas) {
        super(patas);
    }

    @Override
    public void comer() {
        System.out.println("Yo como ratones");
    }

    @Override
    public void setNombre() {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void jugar() {
        System.out.println("Estoy jugando con mi dueño!");
    }
    
}
