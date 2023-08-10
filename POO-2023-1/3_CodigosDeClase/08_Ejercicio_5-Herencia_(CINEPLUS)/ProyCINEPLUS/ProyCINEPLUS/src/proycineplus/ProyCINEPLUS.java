/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proycineplus;

/**
 *
 * @author Giancarlo
 */
public class ProyCINEPLUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N= 10;
        Cliente[] clientes = new Cliente[N];
        
        //Creamos 2 clientes de cada tipo para cargarlo en el arreglo de objetos de clientes
        System.out.println("Código único de clientes corporativos es un aleatorio par entre 1200 y 5400");          
        Cliente objCliente1 = new ClienteCorporativo("RUC-12345", "Jose Pérez", "Claudia Meneses", "Av. Javier prado 1236", 717, "La Victoria");
        Cliente objCliente2 = new ClienteCorporativo("RUC-65459", "Manuela Ramos",  "Jorge Pineda", "Av. Arequipa 5632", 15614, "San Isidro");
        
        System.out.println("Código único de clientes preferentes es un aleatorio múltiplo de 7 entre 5000 y 1000");  
        Cliente objCliente3 = new ClientePreferente("TARJETA 486236", "Toyota",  "Carla Romero", "Av. Arenales 136", 124, "Lince");
        Cliente objCliente4 = new ClientePreferente("TARJETA 48535", "Mercedes",  "Juan Acevedo", "Av. La Encalada 1224", 300, "Surco");
        
        System.out.println("Código único de clientes estándar es un aleatorio impar entre 11000 y 15000");  
        Cliente objCliente5 = new ClienteEstandar("DNI 43045693", "19/07/1985",  "Carlos Chavez", "Av. Arenales 1358", 350, "Lince");
        Cliente objCliente6 = new ClienteEstandar("DNI 24636587", "06/09/2001",  "Susana Marcos", "Av. La Encalada 124", 200, "Surco");
        
        clientes[0] = objCliente1;
        clientes[1] = objCliente2;        
        clientes[2] = objCliente3;
        clientes[3] = objCliente4;
        clientes[4] = objCliente5;
        clientes[5] = objCliente6;
        
        //Leemos el arreglo completo de clientes y buscamos el que tiene el monto máximo de descuento
        double mtoMaxDescuento = 0;
        String codgoClienteDescuento="";
        for(Cliente c: clientes) {
            if (c instanceof ClienteCorporativo) { //Se pregunta si el objeto c leído de qué Clase es
                if (c.getMtoMaxDscto() > mtoMaxDescuento){
                    mtoMaxDescuento = c.getMtoMaxDscto();
                    codgoClienteDescuento = c.getCodigoUnicoCliente();
                }    
            }
        }
        
        System.out.println("El monto máximo de descuento de los clientes corporativos es: " +mtoMaxDescuento + " y corresponde al cliente con código: " +codgoClienteDescuento); 
    }    
}
