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
public class Lista {
    
    Nodo lista;
    Nodo primero;
    Nodo ultimo;
    
    public void agregarFrente(int n) {
        Nodo temp = new Nodo(n);
        if (lista == null) {
            primero = temp;
        } else {
            lista.sig = temp;
        }
        lista = temp;
        ultimo = temp;
    }
    
    public void agregarCima(int n) {
        Nodo temp = new Nodo(n);
        temp.sig = primero;
        primero = temp;
        if (lista == null) {
            lista = primero;
        }
    }
    
    public void imprimir() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.elem + " ");
            actual = actual.sig;
        }
        System.out.println("");
    }
    
    public void borrarImpares() {
        Lista listaTemp = new Lista();
        Nodo actual = primero;
        while (actual != null) {
            if (actual.elem % 2 != 0) {
                listaTemp.agregarFrente(actual.elem);
            }
            actual = actual.sig;
        }
        actual = listaTemp.primero;
        while (actual != null) {
            this.borrar(actual.elem);
            actual = actual.sig;
        }
        System.out.println("");
    }
    
    public int contar() {
        Nodo actual = primero;
        int c = 0;
        while (actual != null) {
            c++;
            actual = actual.sig;
        }
        return c;
    }
    
    public void borrar(int n) {
        Nodo prev = primero;
        Nodo actual = primero.sig;
        if (primero.elem == n) {
            primero = primero.sig;
        } else {
            while (actual != null) {
                if (actual.elem == n) {
                    //encontrado
                    break;
                } else {
                    prev = prev.sig;
                    actual = actual.sig;
                }
            }
            if (actual == null) {
                System.out.println("elemento no encontrado");
            } else {
                prev.sig = actual.sig;
                actual.sig = null;
            }
        }
    }
    
    public int sonIguales(Lista lista2) {
        int i = 1;
        int cl1, cl2;
        cl1 = this.contar();
        cl2 = lista2.contar();
        if (cl1 == cl2) {
            Nodo actuall1 = this.primero;
            while (actuall1 != null) {
                Nodo actuall2 = lista2.primero;
                while (actuall2 != null) {
                    if (actuall1.elem == actuall2.elem) {
                        break;
                    }
                    actuall2 = actuall2.sig;
                }
                if (actuall2 == null) {
                    i = -1;
                }
                if (i == -1) {
                    break;
                }
                actuall1 = actuall1.sig;
            }
        } else {
            i = -1;
        }
        return i;
    }

    /*public void concatenar(Lista lista){
        this.ultimo.sig=lista.primero;
        lista.primero=this.primero;
    }*/
    public void concatenar(Lista lista) {
        Nodo actual = lista.primero;
        while (actual != null) {
            agregarCima(actual.elem);
            actual = actual.sig;
        }
    }
    
    public Lista invertirLista() {
        Nodo actual = primero;
        Lista nuevaLista = new Lista();
        while (actual != null) {
            nuevaLista.agregarCima(actual.elem);
            actual = actual.sig;
        }
        
        return nuevaLista;
    }
    
    public Lista dividirLista(int elemento) {
        Nodo actual = primero;
        Lista Lista2 = new Lista();
        while (actual != null && actual.sig != null && actual.sig.elem != elemento) {
            actual = actual.sig;
        }
        
        Lista2.primero = actual.sig;
        actual.sig = null;
        
        return Lista2;
    }
}
