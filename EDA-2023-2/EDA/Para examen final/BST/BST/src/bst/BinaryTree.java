/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author ProfO2202
 */
public class BinaryTree {
    NodoT raiz;
    public void insertarElem(int n){
        raiz=insertarElemRec(raiz,n);
    }
    public NodoT insertarElemRec(NodoT raiz,int n){
        if (raiz==null){
            raiz=new NodoT(n);
        }
        else{
            if (n<raiz.elem){
                raiz.izq=insertarElemRec(raiz.izq,n);
            }
            else{
                raiz.der=insertarElemRec(raiz.der,n);
            }
        }
        return raiz;
    }
    public void inorder(NodoT raiz){
        if (raiz!=null){
            inorder(raiz.izq);
            System.out.print(raiz.elem+" ");
            inorder(raiz.der);
        }
    }
    public void borrar(int n){
        raiz=borrarNodo(raiz,n);
    }
    public NodoT borrarNodo(NodoT curr,int n){
        //curr apunta la raíz del árbol
        if (curr==null){
            System.out.println("no encontrado");
            return null;
        }
        if (n<curr.elem){
            curr.izq=borrarNodo(curr.izq,n);
        }
        else if (n>curr.elem){
                curr.der=borrarNodo(curr.der,n);
            }
        else{
            //caso un sólo hijo a la derecha
            if (curr.izq==null) return curr.der;
            //caso un sólo hijo a la izquierda
            else if (curr.der==null) return curr.izq;
            //caso dos hijos
            curr.elem=menorValor(curr.der);
            curr.der=borrarNodo(curr.der,curr.elem);
        }
        return curr;
    }
    int menorValor(NodoT curr){
        int menor=curr.elem;
        while (curr.izq!=null){
            menor=curr.elem;
            curr=curr.izq;
        }
        return menor;
    }
}
