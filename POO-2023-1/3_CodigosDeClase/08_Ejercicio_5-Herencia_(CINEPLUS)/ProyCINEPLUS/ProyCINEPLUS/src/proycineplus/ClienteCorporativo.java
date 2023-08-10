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
public class ClienteCorporativo extends Cliente{
    private String RUC;
    private String nombreDeResponsable;

    public ClienteCorporativo(String RUC, String nombreDeResponsable,  String nombre, String direccion, double mtoMaxDscto, String distrito) {
        
        super(nombre, direccion, mtoMaxDscto, distrito);
        this.RUC = RUC;
        this.nombreDeResponsable = nombreDeResponsable;
        
        //Aquí se genera dinámicamente el código único
        super.codigoUnicoCliente = this.generaCodigoUnico();
    }
    
    
    @Override
    public String generaCodigoUnico(){
    /*Para generar el código único de cliente en el caso de los 
        corporativos es un aleatorio par entre 1200 y 5400*/    
        boolean encontrado = false;
        int N=5400;
        int M=1200;
        int  numAleatorio=-1;
        while (!encontrado){
            numAleatorio = (int)(Math.random()*(N-M+1)+M);
            if (numAleatorio%2 ==0)
                encontrado= true;
        }
        
        return numAleatorio + "-" + super.nombre;
    } 
    
}
