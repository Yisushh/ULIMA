/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen02.pregunta3;
import modelo.*;
/**
 *
 * @author otro3
 */
public class Examen02Pregunta3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mensaje objMensaje = new Mensaje("Juan Perez", "jperez", "mlopez", "Hola Mundo!", "2023-05-15");
        Mensaje objMensaje2 = new MensajeSecreto("Juan Perez", "jperez", "mlopez", "Como estas?", "2023-05-15");
        Mensaje objMensaje3 = new MensajeProtegido("Juan Perez", "jperez", "mlopez", "Necesito ayuda.", "2023-05-15");
    
        System.out.println(objMensaje.toString());
        System.out.println(objMensaje2.toString());
        System.out.println(objMensaje3.toString());
    }
    
}
