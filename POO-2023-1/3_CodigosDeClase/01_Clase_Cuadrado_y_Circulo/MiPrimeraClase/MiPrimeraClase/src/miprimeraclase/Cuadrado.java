/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraclase;
/**
 *
 * @author profl3302
 */
public class Cuadrado {
    
//Atributos
    private float lado;
    
//Constructor
    public Cuadrado() {
        lado = 1;
    }
    
    public Cuadrado(float plado) {
        lado = plado;
    }
    
 //Getters y Setters
    public float getLado() {            
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


//Metodos
    public float calcularArea() {
        double resultado = Math.pow(lado, 2);
        
        return (float) resultado;
    }
    
    public float calcularPerimetro() {
        float perimetro = lado * 4;
        
        return perimetro;
    }

    public void imprimir() {
        System.out.println("Soy un cuadrado cuyos lados son de tamaño: " + lado);
    }
    
}
