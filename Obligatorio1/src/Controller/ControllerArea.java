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
public class ControllerArea{
    
    private ArrayList<Area> listaAreas = new ArrayList();
    private ArrayList<Sector> listaSectores = new ArrayList();
    private ArrayList<Puesto> listaPuestos = new ArrayList();

    public ControllerArea() { }
    
    public ArrayList<Area> getListaAreas() {
        return this.listaAreas;
    }
    
    public void agregarListaAreas(Area a) {
        this.listaAreas.add(a);
    }   
    
    public ArrayList<Sector> getListaSectores() {
        return this.listaSectores;
    }
    
    public void agregarListaSectores(Sector s) {
        this.listaSectores.add(s);
    }    
    
    public void agregarListaPuestos(Puesto p) {
        this.listaPuestos.add(p);
    }
    
    public ArrayList<Puesto> getListaPuestos() {
        return this.listaPuestos;
    }
    
    public String[] getListaPuestosDisponibles(Usuario u) {
        Sector s = u.getSector();
        return s.getPuestosDisponibles(s,u);
    }
    
    public String getAreaPorSector(String NombreSector) {
        String aux = null;
        for (Area a : this.listaAreas) {
            for (Sector Sector : a.getSectores()) {
                if(Sector.getNombre().equals(NombreSector)) {
                    aux = a.getNombre();
                }
            }
        }
        return aux;
    }
}
