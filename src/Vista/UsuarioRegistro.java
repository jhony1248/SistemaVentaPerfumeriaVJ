package Vista;

import Controlador.Controlador_Usuarios;
import Modelo.Usuario_model;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;;

/**
 *
 * @author jhony
 */
public class UsuarioRegistro extends javax.swing.JInternalFrame {  
    
    Controlador_Usuarios UsuariosController = new Controlador_Usuarios();
    Usuario_model Usuariomodel = new Usuario_model();
    
    public UsuarioRegistro() {
        initComponents();
        UsuariosController.buscarRegistroUsuarios(TbBuscar);
        lblRecuperar.setVisible(false);
        btnRecuperarCliente.setVisible(false);
        lbleliminar.setVisible(false);
        btnEliminarUsuario.setVisible(false);
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        COMBOSEXO = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblRecuperar = new javax.swing.JLabel();
        btnRecuperarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnBuscarRol = new javax.swing.JButton();
        txtRol = new javax.swing.JLabel();
        txtIdRol = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        btnEliminarUsuario = new javax.swing.JButton();
        lbleliminar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbBuscar = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBuscarN = new javax.swing.JTextField();
        COMBOOPCION = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setForeground(new java.awt.Color(0, 51, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registro de Usuarios");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(249, 249, 249))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 745, -1));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 501, 745, 70));

        jPanel3.setBackground(new java.awt.Color(251, 248, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Usuario: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setText("Nombres:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, -1));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 0));
        jLabel5.setText("Apellidos:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        COMBOSEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel3.add(COMBOSEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 0));
        jLabel7.setText("Sexo:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 0));
        jLabel4.setText("Cedula:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 0));
        jLabel8.setText("Direccion:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 60, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 0));
        jLabel9.setText("Telefono:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 70, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 0));
        jLabel10.setText("E-mail:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 50, -1));

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 170, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 170, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 170, -1));

        lblRecuperar.setForeground(new java.awt.Color(255, 51, 51));
        lblRecuperar.setText(" Recuperar usuario:");
        jPanel3.add(lblRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        btnRecuperarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/ClienteRecuperar.png"))); // NOI18N
        btnRecuperarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnRecuperarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setText("Clave:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 0));
        jLabel11.setText("Usuario:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setText("Rol:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 30, -1));

        btnBuscarRol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscarRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/VBus.png"))); // NOI18N
        btnBuscarRol.setText("Buscar");
        btnBuscarRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRolActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 90, 20));

        txtRol.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 130, 20));

        txtIdRol.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtIdRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 30, 20));

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 170, -1));

        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });
        jPanel3.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, -1));

        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/del_1.png"))); // NOI18N
        btnEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, 30));

        lbleliminar.setForeground(new java.awt.Color(255, 51, 51));
        lbleliminar.setText("Eliminar Usuario:");
        jPanel3.add(lbleliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 745, 215));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 349, 725, 134));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/buscar.png"))); // NOI18N
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 290, -1, -1));
        getContentPane().add(txtBuscarN, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 301, 193, 29));

        COMBOOPCION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre o Apellido", "Usuario", "Cedula", "Usuario eliminado" }));
        getContentPane().add(COMBOOPCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 301, 138, 29));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if(txtUsuario.getText().isEmpty() || this.CamposVacios()==false || txtClave.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else{
            if(!UsuariosController.ExisteUsuario(txtUsuario.getText().trim(), txtCedula.getText().trim())){
                if(txtCedula.getText().length() == 10){
                    if(txtClave.getText().length() >= 4){
                        if(!txtEmail.getText().contains("@") || !txtEmail.getText().contains(".com")){    
                            JOptionPane.showMessageDialog(null, "ingrese un correo valido");
                        }else{
                            //Encriptar clave
                            String encriptacion = "";
                            String SecretKey = "PerfumeriaVJ";
                            try {
                                MessageDigest md5 = MessageDigest.getInstance("MD5");
                                byte[] llavePassword = md5.digest(SecretKey.getBytes("utf-8"));
                                byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
                                SecretKey key = new SecretKeySpec(BytesKey, "DESede");
                                Cipher cifrado = Cipher.getInstance("DESede");
                                cifrado.init(Cipher.ENCRYPT_MODE, key);
                                String ClaveSecreta = txtClave.getText().trim();
                                byte[] plainTextBytes = ClaveSecreta.getBytes("utf-8");
                                byte[] buf = cifrado.doFinal(plainTextBytes);
                                byte[] base64Bytes = Base64.encodeBase64(buf);
                                encriptacion = new String(base64Bytes);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Error al encriptar datos");
                            }
                            //Enviar los datos para ingresar el nuevo cliente
                            int IdRoll = Integer.parseInt(txtIdRol.getText().trim());
                            Usuariomodel.setUsuario(txtUsuario.getText().trim());
                            Usuariomodel.setClave(encriptacion);
                            Usuariomodel.setNombres(txtNombre.getText().trim());
                            Usuariomodel.setApellidos(txtApellido.getText().trim());
                            Usuariomodel.setSexo(String.valueOf(COMBOSEXO.getSelectedItem()));
                            Usuariomodel.setCedula(txtCedula.getText().trim());
                            Usuariomodel.setTelefono(txtTelefono.getText().trim());
                            Usuariomodel.setEmail(txtEmail.getText().trim());
                            Usuariomodel.setDireccion(txtDireccion.getText().trim());
                            Usuariomodel.setID_Rol(IdRoll);
                            Usuariomodel.setEstado("Activo");
                            UsuariosController.insertarUsuarioNuevo(Usuariomodel);
                            this.LimpiarCampos();
                            UsuariosController.buscarRegistroUsuarios(TbBuscar);                  
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "la contraseña debe tener mas de 4 digitos");
                    }    
                }else{
                    JOptionPane.showMessageDialog(null, "la cedula debe tener 10 digitos");
                }    
            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(txtUsuario.getText().isEmpty() || this.CamposVacios()==false){
            JOptionPane.showMessageDialog(null, "Seleccione el registro que desea editar");
        }else{
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Editar el registro?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);           
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                if(txtCedula.getText().length() == 10){
                    if(!txtEmail.getText().contains("@") || !txtEmail.getText().contains(".com")){    
                        JOptionPane.showMessageDialog(null, "ingrese un correo valido");
                    }else{
                        Usuariomodel.setUsuario(txtUsuario.getText());
                        if (UsuariosController.LoginUsuarioDatos(Usuariomodel)) {           
                            String CedulaUsuLo = Usuariomodel.getCedula();
                            if(txtCedula.getText().equals(CedulaUsuLo)){
                                this.actualizarUsuario();
                            }else{
                                if(!UsuariosController.ExisteUsuarioCedula(txtCedula.getText().trim())) {                                  
                                    this.actualizarUsuario();
                                }
                            }
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "la cedula debe tener 10 digitos");
                }
            }
        }    
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtUsuario.getText().isEmpty() || this.CamposVacios()==false){
            JOptionPane.showMessageDialog(null, "Seleccione el registro que desea editar");
        }else{
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Eliminar el registro?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            String usu = txtUsuario.getText();
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                Usuariomodel.setEstado("Inactivo");
                UsuariosController.EliminarUsuario(usu, Usuariomodel);
                this.LimpiarCampos();
                UsuariosController.buscarRegistroUsuarios(TbBuscar); 
            }
        }    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        this.validarSolotexto(evt);
        if(txtNombre.getText().length() >= 32){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        this.validarSoloNumeros(evt);
        if(txtCedula.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        this.validarSolotexto(evt);
        if(txtApellido.getText().length() >= 32){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        this.validarSoloNumeros(evt);
        if(txtTelefono.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnRecuperarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarClienteActionPerformed
        if(txtUsuario.getText().isEmpty() || this.CamposVacios()==false){
            JOptionPane.showMessageDialog(null, "Seleccione el Usuario que desea recuperar");
        }else{
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Recuperar al Usuario?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            String usu = txtUsuario.getText();
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                Usuariomodel.setEstado("Activo");
                UsuariosController.RecuperarUsuario(usu, Usuariomodel);
                this.LimpiarCampos();
                UsuariosController.buscarRegistroUsuarios(TbBuscar); 
            }
        }  
    }//GEN-LAST:event_btnRecuperarClienteActionPerformed
    
    private void btnBuscarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRolActionPerformed
        BuscarRol consul = new BuscarRol();
        Menu.jDesktopPane_menu.add(consul);
        consul.toFront();
        consul.setVisible(true);
    }//GEN-LAST:event_btnBuscarRolActionPerformed

    private void TbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbBuscarMouseClicked
        txtUsuario.setEnabled(false);
        txtClave.setEnabled(false);
        txtUsuario.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),0).toString());
        txtNombre.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),1).toString());
        txtApellido.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),2).toString());
        //Recoger el valor del sexo en un combobox
        String SexoC = TbBuscar.getValueAt(TbBuscar.getSelectedRow(), 3).toString();
        if(SexoC.equals("Masculino")){
            COMBOSEXO.setSelectedIndex(0);
        }else{
            COMBOSEXO.setSelectedIndex(1);
        }
        txtCedula.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),4).toString());
        txtEmail.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),5).toString());
        txtDireccion.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),6).toString());
        txtTelefono.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),7).toString());        
        txtIdRol.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),8).toString());
        txtRol.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),9).toString());
    }//GEN-LAST:event_TbBuscarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(COMBOOPCION.getSelectedItem()=="Nombre o Apellido"){
            this.LimpiarCampos();
            this.RecupElim();
            UsuariosController.buscarRegistroNombreUsuarios(txtBuscarN.getText(), TbBuscar);
        }else if(COMBOOPCION.getSelectedItem()=="Usuario"){  
            this.LimpiarCampos();
            this.RecupElim();
            UsuariosController.buscarRegistroUsuariosU(txtBuscarN.getText(), TbBuscar);
        }else if(COMBOOPCION.getSelectedItem()=="Cedula"){ 
            this.LimpiarCampos();
            this.RecupElim();
            UsuariosController.buscarRegistroUsuariosCedula(txtBuscarN.getText(), TbBuscar);                      
        }else{       
            this.LimpiarCampos();
            lblRecuperar.setVisible(true);
            btnRecuperarCliente.setVisible(true);
            lbleliminar.setVisible(true);
            btnEliminarUsuario.setVisible(true);
            btnEliminar.setVisible(false);
            UsuariosController.buscarRegistroUsuariosEliminados(txtBuscarN.getText(), TbBuscar);           
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyTyped
        if(txtClave.getText().length() >= 16){
            evt.consume();
        }
    }//GEN-LAST:event_txtClaveKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        if(txtUsuario.getText().length() >= 20){
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if(txtEmail.getText().length() >= 30){
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if(txtDireccion.getText().length() >= 30){
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        if(txtUsuario.getText().isEmpty() || this.CamposVacios()==false){
            JOptionPane.showMessageDialog(null, "Seleccione el Usuario que desea Eliminar.");
        }else{
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Eliminar al Usuario?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            String usu = txtUsuario.getText();
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                UsuariosController.EliminarUsuarioBase(usu);
                this.LimpiarCampos();
                UsuariosController.buscarRegistroUsuarios(TbBuscar); 
            }
        } 
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed
    
    //metodos///
    public void actualizarUsuario() {
        String usu = txtUsuario.getText();
        int IdRoll = Integer.parseInt(txtIdRol.getText().trim());
        Usuariomodel.setNombres(txtNombre.getText().trim());
        Usuariomodel.setApellidos(txtApellido.getText().trim());
        Usuariomodel.setSexo(String.valueOf(COMBOSEXO.getSelectedItem()));
        Usuariomodel.setCedula(txtCedula.getText().trim());
        Usuariomodel.setTelefono(txtTelefono.getText().trim());
        Usuariomodel.setEmail(txtEmail.getText().trim());
        Usuariomodel.setDireccion(txtDireccion.getText().trim());
        Usuariomodel.setID_Rol(IdRoll);
        UsuariosController.editarUsuario(usu, Usuariomodel);
        this.LimpiarCampos();
        UsuariosController.buscarRegistroUsuarios(TbBuscar);
    }
    
    //Limpiar Campos
    public void LimpiarCampos(){
        txtNombre.setText("");
        txtApellido.setText("");
        COMBOSEXO.setSelectedIndex(0);
        txtCedula.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        txtDireccion.setText("");
        txtRol.setText("");
        txtIdRol.setText("");
        lblRecuperar.setVisible(false);
        btnRecuperarCliente.setVisible(false);
        lbleliminar.setVisible(false);
        btnEliminarUsuario.setVisible(false);
        txtUsuario.setEnabled(true);
        txtClave.setEnabled(true);
        txtUsuario.setText("");
        txtClave.setText("");
        btnEliminar.setVisible(true);
    }
    
    //recupeelim 
    public void RecupElim(){
        lblRecuperar.setVisible(false);
        btnRecuperarCliente.setVisible(false);
        lbleliminar.setVisible(false);
        btnEliminarUsuario.setVisible(false);
        btnEliminar.setVisible(true);
    }
    
    //Validar campos vacios
    public boolean CamposVacios(){
        boolean respuesta = true;
        if( txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() 
            || txtCedula.getText().isEmpty() || txtRol.getText().isEmpty()
            || txtTelefono.getText().isEmpty() || txtEmail.getText().isEmpty() || txtDireccion.getText().isEmpty()){
            respuesta = false; 
        }
        return respuesta;
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
    public static javax.swing.JButton btnBuscarRol;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRecuperarCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel lblRecuperar;
    private javax.swing.JLabel lbleliminar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarN;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    public static javax.swing.JLabel txtIdRol;
    private javax.swing.JTextField txtNombre;
    public static javax.swing.JLabel txtRol;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
