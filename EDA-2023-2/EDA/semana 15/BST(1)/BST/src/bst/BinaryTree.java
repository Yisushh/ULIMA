/*
 * Para cambiar el encabezado de la licencia, elige Encabezados de Licencia en Propiedades del Proyecto.
 * Para cambiar la plantilla de este archivo, elige Herramientas | Plantillas
 * y abre la plantilla en el editor.
 */
package bst;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * Clase que representa un árbol binario.
 */
public class BinaryTree {
    NodoT raiz; // La raíz del árbol

    /**
     * Método para insertar un elemento en el árbol binario.
     * @param n Elemento a insertar.
     */
    public void insertarElem(int n){
        raiz = insertarElemRec(raiz, n);
    }
    /**
    * Método para vaciar el árbol.
    * @param raiz Nodo actual en el árbol.
    */
   public void vaciarArbol() {
       this.raiz=null;
   }


    /**
     * Método auxiliar recursivo para la inserción de un elemento en el árbol.
     * @param raiz Nodo actual en el árbol.
     * @param n Elemento a insertar.
     * @return Nodo modificado después de la inserción.
     */
    public NodoT insertarElemRec(NodoT raiz, int n){
        if (raiz == null){
            raiz = new NodoT(n);
        }
        else{
            if (n < raiz.elem){
                raiz.izq = insertarElemRec(raiz.izq, n);
            }
            else{
                raiz.der = insertarElemRec(raiz.der, n);
            }
        }
        return raiz;
    }

    /**
     * Método para realizar un recorrido inorden (inorder) del árbol.
     * @param raiz Nodo actual en el árbol.
     */
    public void inorder(NodoT raiz){
        if (raiz != null){
            inorder(raiz.izq);
            System.out.print(raiz.elem + " ");
            inorder(raiz.der);
        }
    }
    /**
    * Método para realizar un recorrido preorden (preorder) del árbol.
    * @param raiz Nodo actual en el árbol.
    */
   public void preOrder(NodoT raiz){
       if (raiz != null){
           System.out.print(raiz.elem + " ");
           preOrder(raiz.izq);
           preOrder(raiz.der);
       }
   }

    /**
     * Método para realizar un recorrido postorden (postorder) del árbol.
     * @param raiz Nodo actual en el árbol.
     */
    public void postOrder(NodoT raiz){
        if (raiz != null){
            postOrder(raiz.izq);
            postOrder(raiz.der);
            System.out.print(raiz.elem + " ");
        }
    }

    /**
     * Método para eliminar un nodo con un valor específico del árbol.
     * @param n Valor a eliminar.
     */
    public void borrar(int n){
        raiz = borrarNodo(raiz, n);
    }

    /**
     * Método auxiliar recursivo para la eliminación de un nodo con un valor específico.
     * @param curr Nodo actual en el árbol.
     * @param n Valor a eliminar.
     * @return Nodo modificado después de la eliminación.
     */
    public NodoT borrarNodo(NodoT curr, int n){
        // curr apunta a la raíz del árbol
        if (curr == null){
            System.out.println("No encontrado");
            return null;
        }
        if (n < curr.elem){
            curr.izq = borrarNodo(curr.izq, n);
        }
        else if (n > curr.elem){
            curr.der = borrarNodo(curr.der, n);
        }
        else{
            // Caso: un solo hijo a la derecha
            if (curr.izq == null) return curr.der;
            // Caso: un solo hijo a la izquierda
            else if (curr.der == null) return curr.izq;
            // Caso: dos hijos
            curr.elem = menorValor(curr.der);
            curr.der = borrarNodo(curr.der, curr.elem);
        }
        return curr;
    }

    /**
     * Método para obtener el menor valor en un subárbol.
     * @param curr Nodo actual en el árbol.
     * @return El menor valor en el subárbol.
     */
    int menorValor(NodoT curr){
        int menor = curr.elem;
        while (curr.izq != null){
            menor = curr.izq.elem;
            curr = curr.izq;
        }
        return menor;
    }

    /**
    * Método para encontrar el mayor valor en el BST.
    * @param curr Nodo actual en el árbol.
    * @return El mayor valor en el árbol.
    */
   public int mayorValor(NodoT curr) {
       int mayor = curr.elem;
       while (curr.der != null) {
           mayor = curr.der.elem;
           curr = curr.der;
       }
       return mayor;
   }

    /**
     * Método para obtener la altura de un subárbol de manera recursiva.
     * @param raiz Nodo actual en el árbol.
     * @return Altura del subárbol.
     */
    int getAltura(NodoT raiz){
        if (raiz == null) return -1;
        else{
            return 1 + Math.max(getAltura(raiz.izq), getAltura(raiz.der));
        }
    }

    /**
     * Método para obtener la altura de un subárbol de manera iterativa utilizando una cola.
     * @param raiz Nodo actual en el árbol.
     * @return Altura del subárbol.
     */
    int getAlturaIter(NodoT raiz){
        if (raiz == null) return 0;
        Queue<NodoT> q = new LinkedList();
        q.add(raiz);
        int altura = -1;
        while (1 == 1){
            int nodoC = q.size();
            if (nodoC == 0) return altura;
            altura++;
            while (nodoC > 0){
                NodoT nodo = q.peek();
                q.remove();
                if (nodo.izq != null) q.add(nodo.izq);
                if (nodo.der != null) q.add(nodo.der);
                nodoC--;
            }
        }
    }

    /**
     * Método para eliminar el nodo con el menor valor en el árbol.
     */
    public void borrarMenor(){
        if (raiz == null){
            System.out.println("Árbol vacío");
        }
        raiz = borrarMenorRec(raiz);
    }

    /**
     * Método auxiliar recursivo para eliminar el nodo con el menor valor en el subárbol.
     * @param nodo Nodo actual en el subárbol.
     * @return Nodo modificado después de la eliminación.
     */
    public NodoT borrarMenorRec(NodoT nodo){
        if (nodo.izq == null){
            return nodo.der;
        }
        nodo.izq = borrarMenorRec(nodo.izq);
        return nodo;
    }
    
    /**
    * Método para buscar un elemento en el BST.
    * @param raiz Nodo actual en el árbol.
    * @param n Elemento a buscar en el árbol.
    * @return true si el elemento se encuentra en el árbol, false de lo contrario.
    */
   public boolean buscarElemento(NodoT raiz, int n) {
       if (raiz == null) {
           // El elemento no se encuentra en el árbol
           return false;
       }

       if (n == raiz.elem) {
           // El elemento se encuentra en el nodo actual
           return true;
       } else if (n < raiz.elem) {
           // El elemento podría estar en el subárbol izquierdo
           return buscarElemento(raiz.izq, n);
       } else {
           // El elemento podría estar en el subárbol derecho
           return buscarElemento(raiz.der, n);
       }
   }

    
    //--------
    /**
     * Método para imprimir el árbol de manera vertical.
     */
    public void imprimirArbol() {
        System.out.print("Arbol:\n\nn" + 0 + "    ");
        for (int i = 1; i < this.getAltura(this.raiz) + 1; i++) {
            System.out.print("n" + i + "   ");
        }
        System.out.println("\n");
        imprimirArbolRec(raiz, 0, "");
        System.out.println();
    }

    /**
     * Método auxiliar recursivo para imprimir el árbol de manera vertical.
     * @param nodo Nodo actual en el árbol.
     * @param nivel Nivel actual del nodo en el árbol.
     * @param direccion Dirección desde el padre al nodo actual ("", "/", "\").
     */
    private void imprimirArbolRec(NodoT nodo, int nivel, String direccion) {
        if (nodo != null) {//↘↗
            imprimirArbolRec(nodo.der, nivel + 1, "↗");

            for (int i = 0; i < nivel; i++) {
                System.out.print("     ");
            }

            System.out.println(direccion + nodo.elem);

            imprimirArbolRec(nodo.izq, nivel + 1, "↘");
        }
    }

    //-----
    /**
     * Método para imprimir los elementos del árbol en orden.
     */
    public void imprimirElementosOrdenados() {
        imprimirElementosOrdenadosRec(raiz);
        System.out.println(); // Agrega un salto de línea al final
    }

    /**
     * Método auxiliar recursivo para imprimir los elementos del árbol en orden.
     * @param nodo Nodo actual en el árbol.
     */
    private void imprimirElementosOrdenadosRec(NodoT nodo) {
        if (nodo != null) {
            imprimirElementosOrdenadosRec(nodo.izq);
            System.out.print(nodo.elem + " ");
            imprimirElementosOrdenadosRec(nodo.der);
        }
    }
    
    public int calcularNivel(int x) {
        NodoT actual = raiz;
        int nivel = 0;

        while (actual != null) {
            if (x == actual.elem) {
                return nivel; // Se encontró el valor, devuelve el nivel
            } else if (x < actual.elem) {
                actual = actual.izq; // Buscar en el subárbol izquierdo
            } else {
                actual = actual.der; // Buscar en el subárbol derecho
            }
            nivel++;
        }

        return -1; // Valor no encontrado en el árbol
    }

}
