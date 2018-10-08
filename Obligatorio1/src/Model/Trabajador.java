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
public class Trabajador {
    private String Cedula;
    private String Password;
    private String NombreCompleto;
    private Puesto Puesto;
    private Sector Sector;
    
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }
    
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
    
    public Trabajador(String Cedula, String Password, String NombreCompleto, Puesto Puesto, Sector Sector) {
        this.Cedula = Cedula;
        this.Password = Password;
        this.NombreCompleto = NombreCompleto;
        this.Puesto = Puesto;
        this.Sector = Sector;
    }
    
    public Trabajador() {
        this.Cedula = "";
        this.Password = "";
        this.NombreCompleto = "";
        this.Puesto = null;
        this.Sector = null;
    }
}
