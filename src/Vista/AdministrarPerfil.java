
package Vista;

import Controlador.Controlador_Usuarios;
import Modelo.Usuario_model;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author jhony
 */
public class AdministrarPerfil extends javax.swing.JInternalFrame {

    Controlador_Usuarios UsuariosController = new Controlador_Usuarios();
    Usuario_model Usuariomodel = new Usuario_model();   
    
    public AdministrarPerfil() {
        initComponents();      
        this.CancelarRestablecer();
    }
    
    public static String CedulaUsuLo = "";
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtNombresUsu = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txtApellidosUsu = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txtCedulaUsu = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txtTelefonoUsu = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtEmailUsu = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txtDireccionUsu = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        COMBOSEXO = new javax.swing.JComboBox<>();
        txtClaveUsu = new javax.swing.JPasswordField();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        LblConfirmacion = new javax.swing.JLabel();
        lblConfirmacion2 = new javax.swing.JSeparator();
        TxtClaveConfirmacion = new javax.swing.JPasswordField();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(58, 159, 171));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Administrar Perfil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Usuario:");

        txtUsuario.setEditable(false);

        jSeparator14.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator14.setForeground(new java.awt.Color(0, 102, 102));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Clave:");

        jSeparator15.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator15.setForeground(new java.awt.Color(0, 102, 102));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Nombres:");

        txtNombresUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresUsuKeyTyped(evt);
            }
        });

        jSeparator16.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator16.setForeground(new java.awt.Color(0, 102, 102));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Apellidos:");

        txtApellidosUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosUsuKeyTyped(evt);
            }
        });

        jSeparator17.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator17.setForeground(new java.awt.Color(0, 102, 102));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Cedula:");

        txtCedulaUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaUsuKeyTyped(evt);
            }
        });

        jSeparator18.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator18.setForeground(new java.awt.Color(0, 102, 102));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Telefono:");

        txtTelefonoUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoUsuKeyTyped(evt);
            }
        });

        jSeparator19.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator19.setForeground(new java.awt.Color(0, 102, 102));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("E-mail:");

        txtEmailUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailUsuKeyTyped(evt);
            }
        });

        jSeparator20.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator20.setForeground(new java.awt.Color(0, 102, 102));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("Direccion:");

        txtDireccionUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionUsuKeyTyped(evt);
            }
        });

        jSeparator21.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator21.setForeground(new java.awt.Color(0, 102, 102));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Sexo:");

        jSeparator22.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator22.setForeground(new java.awt.Color(0, 102, 102));

        COMBOSEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        txtClaveUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveUsuKeyTyped(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/modificar_1.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/canc_1.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        LblConfirmacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblConfirmacion.setForeground(new java.awt.Color(0, 102, 102));
        LblConfirmacion.setText("Confirmacion:");

        lblConfirmacion2.setBackground(new java.awt.Color(0, 51, 51));
        lblConfirmacion2.setForeground(new java.awt.Color(0, 102, 102));

        TxtClaveConfirmacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtClaveConfirmacionKeyTyped(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/Pguar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator20)
                            .addComponent(txtEmailUsu, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(COMBOSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator21)
                                    .addComponent(txtDireccionUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator19)
                                    .addComponent(txtTelefonoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator18)
                                        .addComponent(txtCedulaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator17)
                                        .addComponent(txtApellidosUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator16)
                                        .addComponent(txtNombresUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator15, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(txtClaveUsu)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator14)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(LblConfirmacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblConfirmacion2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(TxtClaveConfirmacion))
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addGap(30, 30, 30))))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClaveUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblConfirmacion)
                        .addComponent(TxtClaveConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txtNombresUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(txtApellidosUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnModificar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(txtCedulaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(txtTelefonoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(txtEmailUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(txtDireccionUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(COMBOSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        LblConfirmacion.setVisible(true);
        TxtClaveConfirmacion.setVisible(true);
        lblConfirmacion2.setVisible(true);
        txtClaveUsu.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtNombresUsu.setEnabled(true);
        txtApellidosUsu.setEnabled(true);
        txtCedulaUsu.setEnabled(true);
        txtTelefonoUsu.setEnabled(true);
        txtEmailUsu.setEnabled(true);
        txtDireccionUsu.setEnabled(true);
        btnGuardar.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.CancelarRestablecer();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtUsuario.getText().isEmpty() || txtNombresUsu.getText().isEmpty() || txtApellidosUsu.getText().isEmpty()
        || txtCedulaUsu.getText().isEmpty() || txtTelefonoUsu.getText().isEmpty() || txtEmailUsu.getText().isEmpty() 
        || txtDireccionUsu.getText().isEmpty() || TxtClaveConfirmacion.getText().isEmpty() || txtClaveUsu.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else {
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Editar sus datos?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);

            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                if(txtClaveUsu.getText().length() >= 4){
                    if(TxtClaveConfirmacion.getText().equals(txtClaveUsu.getText())){
                        if(txtCedulaUsu.getText().length() == 10){
                            if(!txtEmailUsu.getText().contains("@") || !txtEmailUsu.getText().contains(".com")){    
                                JOptionPane.showMessageDialog(null, "ingrese un correo valido");
                            }else{
                                if (txtCedulaUsu.getText().equals(CedulaUsuLo)) {
                                   this.actualizarPerfil();
                                }else {
                                    if(!UsuariosController.ExisteUsuarioCedula(txtCedulaUsu.getText().trim())) {                                  
                                        this.actualizarPerfil(); 
                                    }
                                }
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "la cedula debe tener 10 digitos.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden. Inténtalo de nuevo.", "ERROR", JOptionPane.ERROR_MESSAGE);               
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La contraseña debe tener mas de 4 digitos.", "ERROR", JOptionPane.ERROR_MESSAGE);                                  
                }    
            }    
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombresUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresUsuKeyTyped
        this.validarSolotexto(evt);
        if(txtNombresUsu.getText().length() >= 32){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresUsuKeyTyped

    private void txtApellidosUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosUsuKeyTyped
        this.validarSolotexto(evt);
        if(txtApellidosUsu.getText().length() >= 32){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosUsuKeyTyped

    private void txtCedulaUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaUsuKeyTyped
        this.validarSoloNumeros(evt);
        if(txtCedulaUsu.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaUsuKeyTyped

    private void txtTelefonoUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoUsuKeyTyped
        this.validarSoloNumeros(evt);
        if(txtTelefonoUsu.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoUsuKeyTyped

    private void txtClaveUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveUsuKeyTyped
        if(txtClaveUsu.getText().length() >= 16){
            evt.consume();
        }
    }//GEN-LAST:event_txtClaveUsuKeyTyped

    private void TxtClaveConfirmacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtClaveConfirmacionKeyTyped
        if(TxtClaveConfirmacion.getText().length() >= 16){
            evt.consume();
        }
    }//GEN-LAST:event_TxtClaveConfirmacionKeyTyped

    private void txtEmailUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailUsuKeyTyped
        if(txtEmailUsu.getText().length() >= 30){
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailUsuKeyTyped

    private void txtDireccionUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionUsuKeyTyped
        if(txtDireccionUsu.getText().length() >= 30){
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionUsuKeyTyped

    //Desencriptar la contraseña de la base de datos
    public String deecode(String cadenaEncriptada){
        String Desencriptacion= ""; 
        String SecretKey = "PerfumeriaVJ";
            try{                  
                byte[] message =  Base64.decodeBase64(cadenaEncriptada.getBytes("utf-8"));
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                byte[] digestOfPassword = md5.digest(SecretKey.getBytes("utf-8"));
                byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
                SecretKey key = new SecretKeySpec(keyBytes, "DESede");
                Cipher decipher = Cipher.getInstance("DESede");
                decipher.init(Cipher.DECRYPT_MODE, key);
                byte[] plainText = decipher.doFinal(message);
                Desencriptacion = new String(plainText, "UTF-8");                      
            }catch(Exception e){
            }
        return Desencriptacion;
    }
    //ENCRIPTAR CONTRASEÑA 
    public String encode(String cadenaAEncriptada){
        String encriptacion = ""; 
        String SecretKey = "PerfumeriaVJ";
        try{
            String ClaveSecreta = cadenaAEncriptada;
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(SecretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            
            byte[] plainTextBytes = ClaveSecreta.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al encriptar datos");
        }
        return encriptacion;
    }
    
    public void actualizarPerfil() {
        //Guardar la clave nueva para enviar a encriptar  
        String cadenaEncriptadaS = txtClaveUsu.getText();
        //Llamar a la funcion para Encriptar la clave
        String ClaveEncriptada = this.encode(cadenaEncriptadaS);
        Usuariomodel.setClave(ClaveEncriptada);                
        Usuariomodel.setNombres(txtNombresUsu.getText().trim());
        Usuariomodel.setApellidos(txtApellidosUsu.getText().trim());
        Usuariomodel.setSexo(String.valueOf(COMBOSEXO.getSelectedItem()));
        Usuariomodel.setCedula(txtCedulaUsu.getText().trim());
        Usuariomodel.setTelefono(txtTelefonoUsu.getText().trim());
        Usuariomodel.setEmail(txtEmailUsu.getText().trim());
        Usuariomodel.setDireccion(txtDireccionUsu.getText().trim());
        String usu = txtUsuario.getText();
        UsuariosController.AdministrarPerfil(usu, Usuariomodel);
        JOptionPane.showMessageDialog(null, "Perfil actualizado correctamente. vuelva a loguearse.");
        Usuariomodel.setUsuario(txtUsuario.getText());
        this.CancelarRestablecer();
    }
    
    public void CancelarRestablecer(){
        LblConfirmacion.setVisible(false);
        TxtClaveConfirmacion.setVisible(false);
        lblConfirmacion2.setVisible(false);
        txtClaveUsu.setEnabled(false);
        LblConfirmacion.setVisible(false);
        TxtClaveConfirmacion.setVisible(false);
        lblConfirmacion2.setVisible(false);
        txtClaveUsu.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtNombresUsu.setEnabled(false);
        txtApellidosUsu.setEnabled(false);
        txtCedulaUsu.setEnabled(false);
        txtTelefonoUsu.setEnabled(false);
        txtEmailUsu.setEnabled(false);
        txtDireccionUsu.setEnabled(false);       
        String UsuarioLogin = Login.NombreUsuario;        
        //Traer datos del usuario logeado
        txtUsuario.setText(UsuarioLogin);
        Usuariomodel.setUsuario(txtUsuario.getText());
        if (UsuariosController.LoginUsuarioDatos(Usuariomodel)) {
            String NombresUsuLo = Usuariomodel.getNombres();
            String ApellidosUsuLo = Usuariomodel.getApellidos();
            String ClaveUsuLo = Usuariomodel.getClave();
            String SexoUsuLo = Usuariomodel.getSexo();            
            CedulaUsuLo = Usuariomodel.getCedula();
            String EmailUsuLo = Usuariomodel.getEmail();
            String TelefonoUsuLo = Usuariomodel.getTelefono();
            String DireccionUsuLo = Usuariomodel.getDireccion();
            txtNombresUsu.setText(NombresUsuLo);
            txtApellidosUsu.setText(ApellidosUsuLo);
            txtCedulaUsu.setText(CedulaUsuLo);
            txtTelefonoUsu.setText(TelefonoUsuLo);
            txtEmailUsu.setText(EmailUsuLo);
            txtDireccionUsu.setText(DireccionUsuLo);
            String SexoC = SexoUsuLo;
            if (SexoC.equals("Masculino")) {
                COMBOSEXO.setSelectedIndex(0);
            } else {
                COMBOSEXO.setSelectedIndex(1);
            }
            //Desencriptar la clave
            String cadenaEncriptada = ClaveUsuLo;
            //Llamar a la funcion para desencriptar la clave
            String ClaveDesencripta = this.deecode(cadenaEncriptada);
            TxtClaveConfirmacion.setText(ClaveDesencripta);
            txtClaveUsu.setText(ClaveDesencripta);
            btnGuardar.setVisible(false);
        }              
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
    private javax.swing.JComboBox<String> COMBOSEXO;
    private javax.swing.JLabel LblConfirmacion;
    private javax.swing.JPasswordField TxtClaveConfirmacion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator lblConfirmacion2;
    private javax.swing.JTextField txtApellidosUsu;
    private javax.swing.JTextField txtCedulaUsu;
    private javax.swing.JPasswordField txtClaveUsu;
    private javax.swing.JTextField txtDireccionUsu;
    private javax.swing.JTextField txtEmailUsu;
    private javax.swing.JTextField txtNombresUsu;
    private javax.swing.JTextField txtTelefonoUsu;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
