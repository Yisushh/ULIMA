package bst;

public class BST {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        int datos[]={8,3,10,1,6,4,7,14};
        for (int i=0;i<datos.length;i++){
            bt.insertarElem(datos[i]);
        }
        bt.inorder(bt.raiz);
        bt.borrar(8);
        System.out.println();
        bt.inorder(bt.raiz);
    }
    
}
