
package Controlador;

import Modelo.Producto_model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhony
 */
public class Controlador_Productos {
    Conexion conn= new Conexion();
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    //metodo para crear Producto
    public void insertarProductoNuevo(Producto_model ProductoNuevo){
        try {
            String queryInsert = "insert into productos (Nombre,Marca,Contenido_Neto,Descripcion,Stock,Precio,Imagen,Estado)"
                    + " values(?,?,?,?,?,?,?,?)";
            stm = conn.getConexion().prepareStatement(queryInsert);
            stm.setString(1, ProductoNuevo.getNombre());
            stm.setString(2, ProductoNuevo.getMarca());
            stm.setString(3, ProductoNuevo.getContenido_Neto());
            stm.setString(4, ProductoNuevo.getDescripcion());
            stm.setInt(5, ProductoNuevo.getStock());
            stm.setDouble(6, ProductoNuevo.getPrecio());
            stm.setBytes(7, ProductoNuevo.getImagen());
            stm.setString(8, ProductoNuevo.getEstado());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro creado correctamente");
                   
        } catch (SQLException ex) {
            System.err.println("Error insert: "+ex);
        }
    }
        //Vefificar si existe Producto
    public boolean ExisteProducto(String Nombre,String Contenido){
         
        boolean respuesta = false;
        
        try{
            String queryBuscar = "SELECT Nombre,Contenido_Neto FROM `productos` WHERE Nombre = '"+ Nombre +"' and Contenido_Neto= '"+ Contenido +"'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "El Producto que Ingreso ya existe en el Sistema");
                respuesta = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        return respuesta;
    }
      
    //Buscar Producto
    public void buscarRegistroProducto(JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Producto","Nombre","Marca","Contenido_Neto","Descripcion","Stock","Precio"};
            String [] registros =  new String[7];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select ID_Productos,Nombre,Marca,Contenido_Neto,Descripcion,Stock,Precio,Imagen from "
                    + "productos where Estado ='Activo'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);              
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error Buscar Registro: "+ex);
        }
    } 
    
    //Buscar por nombre producto
    public void buscarRegistroNombreProducto(String TxProducto, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Producto","Nombre","Marca","Contenido_Neto","Descripcion","Stock","Precio"};
            String [] registros =  new String[7];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select ID_Productos,Nombre,Marca,Contenido_Neto,Descripcion,Stock,Precio,Imagen from "
                    + "productos where Nombre like '%"+TxProducto+"%' and  Estado ='Activo'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error buscar: "+ex);
        }
    }
    
    //Buscar por Id producto
    public void buscarRegistroIDProducto(String TxProducto, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Producto","Nombre","Marca","Contenido_Neto","Descripcion","Stock","Precio"};
            String [] registros =  new String[7];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select ID_Productos,Nombre,Marca,Contenido_Neto,Descripcion,Stock,Precio,Imagen from "
                    + "productos where ID_Productos like '%"+TxProducto+"%' and  Estado ='Activo'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error buscar: "+ex);
        }
    }
    
    //Buscar por Id producto
    public void buscarRegistroMarcaProducto(String TxProducto, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Producto","Nombre","Marca","Contenido_Neto","Descripcion","Stock","Precio"};
            String [] registros =  new String[7];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select ID_Productos,Nombre,Marca,Contenido_Neto,Descripcion,Stock,Precio,Imagen from "
                    + "productos where Marca like '%"+TxProducto+"%' and  Estado ='Activo'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error buscar: "+ex);
        }
    }
    
    //Buscar por producto eliminado
    public void buscarRegistroProductoEliminado(String TxProducto, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Producto","Nombre","Marca","Contenido_Neto","Descripcion","Stock","Precio"};
            String [] registros =  new String[7];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select ID_Productos,Nombre,Marca,Contenido_Neto,Descripcion,Stock,Precio,Imagen from "
                    + "productos where Nombre like '%"+TxProducto+"%' and  Estado ='Inactivo'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error buscar: "+ex);
        }
    }
    
    //Buscar Imagen  
    public boolean BuscarImageProd(Producto_model objeto){
        
        boolean respuesta = false;
        
        try{
            String queryBuscar = "SELECT Imagen FROM `productos` WHERE ID_Productos = '"+ objeto.getID_Productos()+"'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            
            while (rs.next()) {             
                respuesta = true;
                objeto.setImagen(rs.getBytes(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error BuscarImagen: "+ex);
        }
        return respuesta;
    }

    //Editar los datos de Rol
    public void  editarProducto(int idRegistroEditar, Producto_model registroEditar){
    String consultaActualizar = "update productos set Nombre=?,Marca=?,Contenido_Neto=?,Descripcion=?,Stock=?,Precio=?,Imagen=? where ID_Productos = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getNombre());
            stm.setString(2, registroEditar.getMarca());
            stm.setString(3, registroEditar.getContenido_Neto());
            stm.setString(4, registroEditar.getDescripcion());
            stm.setInt(5, registroEditar.getStock());
            stm.setDouble(6, registroEditar.getPrecio());
            stm.setBytes(7, registroEditar.getImagen());
            stm.setInt(8, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Producto_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Recuperar Producto Eliminado
    public void  RecuperarProducto(int idRegistroEditar,Producto_model registroEditar){
    String consultaActualizar = "update productos set Estado=? where ID_Productos = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getEstado());
            stm.setInt(2, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Recuperado");
        } catch (SQLException ex) {
            Logger.getLogger(Producto_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Eliminar Producto solo desactiva el estado
    public void  EliminarProducto(int idRegistroEditar,Producto_model registroEditar){
    String consultaActualizar = "update productos set Estado=? where ID_Productos = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getEstado());
            stm.setInt(2, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(Producto_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Eliminar Producto de la base
    public void  EliminarProductoBase(int idRegistroEditar){
    String consultaActualizar = "delete from productos where ID_Productos = ?"; 
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setInt(1, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(Producto_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //disminuir el stock de los productos comprados
    public void  DisminuirStockDeProductoVendidos(int idRegistroEditar,Producto_model registroEditar){
    String consultaActualizar = "update productos set Stock=? where ID_Productos = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setInt(1, registroEditar.getStock());
            stm.setInt(2, idRegistroEditar);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Producto_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //actualizar el stock de los productos 
    public void  ActualizarStockDeProductos(int idRegistroEditar,Producto_model registroEditar){
    String consultaActualizar = "update productos set Stock=? where ID_Productos = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setInt(1, registroEditar.getStock());
            stm.setInt(2, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Stock del producto actualizado");
        } catch (SQLException ex) {
            Logger.getLogger(Producto_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
