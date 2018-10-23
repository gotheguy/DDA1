/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerSistema;
import Model.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gonzalo
 */
public class ViewAtender extends javax.swing.JFrame {

    /**
     * Creates new form ViewAtender
     */
    
    public ViewAtender() {
        initComponents();
        cargarInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblAsignados = new javax.swing.JLabel();
        lblDerivados = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblSector = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtSector = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JTextField();
        txtAsignados = new javax.swing.JTextField();
        txtDerivados = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblNumeroCliente = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblFechaCliente = new javax.swing.JLabel();
        lblSectorCliente = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtFechaCliente = new javax.swing.JTextField();
        txtSectorCliente = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnAbrirAtencion = new javax.swing.JButton();
        btnCerrarAtencion = new javax.swing.JButton();
        btnDerivarNumero = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblNombre.setText("Nombre");

        lblPuesto.setText("Puesto");

        lblArea.setText("Area");

        lblAsignados.setText("N° asignados");

        lblDerivados.setText("N° derivados");

        lblTiempo.setText("Tiempo promedio");

        lblSector.setText("Sector");

        txtNombre.setEditable(false);
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtArea.setEditable(false);
        txtArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSector.setEditable(false);
        txtSector.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPuesto.setEditable(false);
        txtPuesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAsignados.setEditable(false);
        txtAsignados.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDerivados.setEditable(false);
        txtDerivados.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtTiempo.setEditable(false);
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblTitulo.setText("Siguiente Número:");

        lblNumeroCliente.setText("Número");

        lblCliente.setText("Cliente");

        lblFechaCliente.setText("Fecha");

        lblSectorCliente.setText("Sector");

        txtNumeroCliente.setEditable(false);
        txtNumeroCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCliente.setEditable(false);
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFechaCliente.setEditable(false);
        txtFechaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSectorCliente.setEditable(false);
        txtSectorCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAbrirAtencion.setText("Abrir Atención");
        btnAbrirAtencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirAtencionActionPerformed(evt);
            }
        });

        btnCerrarAtencion.setText("Cerrar Atención");
        btnCerrarAtencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarAtencionActionPerformed(evt);
            }
        });

        btnDerivarNumero.setText("Derivar Número");
        btnDerivarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerivarNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(lblDerivados)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTiempo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(lblAsignados)))
                            .addComponent(lblPuesto)
                            .addComponent(lblSector)
                            .addComponent(lblArea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtArea)
                            .addComponent(txtSector)
                            .addComponent(txtAsignados)
                            .addComponent(txtDerivados)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(txtTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(txtNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumeroCliente)
                                    .addComponent(lblFechaCliente)
                                    .addComponent(lblCliente)
                                    .addComponent(lblSectorCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaCliente)
                                    .addComponent(txtCliente)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSectorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 87, Short.MAX_VALUE))))
                            .addComponent(btnSalir)
                            .addComponent(btnCerrarAtencion)
                            .addComponent(btnAbrirAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDerivarNumero))))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtArea, txtAsignados, txtDerivados, txtPuesto, txtSector});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSector)
                    .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuesto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsignados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDerivados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDerivados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempo))
                .addGap(37, 37, 37)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroCliente)
                    .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaCliente)
                    .addComponent(txtFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSectorCliente)
                    .addComponent(txtSectorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAbrirAtencion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarAtencion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDerivarNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtArea, txtAsignados, txtDerivados, txtNombre, txtSector, txtTiempo});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        new ViewIngreso().setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAbrirAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirAtencionActionPerformed
        btnAbrirAtencion.setVisible(false);
        btnCerrarAtencion.setVisible(true);
        
        Atencion a = ControllerSistema.getInstancia().crearAtencion();
        ControllerSistema.getInstancia().setEstadoTrabajador("Ocupado");
    }//GEN-LAST:event_btnAbrirAtencionActionPerformed

    private void btnCerrarAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarAtencionActionPerformed
        btnCerrarAtencion.setVisible(false);
        btnAbrirAtencion.setVisible(true);
        
        NumeroAtencion numero = ControllerSistema.getInstancia().getSiguienteNumeroAtencion();
        ControllerSistema.getInstancia().setEstadoNumeroAtencion(numero.getNumeroID());
        ControllerSistema.getInstancia().setEstadoTrabajador("Libre");
        
        dispose();
        new ViewDescripcion().setVisible(true);
    }//GEN-LAST:event_btnCerrarAtencionActionPerformed

    private void btnDerivarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerivarNumeroActionPerformed
        dispose();
        new ViewDerivarSeleccionarArea().setVisible(true);
    }//GEN-LAST:event_btnDerivarNumeroActionPerformed
    
    public void cargarInfo() {
        btnCerrarAtencion.setVisible(false);
        ArrayList<String> data = ControllerSistema.getInstancia().getInfoTrabajador();
        
        for (String s : data) {
            if(s != null) {
                txtNombre.setText(data.get(0));
                txtArea.setText(ControllerSistema.getInstancia().getAreaPorSector(data.get(1)));
                txtSector.setText(data.get(1));
                txtPuesto.setText(data.get(2));
                txtAsignados.setText(data.get(3));
//                txtDerivados.setText(data.get(4));
//                txtTiempo.setText(data.get(5));
            }
        }
            
        NumeroAtencion numero = ControllerSistema.getInstancia().getSiguienteNumeroAtencion();
            
        if(numero == null) {
            txtNumeroCliente.setText("");
            txtCliente.setText("");
            txtFechaCliente.setText("");
            txtSectorCliente.setText("");
            btnAbrirAtencion.setEnabled(false);
        }
        else {
            String Fecha = ControllerSistema.getInstancia().formatearFecha(numero.getFecha());
            String NumeroID = String.valueOf(numero.getNumeroID());
            txtNumeroCliente.setText(NumeroID);
            txtCliente.setText(numero.getCliente().getNombreCompleto());
            txtFechaCliente.setText(Fecha);
            txtSectorCliente.setText(numero.getSector().getNombre());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirAtencion;
    private javax.swing.JButton btnCerrarAtencion;
    private javax.swing.JButton btnDerivarNumero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblAsignados;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDerivados;
    private javax.swing.JLabel lblFechaCliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroCliente;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSector;
    private javax.swing.JLabel lblSectorCliente;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtAsignados;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDerivados;
    private javax.swing.JTextField txtFechaCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtSector;
    private javax.swing.JTextField txtSectorCliente;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
