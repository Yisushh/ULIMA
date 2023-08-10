/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen02.pregunta1;
import modelo.*;

/**
 *
 * @author otro3
 */
public class Examen02Pregunta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Unidad objUnidad = new Unidad(1,"Zealot",100,10,5,8,2);
        Aereo objaereo = new Aereo(1,"Fighter",100,10,5,8,2,10,50);
        AereoDeCarga objAereoDeCarga = new AereoDeCarga(1,"Fighter",100,10,5,8,2,10,50,4);
        AereoInfiltracion objAereoInfiltracion = new AereoInfiltracion(1,"Fighter",100,10,5,8,2,10,50,true);
        Motorizado objMotorizado = new Motorizado(1,"Tank",100,10,5,8,2,30,6);
        Soldado objSoldado = new Soldado(1,"Zergling",100,10,5,8,2,200);
        
    }
    
}
