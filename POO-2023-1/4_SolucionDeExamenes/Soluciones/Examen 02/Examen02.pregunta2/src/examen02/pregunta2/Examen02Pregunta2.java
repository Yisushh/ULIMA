/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen02.pregunta2;
import modelo.*;

/**
 *
 * @author otro3
 */
public class Examen02Pregunta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EducacionSegura objEducacionSegura = new EducacionSegura(1,"Juan Perez", 1200, 100, 15,200000);
        PlanAhorro objPlanAhorro = new PlanAhorro(2,"Ana Perez", 1200, 100, 60);
        VidaSegura objVidaSegura = new VidaSegura(3,"Julia Perez", 1200, 100,75);
        
        double monto1 = objEducacionSegura.calcularPrimaReferencia();
        double monto2 = objPlanAhorro.calcularPrimaReferencia();
        double monto3 = objVidaSegura.calcularPrimaReferencia();
        
        System.out.println("El monto 1: " + monto1);
        System.out.println("El monto 2: " + monto2);
        System.out.println("El monto 3: " + monto3);
    }
    
}
