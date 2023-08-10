/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovivalibre;

import modelo.Casa;
import modelo.Departamento;

/**
 *
 * @author profl3302
 */
public class ProyectoVivaLibre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Casa objCasa1 = new Casa(150,1000);
        
        System.out.println("Prefio Final Casa 1: " + objCasa1.calcularPrecioFinal());
        
        Casa objCasa2 = new Casa(171,1000);
        
        System.out.println("Prefio Final Casa 2: " + objCasa2.calcularPrecioFinal());

        Departamento objDepartamento2 = new Departamento(120,120000);
        
        System.out.println("Prefio Final Dpto 2: " + objDepartamento2.calcularPrecioFinal());
        
        Departamento objDepartamento1 = new Departamento(175,220000);
        
        System.out.println("Prefio Final Dpto 1: " + objDepartamento1.calcularPrecioFinal());
        
        Departamento objDepartamento3 = new Departamento(100,90000);
        
        System.out.println("Prefio Final Dpto 3: " + objDepartamento3.calcularPrecioFinal());
    }
    
}
