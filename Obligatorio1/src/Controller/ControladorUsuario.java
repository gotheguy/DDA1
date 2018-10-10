/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author gonzalo
 */
public class ControladorUsuario {
 
    private Usuario logueado;
    
    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private ArrayList<Area> listaAreas = new ArrayList();
    private ArrayList<Sector> listaSectores = new ArrayList();
    
    
    public void ControladorUsuario() {
        cargarUsuarios();
    }
    
    public Usuario login(String cedula, String password) {
        for (Usuario usuario: listaUsuarios) {
            if (usuario.getCedula().equalsIgnoreCase(cedula) && usuario.getPassword().equalsIgnoreCase(password)) {
                this.logueado = usuario;
                return usuario;
            }
        }
        return null;
    }

    public Usuario getLogueado() {
        return this.logueado;
    }
    
    public void setLogueado(Usuario usuario) {
        this.logueado = usuario;
    }
    
    public void cargarUsuarios() {
        Usuario u1;
        
        Puesto p1 = new Puesto();
        
        Sector s1 = new Sector("G1",1,null,p1);
        listaSectores.add(s1);
        
        u1 = new Trabajador("45425424","23r2f23f","Rodolfo Rodriguez",p1,s1);
        listaUsuarios.add(u1);
        
        Area a1 = new Area("AT",listaSectores);
        Area a2 = new Area("AF",listaSectores);
        Area a3 = new Area("AG",listaSectores);
                        
        listaAreas.add(a1);
        listaAreas.add(a2);
        listaAreas.add(a3);
    }
    
    public void getAreas() {
        for(int i = 0; i < listaAreas.size(); i++) {
            System.out.println(listaAreas.get(i).getNombre());
        }
        
    }
}
