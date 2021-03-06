/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerSistema;
import Model.*;
import java.util.ArrayList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author gonzalo
 */
public final class ViewSolicitudNumero extends javax.swing.JFrame {

    /**
     * Creates new form ViewSolicitudNumero
     * @param selectedItem
     */
    
    private final String seleccionado;
    
    public ViewSolicitudNumero(String seleccionado) {
        this.seleccionado = seleccionado;
        initComponents();
        cargarSectores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCedula = new javax.swing.JLabel();
        lblSector = new javax.swing.JLabel();
        CmbSector = new javax.swing.JComboBox<>();
        txtCedula = new javax.swing.JTextField();
        btnSolicitar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCedula.setText("Cédula");

        lblSector.setText("Sector");

        btnSolicitar.setText("Solicitar Número");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        lblTitulo.setText("Solicitar Número de Atención");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula)
                            .addComponent(lblSector))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(CmbSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSolicitar)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSector)
                    .addComponent(CmbSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitar)
                    .addComponent(btnVolver))
                .addGap(63, 63, 63))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        String sectorSeleccionado = CmbSector.getSelectedItem().toString();
        String cedulaCliente = txtCedula.getText();
        
        boolean validacion = ControllerSistema.getInstancia().comprobarCedulaCliente(cedulaCliente);
        
        if(validacion) {
            ControllerSistema.getInstancia().crearNumeroAtencion(sectorSeleccionado, cedulaCliente);

            NumeroAtencion n = ControllerSistema.getInstancia().getNumeroAtencion();
            String Fecha = ControllerSistema.getInstancia().formatearFecha(n.getFecha());

            JOptionPane.showMessageDialog(null,"Información de consulta: \n N°: " + n.getNumeroID() + "\n Nombre: " + 
            n.getCliente().getNombreCompleto() + "\n Fecha: " + Fecha + "\n Sector: " + n.getSector().getNombre()); 
        }
        else {
            JOptionPane.showMessageDialog(null,"La cédula no es correcta");
        }
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        new ViewSolicitudSeleccionarArea().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed
    
    public void cargarSectores() {
        String[] sectores = ControllerSistema.getInstancia().getSectoresPorArea(this.seleccionado);
        
        for(String s : sectores) {
            if(s != null) {
                CmbSector.addItem(s);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbSector;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblSector;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
