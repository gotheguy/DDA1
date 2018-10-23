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
    private static int Numero = 1;
    private int NumeroID;
    private Usuario Cliente;
    private Date Fecha;
    private Sector Sector;
    private String Estado;
    
   public static int getNumero() {
       return Numero;
   }
   
   public static void setNumero() {
       NumeroAtencion.Numero = 1;
   }
    
   public int getNumeroID() {
        return NumeroID;
    }
    
    public void setNumeroID(int NumeroID) {
        this.NumeroID = NumeroID;
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
    
    public String getEstado() {
        return Estado;
    }
    
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public NumeroAtencion(Usuario Cliente, Date Fecha, Sector Sector, String Estado) {
        this.NumeroID = Numero++;
        this.Cliente = Cliente;
        this.Fecha = Fecha;
        this.Sector = Sector;
        this.Estado = Estado;
    }
}
