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
public class Circulo {
    public double radio;
    
    public Circulo(){
        radio = 1;
    }
    
    public Circulo(double r) {
        this.radio = r;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getArea() {
        return radio * radio * Math.PI;
    }
    
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }
}
