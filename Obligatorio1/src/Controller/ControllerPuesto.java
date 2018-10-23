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
public class ControllerPuesto implements IControllerPuesto {
    private final ArrayList<Puesto> listaPuestos = new ArrayList();

    public ControllerPuesto() { }
    
    @Override
    public void agregarListaPuestos(Puesto p) {
        this.listaPuestos.add(p);
    }
    
    @Override
    public ArrayList<Puesto> getListaPuestos() {
        return this.listaPuestos;
    }
    
    @Override
    public String[] getListaPuestosDisponibles(Usuario u) {
        Sector s = u.getSector();
        return s.getPuestosDisponibles(s,u);
    }
    
    public ArrayList<Puesto> getListaPuestosLibres() {
        ArrayList<Puesto> p = new ArrayList();
        for (Puesto Puesto : this.listaPuestos) {
            if(Puesto.getNumeroAtencion() != null) {
                p.add(Puesto);
            }
        }
        return p;
    }
}
