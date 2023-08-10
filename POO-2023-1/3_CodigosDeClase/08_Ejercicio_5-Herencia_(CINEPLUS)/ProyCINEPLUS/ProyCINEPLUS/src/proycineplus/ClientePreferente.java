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
public class ClientePreferente extends Cliente{
    private String nroTarjeta;
    private String marcaAuto;

    public ClientePreferente(String nroTarjeta, String marcaAuto, String nombre, String direccion, double mtoMaxDscto, String distrito) {
        super( nombre, direccion, mtoMaxDscto, distrito);
        this.nroTarjeta = nroTarjeta;
        this.marcaAuto = marcaAuto;
        
        //Aquí se genera dinámicamente el código único
        super.codigoUnicoCliente = this.generaCodigoUnico();
    }
    
    @Override
    public String generaCodigoUnico(){
    /*en el caso de los preferentes es un aleatorio múltiplo de 7 entre 5000 y 1000*/    
        boolean encontrado = false;
        int N=5000;
        int M=1000;
        int  numAleatorio=-1;
        while (!encontrado){
            numAleatorio = (int)(Math.random()*(N-M+1)+M);
            if (numAleatorio%7 ==0)
                encontrado= true;
        }
        return numAleatorio + "-" + super.nombre;
    }
}
