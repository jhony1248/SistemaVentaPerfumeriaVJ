/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Factura;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jhony
 */
public class Caja extends javax.swing.JInternalFrame {

    Controlador_Factura FacturaController = new Controlador_Factura();
    
    public Caja() {
        initComponents();
        txtFecha.setText(fecha());
        //transformar el txtFecha a Date
        String Fechatxt = txtFecha.getText();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha;
        try {
            fecha = formato.parse(Fechatxt);
            java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            FacturaController.buscarRegistroFacturas(sqlDate, TbBuscar);    
        } catch (ParseException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }   
        this.CalcularTotal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIngresoventas = new javax.swing.JTextField();
        txtIvaPro = new javax.swing.JTextField();
        txtGanancia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbBuscar = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AImagenes/caja2.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(251, 248, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resumen diario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(51, 0, 0))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Ingreso por ventas:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(16, 27, 120, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Total de Iva:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 120, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Ganancia:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 120, 70, 30);

        txtIngresoventas.setEditable(false);
        jPanel1.add(txtIngresoventas);
        txtIngresoventas.setBounds(140, 30, 80, 20);

        txtIvaPro.setEditable(false);
        jPanel1.add(txtIvaPro);
        txtIvaPro.setBounds(140, 80, 80, 20);

        txtGanancia.setEditable(false);
        jPanel1.add(txtGanancia);
        txtGanancia.setBounds(140, 130, 80, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("FECHA:");

        txtFecha.setEditable(false);

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
        jScrollPane2.setViewportView(TbBuscar);

        jLabel5.setFont(new java.awt.Font("AR JULIAN", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL EN CAJA:");

        txtCaja.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbBuscarMouseClicked

    }//GEN-LAST:event_TbBuscarMouseClicked

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatofecha.format(fecha);
    }
    
    public void CalcularTotal(){
        Double Total_venta=0.0;  
        Double IngresoPorventa=0.0; 
        Double TotalIva=0.0;
        int fila = 0;
        fila = TbBuscar.getRowCount();
        for (int i=0; i<fila; i++){
            TotalIva += Double.parseDouble(String.valueOf(TbBuscar.getModel().getValueAt(i, 1)));
            IngresoPorventa += Double.parseDouble(String.valueOf(TbBuscar.getModel().getValueAt(i, 2))); 
            Total_venta += Double.parseDouble(String.valueOf(TbBuscar.getModel().getValueAt(i, 3)));            
        }
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("####.##", simbolos);
        txtCaja.setText(String.valueOf(formateador.format(Total_venta)));
        txtIngresoventas.setText(String.valueOf(formateador.format(IngresoPorventa)));
        txtIvaPro.setText(String.valueOf(formateador.format(TotalIva)));
        txtGanancia.setText(String.valueOf(formateador.format(Total_venta)));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TbBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGanancia;
    private javax.swing.JTextField txtIngresoventas;
    private javax.swing.JTextField txtIvaPro;
    // End of variables declaration//GEN-END:variables
}
