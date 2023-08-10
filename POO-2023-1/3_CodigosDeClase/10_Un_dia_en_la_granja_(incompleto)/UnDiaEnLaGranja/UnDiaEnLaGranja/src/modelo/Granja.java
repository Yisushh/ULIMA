/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Scanner;

/**
 *
 * @author profl3302
 */
public class Granja {
    private String nombre;
    private float area;
    private Pollo[] pollitos;
    private int nroPollitos;
    
    private Scanner scanner;

    public Granja(String nombre, float area) {
        this.nombre = nombre;
        this.area = area;
        this.pollitos = new Pollo[3];
        this.nroPollitos = 0;
        
        this.scanner = new Scanner(System.in);
    }
    
    public void insertarTodos() {
        
        for(int i = 0; i < pollitos.length; i++) {
            System.out.println("Ingrese nombre de pollito: ");
            String nombre = scanner.next();
            System.out.println("Ingrese peso del pollito: ");
            int peso = scanner.nextInt();
            System.out.println("Ingrese tiempo en dias del pollito: ");
            int tiempoEnDias = scanner.nextInt();
            
            Pollo objPollo = new Pollo(nombre, peso, tiempoEnDias);
            
            this.insertar(objPollo);
        }
    }
    
    public void insertar(Pollo pollo) {
        if (this.nroPollitos < 10) {
           this.pollitos[this.nroPollitos] = pollo;
           this.nroPollitos += 1; 
            System.out.println("Pollo " + pollo.getNombre() + " ingresado!");
        } else {
            System.out.println("No se puede insertar, espacios llenos.");
        }
        
    }
    
    public void imprimirPollos() {
    
        for(Pollo pollo: pollitos) {
            if(pollo != null) {
                System.out.println("\n" + pollo.toString());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public float getArea() {
        return area;
    }

    public Pollo[] getPollitos() {
        return pollitos;
    }

    public int getNroPollitos() {
        return nroPollitos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPollitos(Pollo[] pollitos) {
        this.pollitos = pollitos;
    }

    public void setNroPollitos(int nroPollitos) {
        this.nroPollitos = nroPollitos;
    }
    
    
    
}
