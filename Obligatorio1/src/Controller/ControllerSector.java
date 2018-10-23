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
public class ControllerSector implements IControllerSector {
    private final ArrayList<Sector> listaSectores = new ArrayList();
    
    public ControllerSector() { }
        
    @Override
    public ArrayList<Sector> getListaSectores() {
        return this.listaSectores;
    }
    
    @Override
    public void agregarListaSectores(Sector s) {
        this.listaSectores.add(s);
    }  
    
    @Override
    public Sector getSectorPorNombre(String NombreSector) {
        Sector Sector = null;
        for (Sector s : this.listaSectores) {
            if(s.getNombre().equalsIgnoreCase(NombreSector)) {
                Sector = s;
            }
        }
        return Sector;
    }

    public ArrayList<Puesto> getPuestosLibres(Sector Sector) {
        ArrayList<Puesto> puestos = new ArrayList();
        for (Puesto Puesto : Sector.getPuestos()) {
            if(Puesto.getNumeroAtencion() == null) {
                puestos.add(Puesto);
            }
        }
        return puestos;
    }    
}
