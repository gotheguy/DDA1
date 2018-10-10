/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author gonzalo
 */
public class ControladorSistema {
     
    private ControladorUsuario controladorUsuario = new ControladorUsuario();
    
    private static ControladorSistema instancia;
    
    public static ControladorSistema getInstancia() {
        if (instancia == null) {
            instancia = new ControladorSistema();
        }
        return instancia;
    }
    
    public Usuario getLogueado() {
        return this.controladorUsuario.getLogueado();
    }
    
    public void setLogueado(Usuario usuario) {
        this.controladorUsuario.setLogueado(usuario);
    }
 
    private ControladorSistema() {
        controladorUsuario.cargarUsuarios();
    }
     
    public Usuario login(String cedula, String password) {
        return this.controladorUsuario.login(cedula, password);
    }
    
    public void getAreas() {
        this.controladorUsuario.getAreas();
    }
}
