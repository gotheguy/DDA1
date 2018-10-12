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
public abstract class Usuario {
    protected String Cedula;
    protected String Password;
    protected String NombreCompleto;
    
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
    
    public void agregarSector(Sector Sector) {
    }
    
    public Usuario(String Cedula, String Password, String NombreCompleto) {
        this.Cedula = Cedula;
        this.Password = Password;
        this.NombreCompleto = NombreCompleto;
    }
}
