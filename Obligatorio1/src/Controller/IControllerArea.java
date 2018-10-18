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
public interface IControllerArea {
    public String[] getListaAreas();
    
    public void agregarListaAreas(Area Area);
    
    public ArrayList<Sector> getListaSectores();
    
    public void agregarListaSectores(Sector Sector);

    public ArrayList<Puesto> getListaPuestos();
    
    public void agregarListaPuestos(Puesto Puesto);
    
    public String[] getListaPuestosDisponibles(Usuario u);
    
    public String getAreaPorSector(String NombreSector);
    
    public String[] getSectoresPorArea(String NombreArea);
}
