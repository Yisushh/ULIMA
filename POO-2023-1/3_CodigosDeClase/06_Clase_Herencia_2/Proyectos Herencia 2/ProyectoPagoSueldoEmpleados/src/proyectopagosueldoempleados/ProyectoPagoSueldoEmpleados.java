/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopagosueldoempleados;
import modelo.Administrativo;
import modelo.Electronico;
import modelo.Programador;
import modelo.Empleado;

/**
 *
 * @author otro3
 */
public class ProyectoPagoSueldoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Administrativo objAdministrativo = new Administrativo("Juan Perez", "Av SN 1",10000,"Gerente");
        Electronico objElectronico = new Electronico("Juan Sanchez","Av SN 2", 11000,6);
        Empleado objProgramador = new Programador("Santiago Lopez", "Av SN 3", 12000, new String[] {"Web","Algoritmos"},1);
        
        System.out.println("El sueldo del Admin es: " + objAdministrativo.calcularSueldo());
        System.out.println("El sueldo del Electronico es: " + objElectronico.calcularSueldo());
        System.out.println("El sueldo del Programador es: " + objProgramador.calcularSueldo());
        
        
        
        
    }
    
}
