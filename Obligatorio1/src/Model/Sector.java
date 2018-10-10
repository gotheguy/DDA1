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
    private ArrayList<Trabajador> Trabajadores = new ArrayList();
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
    
    public ArrayList<Trabajador> getTrabajadores() {
        return Trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> Trabajadores) {
        this.Trabajadores = Trabajadores;
    }
    
    public Puesto getPuesto() {
        return Puesto;
    }

    public void setPuesto(Puesto Puesto) {
        this.Puesto = Puesto;
    }
    
    public Sector(String Nombre, int CantPuestos, ArrayList<Trabajador> Trabajadores, Puesto Puesto) {
        this.Nombre = Nombre;
        this.CantPuestos = CantPuestos;
        this.Trabajadores = Trabajadores;
        this.Puesto = Puesto;
    }
}
