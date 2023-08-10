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
public class ClienteEstandar extends Cliente{
    private String nroDNI;
    private String fechaCumpleaños;

    public ClienteEstandar(String nroDNI, String fechaCumpleaños, String nombre, String direccion, double mtoMaxDscto, String distrito) {
        super( nombre, direccion, mtoMaxDscto, distrito);
        this.nroDNI = nroDNI;
        this.fechaCumpleaños = fechaCumpleaños;
        
        //Aquí se genera dinámicamente el código único
        super.codigoUnicoCliente = this.generaCodigoUnico();
    }
    
    @Override
    public String generaCodigoUnico(){
    /*en el caso de los clientes estándar es un aleatorio impar entre 11000 y 15000*/    
        boolean encontrado = false;
        int N=15000;
        int M=11000;
        int  numAleatorio=-1;
        while (!encontrado){
            numAleatorio = (int)(Math.random()*(N-M+1)+M);
            if (numAleatorio%2 !=0)
                encontrado= true;
        }
        return numAleatorio + "-" +  super.nombre;
    }
}
