/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programatrapecio;

/**
 *
 * @author otro3
 */
public class ProgramaTrapecio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Trapecio objTrapecio = new Trapecio(4.0,5.0,4.0,6.0,4.5);
        
        double area = objTrapecio.calcularArea();
        String datos = objTrapecio.getDatos();
        double perimetro = objTrapecio.calcularPerimetro();
        
        System.out.println(datos);
        System.out.println("El area del trapecio es:" + area);
        System.out.println("El perímetro del trapecio es: " + perimetro);
    }
    
}
