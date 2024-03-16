
package Controlador;

import Modelo.Factura_model;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhony
 */
public class Controlador_Factura {
    Conexion conn= new Conexion();
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    //metodo para crear Factura
    public void insertarFacturaNuevo(Factura_model FacturaNueva){
        try {
            String queryInsert = "insert into facturas (Num_Factura,Fecha,VentaTotal,Descuento,SubTotal,Iva,Total,Estado,ID_Cliente,Usuario)"
                    + " values(?,?,?,?,?,?,?,?,?,?)";
            stm = conn.getConexion().prepareStatement(queryInsert);
            stm.setString(1, FacturaNueva.getNum_Factura());
            stm.setDate(2, FacturaNueva.getFecha());
            stm.setDouble(3, FacturaNueva.getVentaTotal());
            stm.setDouble(4, FacturaNueva.getDescuento());
            stm.setDouble(5, FacturaNueva.getSubTotal());
            stm.setDouble(6, FacturaNueva.getIva());
            stm.setDouble(7, FacturaNueva.getTotal());
            stm.setString(8, FacturaNueva.getEstado());
            stm.setInt(9, FacturaNueva.getID_Cliente());
            stm.setString(10, FacturaNueva.getUsuario());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro creado correctamente");
                   
        } catch (SQLException ex) {
            System.err.println("Error al insertar factura: "+ex);
        }
    }
    //metodo para traer el ultimo numero de la factura
    public String obtenerUltimoNumVenta(){ 
    String Num_Fact = "";
        try{
            String queryBuscar = "SELECT * FROM facturas ORDER by Num_Factura DESC LIMIT 1";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();           
            while (rs.next()) {
                return Num_Fact = rs.getString("Num_Factura");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener datos del cliente: "+ex);
        }
        return Num_Fact = "";
    }
    //Buscar Usuario mostrar primero los del estado Activos
    public void buscarRegistroFacturas(Date txtfecha, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"Num_Factura","SubTotal","Total","VentaTotal"};
            String [] registros =  new String[4];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select Num_Factura,SubTotal,VentaTotal,Total from facturas where Fecha = '"+txtfecha+"' ";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = String.valueOf(rs.getDouble(2));
                registros[2] = String.valueOf(rs.getDouble(3));
                registros[3] = String.valueOf(rs.getDouble(4));
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error buscar: "+ex);
        }
    }
}
