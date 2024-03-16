package Vista;

import Controlador.Controlador_Clientes;
import Modelo.Cliente_model;
import javax.swing.JOptionPane;

/**
 *
 * @author jhony
 */
public class ClientesRegistro extends javax.swing.JInternalFrame {

    Controlador_Clientes ClienteController = new Controlador_Clientes();
    Cliente_model clientemodel = new Cliente_model();
    
    public ClientesRegistro() {
        initComponents();
        lblRecuperar.setVisible(false);
        btnRecuperarCliente.setVisible(false);
        lbleliminar.setVisible(false);
        btnEliminarCliente.setVisible(false);
        ClienteController.buscarRegistroClientes(TbBuscar); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lbIDCliente = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        COMBOSEXO = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbleliminar = new javax.swing.JLabel();
        btnEliminarCliente = new javax.swing.JButton();
        lblRecuperar = new javax.swing.JLabel();
        btnRecuperarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbBuscar = new javax.swing.JTable();
        txtBuscarN = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        COMBOOPCION = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setForeground(new java.awt.Color(0, 51, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registro de Clientes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(236, 236, 236)
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("Id:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setText("Nombres:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, -1));

        lbIDCliente.setBackground(new java.awt.Color(255, 255, 255));
        lbIDCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(lbIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 16, 170, 25));

        txtCedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyTyped(evt);
            }
        });
        jPanel3.add(txtCedulaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 0));
        jLabel5.setText("Apellidos:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        COMBOSEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel3.add(COMBOSEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 0));
        jLabel7.setText("Sexo:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoClienteKeyTyped(evt);
            }
        });
        jPanel3.add(txtApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 0));
        jLabel4.setText("Cedula:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 150, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 0));
        jLabel8.setText("Direccion:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 60, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 0));
        jLabel9.setText("Telefono:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 70, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 0));
        jLabel10.setText("E-mail:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 50, -1));
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 170, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 170, -1));
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 170, -1));

        lbleliminar.setForeground(new java.awt.Color(255, 51, 51));
        lbleliminar.setText("Eliminar Cliente:");
        jPanel3.add(lbleliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/del_1.png"))); // NOI18N
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, 30));

        lblRecuperar.setForeground(new java.awt.Color(255, 51, 51));
        lblRecuperar.setText(" Recuperar Cliente:");
        jPanel3.add(lblRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        btnRecuperarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/ClienteRecuperar.png"))); // NOI18N
        btnRecuperarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnRecuperarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, 30));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/BtNuevo.png"))); // NOI18N
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setFocusPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 40));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/BtEditar.png"))); // NOI18N
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 150, 40));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 120, 40));

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

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/buscar.png"))); // NOI18N
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        COMBOOPCION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre o Apellido", "ID", "Cedula", "Cliente eliminado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(COMBOOPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtBuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(COMBOOPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Datos del Clientes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //validar que los campos no esten vacios
        if(txtNombreCliente.getText().isEmpty() || txtApellidoCliente.getText().isEmpty() || txtCedulaCliente.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtEmail.getText().isEmpty() || txtDireccion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            //validar si la Cedula del cliente no se repite 
            if(!ClienteController.ExisteCliente(txtCedulaCliente.getText().trim())){
                 if(txtCedulaCliente.getText().length() == 10){
                    if(!txtEmail.getText().contains("@") || !txtEmail.getText().contains(".com")){    
                        JOptionPane.showMessageDialog(null, "ingrese un correo valido");
                    }else{
                        //Enviar los datos para ingresar el nuevo cliente
                        clientemodel.setNombres(txtNombreCliente.getText().trim());
                        clientemodel.setApellidos(txtApellidoCliente.getText().trim());
                        clientemodel.setSexo(String.valueOf(COMBOSEXO.getSelectedItem()));
                        clientemodel.setCedula(txtCedulaCliente.getText().trim());
                        clientemodel.setTelefono(txtTelefono.getText().trim());
                        clientemodel.setEmail(txtEmail.getText().trim());
                        clientemodel.setDireccion(txtDireccion.getText().trim());
                        clientemodel.setEstado("Activo");
                        ClienteController.insertarClientesNuevo(clientemodel);
                        ClienteController.buscarRegistroClientes(TbBuscar);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "la cedula debe tener 10 digitos");
                }
            }         
        }
        //limpiar campos
        this.LimpiarCampos();   
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(this.CamposVacios() == false){
            JOptionPane.showMessageDialog(null, "Seleccione el registro que desea editar");
        } else {
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Editar el registro?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);          
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                if(!txtEmail.getText().contains("@") || !txtEmail.getText().contains(".com")){    
                    JOptionPane.showMessageDialog(null, "ingrese un correo valido");
                }else{                   
                    int idcli = Integer.parseInt(lbIDCliente.getText());
                    clientemodel.setID_Cliente(idcli);
                    if (ClienteController.LoginClientesDatos(clientemodel)) {
                        String CedulaClien = clientemodel.getCedula();
                        if (txtCedulaCliente.getText().equals(CedulaClien)) {
                            this.actualizarClientes();
                        } else {
                            if (!ClienteController.ExisteCliente(txtCedulaCliente.getText().trim())) {
                                this.actualizarClientes();
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(COMBOOPCION.getSelectedItem()=="Nombre o Apellido"){
            this.RecuElimi();
            ClienteController.buscarRegistroNombreCliente(txtBuscarN.getText(), TbBuscar);
            this.LimpiarCampos();
        }else if(COMBOOPCION.getSelectedItem()=="ID"){
            ClienteController.buscarRegistroIDCliente(txtBuscarN.getText(), TbBuscar);
            this.RecuElimi();
            this.LimpiarCampos();
        }else if(COMBOOPCION.getSelectedItem()=="Cedula"){
            ClienteController.buscarRegistroCedulaCliente(txtBuscarN.getText(), TbBuscar); 
            this.RecuElimi(); 
            this.LimpiarCampos();
        }else{
            ClienteController.buscarRegistroClienteEliminado(txtBuscarN.getText(), TbBuscar);
            this.LimpiarCampos();
            lblRecuperar.setVisible(true);
            btnRecuperarCliente.setVisible(true);
            lbleliminar.setVisible(true);
            btnEliminarCliente.setVisible(true);
            btnEliminar.setVisible(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if(this.CamposVacios() == false){
            JOptionPane.showMessageDialog(null, "Seleccione el Cliente que desea eliminar");
        } else {
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Eliminar al Cliente?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            int id = Integer.parseInt(lbIDCliente.getText());
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
            ClienteController.EliminarClienteBase(id);
            ClienteController.buscarRegistroClientes(TbBuscar);
            COMBOOPCION.setSelectedIndex(0);
            this.RecuElimi();
            this.LimpiarCampos();
            }
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        this.validarSolotexto(evt);
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteKeyTyped
        this.validarSolotexto(evt);
    }//GEN-LAST:event_txtApellidoClienteKeyTyped

    private void txtCedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyTyped
        this.validarSoloNumeros(evt);
        if(txtCedulaCliente.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaClienteKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        this.validarSoloNumeros(evt);
        if(txtTelefono.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(this.CamposVacios() == false){
            JOptionPane.showMessageDialog(null, "Seleccione el Cliente que desea eliminar");
        } else {
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Eliminar al Cliente?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            int id = Integer.parseInt(lbIDCliente.getText());
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                clientemodel.setEstado("Inactivo");
                ClienteController.EliminarCliente(id,clientemodel);
                //recargar la tabla de registros
                ClienteController.buscarRegistroClientes(TbBuscar);
                //Vaciar los campos
                this.LimpiarCampos();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbBuscarMouseClicked
        lbIDCliente.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),0).toString());
        txtNombreCliente.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),1).toString()); 
        txtApellidoCliente.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),2).toString()); 
        //Recoger el valor del sexo en un combobox
        String SexoC = TbBuscar.getValueAt(TbBuscar.getSelectedRow(), 3).toString();
        if(SexoC.equals("Masculino")){
            COMBOSEXO.setSelectedIndex(0);
        }else{ 
            COMBOSEXO.setSelectedIndex(1);
        }
        txtCedulaCliente.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),4).toString());
        txtTelefono.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),5).toString());
        txtEmail.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),6).toString());
        txtDireccion.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),7).toString());
    }//GEN-LAST:event_TbBuscarMouseClicked

    private void btnRecuperarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarClienteActionPerformed
        if(this.CamposVacios() == false){
            JOptionPane.showMessageDialog(null, "Seleccione el Cliente que desea recuperar");
        } else {
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Recuperar al Cliente?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            int id = Integer.parseInt(lbIDCliente.getText());
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
            clientemodel.setEstado("Activo");
            ClienteController.RecuperarCliente(id,clientemodel);
            ClienteController.buscarRegistroClientes(TbBuscar);
            COMBOOPCION.setSelectedIndex(0);
            this.RecuElimi();
            this.LimpiarCampos();
            }
        }
    }//GEN-LAST:event_btnRecuperarClienteActionPerformed

    public boolean CamposVacios(){
        boolean respuesta = true;
        if(lbIDCliente.getText().isEmpty() || txtNombreCliente.getText().isEmpty() || 
            txtApellidoCliente.getText().isEmpty() || txtCedulaCliente.getText().isEmpty() 
            || txtTelefono.getText().isEmpty() || txtEmail.getText().isEmpty() || txtDireccion.getText().isEmpty()){
            respuesta = false; 
        }
        return respuesta;
    }
    
    public void LimpiarCampos(){
        lbIDCliente.setText("");
        txtNombreCliente.setText("");
        txtApellidoCliente.setText("");
        COMBOSEXO.setSelectedIndex(0);
        txtCedulaCliente.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        txtDireccion.setText("");
        lbleliminar.setVisible(false);
        btnEliminarCliente.setVisible(false);
        lbleliminar.setVisible(false);
        btnEliminarCliente.setVisible(false);
    }
    
    public void actualizarClientes() {
        int id = Integer.parseInt(lbIDCliente.getText());
        clientemodel.setNombres(txtNombreCliente.getText());
        clientemodel.setApellidos(txtApellidoCliente.getText());
        clientemodel.setSexo(String.valueOf(COMBOSEXO.getSelectedItem()));
        clientemodel.setCedula(txtCedulaCliente.getText());
        clientemodel.setTelefono(txtTelefono.getText());
        clientemodel.setEmail(txtEmail.getText());
        clientemodel.setDireccion(txtDireccion.getText());
        ClienteController.editarCliente(id, clientemodel);
        //recargar la tabla de registros
        ClienteController.buscarRegistroClientes(TbBuscar);
        //Vaciar los campos
        this.LimpiarCampos();
    }
    
    public void RecuElimi(){
        lblRecuperar.setVisible(false);
        btnRecuperarCliente.setVisible(false);
        lbleliminar.setVisible(false);
        btnEliminarCliente.setVisible(false);
        btnEliminar.setVisible(true); 
    }
    
    public void validarSoloNumeros(java.awt.event.KeyEvent evt){
    char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();  
        }
    }
    public void validarSolotexto(java.awt.event.KeyEvent evt){
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();  
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBOOPCION;
    private javax.swing.JComboBox<String> COMBOSEXO;
    public static javax.swing.JTable TbBuscar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRecuperarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIDCliente;
    private javax.swing.JLabel lblRecuperar;
    private javax.swing.JLabel lbleliminar;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtBuscarN;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
