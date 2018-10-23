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
    private NumeroAtencion NumeroAtencion;
    private int NumerosAsignados;
    private Usuario Trabajador;
    
    public int getNumeroPuesto() {
        return NumeroPuestoID;
    }
    
    public void setNumeroPuesto(int NumeroPuestoID) {
        this.NumeroPuestoID = NumeroPuestoID;
    }
    
    public NumeroAtencion getNumeroAtencion() {
        return NumeroAtencion;
    }
    
    public void setNumeroAtencion(NumeroAtencion NumeroAtencion) {
        this.NumeroAtencion = NumeroAtencion;
    }
    
   public int getNumerosAsignados() {
        return NumerosAsignados;
    }
    
    public void setNumerosAsignados() {
        this.NumerosAsignados++;
    }

    public Usuario getTrabajador() {
        return Trabajador;
    }

    public void setTrabajador(Usuario Trabajador) {
        this.Trabajador = Trabajador;
    }
    
    public Puesto() {
        this.NumeroPuestoID = NumeroPuesto++;
    }
    
    public Puesto(Usuario Trabajador) {
        this.NumeroPuestoID = NumeroPuesto++;
        this.Trabajador = Trabajador;
    }
}
