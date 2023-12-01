/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstprod;

/**
 *
 * @author ProfO2304
 */
public class BST {
    NodoTesp raiz;
    public void insertarElem(int cod, String nomb, int stock){
        raiz=agregarRecursivo(raiz,cod,nomb,stock);
    }
    public NodoTesp agregarRecursivo(NodoTesp raiz,int cod,String nomb,int stock){
        if (raiz==null){
            raiz=new NodoTesp(cod,nomb,stock);
        }
        else{
            if (cod<raiz.cod){
                raiz.izq=agregarRecursivo(raiz.izq,cod,nomb,stock);
            }
            else{
                raiz.der=agregarRecursivo(raiz.der,cod,nomb,stock);
            }
        }
        return raiz;
    }
    public void mostrarListado(NodoTesp raiz){
        if (raiz!=null){
            mostrarListado(raiz.izq);
            System.out.println(raiz.cod+","+raiz.nomb+","+raiz.stock);
            mostrarListado(raiz.der);
        }
    }
    public void actualizarStock(int cod,int stU){
        buscarRec(raiz,cod,stU);
    }
    public void buscarRec(NodoTesp raiz,int cod, int stU){
        if (raiz.cod==cod){
            raiz.stock=raiz.stock+stU;
        }
        else{
            if (raiz==null){
                System.out.println("cod no encontrado");
            }
            else{
                if (cod<raiz.cod) buscarRec(raiz.izq,cod,stU);
                else buscarRec(raiz.der,cod,stU);
            }
        }
    }
}
