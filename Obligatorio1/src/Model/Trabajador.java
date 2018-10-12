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
public class Trabajador extends Usuario {
    private Puesto Puesto;
    private Sector Sector;
    
    public Puesto getPuesto() {
        return Puesto;
    }

    public void setPuesto(Puesto Puesto) {
        this.Puesto = Puesto;
    }
    
    public Sector getSector() {
        return Sector;
    }

    public void setSector(Sector Sector) {
        this.Sector = Sector;
    }
    
    @Override
    public void agregarSector(Sector s) {
        if (!this.Sector.equals(s)) {
            this.Sector = s;   
        }
    }
    
    public Trabajador(String Cedula, String Password, String NombreCompleto, Puesto Puesto, Sector Sector) { 
        super(Cedula, Password, NombreCompleto);
        
        this.Puesto = Puesto;
        this.Sector = Sector;
    }
}
