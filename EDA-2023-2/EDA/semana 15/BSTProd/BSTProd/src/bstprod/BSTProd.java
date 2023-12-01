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
public class BSTProd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cod[]={300,200,150,100,250};
        String nomb[]={"prod a","prod b","prod c","prod d","prod e"};
        int stock[]={1000,2000,1050,1000,2500};
        BST bt=new BST();
        for (int i=0;i<cod.length;i++){
            bt.insertarElem(cod[i], nomb[i], stock[i]);
        }
        bt.mostrarListado(bt.raiz);
        System.out.println();
        bt.actualizarStock(200, 1000);
        bt.mostrarListado(bt.raiz);
    }
    
}
