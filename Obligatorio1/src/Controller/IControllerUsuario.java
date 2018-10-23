/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author gonzalo
 */
public interface IControllerUsuario {
    public Usuario login(String cedula, String password);
            
    public Usuario getLogueado();
    
    public void setLogueado(Usuario Usuario);
    
    public ArrayList<Usuario> getListaUsuarios();
    
    public void agregarListaUsuarios(Usuario u);
    
    public Usuario getUsuarioPorCedula(String CedulaCliente);
    
    public void setPuestoTrabajador(Usuario Usuario, int PuestoID);
    
    public int getPuestoTrabajador(Usuario Usuario);
    
    public ArrayList<String> getInfoTrabajador(Usuario Usuario);
}
