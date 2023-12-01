/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota_2_extra;

/**
 *
 * @author o22215
 */
public class Nodo <T>{
    private T elemento;
    private Nodo<T> sgteNodo;
    public Nodo(){
        elemento = null;
        sgteNodo = null;
    }
    public Nodo(T pElemento, Nodo<T> pSgteNodo){
        elemento = pElemento;
        sgteNodo = pSgteNodo;
    }
    // Getter and Setter
    public T getElemento(){
        return elemento;
    }
    public void setElemento(T pElemento){
        elemento = pElemento;
    }
    public Nodo<T> getSgteNodo(){
        return sgteNodo;
    }
    public void setSgteNodo(Nodo<T> pSgteNodo){
        sgteNodo = pSgteNodo;
    }
}

