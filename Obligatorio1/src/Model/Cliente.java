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
public final class Cliente extends Usuario {

    public Cliente(String Cedula, String Password, String NombreCompleto, Rol Rol, String Email) {
        super(Cedula, Password, NombreCompleto, Rol.Cliente);
        
        this.Email = Email;
    }
}
