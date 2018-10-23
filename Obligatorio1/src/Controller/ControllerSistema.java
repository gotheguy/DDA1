/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Queue;

/**
 *
 * @author gonzalo
 */
public class ControllerSistema {

    private final ControllerUsuario controllerUsuario = new ControllerUsuario();
    private final ControllerArea controllerArea = new ControllerArea();
    private final ControllerSector controllerSector = new ControllerSector();
    private final ControllerPuesto controllerPuesto = new ControllerPuesto();
    private final ControllerNumeroAtencion controllerNumeroAtencion = new ControllerNumeroAtencion();
    private final ControllerAtencion controllerAtencion = new ControllerAtencion();
    private final Queue<Integer> Cola = new ArrayDeque();

    private static ControllerSistema instancia;

    public static ControllerSistema getInstancia() {
        if (instancia == null) {
            instancia = new ControllerSistema();
        }
        return instancia;
    }

    public Usuario getLogueado() {
        return this.controllerUsuario.getLogueado();
    }

    public void setLogueado(Usuario usuario) {
        this.controllerUsuario.setLogueado(usuario);
    }

    public void cargarDatos() {
        ArrayList<Sector> sectores1 = new ArrayList();
        ArrayList<Sector> sectores2 = new ArrayList();
        ArrayList<Usuario> usuarios1 = new ArrayList();
        ArrayList<Usuario> usuarios2 = new ArrayList();
        ArrayList<Usuario> usuarios3 = new ArrayList();
        ArrayList<Puesto> puestos1 = new ArrayList();
        ArrayList<Puesto> puestos2 = new ArrayList();
        ArrayList<Puesto> puestos3 = new ArrayList();
        Sector sector = new Sector();
        Puesto puesto = new Puesto();
        Rol cliente = null;
        cliente = Rol.Cliente;
        Rol trabajador = null;
        trabajador = Rol.Trabajador;

        Puesto p1 = new Puesto();
        Puesto p2 = new Puesto();
        Puesto p3 = new Puesto();
        Puesto p4 = new Puesto();
        Puesto p5 = new Puesto();
        Puesto p6 = new Puesto();
        Puesto p7 = new Puesto();
        Puesto p8 = new Puesto();
        Puesto p9 = new Puesto();

        Usuario u1 = new Trabajador("46632345", "asd83h83j", "Alberto Gomez", trabajador, puesto, sector, "Libre");
        Usuario u2 = new Trabajador("53267547", "d43g4333e", "Juan Castillo", trabajador, puesto, sector, "Libre");
        Usuario u3 = new Trabajador("46373755", "h4h5h56da", "Francisco Bouza", trabajador, puesto, sector, "Libre");
        Usuario u4 = new Trabajador("82568358", "46j556j56", "Rodrigo Miranda", trabajador, puesto, sector, "Libre");
        Usuario u5 = new Trabajador("62863833", "65j34h3g4", "Gonzalo Beri", trabajador, puesto, sector, "Libre");
        Usuario u6 = new Trabajador("66442642", "ads32f345", "Martin Cazorla", trabajador, p6, sector, "Ocupado");
        Usuario u7 = new Trabajador("34263463", "35y3ggg3g", "Javier Ortega", trabajador, p7, sector, "Ocupado");
        Usuario u8 = new Trabajador("43434222", "g56ydfh55", "Clauido Launas", trabajador, puesto, sector, "Libre");
        Usuario u9 = new Trabajador("59389888", "gdfhdh5h5", "Alfredo Cortez", trabajador, p9, sector, "Ocupado");

        Usuario u10 = new Cliente("44249992", "u3ou34ouh", "Oscar Beisso", cliente, "oscar.beisso@gmail.com");
        Usuario u11 = new Cliente("52532932", "u29298nf8", "Martin Ramirez", cliente, "martin.ramirez@gmail.com");
        Usuario u12 = new Cliente("43194928", "j293fn93n", "Pedro Velez", cliente, "pedro.velez@gmail.com");
        Usuario u13 = new Cliente("59289235", "329f2m392", "Omar Gutierrez", cliente, "omar.gutierrez@hotmail.com");
        Usuario u14 = new Cliente("59828583", "sdf9sd938", "Sebastian Romero", cliente, "sebastian.romero@gmail.com");
        Usuario u15 = new Cliente("45329811", "asdj939n2", "Esteban Barcos", cliente, "esteban.barcos@gmail.com");
        Usuario u16 = new Cliente("41938238", "2m3f92m9f", "Patricio Perez", cliente, "patricio.perez@hotmail.com");
        Usuario u17 = new Cliente("32592838", "m29f3mfnf", "Marcelo Goya", cliente, "marcelo.goya@hotmail.com");
        Usuario u18 = new Cliente("43598283", "mg59h54nn", "Victor Magallan", cliente, "victor.magallan@gmail.com");
        Usuario u19 = new Cliente("53292999", "a90asd093", "Marco Brito", cliente, "marco.brito@hotmail.com");

        p1.setTrabajador(u1);
        p6.setTrabajador(u6);
        p7.setTrabajador(u7);
        p9.setTrabajador(u9);

        Area a1 = new Area("AT", sectores1);
        Area a2 = new Area("CT", sectores2);

        usuarios1.add(u1);
        usuarios1.add(u2);
        usuarios1.add(u3);
        puestos1.add(p1);
        puestos1.add(p2);
        puestos1.add(p3);

        Sector s1 = new Sector("G34", 3, usuarios1, puestos1);
        sectores1.add(s1);
        u1.setSector(s1);
        u2.setSector(s1);
        u3.setSector(s1);

        usuarios2.add(u4);
        usuarios2.add(u5);
        usuarios2.add(u6);
        puestos2.add(p4);
        puestos2.add(p5);
        puestos2.add(p6);

        Sector s2 = new Sector("H35", 3, usuarios2, puestos2);
        sectores1.add(s2);
        a1.setSectores(sectores1);
        u4.setSector(s2);
        u5.setSector(s2);
        u6.setSector(s2);
        this.agregarListaAreas(a1);
        this.agregarListaSectores(s1);
        this.agregarListaSectores(s2);

        usuarios3.add(u7);
        usuarios3.add(u8);
        usuarios3.add(u9);
        puestos3.add(p7);
        puestos3.add(p8);
        puestos3.add(p9);

        Sector s3 = new Sector("J36", 3, usuarios3, puestos3);
        sectores2.add(s3);
        a2.setSectores(sectores2);
        u7.setSector(s3);
        u8.setSector(s3);
        u9.setSector(s3);
        this.agregarListaAreas(a2);
        this.agregarListaSectores(s3);

        this.agregarListaPuestos(p1);
        this.agregarListaPuestos(p2);
        this.agregarListaPuestos(p3);
        this.agregarListaPuestos(p4);
        this.agregarListaPuestos(p5);
        this.agregarListaPuestos(p6);
        this.agregarListaPuestos(p7);
        this.agregarListaPuestos(p8);
        this.agregarListaPuestos(p9);

        this.agregarListaUsuarios(u1);
        this.agregarListaUsuarios(u2);
        this.agregarListaUsuarios(u3);
        this.agregarListaUsuarios(u4);
        this.agregarListaUsuarios(u5);
        this.agregarListaUsuarios(u6);
        this.agregarListaUsuarios(u7);
        this.agregarListaUsuarios(u8);
        this.agregarListaUsuarios(u9);
        this.agregarListaUsuarios(u10);
        this.agregarListaUsuarios(u11);
        this.agregarListaUsuarios(u12);
        this.agregarListaUsuarios(u13);
        this.agregarListaUsuarios(u14);
        this.agregarListaUsuarios(u15);
        this.agregarListaUsuarios(u16);
        this.agregarListaUsuarios(u17);
        this.agregarListaUsuarios(u18);
        this.agregarListaUsuarios(u19);
    }

    public Usuario login(String cedula, String password) {
        return this.controllerUsuario.login(cedula, password);
    }

    public String[] getListaAreas() {
        return this.controllerArea.getListaAreas();
    }

    public void agregarListaAreas(Area Area) {
        this.controllerArea.agregarListaAreas(Area);
    }

    public ArrayList<Sector> getListaSectores() {
        return this.controllerSector.getListaSectores();
    }

    public void agregarListaSectores(Sector Sector) {
        this.controllerSector.agregarListaSectores(Sector);
    }

    public ArrayList<Puesto> getListaPuestos() {
        return this.controllerPuesto.getListaPuestos();
    }

    public void agregarListaPuestos(Puesto Puesto) {
        this.controllerPuesto.agregarListaPuestos(Puesto);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return this.controllerUsuario.getListaUsuarios();
    }

    public void agregarListaUsuarios(Usuario Usuario) {
        this.controllerUsuario.agregarListaUsuarios(Usuario);
    }

    public String[] getPuestosDisponibles() {
        return this.controllerPuesto.getListaPuestosDisponibles(this.getLogueado());
    }

    public void setPuestoTrabajador(int PuestoID) {
        this.controllerUsuario.setPuestoTrabajador(this.getLogueado(), PuestoID);
    }

    public int getPuestoTrabajador() {
        return this.controllerUsuario.getPuestoTrabajador(this.getLogueado());
    }

    public ArrayList<String> getInfoTrabajador() {
        return this.controllerUsuario.getInfoTrabajador(this.getLogueado());
    }

    public String getAreaPorSector(String NombreSector) {
        return this.controllerArea.getAreaPorSector(NombreSector);
    }

    public String[] getSectoresPorArea(String NombreArea) {
        return this.controllerArea.getSectoresPorArea(NombreArea);
    }

    public Sector getSectorTrabajador() {
        return this.controllerUsuario.getSectorTrabajador(this.getLogueado());
    }

    public void crearNumeroAtencion(String NombreSector, String CedulaCliente) {
        Usuario Usuario = this.controllerUsuario.getUsuarioPorCedula(CedulaCliente);
        Sector Sector = this.controllerSector.getSectorPorNombre(NombreSector);
        NumeroAtencion numero = this.controllerNumeroAtencion.crearNumeroAtencion(Sector, Usuario);
        ArrayList<Puesto> puestos = this.controllerSector.getPuestosLibres(Sector);

        if (puestos.size() > 0) {
            Puesto p = puestos.get(0);
            p.setNumeroAtencion(numero);
        } else {
            Cola.add(numero.getNumeroID());
        }
    }

    public ArrayList<NumeroAtencion> getListaNumerosAtencion() {
        return this.controllerNumeroAtencion.getListaNumerosAtencion();
    }

    public NumeroAtencion getNumeroAtencion() {
        return this.controllerNumeroAtencion.getNumeroAtencion(this.getLogueado());
    }

    public NumeroAtencion getSiguienteNumeroAtencion() {
        Sector Sector = this.getSectorTrabajador();
        return this.controllerNumeroAtencion.getSiguienteNumeroAtencion(Sector);
    }

    public String formatearFecha(Date Fecha) {
        return this.controllerNumeroAtencion.formatearFecha(Fecha);
    }

    public Queue<Integer> getCola() {
        return this.Cola;
    }

    public ArrayList<Puesto> getListaPuestosLibres() {
        return this.controllerPuesto.getListaPuestosLibres();
    }

    public Atencion crearAtencion() {
        return this.controllerAtencion.crearAtencion(this.getLogueado());
    }
    
    public Atencion cerrarAtencion(String Descripcion) {
        return this.controllerAtencion.cerrarAtencion(this.getLogueado(),Descripcion);
    }

    public ArrayList<Atencion> getListaAtencion() {
        return this.controllerAtencion.getListaAtencion();
    }
    
    public Atencion getAtencionTrabajador() {
        return this.controllerAtencion.getAtencionTrabajador(this.getLogueado());
    }

    public boolean comprobarCedulaCliente(String Cedula) {
        return this.controllerUsuario.comprobarCedulaCliente(Cedula);
    }
    
    public void setEstadoNumeroAtencion(int NumeroID) {
        this.controllerNumeroAtencion.setEstadoNumeroAtencion(NumeroID);
    }
    
    public void setEstadoTrabajador(String Estado) {
        this.controllerUsuario.setEstadoTrabajador(this.getLogueado(), Estado);
    }
}
