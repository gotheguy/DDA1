/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author gonzalo
 */
public class Area {
    private String Nombre;
    private ArrayList<Sector> Sectores = new ArrayList();
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public ArrayList<Sector> getSectores() {
        return Sectores;
    }

    public void setSectores(ArrayList<Sector> Sectores) {
        this.Sectores = Sectores;
    }
    
    public Area(String Nombre, ArrayList<Sector> Sectores) {
        this.Nombre = Nombre;
        this.Sectores = Sectores;
    }
}



