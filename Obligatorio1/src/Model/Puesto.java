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
    private static int NumeroPuesto;
    private int NumeroAtencion;
    
    public int getNumeroPuesto() {
        return NumeroPuesto;
    }
    
    public int getNumeroAtencion() {
        return NumeroAtencion;
    }
    
    public void setNumeroPuesto(int NumeroAtencion) {
        this.NumeroAtencion = NumeroAtencion;
    }
    
    public Puesto(int NumeroAtencion) {
        this.NumeroPuesto++;
        this.NumeroAtencion = NumeroAtencion;
    }
}
