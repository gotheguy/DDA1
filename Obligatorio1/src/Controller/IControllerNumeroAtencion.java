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
public interface IControllerNumeroAtencion {
        
    public ArrayList<NumeroAtencion> getListaNumerosAtencion();
        
    public NumeroAtencion crearNumeroAtencion(Sector Sector, Usuario Cliente);
    
    public NumeroAtencion getNumeroAtencion(Usuario Usuario);
    
    public NumeroAtencion getSiguienteNumeroAtencion(Sector Sector);
    
    public String formatearFecha(Date Fecha);
}
