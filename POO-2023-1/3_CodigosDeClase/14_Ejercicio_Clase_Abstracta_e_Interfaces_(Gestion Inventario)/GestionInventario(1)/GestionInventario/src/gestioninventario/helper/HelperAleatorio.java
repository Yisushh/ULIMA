/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninventario.helper;

import java.util.Random;

/**
 *
 * @author otro3
 */
public class HelperAleatorio {
    public static int getNumeroAleatorio(int min, int max){
        int range = (max - min) + 1;  
        
        return (int)(Math.random() * range) + min;
     }
    
    public static int getNumeroAleatorioPar(int min, int max){
        Random rand = new Random();
        
        return min + rand.nextInt((max-min)/2)*2;
    }
    
    public static int getNumeroAleatorioImPar(int min, int max){
        int aleatorio = getNumeroAleatorioPar(min,max);
        
        return aleatorio % 2 == 0 ? aleatorio + 1 : aleatorio; 
    }
}
