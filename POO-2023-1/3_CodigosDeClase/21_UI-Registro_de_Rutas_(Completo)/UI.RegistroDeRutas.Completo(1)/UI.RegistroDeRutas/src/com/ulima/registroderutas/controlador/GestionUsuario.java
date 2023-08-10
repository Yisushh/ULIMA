/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulima.registroderutas.controlador;

import com.ulima.registroderutas.modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author otro3
 */
public class GestionUsuario {
    private ArrayList<Usuario> usuarios;
    
    public GestionUsuario(){
        this.usuarios = new ArrayList();
        
        Usuario usr1 = new Usuario(1,"admin","admin");
        this.usuarios.add(usr1);
    }
    
    public boolean login(String usuario, String password) {
        
        for(Usuario usr:usuarios){
            if (usr.getNombreUsuario().equals(usuario) &&
                    usr.getPassword().equals(password)) {
                return true;
            }   
        }
        return false;
    }
}
