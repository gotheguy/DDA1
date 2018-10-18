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
public class NumeroAtencion {
    private int Numero;
    private Usuario Cliente;
    private Date Fecha;
    private Sector Sector;
    
   public int getNumero() {
        return Numero;
    }
    
    public void setNumero() {
        this.Numero++;
    }
    
    public Usuario getCliente() {
        return Cliente;
    }
    
    public void setCliente(Usuario Cliente) {
        this.Cliente = Cliente;
    }
    
    public Date getFecha() {
        return Fecha;
    }
    
    public void setFecha() {
        this.Fecha = new Date();
    }
    
    public Sector getSector() {
        return Sector;
    }
    
    public void setSector(Sector Sector) {
        this.Sector = Sector;
    }
    
    public NumeroAtencion(int Numero, Usuario Cliente, Date Fecha, Sector Sector) {
        this.Numero = Numero;
        this.Cliente = Cliente;
        this.Fecha = Fecha;
        this.Sector = Sector;
    }
}
