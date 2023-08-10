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
public class MiPrimeraClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        Cuadrado objCuadrado1 = new Cuadrado();
        Cuadrado objCuadrado2 = new Cuadrado(2);
        Cuadrado objCuadrado3 = new Cuadrado(3);
        
        objCuadrado1.imprimir();
        objCuadrado2.imprimir();
        objCuadrado3.imprimir();
       
        
        float area1 = objCuadrado1.calcularArea();
        System.out.println("El area del objCuadrado1 es " + area1);
        
        float area2 = objCuadrado2.calcularArea();
        System.out.println("El area del objCuadrado2 es " + area2);
        
        float area3 = objCuadrado3.calcularArea();
        System.out.println("El area del objCuadrado3  es " + area3);
        
        float perimetro1 = objCuadrado1.calcularPerimetro();
        System.out.println("El perímetro de objCuadrado1 es: " + perimetro1);
        
        float perimetro2 = objCuadrado2.calcularPerimetro();
        System.out.println("El perímetro de objCuadrado2 es: " + perimetro2);
        
        float perimetro3 = objCuadrado3.calcularPerimetro();
        System.out.println("El perímetro de objCuadrado3 es: " + perimetro3);
        
        Circulo objCirculo = new Circulo(3);
        
        double areaCirculo1 = objCirculo.getArea();
        System.out.println("El area del circulo es: " + areaCirculo1);
        
        double circunferenciaCirculo1 = objCirculo.getCircunferencia();
        System.out.println("La circunferencia del circulo es: " + circunferenciaCirculo1);
        
        
    }
    
}
