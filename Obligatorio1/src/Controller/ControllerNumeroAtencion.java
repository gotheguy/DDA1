/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.NumeroAtencion;
import Model.Sector;
import Model.Usuario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gonzalo
 */
public class ControllerNumeroAtencion implements IControllerNumeroAtencion {
    private final ArrayList<NumeroAtencion> listaNumerosAtencion = new ArrayList();
    
    public ControllerNumeroAtencion() { }
    
    @Override
    public ArrayList<NumeroAtencion> getListaNumerosAtencion() {
        return this.listaNumerosAtencion;
    }
    
    @Override
    public NumeroAtencion crearNumeroAtencion(Sector Sector, Usuario Cliente) {
        Date Fecha = new Date();
        boolean Bandera = false;
        NumeroAtencion numero = null;
        
        for (NumeroAtencion n : this.listaNumerosAtencion) {
            if(n.getSector().equals(Sector)) {
                Bandera = true;
            }
        }
        
        if(!Bandera) {
            numero = new NumeroAtencion(Cliente,Fecha,Sector,"Pendiente");
        }
        else {
            numero = new NumeroAtencion(Cliente,Fecha,Sector,"Pendiente");
        }
        listaNumerosAtencion.add(numero);
        return numero;
    }
        
    @Override
    public NumeroAtencion getNumeroAtencion(Usuario Usuario) {
      NumeroAtencion Numero = null;
        for (NumeroAtencion n : this.listaNumerosAtencion) {
            if(n.getCliente().equals(Usuario)) {
                Numero = n;
            }
        }
        return Numero;
    }
    
    public void setEstadoNumeroAtencion(int NumeroID) {
        for (NumeroAtencion n : this.listaNumerosAtencion) {
            if(n.getNumeroID() == NumeroID) {
                n.setEstado("Atendido");
            }
        }
    }
    
    @Override
    public NumeroAtencion getSiguienteNumeroAtencion(Sector Sector) {
      NumeroAtencion Numero = null;
      boolean encontre = false;
        for (NumeroAtencion n : this.listaNumerosAtencion) {
            if(!encontre) {
                if(n.getSector().equals(Sector) && n.getEstado().equals("Pendiente")) {
                    Numero = n;
                    encontre = true;
                }
            }
        }
        return Numero; 
    }
    
    @Override
    public String formatearFecha(Date Fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        String FechaFormato = sdf.format(Fecha);
        return FechaFormato;
    }    
}
