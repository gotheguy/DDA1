/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author gonzalo
 */
public class Atencion {
    private static int Atencion = 1;
    private int AtencionID;
    private Usuario Trabajador;
    private String Descripcion;
    private Date FechaInicio;
    private Date FechaFin;
    
   public int getAtencionID() {
       return AtencionID;
   } 
    
   public void setAtencionID(int AtencionID) {
       this.AtencionID = AtencionID;
   }
   
   public Usuario getTrabajador() {
       return Trabajador;
   }
   
   public void setTrabajador(Usuario Trabajador) {
       this.Trabajador = Trabajador;
   }
    
   public String getDescripcion() {
        return Descripcion;
    }
    
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }
    
    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }
    
    public Date getFechaFin() {
        return FechaFin;
    }
    
    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }
    
    public Atencion(Usuario Trabajador, String Descripcion, Date FechaInicio, Date FechaFin) {
        this.AtencionID = Atencion++;
        this.Trabajador = Trabajador;
        this.Descripcion = Descripcion;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
    }
}
