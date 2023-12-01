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
public class Nota_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = {2, 4, 3, 1, 2, 1};
        Pila<Integer> pila = new Pila<>(); 
        for (int i = 0; i < v.length; i++) {
            pila.push(v[i]);
        }

        System.out.println("\nPila Inicial:");
        pila.mostrar(pila);

        System.out.println("\nPila Final:");
        pila.eliminarMayor();
        pila.mostrar(pila);
    }
    
}
