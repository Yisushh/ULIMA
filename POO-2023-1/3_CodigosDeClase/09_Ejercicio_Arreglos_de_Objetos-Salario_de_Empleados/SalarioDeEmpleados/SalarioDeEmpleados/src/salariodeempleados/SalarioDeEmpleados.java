/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariodeempleados;
import salariodeempleados.gestion.GestionEmpleado;
import salariodeempleados.clases.Empleado;

/**
 *
 * @author otro3
 */
public class SalarioDeEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestionEmpleado objGestion = new GestionEmpleado();
        
//        Scanner objScanner = new Scanner (System.in);
//        int codigo = objScanner.next;
        
        objGestion.insertar(new Empleado(1,40,80.0f));
        objGestion.insertar(new Empleado(2,41,70.0f));
        objGestion.insertar(new Empleado(3,44,80.0f));
        objGestion.insertar(new Empleado(4,30,80.0f));
        objGestion.insertar(new Empleado(5,20,90.0f));
        objGestion.insertar(new Empleado(6,50,50.0f));
        objGestion.insertar(new Empleado(7,50,50.0f));
        objGestion.insertar(new Empleado(8,20,90.0f));
        objGestion.insertar(new Empleado(9,30,70.0f));
        objGestion.insertar(new Empleado(10,50,50.0f));
        objGestion.insertar(new Empleado(11,20,95.0f));
        
        System.out.println("EMPLEADO CON MAYOR SALARIO: ");
        objGestion.imprimirEmpleadosConMayorSalario();
        System.out.println("LISTA DE EMPLEADOS: ");
        objGestion.imprimirEmpleados();
    }
    
}
