/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesgenericas;

/**
 *
 * @author profl3302
 */
public class ClasesGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche objCoche = new Coche("Nissan", "Rojo");
        Bicicleta objBicicleta = new Bicicleta("BTX");
        Bicicleta objBicicleta2 = new Bicicleta("MadMax");
        
        Almacen<Coche> almacenDeCoches = new Almacen<Coche>();
        
        almacenDeCoches.agregar(objCoche);
        
        Coche newObjCoche = almacenDeCoches.obtener();
        
        Almacen<Bicicleta> almacenDeBicicleta = new Almacen<Bicicleta>();
        
        almacenDeBicicleta.agregar(objBicicleta);
        
        Bicicleta newObjBicicleta = almacenDeBicicleta.obtener();
        
        Repositorio<Bicicleta> repoBicicleta = new Repositorio<Bicicleta>();
        
        repoBicicleta.agregar(objBicicleta);
        
        repoBicicleta.agregar(objBicicleta2);
        
        Bicicleta objBuscado = repoBicicleta.buscar(objBicicleta2);
      
        System.out.println("Encontrado!");
        
    }
    
}
