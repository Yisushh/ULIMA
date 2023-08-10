/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programatrapecio;

/**
 *
 * @author otro3
 */
public class Trapecio {
    private double ladoa;
    private double ladob;
    private double ladoB;
    private double ladoc;
    private double h;

    public Trapecio(double ladoa, double ladob, 
                    double ladoB, double ladoc, double h) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoB = ladoB;
        this.ladoc = ladoc;
        this.h = h;
    }
    
    public double calcularArea() {
        return ((this.ladob + this.ladoB) / 2) * this.h;
    }
    
    public double calcularPerimetro() {
        return this.ladoa + this.ladob + this.ladoB + this.ladoc;
    }
    
    public String getDatos() {
        return "TRAPECIO \n" + 
                "Lado a: " + this.ladoa + "\n" +
                "Lado b: " +  this.ladob + "\n" +
                "Lado B: " +  this.ladoB + "\n" +
                "Lado c: " +  this.ladoc + "\n" +
                "Altura: " + this.h;
    }
    
    
    

}
