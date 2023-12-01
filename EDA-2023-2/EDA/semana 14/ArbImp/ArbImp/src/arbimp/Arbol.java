/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbimp;

/**
 *
 * @author ProfO2304
 */
public class Arbol {
    public NodoT crearArbol(){
        NodoT raiz=new NodoT(12);
        NodoT n1=new NodoT(10);
        NodoT n2=new NodoT(14);
        NodoT n3=new NodoT(9);
        NodoT n4=new NodoT(11);
        NodoT n5=new NodoT(15);
        NodoT n6=new NodoT(6);
        raiz.izq=n1;
        raiz.der=n2;
        n1.izq=n3;
        n1.der=n4;
        n2.der=n5;
        n4.der=n6;
        return raiz;
    }
    public void inOrder(NodoT raiz){
        if (raiz!=null){
            inOrder(raiz.izq);
            System.out.println(raiz.elem);
            inOrder(raiz.der);
        }
    }
    public int contarN(NodoT raiz){
        if (raiz==null){
            return 0;
        }
        else{
            return 1+contarN(raiz.izq)+contarN(raiz.der);
        }
    }
    public void listarElemD(NodoT raiz){
        if (raiz!=null){
            if (raiz.der!=null){
                System.out.println(raiz.der.elem);
            }
            listarElemD(raiz.izq);
            listarElemD(raiz.der);
        }
    }
}
