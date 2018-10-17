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
    
    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    @Override
    public Puesto getPuesto() {
        return Puesto;
    }

    @Override
    public void setPuesto(Puesto Puesto) {
        this.Puesto = Puesto;
    }
    
    public Cliente(String Cedula, String Password, String NombreCompleto, Rol Rol, String Email, Puesto Puesto) {
        super(Cedula, Password, NombreCompleto, Rol.Cliente);
        
        this.Email = Email;
        this.Puesto = Puesto;
    }
}
