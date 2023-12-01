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
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree bt=new BinaryTree();
        int datos[]={8,3,10,1,6,4,7,14};
        for (int i=0;i<datos.length;i++){
            bt.insertarElem(datos[i]);
        }
        bt.inorder(bt.raiz);
        bt.borrar(8);
        System.out.println();
        bt.inorder(bt.raiz);
    }
    
}
