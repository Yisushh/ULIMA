/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariodeempleados.gestion;
import salariodeempleados.clases.Empleado;

/**
 *
 * @author otro3
 */
public class GestionEmpleado {
    private Empleado[] empleados;
    private int nroEmpleados;
    
    public GestionEmpleado() {
        this.empleados = new Empleado[10];
        this.nroEmpleados = 0;
    }
    
    public boolean insertar(Empleado empleado){
        if (nroEmpleados < 10) {
            empleados[this.nroEmpleados] = empleado;
            this.nroEmpleados++;
            return true;
        } 
        System.out.println("No se ingresó empleado " + empleado.getCodigo() + ", no hay mas espacio en memoria.");
        return false;          
    }
    
    public Empleado buscarMayorSalario() {
        Empleado empleadoConMayorSalario = null;
        
        float mayorSalario = -1;
        
        for(Empleado empleado:this.empleados){
            if (empleado != null &&
                empleado.CalcularSalarioSemanal() > mayorSalario){
                mayorSalario = empleado.CalcularSalarioSemanal();
                empleadoConMayorSalario = empleado;
            }
        }
        
        return empleadoConMayorSalario;
    }
    
    public void imprimirEmpleadosConMayorSalario() {
        Empleado empleado = buscarMayorSalario();
        
        System.out.println(empleado.toString());

        
    }
    
    public void imprimirEmpleados() {
        for(Empleado empleado:empleados) {
            if (empleado != null) {
                System.out.println(empleado.toString());
            }
            
        }
    }
}
