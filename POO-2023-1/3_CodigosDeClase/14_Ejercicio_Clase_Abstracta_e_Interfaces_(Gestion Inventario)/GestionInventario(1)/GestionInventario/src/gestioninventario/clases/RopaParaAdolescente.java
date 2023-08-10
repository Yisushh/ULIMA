/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninventario.clases;

import gestioninventario.helper.HelperAleatorio;
import java.util.Random;

/**
 *
 * @author profo1601
 */
public class RopaParaAdolescente extends Vestimenta implements CalculadorDeCostos {
    
    private float costoConfeccion;
    
    public RopaParaAdolescente(String talla, String color) {
        super(talla, color);
    }

    @Override
    public void calcularInventario() {
        this.calcularCostoConfeccion();
        this.cantidad = HelperAleatorio.getNumeroAleatorio(220, 380);
    }

    @Override
    public void calcularCostoConfeccion() {
        Random rand = new Random();
        this.costoConfeccion = MIN_COSTO + rand.nextInt((MAX_COSTO-MIN_COSTO)/6)*6;
    }
    
    @Override
    public String getDatos() {
        return super.getDatos() + ", TIPO: ROPA PARA ADOLESCENTE, COSTO CONFECCION: " + this.costoConfeccion;
    }
}
