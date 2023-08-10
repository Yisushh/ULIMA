/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulima.registroderutas.controlador;
import com.ulima.registroderutas.modelo.Provincia;
import com.ulima.registroderutas.modelo.Ruta;
import java.util.ArrayList;
/**
 *
 * @author otro3
 */
public class GestionRutas {
    private ArrayList<Ruta> rutas;
    private int nroRutas;
    
    public GestionRutas() {
        this.rutas = new ArrayList();
        this.nroRutas = 0;
    }
    
    public Ruta insertar(Ruta ruta) {
        ruta.setId(nroRutas + 1);
        rutas.add(ruta);
        nroRutas++;
        return ruta;
    }
    
    public Ruta buscar(int id) {
        for(Ruta ruta:rutas) {
            if (ruta.getId() == id)
                return ruta;
        }
        
        return null;
    }
    
    public ArrayList<Ruta> filtrar(String nombre) {
        ArrayList<Ruta> filteredRutas = new ArrayList();
        
        for(Ruta rut:rutas) {
            if (
                rut.getNombre().contains(nombre))
                filteredRutas.add(rut);
        }
        return filteredRutas;
    }
    
    public void remover(Ruta ruta) {
        if (ruta != null)
            rutas.remove(ruta);
    }

    public ArrayList<Ruta> getRutas() {
        return rutas;
    }
    
    
}
