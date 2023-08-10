/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programalibro;

/**
 *
 * @author otro3
 */
public class ProgramaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro objLibro1 = new Libro("Un Mundo para Julius", "Alfredo Bryce", "1970", 450);
        String datos = objLibro1.getDatos();
        System.out.println(datos);
        
        Libro objLibro2 = new Libro("The Hunger Games", "Suzanne Collins", "2008", 385);
        String datos2 = objLibro2.getDatos();
        System.out.println(datos2);
    }
    
}
