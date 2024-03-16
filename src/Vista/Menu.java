package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author jhony
 */
public class Menu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;
    
    public Menu() {
        initComponents();
       //Codigo para ajustar el menu con la resolucion de pantalla
       this.setSize(new Dimension(1200, 700));
       this.setExtendedState(this.MAXIMIZED_BOTH);
       this.setLocationRelativeTo(null);
       this.setTitle("Sistema de Ventas");
        
       //codigo para que el jInternal se muestre en el menu con las dimenciones de la resolucion de la pantalla
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 90));
        this.jDesktopPane_menu.setBackground(Color.darkGray);
        this.add(jDesktopPane_menu);
        
                          
    }
    @Override
    public Image getIconImage (){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("AImagenes/IconoLogoGeneral.png"));
    return retValue;
    }    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        RolMenu1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ProductoMenu = new javax.swing.JMenuItem();
        RolMenu = new javax.swing.JMenuItem();
        ClientesMenu = new javax.swing.JMenuItem();
        UsuariosMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        VentasMenu = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        AgrstockMenu = new javax.swing.JMenuItem();
        MnuAdministrador = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        mnuPerfil = new javax.swing.JMenu();
        mnuAdminPerfil = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setForeground(new java.awt.Color(0, 102, 102));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setAlignmentX(4.0F);
        jMenuBar1.setMaximumSize(new java.awt.Dimension(220, 32769));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(212, 35));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/MenuArchivo.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        RolMenu1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RolMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/sa1.png"))); // NOI18N
        RolMenu1.setText("Cerrar sesión");
        RolMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RolMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolMenu1ActionPerformed(evt);
            }
        });
        jMenu1.add(RolMenu1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/ce2.png"))); // NOI18N
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/reg.png"))); // NOI18N
        jMenu2.setText("Registro");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        ProductoMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ProductoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/prod2.png"))); // NOI18N
        ProductoMenu.setText("Productos");
        ProductoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProductoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoMenuActionPerformed(evt);
            }
        });
        jMenu2.add(ProductoMenu);

        RolMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RolMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/cons2.png"))); // NOI18N
        RolMenu.setText("Rol");
        RolMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RolMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolMenuActionPerformed(evt);
            }
        });
        jMenu2.add(RolMenu);

        ClientesMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ClientesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/cli1.png"))); // NOI18N
        ClientesMenu.setText("Clientes");
        ClientesMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ClientesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesMenuActionPerformed(evt);
            }
        });
        jMenu2.add(ClientesMenu);

        UsuariosMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UsuariosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/emp1.png"))); // NOI18N
        UsuariosMenu.setText("Usuarios");
        UsuariosMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UsuariosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosMenuActionPerformed(evt);
            }
        });
        jMenu2.add(UsuariosMenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/mov.png"))); // NOI18N
        jMenu3.setText("Movimiento");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        VentasMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        VentasMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        VentasMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/vent1.png"))); // NOI18N
        VentasMenu.setText("Ventas");
        VentasMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VentasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasMenuActionPerformed(evt);
            }
        });
        jMenu3.add(VentasMenu);

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/caja1.png"))); // NOI18N
        jMenuItem24.setText("Caja");
        jMenuItem24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem24);

        AgrstockMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        AgrstockMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AgrstockMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/co1.png"))); // NOI18N
        AgrstockMenu.setText("Agregar stock");
        AgrstockMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgrstockMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrstockMenuActionPerformed(evt);
            }
        });
        jMenu3.add(AgrstockMenu);

        jMenuBar1.add(jMenu3);

        MnuAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/adm.png"))); // NOI18N
        MnuAdministrador.setText("Administrador");
        MnuAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MnuAdministrador.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/us1.png"))); // NOI18N
        jMenuItem10.setText("Nuevo Cliente");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        MnuAdministrador.add(jMenuItem10);

        jMenuBar1.add(MnuAdministrador);

        mnuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/per.png"))); // NOI18N
        mnuPerfil.setText("Perfil");
        mnuPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuPerfil.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        mnuAdminPerfil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        mnuAdminPerfil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuAdminPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/con1.png"))); // NOI18N
        mnuAdminPerfil.setText("Administrar Perfil");
        mnuAdminPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuAdminPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuAdminPerfilMouseClicked(evt);
            }
        });
        mnuAdminPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAdminPerfilActionPerformed(evt);
            }
        });
        mnuPerfil.add(mnuAdminPerfil);

        jMenuBar1.add(mnuPerfil);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ProductoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoMenuActionPerformed
        ProductoRegistro ProdRe = new ProductoRegistro();
        agregarFrameCentrado(ProdRe, jDesktopPane_menu);
    }//GEN-LAST:event_ProductoMenuActionPerformed

    private void RolMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolMenuActionPerformed
        RolRegistro rol = new RolRegistro();
        agregarFrameCentrado(rol, jDesktopPane_menu);
    }//GEN-LAST:event_RolMenuActionPerformed

    private void ClientesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesMenuActionPerformed
        ClientesRegistro ConsultaClientes = new ClientesRegistro();
        agregarFrameCentrado(ConsultaClientes, jDesktopPane_menu);
    }//GEN-LAST:event_ClientesMenuActionPerformed

    private void UsuariosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosMenuActionPerformed
        UsuarioRegistro Usuar = new UsuarioRegistro();
        agregarFrameCentrado(Usuar, jDesktopPane_menu);
    }//GEN-LAST:event_UsuariosMenuActionPerformed

    private void VentasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasMenuActionPerformed
       Ventas NuevaVenta = new Ventas();
       agregarFrameCentrado(NuevaVenta, jDesktopPane_menu);
    }//GEN-LAST:event_VentasMenuActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        Caja cajaA = new Caja();
        agregarFrameCentrado(cajaA, jDesktopPane_menu);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void mnuAdminPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAdminPerfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAdminPerfilMouseClicked

    private void mnuAdminPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAdminPerfilActionPerformed
        AdministrarPerfil adminPerfil = new AdministrarPerfil();
        agregarFrameCentrado(adminPerfil, jDesktopPane_menu);
    }//GEN-LAST:event_mnuAdminPerfilActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        NuevoCliente nuevousu = new NuevoCliente();
        agregarFrameCentrado(nuevousu, jDesktopPane_menu);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void AgrstockMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrstockMenuActionPerformed
        AgregarStock agrStock = new AgregarStock();
        agregarFrameCentrado(agrStock, jDesktopPane_menu);
    }//GEN-LAST:event_AgrstockMenuActionPerformed

    private void RolMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolMenu1ActionPerformed
        Login regresar = new Login();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RolMenu1ActionPerformed
    
    public void agregarFrameCentrado(JInternalFrame frame, JDesktopPane desktopPane) {
    desktopPane.add(frame);           
    Dimension desktopSize = desktopPane.getSize();
    Dimension frameSize = frame.getSize();
    frame.setLocation((desktopSize.width - frameSize.width)/2, (desktopSize.height- frameSize.height)/2);
    frame.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgrstockMenu;
    private javax.swing.JMenuItem ClientesMenu;
    public static javax.swing.JMenu MnuAdministrador;
    private javax.swing.JMenuItem ProductoMenu;
    public static javax.swing.JMenuItem RolMenu;
    public static javax.swing.JMenuItem RolMenu1;
    private javax.swing.JMenuItem UsuariosMenu;
    private javax.swing.JMenuItem VentasMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JMenuItem mnuAdminPerfil;
    public static javax.swing.JMenu mnuPerfil;
    // End of variables declaration//GEN-END:variables
}
