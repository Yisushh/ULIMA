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
public class Pila {

    public Nodo primero;
    public Nodo ultimo;
    public int cant;

    public Pila() {
        this.primero = this.ultimo = null;
        this.cant = 0;
    }

    public boolean estaVacio() {
        if (this.primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar(int n) {
        Nodo temp = new Nodo(n);
        if (this.estaVacio()) {
            this.primero = temp;
        } else {
            temp.sig = this.ultimo;
            this.ultimo = temp;
        }
        cant++;
    }

    public int desapilar() {
        if (this.estaVacio()) {
            return -1;
        } else {
            int n = this.ultimo.elem;
            this.ultimo = this.ultimo.sig;
            cant--;
            return n;
        }
    }

    public int peek() {
        if (this.estaVacio()) {
            System.out.println("Pila vacia");
            return -1;
        } else {
            return this.ultimo.elem;
        }
    }

    public void imprimir() {
        Nodo actual = ultimo;
        while (actual != null) {
            System.out.print(actual.elem + "->");
            actual = actual.sig;
        }
        System.out.print(this.primero.elem);
        System.out.println();
    }

    public void eliminarRepetidos() {
        Pila temp = new Pila();
        Nodo actual = ultimo;
        while (actual != null) {
            if (!this.esRepetido(actual.elem)) {
                temp.apilar(actual.elem);
            }
            actual = actual.sig;
        }
        temp.imprimir();

    }

    public boolean esRepetido(int x) {
        Nodo actual = ultimo;
        int cant = 0;
        while (actual != null) {
            if (actual.elem == x) {
                //System.out.println(actual.elem + "=" + x);
                //System.out.println("gaa");
                cant++;
            }
            actual = actual.sig;
        }
        if (x == this.primero.elem) {
            cant++;
        }
        if (cant > 1) {
            return true;
        }
        return false;
    }

}
