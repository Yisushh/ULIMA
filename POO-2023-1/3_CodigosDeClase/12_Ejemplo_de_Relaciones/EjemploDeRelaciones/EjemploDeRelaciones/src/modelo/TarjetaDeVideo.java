/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author profl3302
 */
public class TarjetaDeVideo {
    private int id;
    private String marca;
    private String modelo;
    private int vram;
    private int frecuencia;

    public TarjetaDeVideo(int id, String marca, String modelo, int vram, int frecuencia) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.vram = vram;
        this.frecuencia = frecuencia;
    }
    
    public String toString() {
        return this.marca + " " + modelo + " " + vram + " " + frecuencia;
    }
    
}
