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
public class BST {

    /**
     * @param args the command line arguments
     */
    //25,13,34,9,17,29,52,4,26,44,61
    public static void main(String[] args) {
        /*
        1) Ingrese el siguiente BST en su el programa realizado en clase:

        Programe las siguientes funciones:
        a) Recorrido preorder, en este tipo de recorrido se recorre primero la raíz, luego la
        rama izquierda y para finalizar la rama derecha.
        b) Recorrido postorder, en este recorrido se recorre primero la parte izquierda, luego
        la parte derecha y al final la raíz.

        */
        BinaryTree bt=new BinaryTree();
        int datos[]={25,13,34,9,17,29,52,4,26,44,61};
        //int datos[]={8,3,10,1,6,4,7,14};
        for (int i=0;i<datos.length;i++){
            bt.insertarElem(datos[i]);
        }
        
        System.out.print("Inorder inicial: ");bt.inorder(bt.raiz);System.out.println();
        System.out.print("Preorder inicial: ");bt.preOrder(bt.raiz);System.out.println();
        System.out.print("Postorder inicial: ");bt.postOrder(bt.raiz);System.out.println();
        /*bt.borrar(8);
        System.out.println();
        bt.inorder(bt.raiz);*/
        System.out.println();
        System.out.println("altura "+bt.getAltura(bt.raiz));
        System.out.println("altura "+bt.getAlturaIter(bt.raiz));
        //bt.borrarMenor();
        //bt.inorder(bt.raiz);
        //----
        System.out.println("\n------");
        bt.imprimirArbol();
        
        System.out.println("\n------p2");
        System.out.println(bt.buscarElemento(bt.raiz, 25));
        
        System.out.println("\n------p3");
        System.out.println(bt.menorValor(bt.raiz));
        System.out.println(bt.mayorValor(bt.raiz));
    
        System.out.println("\n------p3");
        bt.vaciarArbol();
        //BinaryTree bt2 = new BinaryTree();
        datos = new int[]{20, 14, 27, 7, 18, 22, 31, 15, 28, 35, 30};
        for (int i=0;i<datos.length;i++){
            bt.insertarElem(datos[i]);
        }
        bt.imprimirArbol();
        
        bt.imprimirElementosOrdenados();
        
    }
    
}
