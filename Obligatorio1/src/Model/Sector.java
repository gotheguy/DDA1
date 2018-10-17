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
public class Sector {
    private String Nombre;
    private int CantPuestos;
    private ArrayList<Usuario> Trabajadores = new ArrayList();
    private ArrayList<Puesto> Puestos = new ArrayList();
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getCantPuestos() {
        return CantPuestos;
    }

    public void setCantPuestos(int CantPuestos) {
        this.CantPuestos = CantPuestos;
    }
    
    public ArrayList<Usuario> getTrabajadores() {
        return Trabajadores;
    }

    public void setTrabajadores(ArrayList<Usuario> Trabajadores) {
        this.Trabajadores = Trabajadores;
    }
    
    public ArrayList<Puesto> getPuestos() {
        return Puestos;
    }

    public void setPuestos(ArrayList<Puesto> Puestos) {
        this.Puestos = Puestos;
    }
    
    public void agregarTrabajadores(Usuario Usuario) {
        this.Trabajadores.add(Usuario);
    }    
    
    public void agregarPuestos(Puesto Puesto) {
        this.Puestos.add(Puesto);
    }  
    
    public String[] getPuestosDisponibles(Sector s, Usuario u) {
        String[] array = new String[this.Puestos.size()];
        int i = 0;
        for (Puesto p : this.Puestos) {
            if(p.getTrabajador() == null) {
                array[i] = String.valueOf(p.getNumeroPuesto());
                i++;            
            }
        }
        return array;
    } 
        
    public Sector() { }
    
    public Sector(String Nombre, int CantPuestos, ArrayList<Usuario> Trabajadores, ArrayList<Puesto> Puestos) {
        this.Nombre = Nombre;
        this.CantPuestos = CantPuestos;
        this.Trabajadores = Trabajadores;
        this.Puestos = Puestos;
    }
}
