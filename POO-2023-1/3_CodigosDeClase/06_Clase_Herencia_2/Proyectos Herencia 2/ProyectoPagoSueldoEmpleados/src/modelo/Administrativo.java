/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author otro3
 */
public class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombreCompleto, String direccion, double sueldoBasico, String cargo) {
        super(nombreCompleto, direccion, sueldoBasico);
        this.tipo = "A";
        this.cargo = cargo;
        
    }
    
    @Override
    public double calcularSueldo() {
        if (this.cargo.equals("Secretaria")) {
            return super.calcularSueldo() + 30;
        } else if (this.cargo.equals("Jefe de Seccion")) {
            return (super.calcularSueldo() * 1.05) + 150;
        } else if (this.cargo.equals("Gerente")) {
            return (super.calcularSueldo() * 1.10) + 300;
        }
        
        return this.sueldoBasico;
    }
}
