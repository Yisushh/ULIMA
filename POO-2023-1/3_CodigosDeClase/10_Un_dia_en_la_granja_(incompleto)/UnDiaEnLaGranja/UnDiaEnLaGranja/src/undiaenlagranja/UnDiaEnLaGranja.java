/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undiaenlagranja;
import modelo.Granja;
import modelo.Pollo;

/**
 *
 * @author profl3302
 */
public class UnDiaEnLaGranja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Granja objGranja = new Granja("Granja Pollitos Felices",100);
        
        //Pollo objPollo = new Pollo("Luis", 12, 20);
        
        //objGranja.insertar(objPollo);
        
        objGranja.insertarTodos();
        
        objGranja.imprimirPollos();
        
    }
    
}
