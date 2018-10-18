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
public class Puesto {
    private static int NumeroPuesto = 1;
    private int NumeroPuestoID;
    private int NumeroAtencion = 0;
    private int CantNumerosAsignados = 0;
    private int CantNumerosDerivados = 0;
    private Date TiempoPromedio;
    private Usuario Trabajador;
    
    public int getNumeroPuesto() {
        return NumeroPuestoID;
    }
    
    public void setNumeroPuesto(int NumeroPuestoID) {
        this.NumeroPuestoID = NumeroPuestoID;
    }
    
    public int getNumeroAtencion() {
        return NumeroAtencion;
    }
    
    public void setNumeroAtencion(int NumeroAtencion) {
        this.NumeroAtencion = NumeroAtencion;
    }
    
    public int getCantNumerosAsignados() {
        return CantNumerosAsignados;
    }
    
    public void setCantNumerosAsignados() {
        this.CantNumerosAsignados++;
    }
    
    public int getCantNumerosDerivados() {
        return CantNumerosDerivados;
    }
    
    public void setCantNumerosDerivados() {
        this.CantNumerosDerivados++;
    }
    
    public int getTiempoPromedio() {
        return CantNumerosDerivados;
    }
    
    public Usuario getTrabajador() {
        return Trabajador;
    }

    public void setTrabajador(Usuario Trabajador) {
        this.Trabajador = Trabajador;
    }
    
    public Puesto() { }
    
    public Puesto(int NumeroAtencion) {
        this.NumeroPuestoID = NumeroPuesto++;
    }
    
    public Puesto(Usuario Trabajador) {
        this.NumeroPuestoID = NumeroPuesto++;
        this.Trabajador = Trabajador;
    }
}
