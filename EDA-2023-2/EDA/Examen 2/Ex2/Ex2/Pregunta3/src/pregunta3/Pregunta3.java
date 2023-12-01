/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta3;

/**
 *
 * @author o23413
 */
public class Pregunta3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {3, 5, 2, 1};
        Cola cola = new Cola();
        for (int i = 0; i < v.length; i++) {
            cola.encolar(v[i]);
        }

        System.out.println("\nCola Inicial:");
        cola.imprimir();
        cola.eliminarMayor();
        System.out.println("\nCola Final:");
        cola.imprimir();

    }

}
