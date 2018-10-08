/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author gonzalo
 */
public class Area {
    private String Nombre;
    private List<Sector> Sectores;
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public List<Sector> getSectores() {
        return Sectores;
    }

    public void setSectores(List<Sector> Sectores) {
        this.Sectores = Sectores;
    }
    
    public Area(String Nombre, List<Sector> Sectores) {
        this.Nombre = Nombre;
        this.Sectores = Sectores;
    }
    
    public Area() {
        this.Sectores = null;
        this.Nombre = "";
    }
}



