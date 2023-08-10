/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proycineplus;

/**
 *
 * @author Giancarlo
 */
public class Cliente {
    protected String codigoUnicoCliente;
    protected String nombre;
    protected String direccion;
    protected double mtoMaxDscto;
    protected String distrito;

    public Cliente(String nombre, String direccion, double mtoMaxDscto, String distrito) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.mtoMaxDscto = mtoMaxDscto;
        this.distrito = distrito;
    }

    public String getCodigoUnicoCliente() {
        return codigoUnicoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getMtoMaxDscto() {
        return mtoMaxDscto;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    public String generaCodigoUnico(){
        return "";
    } 
}
