package Vista;

import Controlador.Controlador_Rol;
import Modelo.Rol_model;
import javax.swing.JOptionPane;

/**
 *
 * @author jhony
 */
public class RolRegistro extends javax.swing.JInternalFrame {

    Controlador_Rol RolController = new Controlador_Rol();
    Rol_model Rolmodel = new Rol_model();
    
    public RolRegistro() {
        initComponents();
        RolController.buscarRegistroRol(TbBuscar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreRol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jchEstado = new javax.swing.JCheckBox();
        lbIDRol = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbBuscar = new javax.swing.JTable();
        COMBOOPCION = new javax.swing.JComboBox<>();
        txtBuscarN = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 120, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 560, 150));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/BtNuevo.png"))); // NOI18N
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 130, 40));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/BtEditar.png"))); // NOI18N
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 150, 40));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/BtEliminar3.png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 150, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 580, 70));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setForeground(new java.awt.Color(0, 51, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registro Rol de Usuario ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 147, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 146, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 461, 134));

        COMBOOPCION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre_Rol", "Id" }));
        COMBOOPCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOOPCIONActionPerformed(evt);
            }
        });
        getContentPane().add(COMBOOPCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 230, 120, 53));
        getContentPane().add(txtBuscarN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 182, 53));

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
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 120, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //Tomar el valor de Estado de un check
        String Estado;
        if (jchEstado.isSelected()) {
                Estado = "Activo";
            } else {
                Estado = "Inactivo";
            }
        //Linea de codigo validar campos vacios
        if(txtNombreRol.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            //validar si El nombre del rol no esta repetido
            if(!RolController.ExisteRol(txtNombreRol.getText().trim())){
                //Enviar los datos para ingresar el nuevo Rol
                Rolmodel.setNombre_Rol(txtNombreRol.getText().trim());
                Rolmodel.setEstado(Estado);
                RolController.insertarRolNuevo(Rolmodel);      
                RolController.buscarRegistroRol(TbBuscar);
            }       
        }
        //Limpiar Campos
        this.LimpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed
  
    private void jchEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchEstadoActionPerformed

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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(txtNombreRol.getText().isEmpty() || lbIDRol.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione el registro que desea editar");
        } else { 
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Editar el registro?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            int id = Integer.parseInt(lbIDRol.getText());
            String Estado;
                if (jchEstado.isSelected()) {
                    Estado = "Activo";
                } else {
                    Estado = "Inactivo";
                }
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                Rolmodel.setNombre_Rol(txtNombreRol.getText());
                Rolmodel.setEstado(Estado);
                RolController.editarRol(id, Rolmodel);
                //recargar la tabla de registros
                RolController.buscarRegistroRol(TbBuscar);
                //Vaciar los campos
                this.LimpiarCampos();
            } 
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtNombreRol.getText().isEmpty() && lbIDRol.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione el registro que desea eliminar");
        } else { 
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Eliminar el registro?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            int id = Integer.parseInt(lbIDRol.getText());
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                RolController.eliminarRol(id);
                //recargar la tabla de registros
                RolController.buscarRegistroRol(TbBuscar);
                //Vaciar los campos
                this.LimpiarCampos();
            }
        }    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void COMBOOPCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOOPCIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMBOOPCIONActionPerformed

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
    }//GEN-LAST:event_TbBuscarMouseClicked

    public void LimpiarCampos(){
        lbIDRol.setText("");
        txtNombreRol.setText("");
        jchEstado.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBOOPCION;
    public static javax.swing.JTable TbBuscar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jchEstado;
    private javax.swing.JLabel lbIDRol;
    private javax.swing.JTextField txtBuscarN;
    private javax.swing.JTextField txtNombreRol;
    // End of variables declaration//GEN-END:variables
}
