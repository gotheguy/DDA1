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
public final class Trabajador extends Usuario {
    
    public Trabajador(String Cedula, String Password, String NombreCompleto, Rol Rol, Puesto Puesto, Sector Sector, String Estado) { 
        super(Cedula, Password, NombreCompleto, Rol.Trabajador);
        
        this.Puesto = Puesto;
        this.Sector = Sector;
        this.Estado = Estado;
    }
}
