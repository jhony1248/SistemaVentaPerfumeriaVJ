/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Rol;
import Modelo.Rol_model;

/**
 *
 * @author jhony
 */
public class BuscarRol extends javax.swing.JInternalFrame {

    Controlador_Rol RolController = new Controlador_Rol();
    Rol_model Rolmodel = new Rol_model();
    public BuscarRol() {
        initComponents();
        RolController.buscarRegistroRol(TbBuscar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreRol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jchEstado = new javax.swing.JCheckBox();
        lbIDRol = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbBuscar = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBuscarN = new javax.swing.JTextField();
        COMBOOPCION = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setForeground(new java.awt.Color(0, 51, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar Rol Del Usuario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(251, 248, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Rol: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("Id:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setText("Nombre del Rol:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 61, -1, -1));
        jPanel3.add(txtNombreRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 59, 131, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 0));
        jLabel4.setText("Estado:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 114, -1, -1));

        jchEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jchEstado.setForeground(new java.awt.Color(0, 102, 0));
        jchEstado.setSelected(true);
        jchEstado.setText("Activo");
        jchEstado.setContentAreaFilled(false);
        jchEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jchEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchEstadoActionPerformed(evt);
            }
        });
        jPanel3.add(jchEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        lbIDRol.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lbIDRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 16, 131, 25));

        TbBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbBuscar);

        btnBuscar.setBackground(new java.awt.Color(73, 181, 172));
        btnBuscar.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/buscar.png"))); // NOI18N
        btnBuscar.setToolTipText("");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setRequestFocusEnabled(false);
        btnBuscar.setVerifyInputWhenFocusTarget(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarKeyPressed(evt);
            }
        });

        COMBOOPCION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre_Rol", "Id" }));
        COMBOOPCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOOPCIONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(COMBOOPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtBuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(COMBOOPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jchEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchEstadoActionPerformed

    private void TbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbBuscarMouseClicked
        lbIDRol.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),0).toString());
        txtNombreRol.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),1).toString());
        //Recoger el valor de estado a un check
        String estado = TbBuscar.getValueAt(TbBuscar.getSelectedRow(), 2).toString();
        if(estado.equals("Activo")){
            jchEstado.setSelected(true);
        }else{
            jchEstado.setSelected(false);
        }
        UsuarioRegistro.txtRol.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),1).toString());
        UsuarioRegistro.txtIdRol.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),0).toString());
    }//GEN-LAST:event_TbBuscarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        TbBuscar.setVisible(true);
        if(COMBOOPCION.getSelectedItem()=="Id"){
            RolController.buscarRegistoID_Rol(txtBuscarN.getText(), TbBuscar);
        }else{
            RolController.buscarRegistroNombreRol(txtBuscarN.getText(), TbBuscar);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed

    }//GEN-LAST:event_btnBuscarKeyPressed

    private void COMBOOPCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOOPCIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMBOOPCIONActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBOOPCION;
    public static javax.swing.JTable TbBuscar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jchEstado;
    private javax.swing.JLabel lbIDRol;
    private javax.swing.JTextField txtBuscarN;
    private javax.swing.JTextField txtNombreRol;
    // End of variables declaration//GEN-END:variables
}
