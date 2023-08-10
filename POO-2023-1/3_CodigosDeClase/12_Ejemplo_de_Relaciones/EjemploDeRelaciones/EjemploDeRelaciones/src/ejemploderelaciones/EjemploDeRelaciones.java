/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploderelaciones;
import modelo.Computadora;
import modelo.TarjetaDeVideo;
import modelo.Accesorio;

/**
 *
 * @author profl3302
 */
public class EjemploDeRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TarjetaDeVideo objTarjetaDeVideo = new TarjetaDeVideo(1,"Asus","ROG Strix 4090", 32, 1066);
        
        Accesorio accesorio1 = new Accesorio(1,"Teclado Gamer", "Razer");
        Accesorio accesorio2 = new Accesorio(2,"Mouse Gamer", "Razer");
        Accesorio accesorio3 = new Accesorio(3,"Audifonos", "Hello Kitty");
        
        Accesorio[] accesorios = { accesorio1,accesorio2,accesorio3 };
        
        Computadora objComputadora = new Computadora(1,"InHouse","001", objTarjetaDeVideo,accesorios);
        
        System.out.println(objComputadora.toString());
                
    }
    
}
