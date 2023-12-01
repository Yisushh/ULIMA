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
public class NodoTesp {
    int cod;
    String nomb;
    int stock;
    NodoTesp izq;
    NodoTesp der;
    public NodoTesp(int cod,String nomb,int stock){
        this.cod=cod;
        this.nomb=nomb;
        this.stock=stock;
    }
}
