/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulima.registroderutas.prueba;

import com.ulima.registroderutas.controlador.GestionRutas;
import com.ulima.registroderutas.controlador.GestionUsuario;
import com.ulima.registroderutas.modelo.Provincia;
import com.ulima.registroderutas.modelo.Ruta;
import java.util.ArrayList;

/**
 *
 * @author otro3
 */
public class Main {
    public static void main(String[] args) {
        GestionUsuario gestionUsuarios = new GestionUsuario();
        GestionRutas gestionRutas = new GestionRutas();
        
        boolean target = gestionUsuarios.login("admin", "admin");
        
        Ruta ruta1 = new Ruta("Ruta 1", "Jiron Huiracocha", "Jesus Maria", Provincia.LIMA);
        Ruta ruta2 = new Ruta("Simple Ruta", "Jiron Huiracocha", "Jesus Maria", Provincia.LIMA);
        
        gestionRutas.insertar(ruta1);
        gestionRutas.insertar(ruta2);
        
        ArrayList<Ruta> result = gestionRutas.filtrar("1");
        
        
        
        
    }
}
