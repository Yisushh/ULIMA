/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

/**
 *
 * @author o23413
 */
public class Pregunta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valorEntero;
        Lista lista = new Lista();
        for (int i = 0; i < 10; i++) {
            valorEntero = (int) (Math.floor(Math.random() * (10 - 1 + 1) + 1));
            lista.agregarFrente(valorEntero);
        }
        System.out.println("Lista Completa:");
        lista.imprimir();
        //Borrando impares
        lista.borrarImpares();
        System.out.println("Lista sin impares:");
        lista.imprimir();

    }

}
