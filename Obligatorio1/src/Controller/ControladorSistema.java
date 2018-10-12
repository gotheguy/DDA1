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
    private ControladorArea controladorArea = new ControladorArea();
    private ControladorSector controladorSector = new ControladorSector();
    private ControladorPuesto controladorPuesto = new ControladorPuesto();
    
    private static ControladorSistema instancia;
    
    public static ControladorSistema getInstancia() {
        if (instancia == null) {
            instancia = new ControladorSistema();
        }
        return instancia;
    }
    
    private ControladorSistema() {
        this.controladorArea.cargarDatos();
   //     this.controladorSector.cargarDatos();
    }
    
    public Usuario getLogueado() {
        return this.controladorUsuario.getLogueado();
    }
    
    public void setLogueado(Usuario usuario) {
        this.controladorUsuario.setLogueado(usuario);
    }
     
    public Usuario login(String cedula, String password) {
        return this.controladorUsuario.login(cedula, password);
    }
    
    public ArrayList<Sector> getListaSectores() {
        return this.controladorSector.getListaSectores();
    }

    public ArrayList<Puesto> getListaPuestos() {
        return this.controladorPuesto.getListaPuestos();
    }
    
    public ArrayList<Usuario> getListaUsuarios() {
        return this.controladorUsuario.getListaUsuarios();
    }

    public ArrayList<Area> getListaAreas() {
        return this.controladorArea.getListaAreas();
    }
}
