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
public class ControllerUsuario {
 
    private Usuario logueado;
    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    
    public void ControladorUsuario() { }
    
    public Usuario login(String cedula, String password) {
        for (Usuario usuario: listaUsuarios) {
            if (usuario.getCedula().equalsIgnoreCase(cedula) && usuario.getPassword().equalsIgnoreCase(password)) {
                this.logueado = usuario;
                return usuario;
            }
        }
        return null;
    }

    public Usuario getLogueado() {
        return this.logueado;
    }
    
    public void setLogueado(Usuario Usuario) {
        this.logueado = Usuario;
    }
    
    public ArrayList<Usuario> getListaUsuarios() {
        return this.listaUsuarios;
    }    
    
    public void agregarListaUsuarios(Usuario u) {
        this.listaUsuarios.add(u);
    }
    
    public void setPuestoTrabajador(Usuario Usuario, int PuestoID) {
        for (Usuario u : listaUsuarios) {
            if (u.getCedula().equalsIgnoreCase(Usuario.getCedula()) && u.getPassword().equalsIgnoreCase(Usuario.getPassword())) {
                u.getPuesto().setNumeroPuesto(PuestoID);
                u.getPuesto().setTrabajador(Usuario);
            }
        }
    }
    
    public int getPuestoTrabajador(Usuario Usuario) {
        int p = 0;
        for (Usuario u : listaUsuarios) {
            if (u.getCedula().equalsIgnoreCase(Usuario.getCedula()) && u.getPassword().equalsIgnoreCase(Usuario.getPassword())) {
                p = u.getPuesto().getNumeroPuesto();
            }
        }
        return p;
    }
    
    public ArrayList<String> getInfoTrabajador(Usuario Usuario) {
        ArrayList<String> array = new ArrayList<>();
        for (Usuario u : listaUsuarios) {
            if (u.getCedula().equalsIgnoreCase(Usuario.getCedula()) && u.getPassword().equalsIgnoreCase(Usuario.getPassword())) {
                array.add(u.getNombreCompleto());
                array.add(u.getSector().getNombre());
                array.add(String.valueOf(u.getPuesto().getNumeroPuesto()));
            }
        }
        return array;
    }
}
