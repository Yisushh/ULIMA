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
public class PartidoDeFutbol {
    private String equipoLocal;
    private String equipoVisita;
    private int golesLocal;
    private int golesVisita;
    private String fechaPartido;

    public PartidoDeFutbol(String equipoLocal, String equipoVisita, String fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisita = equipoVisita;
        this.fechaPartido = fechaPartido;
        this.golesLocal = 0;
        this.golesVisita = 0;
    }
    
    public void anotaEquipoLocal(){
        this.golesLocal += 1;
    }
    
    public void anotaEquipoVisita(){
        this.golesVisita += 1;
    }
    
    public String determinarGanador() {
        if (this.golesLocal > this.golesVisita)
            return this.equipoLocal;
        else if (this.golesLocal == this.golesVisita)
            return "Empate";
        else
            return this.equipoVisita;
    }
    
    public static String determinarGanador(int golesEquipoLocal, int golesEquipoVisita){
        if (golesEquipoLocal > golesEquipoVisita)
            return "Equipo Local";
        else if (golesEquipoLocal == golesEquipoVisita)
            return "Empate";
        else
            return "Equipo Visita";
    }
    
    
    
}
