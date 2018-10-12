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
public class ControladorSector extends ControladorArea { 
    private ArrayList<Sector> listaSectores = new ArrayList();
    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private ArrayList<Puesto> listaPuestos = new ArrayList();
    
    public void ControladorSector() {
    }
   
    public void agregarUsuarios(Usuario Usuario) {
        this.listaUsuarios.add(Usuario);
    }
    
    public void agregarPuestos(Puesto Puesto) {
        this.listaPuestos.add(Puesto);
    }
    
    public ArrayList<Puesto> getPuestos() {
        return this.listaPuestos;
    }
    
    public ArrayList<Sector> getListaSectores() {
        return this.listaSectores;
    }
    
    public void cargarDatos() {
    }
}
