/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author gonzalo
 */
public class ViewDerivarMostrarPuesto extends javax.swing.JFrame {

    /**
     * Creates new form ViewDerivarMostrarPuesto
     */
    public ViewDerivarMostrarPuesto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCliente = new javax.swing.JTextField();
        txtFechaCliente = new javax.swing.JTextField();
        txtSectorCliente = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnAbrirAtencion = new javax.swing.JButton();
        btnCerrarAtencion = new javax.swing.JButton();
        btnDerivarNumero = new javax.swing.JButton();
        txtDerivados = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblNumeroCliente = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblFechaCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDerivados = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSectorCliente = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        lblLibre = new javax.swing.JLabel();
        txtLibre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCliente.setEditable(false);
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFechaCliente.setEditable(false);
        txtFechaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSectorCliente.setEditable(false);
        txtSectorCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
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

        txtDerivados.setEditable(false);
        txtDerivados.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblTitulo.setText("Siguiente Número:");

        lblNumeroCliente.setText("Número");

        lblCliente.setText("Cliente");

        lblFechaCliente.setText("Fecha");

        lblNombre.setText("Nombre");

        lblDerivados.setText("N° derivados");

        txtNombre.setEditable(false);
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblSectorCliente.setText("Sector");

        txtNumeroCliente.setEditable(false);
        txtNumeroCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblLibre.setText("Libre");

        txtLibre.setEditable(false);
        txtLibre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblLibre)
                    .addComponent(lblDerivados))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDerivados, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
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
                            .addComponent(btnVolver)
                            .addComponent(btnCerrarAtencion)
                            .addComponent(btnAbrirAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDerivarNumero)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDerivados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDerivados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLibre)
                    .addComponent(txtLibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(164, 164, 164)
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
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        new ViewIngreso().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAbrirAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirAtencionActionPerformed
        btnAbrirAtencion.setVisible(false);
        btnCerrarAtencion.setVisible(true);

//        Atencion a = ControllerSistema.getInstancia().crearAtencion();
//
//        JOptionPane.showMessageDialog(null,a.getAtencionID() + " " + a.getDescripcion() + " " + a.getFechaInicio() + " " + a.getFechaFin() + " " + a.getTrabajador().getNombreCompleto());
    }//GEN-LAST:event_btnAbrirAtencionActionPerformed

    private void btnCerrarAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarAtencionActionPerformed
        btnCerrarAtencion.setVisible(false);
        btnAbrirAtencion.setVisible(true);

        dispose();
        new ViewDescripcion().setVisible(true);
    }//GEN-LAST:event_btnCerrarAtencionActionPerformed

    private void btnDerivarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerivarNumeroActionPerformed
        dispose();
        new ViewDerivarSeleccionarArea().setVisible(true);
    }//GEN-LAST:event_btnDerivarNumeroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewDerivarMostrarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDerivarMostrarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDerivarMostrarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDerivarMostrarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDerivarMostrarPuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirAtencion;
    private javax.swing.JButton btnCerrarAtencion;
    private javax.swing.JButton btnDerivarNumero;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDerivados;
    private javax.swing.JLabel lblFechaCliente;
    private javax.swing.JLabel lblLibre;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroCliente;
    private javax.swing.JLabel lblSectorCliente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDerivados;
    private javax.swing.JTextField txtFechaCliente;
    private javax.swing.JTextField txtLibre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtSectorCliente;
    // End of variables declaration//GEN-END:variables
}
