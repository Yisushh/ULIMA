/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoviajes;
import modelo.Paquete;
import modelo.Cruceros;
import modelo.Pasajes;
/**
 *
 * @author otro3
 */
public class ProyectoViajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Paquete objPaquete = new Paquete(10, 2, "123", "09-09-2023", "19-09-2923", 10, 1000, 2);
        Cruceros objCrucero = new Cruceros(10, 2, "123", "09-09-2023", "19-09-2923", 10, 1000, 2);
        Pasajes objPasaje = new Pasajes("Ae","Ae",true, "123", "09-09-2023", "19-09-2923", 10, 1000, 2);
        
        
        System.out.println(objPaquete.calcularMontoAPagar());
        
    }
    
}
