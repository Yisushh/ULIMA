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
public class Nodo {

    public int elem;
    public int cod, prom, rank;
    Nodo sig;

    public Nodo(int elem) {
        this.elem = elem;
    }

    public Nodo(int cod, int prom, int rank) {
        this.cod = cod;
        this.prom = prom;
        this.rank = rank;
    }
}
