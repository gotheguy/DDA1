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
    
    public String getAreaPorSector(String NombreSector);
    
    public String[] getSectoresPorArea(String NombreArea);
}
