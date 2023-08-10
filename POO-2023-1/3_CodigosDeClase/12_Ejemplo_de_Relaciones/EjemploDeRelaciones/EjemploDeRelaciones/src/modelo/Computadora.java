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
public class Computadora {
    private int id;
    private String marca;
    private String modelo;
    private TarjetaDeVideo tarjetaDeVideo;
    private Accesorio[] accesorios;

    public Computadora(int id, String Marca, String Modelo, 
                        TarjetaDeVideo tarjetaDeVideo,
                        Accesorio[] accesorios) {
        this.id = id;
        this.marca = Marca;
        this.modelo = Modelo;
        this.tarjetaDeVideo = tarjetaDeVideo;
        this.accesorios = accesorios;
    }
    
    public String toString() {
        String concat =  "PC: " + this.marca + " " + this.modelo +
                "\nTarjeta de video:" + this.tarjetaDeVideo.toString();
                
        for(Accesorio accesorio:accesorios) {
            concat = concat + ",Accesorio: " + accesorio.getDescripcion() 
                    + " " + accesorio.getMarca();
        }
        return concat;
        
    }
    
    
}
