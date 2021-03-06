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
public class ControllerArea implements IControllerArea {
    private final ArrayList<Area> listaAreas = new ArrayList();
    
    public ControllerArea() { }
    
    @Override
    public String[] getListaAreas() {
        String[] array = new String[this.listaAreas.size()];
        int i = 0;
        for (Area a : this.listaAreas) {
            array[i] = String.valueOf(a.getNombre());
            i++;            
        }
        return array;
    }
    
    @Override
    public void agregarListaAreas(Area a) {
        this.listaAreas.add(a);
    }    
    
    @Override
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
    
    @Override
    public String[] getSectoresPorArea(String NombreArea) {
        String[] array = new String[this.listaAreas.size()];
        int i = 0;
        for (Area a : this.listaAreas) {
            if(a.getNombre().equals(NombreArea)) {
                for (Sector s : a.getSectores()) {
                    array[i] = s.getNombre();
                    i++; 
                }
            }
        }
        return array;
    }
}
