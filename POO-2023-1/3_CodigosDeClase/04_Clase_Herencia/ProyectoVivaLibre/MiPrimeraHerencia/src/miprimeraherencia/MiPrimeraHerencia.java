/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraherencia;

/**
 *
 * @author profl3302
 */
public class MiPrimeraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona objPersona = new Persona("Juan", "Perez", 43434343);
        
        Alumno objAlumno = new Alumno("Esteban", "Gomez", 12345678,20230001);
                
        System.out.println(objPersona.getDatos());
        
        System.out.println(objAlumno.getDatos());
        
        
    }
    
}
