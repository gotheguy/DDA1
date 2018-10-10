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
public class Cliente extends Usuario {
    private String Email;
    private Puesto Puesto;
    
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
    
    public Cliente(String Cedula, String Password, String NombreCompleto, String Email, Puesto Puesto) {
        super(Cedula, Password, NombreCompleto);
        
        this.Email = Email;
        this.Puesto = Puesto;
    }
}
