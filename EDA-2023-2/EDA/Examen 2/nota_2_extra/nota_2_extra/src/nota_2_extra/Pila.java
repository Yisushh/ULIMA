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
public class Pila<T> {
    // Atributos
    private Nodo<T> top;
    
    // Constructor para crear una pila
    public Pila(){ // objeto pila totalmente vacia
        top = null;
    }
    // Otro metodos
    // Verifica si una pila esta vacia
    public boolean isEmpty(){
        return top == null;
    }
    // push() - Apilar: Añade un elemento en la cima de la pila
    public void push(T elemento){
        Nodo<T> nuevoNodo = new Nodo(elemento,null);
        if (isEmpty()){
            top = nuevoNodo;
        }else{ // la pila no esta vacia
            nuevoNodo.setSgteNodo(top);
            top = nuevoNodo;
        }
    }
    // pop() - desapilar: Sacar un elemento de la pila
    public T pop(){
        T elemento = null;
        if (!isEmpty()){
            // eliminar el nodo de la cima
            elemento = top.getElemento();
            top = top.getSgteNodo();
        }
        return elemento;
    }
    public void mostrar(Pila<T> pila) {
        Pila<T> aux = new Pila<>();
        while(!pila.isEmpty()){
            T x = pila.pop();
            System.out.print(x+"->");
            aux.push(x);
        }System.out.println("||");
        // devolver a la pila original sus elementos
        while (!aux.isEmpty()){
            pila.push(aux.pop());
        }
        System.out.println("");
    }
    
    public void eliminarMayor(){
        Pila<T> temp = new Pila<>();
        T mayor = this.top.getElemento();
        while(!this.isEmpty()){
            T aux = this.pop();
            if((Integer)mayor <= (Integer)aux){
                mayor=aux;
            }
            temp.push(aux);
        }
        while(!temp.isEmpty()){
            T aux = temp.pop();
            if(aux!=mayor){
                this.push(aux);
            }
            
        }
    }
    
}