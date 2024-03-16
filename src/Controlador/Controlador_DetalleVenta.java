
package Controlador;

import Modelo.DetalleVenta_model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhony
 */
public class Controlador_DetalleVenta {
    Conexion conn= new Conexion();
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    //metodo para crear Detalle de venta
    public void insertarDetalleVentaNuevo(DetalleVenta_model DetalleVentaNueva){
        try {
            String queryInsert = "insert into detalleventa (Num_Factura,ID_Producto,Cantidad)"
                    + " values(?,?,?)";
            stm = conn.getConexion().prepareStatement(queryInsert);
            stm.setString(1, DetalleVentaNueva.getNum_Factura());
            stm.setInt(2, DetalleVentaNueva.getID_Producto());
            stm.setDouble(3, DetalleVentaNueva.getCantidad());
            stm.executeUpdate();
                   
        } catch (SQLException ex) {
            System.err.println("Error insert: "+ex);
        }
    }
}
