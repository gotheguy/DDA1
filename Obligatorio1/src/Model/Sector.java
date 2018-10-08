/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author gonzalo
 */
public class Sector {
    private String Nombre;
    private int CantPuestos;
    private List<Trabajador> Trabajadores;
    private Puesto Puesto;
    
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
    
    public List<Trabajador> getTrabajadores() {
        return Trabajadores;
    }

    public void setTrabajadores(List<Trabajador> Trabajadores) {
        this.Trabajadores = Trabajadores;
    }
    
    public Puesto getPuesto() {
        return Puesto;
    }

    public void setPuesto(Puesto Puesto) {
        this.Puesto = Puesto;
    }
    
    public Sector(String Nombre, int CantPuestos, List<Trabajador> Trabajadores, Puesto Puesto) {
        this.Nombre = Nombre;
        this.CantPuestos = CantPuestos;
        this.Trabajadores = Trabajadores;
        this.Puesto = Puesto;
    }
    
    public Sector() {
        this.Nombre = "";
        this.CantPuestos = 0;
        this.Trabajadores = null;
        this.Puesto = null;
    }
}
