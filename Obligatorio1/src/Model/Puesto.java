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
public class Puesto {
    private static int NumeroPuesto = 1;
    private int NumeroPuestoID;
    private int NumeroAtencion;
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
    
    public Usuario getTrabajador() {
        return Trabajador;
    }

    public void setTrabajador(Usuario Trabajador) {
        this.Trabajador = Trabajador;
    }
    
    public Puesto() { }
    
    public Puesto(int NumeroAtencion) {
        this.NumeroPuestoID = NumeroPuesto++;
        this.NumeroAtencion = NumeroAtencion;
    }
    
    public Puesto(int NumeroAtencion, Usuario Trabajador) {
        this.NumeroPuestoID = NumeroPuesto++;
        this.NumeroAtencion = NumeroAtencion;
        this.Trabajador = Trabajador;
    }
}
