/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesgenericas;

/**
 *
 * @author profl3302
 */
public class Almacen<T> {
    private T objetoAlmacenado;
    
    public void agregar(T objeto) {
        objetoAlmacenado = objeto;
    }
    
    public T obtener() {
        return objetoAlmacenado;
    }
}
