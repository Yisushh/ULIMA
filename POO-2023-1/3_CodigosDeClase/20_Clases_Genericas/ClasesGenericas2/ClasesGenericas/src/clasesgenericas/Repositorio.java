/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesgenericas;

import java.util.ArrayList;

/**
 *
 * @author profl3302
 */
public class Repositorio<T> {
    private ArrayList<T> lista;

    public Repositorio() {
        this.lista = new ArrayList<T>();
    }
    
    public void agregar(T objeto) {
        lista.add(objeto);
    }
    
    public void eliminar(T objeto) {
        lista.remove(objeto);
    }
    
    public T buscar(T objeto) {
        int i = lista.indexOf(objeto);
        
        return lista.get(i);
    }
}
