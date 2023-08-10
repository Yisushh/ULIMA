/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacuentadeahorros;

/**
 *
 * @author otro3
 */
public class ProgramaCuentaDeAhorros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaDeAhorros objCuentaDeAhorros = new CuentaDeAhorros("Juan Romaina", "Soles", "11223344");
        
        System.out.println(objCuentaDeAhorros.getDatos());
        
        System.out.println("Deposito de 100");
        objCuentaDeAhorros.deposito(100.00f);
        System.out.println(objCuentaDeAhorros.getSaldoActual()); //100
        
        System.out.println("Retiro de 50");
        objCuentaDeAhorros.retiro(50.00f);
        System.out.println(objCuentaDeAhorros.getSaldoActual()); //50
        
        System.out.println("Retiro de 60");
        objCuentaDeAhorros.retiro(60.00f); //error
        System.out.println(objCuentaDeAhorros.getSaldoActual()); //50
    }
    
}
