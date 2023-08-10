/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerarreglodeobjetos;

import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;

/**
 *
 * @author profl3302
 */
public class MiPrimerArregloDeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona[] personas = new Persona[4];
        
        Persona persona1 = new Docente ("Juan", "Perez", "12345678",1000);
        Persona persona2 = new Docente ("Mario", "Gomez", "12325678",2000);
        Persona persona3 = new Estudiante("Felipe", "Sanchez", "98765432",450);
        Persona persona4 = new Estudiante("Maria", "Flores", "91165432",650);
        
        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;
        personas[3] = persona4;
        
//        for(Persona p: personas) {
//            System.out.println(p.toString());
//        }
        
//        for(Persona p: personas) {
//            if (p.getNombre().equals("Maria")) {
//                System.out.println("Encontré a Maria!");
//                System.out.println(p.toString());
//            }
//        }

        Persona personaBusqueda = buscarPersona(personas, "Maria");
        
        System.out.println(personaBusqueda.toString());
        
        Persona personaBusqueda2 = buscarPersona(personas, "Mario");
        
        System.out.println(personaBusqueda2.toString());
        
        Persona personaBusqueda3 = buscarPersona(personas, "Julio");
        
        if (personaBusqueda3 != null) {
            System.out.println(personaBusqueda3.toString());
        } else {
            System.out.println("No se encontró.");
        }
        
        
        
    }
    
    private static Persona buscarPersona(Persona[] personas, String nombrePersona) {
        
        for(Persona p: personas) {
            if (p.getNombre().equals(nombrePersona)) {
                return p;
            }
        }
    
        return null;
    }
    
}
