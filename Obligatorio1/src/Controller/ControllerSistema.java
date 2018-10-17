/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author gonzalo
 */
public class ControllerSistema {
     
    private ControllerUsuario controllerUsuario = new ControllerUsuario();
    private ControllerArea controllerArea = new ControllerArea();
    
    private static ControllerSistema instancia;
    
    public static ControllerSistema getInstancia() {
        if (instancia == null) {
            instancia = new ControllerSistema();
        }
        return instancia;
    }   

    public Usuario getLogueado() {
        return this.controllerUsuario.getLogueado();
    }
    
    public void setLogueado(Usuario usuario) {
        this.controllerUsuario.setLogueado(usuario);
    }
     
    public Usuario login(String cedula, String password) {
        return this.controllerUsuario.login(cedula, password);
    }
  
    public ArrayList<Area> getListaAreas() {
        return this.controllerArea.getListaAreas();
    }
    
    public void agregarListaAreas(Area Area) {
        this.controllerArea.agregarListaAreas(Area);
    }
    
    public ArrayList<Sector> getListaSectores() {
        return this.controllerArea.getListaSectores();
    }
    
    public void agregarListaSectores(Sector Sector) {
        this.controllerArea.agregarListaSectores(Sector);
    }

    public ArrayList<Puesto> getListaPuestos() {
        return this.controllerArea.getListaPuestos();
    }
    
    public void agregarListaPuestos(Puesto Puesto) {
        this.controllerArea.agregarListaPuestos(Puesto);
    }    
    
    public ArrayList<Usuario> getListaUsuarios() {
        return this.controllerUsuario.getListaUsuarios();
    }
    
    public void agregarListaUsuarios(Usuario Usuario) {
        this.controllerUsuario.agregarListaUsuarios(Usuario);
    }
    
    public String[] getPuestosDisponibles() {
        return this.controllerArea.getListaPuestosDisponibles(this.getLogueado());
    }
    
    public void setPuestoTrabajador(int PuestoID) {
        this.controllerUsuario.setPuestoTrabajador(this.getLogueado(), PuestoID);
    }
    
    public int getPuestoTrabajador() {
        return this.controllerUsuario.getPuestoTrabajador(this.getLogueado());
    }
    
    public ArrayList<String> getInfoTrabajador() {
        return this.controllerUsuario.getInfoTrabajador(this.getLogueado());
    }
    
    public String getAreaPorSector(String NombreSector) {
        return this.controllerArea.getAreaPorSector(NombreSector);
    }
}
