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
public class ArbImp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol tree=new Arbol();
        NodoT raiz=tree.crearArbol();
        tree.inOrder(raiz);
        System.out.println("num nodos "+tree.contarN(raiz));
        System.out.println("nodos derecha");
        tree.listarElemD(raiz);
    }
    
}
