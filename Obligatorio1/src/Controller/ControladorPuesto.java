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
public class ControladorPuesto {
    private ArrayList<Puesto> listaPuestos = new ArrayList();
    
    public void ControladorSector() {
        cargarPuestos();
    }
    
    public ArrayList<Puesto> getListaPuestos() {
        return this.listaPuestos;
    }
    
    public void cargarPuestos() {
        Puesto p1 = new Puesto();
        Puesto p2 = new Puesto();
        Puesto p3 = new Puesto();
        Puesto p4 = new Puesto();
        Puesto p5 = new Puesto();
        
        listaPuestos.add(p1);
        listaPuestos.add(p2);
        listaPuestos.add(p3);
        listaPuestos.add(p4);
        listaPuestos.add(p5);
    }
}
