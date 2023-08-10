/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesgenericas2;

import java.util.ArrayList;

/**
 *
 * @author profl3302
 */
public class Bolsa<T> {
    
    private ArrayList<T> lista;

    public Bolsa() {
        this.lista = new ArrayList<T>();
    }
    
    public void agregar(T objeto){
        lista.add(objeto);
    }
    
     
}
