/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gonzalo
 */
public class ControllerAtencion implements IControllerAtencion {
    private final ArrayList<Atencion> listaAtencion = new ArrayList();
    
    public Atencion crearAtencion(Usuario Usuario) {
        Date Fecha = new Date();
        Atencion Atencion = new Atencion(Usuario,null,Fecha,null);
        this.listaAtencion.add(Atencion);
        return Atencion;
    }
    
    public Atencion cerrarAtencion(Usuario Usuario, String Descripcion) {
        Atencion Atencion = null;
        Date FechaFin = new Date();
        for (Atencion a : this.listaAtencion) {
            if(a.getTrabajador().equals(Usuario)) {
                Atencion = this.listaAtencion.get(this.listaAtencion.size()-1);
                Atencion.setDescripcion(Descripcion);
                Atencion.setFechaFin(FechaFin);
            }
        }
        return Atencion;
    }
    
    public ArrayList<Atencion> getListaAtencion() {
        return this.listaAtencion;
    }
    
    public Atencion getAtencionTrabajador(Usuario Usuario) {
        Atencion Atencion = null;
        for (Atencion a : this.listaAtencion) {
            if(a.getTrabajador().equals(Usuario)) {
                Atencion = this.listaAtencion.get(this.listaAtencion.size()-1);
            }
        }
        return Atencion;
    }
}
