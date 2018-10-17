/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gonzalo
 */
public class Trabajador extends Usuario {
    private Puesto Puesto;
    private Sector Sector;
    
    @Override
    public Puesto getPuesto() {
        return Puesto;
    }

    @Override
    public void setPuesto(Puesto Puesto) {
        this.Puesto = Puesto;
    }
    
    @Override
    public Sector getSector() {
        return Sector;
    }

    @Override
    public void setSector(Sector Sector) {
        this.Sector = Sector;
    }
    
    public Trabajador(String Cedula, String Password, String NombreCompleto, Rol Rol, Puesto Puesto, Sector Sector) { 
        super(Cedula, Password, NombreCompleto, Rol.Trabajador);
        
        this.Puesto = Puesto;
        this.Sector = Sector;
    }
}
