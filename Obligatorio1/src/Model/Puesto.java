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
    private static int NumeroAtencion;
    
    public int getNumeroAtencion() {
        return NumeroAtencion;
    }
    
    public Puesto() {
        this.NumeroAtencion++;
    }
}
