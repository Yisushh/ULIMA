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
public class Cola {

    Nodo frente;
    Nodo cima;

    public void encolar(int n) {
        Nodo temp = new Nodo(n);
        if (frente == null) {
            frente = cima = temp;
        } else {
            temp.sig = cima;
            cima = temp;
        }
    }

    public boolean estaVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }

    public int decolar() {
        int elem = 0;
        if (estaVacia()) {
            System.out.println("cola vacia");
        } else {
            Nodo actual;
            actual = cima;
            //si tengo un solo elemento
            if (actual.sig == null) {
                elem = cima.elem;
                cima = frente = null;
            } else {
                while (actual.sig != frente) {
                    actual = actual.sig;
                }
                elem = frente.elem;
                frente = actual;
                actual.sig = null;
            }
        }
        return elem;
    }

    public void imprimir() {
        Nodo actual = cima;
        while (actual != null) {
            System.out.print(actual.elem + "->");
            actual = actual.sig;
        }
        System.out.print("null");
        System.out.println();
    }

    public int eliminarMayor() {
        Nodo actual = cima;
        Cola temp = new Cola();
        //hallamos el maximo
        int max = actual.elem;
        while (actual != null) {
            if (max <= actual.elem) {
                max = actual.elem;
            }
            actual = actual.sig;
        }
        //Filtramos el mayor 
        actual = cima;
        while (actual != null) {
            if (actual.elem != max) {
                temp.encolar(actual.elem);
            }
            actual = actual.sig;
        }
        // Vaciamos la cola
        int n = this.cuentaElemPropios();
        for (int i = 0; i < n; i++) {
            this.decolar();
        }
        //LA volvemos a llenar
        while (temp.estaVacia() != true) {
            this.encolar(temp.decolar());
        }
        return max;
    }

    public void invertirCola() {
        Cola temp = new Cola();
        Nodo actual = cima;
        while (actual != null) {
            temp.encolar(actual.elem);
            actual = actual.sig;
        }
        int n = this.cuentaElemPropios();
        for (int i = 0; i < n; i++) {
            this.decolar();
        }
        while (temp.estaVacia() != true) {
            this.encolar(temp.decolar());
        }
    }

    public int cuentaElem(Cola temp) {
        int cuenta = 0;
        while (this.estaVacia() != true) {
            temp.encolar(this.decolar());
            cuenta++;
        }
        return cuenta;
    }

    public int cuentaElemPropios() {
        Cola temp = new Cola();
        int cuenta = 0;
        while (this.estaVacia() != true) {
            temp.encolar(this.decolar());
            cuenta++;
        }
        while (temp.estaVacia() != true) {
            this.encolar(temp.decolar());
        }
        return cuenta;
    }

    public int peek() {
        return frente.elem;
    }

    public Cola unirColasOrdenadas(Cola c1, Cola c2) {
        Cola c3 = new Cola();

        while (!c1.estaVacia()) {
            if (!c2.estaVacia()) {
                if (c1.peek() < c2.peek()) {
                    c3.encolar(c1.decolar());
                } else {
                    c3.encolar(c2.decolar());
                }
            } else {
                c3.encolar(c1.decolar());
            }
        }

        while (!c2.estaVacia()) {
            c3.encolar(c2.decolar());
        }
        return c3;
    }
}
