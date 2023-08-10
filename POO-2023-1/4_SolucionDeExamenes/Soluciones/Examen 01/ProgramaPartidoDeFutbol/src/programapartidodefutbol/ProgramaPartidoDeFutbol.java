/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapartidodefutbol;

/**
 *
 * @author otro3
 */
public class ProgramaPartidoDeFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PartidoDeFutbol objPartido = new PartidoDeFutbol("Manchester United", "Tottenham", "27/04/2023");
        
        objPartido.anotaEquipoLocal();
        objPartido.anotaEquipoLocal();
        objPartido.anotaEquipoVisita();
        objPartido.anotaEquipoVisita();
        objPartido.anotaEquipoVisita();
        
        String ganador = objPartido.determinarGanador();
        
        System.out.println("El equipo ganador es: " + ganador);
        
    }
    
}
