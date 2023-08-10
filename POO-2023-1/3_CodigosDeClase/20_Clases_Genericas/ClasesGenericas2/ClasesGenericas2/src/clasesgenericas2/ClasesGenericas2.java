/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesgenericas2;

/**
 *
 * @author profl3302
 */
public class ClasesGenericas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bolsa<Dulce> bolsa = new Bolsa<Dulce>();
        
        Bolsa<UtensiliosDeCocina> bolsa2 = new Bolsa<UtensiliosDeCocina>();
        
        Dulce objChocolatina = new Chocolatina("Donofrio");
        Dulce objGolosina = new Golosina("Winters");
        
        UtensiliosDeCocina objUDC = new UtensiliosDeCocina();
        
        bolsa.agregar(objChocolatina);
        bolsa.agregar(objGolosina);
        
        
    }
    
}
