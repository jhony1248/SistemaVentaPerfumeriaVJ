package Vista;

import Controlador.Controlador_Productos;
import Modelo.Producto_model;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import javax.imageio.ImageIO;

/**
 *
 * @author jhony
 */
public class ProductoRegistro extends javax.swing.JInternalFrame {

    Controlador_Productos ProductoController = new Controlador_Productos();
    Producto_model ProductoModel = new Producto_model();
    String path = "";
    
    public ProductoRegistro() {
        initComponents();
        lblRecuperar.setVisible(false);
        btnRecuperarCliente.setVisible(false);
        lbleliminar.setVisible(false);
        btnEliminarUsuario.setVisible(false);
        ProductoController.buscarRegistroProducto(TbBuscar);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txt_Contenido_neto = new javax.swing.JTextField();
        txt_Descripcion = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        txt_Stock = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_Foto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        btnRecuperarCliente = new javax.swing.JButton();
        lblRecuperar = new javax.swing.JLabel();
        lblNombreImagen = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnEliminarUsuario = new javax.swing.JButton();
        lbleliminar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbBuscar = new javax.swing.JTable();
        COMBOOPCION = new javax.swing.JComboBox<>();
        txtBuscarN = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("*");

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));

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

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 850, -1));

        jPanel3.setBackground(new java.awt.Color(251, 248, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Producto: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 62, 167, -1));
        jPanel3.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 93, 167, -1));
        jPanel3.add(txt_Contenido_neto, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 124, 167, -1));
        jPanel3.add(txt_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 155, 167, -1));

        txt_Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PrecioKeyTyped(evt);
            }
        });
        jPanel3.add(txt_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 220, 167, -1));

        txt_Stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_StockKeyTyped(evt);
            }
        });
        jPanel3.add(txt_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 189, 167, -1));

        jLabel1.setText("ID_Producto:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, -1, -1));

        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 68, -1, -1));

        jLabel4.setText("Marca:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 96, -1, -1));

        jLabel5.setText("Stock:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 192, -1, -1));

        jLabel6.setText("Descripcion:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 158, -1, -1));

        jLabel7.setText("Contenido_Neto:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 127, -1, -1));

        jLabel10.setText("Precio:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 223, -1, -1));

        jLabel_Foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel_Foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_FotoMouseClicked(evt);
            }
        });
        jPanel3.add(jLabel_Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 270, 160));

        jLabel2.setText("Click para agregar Foto");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 160, 20));

        btnRecuperarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/producto.png"))); // NOI18N
        btnRecuperarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnRecuperarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, 30));

        lblRecuperar.setForeground(new java.awt.Color(255, 51, 51));
        lblRecuperar.setText(" Recuperar producto:");
        jPanel3.add(lblRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));
        jPanel3.add(lblNombreImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("*");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 10, -1));

        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("*");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 10, -1));

        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("*");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 10, -1));

        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("*");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 10, -1));

        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("*");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 10, -1));

        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/del_1.png"))); // NOI18N
        btnEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, 30));

        lbleliminar.setForeground(new java.awt.Color(255, 51, 51));
        lbleliminar.setText("Eliminar Producto:");
        jPanel3.add(lbleliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 840, 265));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setForeground(new java.awt.Color(0, 51, 51));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Registro de Productos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel8)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 50));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 820, 134));

        COMBOOPCION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "ID", "Marca", "Producto eliminado" }));
        getContentPane().add(COMBOOPCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));
        getContentPane().add(txtBuscarN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 190, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/buscar.png"))); // NOI18N
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecuperarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarClienteActionPerformed
        if(this.CamposVacios() == false){
            JOptionPane.showMessageDialog(null, "Seleccione el Producto que desea recuperar.");
        } else {
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Recuperar al Producto?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            int id = Integer.parseInt(txtId.getText()); 
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
            ProductoModel.setEstado("Activo");
            ProductoController.RecuperarProducto(id,ProductoModel);
            ProductoController.buscarRegistroProducto(TbBuscar); 
            COMBOOPCION.setSelectedIndex(0);
            this.LimpiarCampos();
            }
        }
    }//GEN-LAST:event_btnRecuperarClienteActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        String file = path;
        //validar que los campos no esten vacios      
        if(this.CamposVacios() == false){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else {
            //Validar si el producto no existe
            if(!ProductoController.ExisteProducto(txtNombre.getText().trim(), txt_Contenido_neto.getText().trim())){
                int stock = Integer.parseInt(txt_Stock.getText());
                double precio = Double.parseDouble(txt_Precio.getText());
                ProductoModel.setNombre(txtNombre.getText().trim());
                ProductoModel.setMarca(txtMarca.getText().trim());
                ProductoModel.setContenido_Neto(txt_Contenido_neto.getText().trim());
                ProductoModel.setDescripcion(txt_Descripcion.getText().trim());
                ProductoModel.setStock(stock);
                ProductoModel.setPrecio(precio);
                ProductoModel.setEstado("Activo");
                //transformar la imagen a bytes para enviar a la base de datos
                try{               
                    InputStream is = new FileInputStream(file);
                    RandomAccessFile raf = new RandomAccessFile(file, "r");
                    byte[] bytesData = new byte[(int) raf.length()];
                    raf.readFully(bytesData);
                    ProductoModel.setImagen(bytesData);
                }catch(IOException e) {
                    //e.printStackTrace();
                }
                ProductoController.insertarProductoNuevo(ProductoModel);
                //Vaciar los campos
                this.LimpiarCampos();
                //refrescar la tabla
                ProductoController.buscarRegistroProducto(TbBuscar);
            }
        }    
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(txtId.getText().isEmpty() || this.CamposVacios() == false || jLabel_Foto.getIcon()==null){
            JOptionPane.showMessageDialog(null, "Seleccione el registro que desea editar");
        }else {
            String file = path;
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Editar el registro?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            int id = Integer.parseInt(txtId.getText());           
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                int stock = Integer.parseInt(txt_Stock.getText());
                double precio = Double.parseDouble(txt_Precio.getText());
                ProductoModel.setNombre(txtNombre.getText());
                ProductoModel.setMarca(txtMarca.getText());
                ProductoModel.setContenido_Neto(txt_Contenido_neto.getText());
                ProductoModel.setDescripcion(txt_Descripcion.getText());
                ProductoModel.setStock(stock);
                ProductoModel.setPrecio(precio);
                try{               
                    InputStream is = new FileInputStream(file);
                    RandomAccessFile raf = new RandomAccessFile(file, "r");
                    byte[] bytesData = new byte[(int) raf.length()];
                    raf.readFully(bytesData);
                    ProductoModel.setImagen(bytesData);
                }catch(IOException e) {
                    //e.printStackTrace();
                }                               
                ProductoController.editarProducto(id, ProductoModel);
                //recargar la tabla de registros
                ProductoController.buscarRegistroProducto(TbBuscar);  
                //Vaciar los campos
                this.LimpiarCampos();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtId.getText().isEmpty() || this.CamposVacios() == false){
            JOptionPane.showMessageDialog(null, "Seleccione el Cliente que desea eliminar");
        } else {
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Eliminar al Producto?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            int id = Integer.parseInt(txtId.getText());   
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
                ProductoModel.setEstado("Inactivo");
                ProductoController.EliminarProducto(id,ProductoModel);
                //recargar la tabla de registros
                ProductoController.buscarRegistroProducto(TbBuscar);
                //Vaciar los campos
                this.LimpiarCampos();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbBuscarMouseClicked
        txtId.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),0).toString());
        txtNombre.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),1).toString());
        txtMarca.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),2).toString());
        txt_Contenido_neto.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),3).toString());
        txt_Descripcion.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),4).toString());
        txt_Stock.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),5).toString());
        txt_Precio.setText(TbBuscar.getValueAt(TbBuscar.getSelectedRow(),6).toString());
        int id = Integer.parseInt(txtId.getText());
        ProductoModel.setID_Productos(id);
        ProductoController.BuscarImageProd(ProductoModel);
        byte[] ImagenMod = ProductoModel.getImagen();
        BufferedImage img1 = null;
        try{
            img1 = ImageIO.read(new ByteArrayInputStream(ImagenMod));
            //Mostrar la imagen traida de la base de datos a un label
            jLabel_Foto.setIcon(new ImageIcon(img1));
            ImageIcon icon = new ImageIcon(img1);
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(jLabel_Foto.getWidth(), jLabel_Foto.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newimg);
            jLabel_Foto.setIcon(newIcon);
            jLabel_Foto.setSize(jLabel_Foto.getWidth(), jLabel_Foto.getHeight());           
        } catch (IOException ex) {
            Logger.getLogger(ProductoRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TbBuscarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(COMBOOPCION.getSelectedItem()=="Nombre"){
            this.RecuperElimi();
            ProductoController.buscarRegistroNombreProducto(txtBuscarN.getText(), TbBuscar);
            this.LimpiarCampos();
        }else if(COMBOOPCION.getSelectedItem()=="ID"){
            this.RecuperElimi();
            ProductoController.buscarRegistroIDProducto(txtBuscarN.getText(), TbBuscar);
            this.LimpiarCampos();
        }else if(COMBOOPCION.getSelectedItem()=="Marca"){
            this.RecuperElimi();
            ProductoController.buscarRegistroMarcaProducto(txtBuscarN.getText(), TbBuscar);
            this.LimpiarCampos();
        }else{        
            this.LimpiarCampos();
            lblRecuperar.setVisible(true);
            btnRecuperarCliente.setVisible(true);
            lbleliminar.setVisible(true);
            btnEliminarUsuario.setVisible(true);
            btnEliminar.setVisible(false);
            ProductoController.buscarRegistroProductoEliminado(txtBuscarN.getText(), TbBuscar);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jLabel_FotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_FotoMouseClicked
        try {
            this.open();
        } catch (IOException ex) {
            Logger.getLogger(ProductoRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel_FotoMouseClicked

    private void txt_StockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_StockKeyTyped
        this.validarSoloNumeros(evt);
        this.validarSoloPunto(evt);
        if(txt_Stock.getText().length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_txt_StockKeyTyped

    private void txt_PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PrecioKeyTyped
        this.validarSoloNumeros(evt);
        this.validarSoloPunto(evt);
        if(txt_Precio.getText().length() >= 5){
            evt.consume();
        }
    }//GEN-LAST:event_txt_PrecioKeyTyped

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        if(this.CamposVacios() == false){
            JOptionPane.showMessageDialog(null, "Seleccione el Producto que desea Eliminar.");
        } else {
            int resultadoPregunta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Eliminar al Producto?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            int id = Integer.parseInt(txtId.getText()); 
            if(resultadoPregunta == JOptionPane.YES_OPTION)
            {
            ProductoController.EliminarProductoBase(id);
            ProductoController.buscarRegistroProducto(TbBuscar); 
            COMBOOPCION.setSelectedIndex(0);
            this.LimpiarCampos();
            }
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    //Validar campos vacios
    public boolean CamposVacios(){
        boolean respuesta = true;
        if(txtNombre.getText().isEmpty() || txtMarca.getText().isEmpty() || txt_Contenido_neto.getText().isEmpty() 
                || txt_Precio.getText().isEmpty() || jLabel_Foto.getIcon()==null){
            respuesta = false; 
        }
        return respuesta;
    }
    
    //Limpiar campos
    public void LimpiarCampos(){
        txtId.setText("");
        txtNombre.setText("");
        txtMarca.setText("");
        txt_Contenido_neto.setText("");
        txt_Descripcion.setText("");
        txt_Stock.setText("");
        txt_Precio.setText("");
        jLabel_Foto.setIcon(null);      
        lblRecuperar.setVisible(false);
        btnRecuperarCliente.setVisible(false);
        lbleliminar.setVisible(false);
        btnEliminarUsuario.setVisible(false);
        btnEliminar.setVisible(true); 
    }
    
    public void RecuperElimi (){
        lblRecuperar.setVisible(false);
        btnRecuperarCliente.setVisible(false);
        lbleliminar.setVisible(false);
        btnEliminarUsuario.setVisible(false);
        btnEliminar.setVisible(true);
    }
    
    public void validarSoloNumeros(java.awt.event.KeyEvent evt){
    char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();  
        }
    }
    
    public void validarSoloPunto(java.awt.event.KeyEvent evt){
    char validar=evt.getKeyChar();
        if(validar == ','){
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
    
    //Codigo para abrir el explorador de archivos y seleccionar imagen
    public void open() throws IOException {
      
        JFileChooser JFC = new JFileChooser();
       
        JFC.setFileFilter(new FileNameExtensionFilter("Todos los archivos *.jpg", "png", "JPG","JPEG"));
       
        int abrir = JFC.showDialog(null, "Abrir");
        if (abrir == JFileChooser.APPROVE_OPTION) {
            FileReader FR = null;
            BufferedReader BR = null;

            try {
                File archivo = JFC.getSelectedFile();

                String PATH = JFC.getSelectedFile().getAbsolutePath();
                if (PATH.endsWith(".jpg") || PATH.endsWith(".png") || PATH.endsWith(".jpeg")) {

                    FR = new FileReader(archivo);
                    BR = new BufferedReader(FR);

                    String linea;
                    if (path.compareTo(archivo.getAbsolutePath()) == 0) {
                        JOptionPane.showMessageDialog(null, "Archivo no soportado Error");
                    } else {
                        path = archivo.getAbsolutePath();
                        while ((linea = BR.readLine()) != null) { 
                        }
                    }
                    jLabel_Foto.setIcon(new ImageIcon(path));
                    ImageIcon icon = new ImageIcon(path);
                    Image img = icon.getImage();
                    Image newimg = img.getScaledInstance(jLabel_Foto.getWidth(), jLabel_Foto.getHeight(), java.awt.Image.SCALE_SMOOTH);
                    ImageIcon newIcon = new ImageIcon(newimg);
                    jLabel_Foto.setIcon(newIcon);
                    jLabel_Foto.setSize(jLabel_Foto.getWidth(), jLabel_Foto.getHeight());
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no soportado Error");
                    open();
                }

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                
            } finally {
                try {
                    if (null != FR) {
                        FR.close();
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                    
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBOOPCION;
    public static javax.swing.JTable TbBuscar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRecuperarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Foto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreImagen;
    private javax.swing.JLabel lblRecuperar;
    private javax.swing.JLabel lbleliminar;
    private javax.swing.JTextField txtBuscarN;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txt_Contenido_neto;
    private javax.swing.JTextField txt_Descripcion;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_Stock;
    // End of variables declaration//GEN-END:variables
}
