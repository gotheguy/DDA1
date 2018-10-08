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
public class Cliente {
    private String Cedula;
    private String NombreCompleto;
    private String Email;
    private Puesto Puesto;
    
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public Puesto getPuesto() {
        return Puesto;
    }

    public void setPuesto(Puesto Puesto) {
        this.Puesto = Puesto;
    }
    
    public Cliente(String Cedula, String NombreCompleto, String Email, Puesto Puesto) {
        this.Cedula = Cedula;
        this.NombreCompleto = NombreCompleto;
        this.Email = Email;
        this.Puesto = Puesto;
    }
    
    public Cliente() {
        this.Cedula = "";
        this.NombreCompleto = "";
        this.Email = "";
        this.Puesto = null;
    }
}
