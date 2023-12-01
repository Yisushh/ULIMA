/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta4;

/**
 *
 * @author o23413
 */
public class Pregunta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = {2, 4, 3, 1, 2, 1};
        Pila pila = new Pila();
        for (int i = 0; i < v.length; i++) {
            pila.apilar(v[i]);
        }

        System.out.println("\nPila Inicial:");
        pila.imprimir();

        System.out.println("\nPila Final:");
        pila.eliminarRepetidos();
    }

}
