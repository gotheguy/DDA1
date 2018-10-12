/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author gonzalo
 */
public class ControladorArea {
    
    //private ControladorSistema Sistema = ControladorSistema.getInstancia();
    private IControladorSistema ISistema;
    private ArrayList<Area> listaAreas = new ArrayList();
    
    public ControladorArea(IControladorSistema ISistema) {
        this.ISistema = ISistema;
    }
    
    public ControladorArea() {
    }
        
    public ArrayList<Area> getListaAreas() {
        return this.listaAreas;
    }

    public void agregarAreas(Area Area) {
        this.listaAreas.add(Area);
    }
    
    public void cargarDatos() {
        ArrayList<Sector> sectores = new ArrayList();
        ArrayList<Usuario> usuarios = new ArrayList();
        ArrayList<Puesto> puestos = new ArrayList();
        Sector sector = new Sector();
        
        Puesto p1 = new Puesto(0);
        Puesto p2 = new Puesto(0);
        Puesto p3 = new Puesto(0);
        Puesto p4 = new Puesto(0);
        Puesto p5 = new Puesto(0);
        
        Usuario u1 = new Trabajador("46632345","asd83h83","Alberto Gomez",p1,sector);
        Usuario u2 = new Trabajador("53267547","d43g43","Juan Castillo",p2,sector);
        Usuario u3 = new Trabajador("46373755","h4h5h56","Francisco Bouza",p3,sector);
        Usuario u4 = new Trabajador("82568358","46j556j56","Rodrigo Miranda",p4,sector);
        Usuario u5 = new Trabajador("62863833","65j34h3g4","Gonzalo Beri",p5,sector);
        
        Area a1 = new Area("AT",sectores);
        Area a2 = new Area("CT",sectores);
        
        usuarios.add(u1);
        usuarios.add(u2);
        puestos.add(p1);
        puestos.add(p2);
        puestos.add(p3);
        
        a1.agregarSectores("G34", 3, usuarios, puestos);
        u1.agregarSector(a1.getSectores().get(0));
        u2.agregarSector(a1.getSectores().get(0));
        u3.agregarSector(a1.getSectores().get(0));

        usuarios.clear();   
        puestos.clear();
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        puestos.add(p4);
        puestos.add(p5);
        
        a2.agregarSectores("G35", 4, usuarios, puestos);
        u2.agregarSector(a1.getSectores().get(1));
        u3.agregarSector(a1.getSectores().get(1));
        
        this.listaAreas.add(a1);
        this.listaAreas.add(a2);
        
        for(Area a : this.listaAreas) {
            System.out.println(a.getNombre());
        }
    }
}
