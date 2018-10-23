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
public interface IControllerSector {
    public ArrayList<Sector> getListaSectores();
    
    public void agregarListaSectores(Sector Sector);
    
    public Sector getSectorPorNombre(String NombreSector);
}
