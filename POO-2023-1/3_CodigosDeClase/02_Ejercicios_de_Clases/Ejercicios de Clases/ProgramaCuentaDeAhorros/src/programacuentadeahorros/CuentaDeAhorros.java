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
public class CuentaDeAhorros {

    private String nombre;
    private String moneda;
    private String dni;
    private float saldo;
    
    public CuentaDeAhorros(String nombre, String moneda, String dni) {
        this.saldo = 0;
        this.dni = dni;
        this.moneda = moneda;
        this.nombre = nombre;
    }

    public void deposito(float f) {
        this.saldo = this.saldo + f;
        
        // this.saldo += f;
    }

    public void retiro(float f) {
        if (f > this.saldo)
            System.out.println("Saldo insuficiente");
        else
            this.saldo = this.saldo - f;
    }
    
    public String getSaldoActual() {
        return "El saldo actual de la cuenta es: " + this.saldo;
    }

    public String getDatos() {
        return "Titular: " + this.nombre + "\n" +
                "DNI: " + this.dni + "\n" +
                "Moneda: " + this.moneda + "\n" +
                "Saldo: " + this.saldo + "\n";
                
    }
    
}
