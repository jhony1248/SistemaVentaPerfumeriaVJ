/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente_model;
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
public class Controlador_Clientes {
    Conexion conn= new Conexion();
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    //metodo para crear Cliente
    public void insertarClientesNuevo(Cliente_model ClienteNuevo){
        try {
            String queryInsert = "insert into clientes (Nombres,Apellidos,Sexo,Cedula,Telefono,Email,Direccion,Estado)"
                    + " values(?,?,?,?,?,?,?,?)";
            stm = conn.getConexion().prepareStatement(queryInsert);
            stm.setString(1, ClienteNuevo.getNombres());
            stm.setString(2, ClienteNuevo.getApellidos());
            stm.setString(3, ClienteNuevo.getSexo());
            stm.setString(4, ClienteNuevo.getCedula());
            stm.setString(5, ClienteNuevo.getTelefono());
            stm.setString(6, ClienteNuevo.getEmail());
            stm.setString(7, ClienteNuevo.getDireccion());
            stm.setString(8, ClienteNuevo.getEstado());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro creado correctamente");
                   
        } catch (SQLException ex) {
            System.err.println("Error insert: "+ex);
        }
    }
    
    public boolean LoginClientesDatos(Cliente_model objeto){
        boolean respuesta = false;
        try{
            String queryBuscar = "SELECT Cedula FROM `clientes` WHERE ID_Cliente = '"+ objeto.getID_Cliente()+"'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
       
            while (rs.next()) {             
                respuesta = true;        
                objeto.setCedula(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.err.println("Error insert: "+ex);
            JOptionPane.showMessageDialog(null,"Error insert: "+ex);
        }
        return respuesta;
    }
    
    //Vefificar si existe Clientes
    public boolean ExisteCliente(String Cedula){
         
        boolean respuesta = false;
        
        try{
            String queryBuscar = "SELECT Cedula FROM `clientes` WHERE Cedula = '"+ Cedula +"'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "El Cliente que Ingreso ya existe en el Sistema Verifique la Cedula");
                respuesta = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        return respuesta;
    } 
    //Buscar Rol mostrar primero los del estado Activos
    public void buscarRegistroClientes(JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Cliente","Nombres","Apellidos","Sexo","Cedula","Telefono","Email","Direccion"};
            String [] registros =  new String[8];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select ID_Cliente,Nombres,Apellidos,Sexo,Cedula,Telefono,Email,Direccion from "
                    + "clientes where Estado ='Activo'";
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
                registros[7] = rs.getString(8);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error insert: "+ex);
        }
    }
    //Buscar Cliente por nombre y apellido
    public void buscarRegistroNombreCliente(String TxCliente, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Cliente","Nombres","Apellidos","Sexo","Cedula","Telefono","Email","Direccion"};
            String [] registros =  new String[8];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select ID_Cliente,Nombres,Apellidos,Sexo,Cedula,Telefono,Email,Direccion"
                    + " from clientes where (Nombres like '%"+TxCliente+"%' or Apellidos like '%"+TxCliente+"%') and Estado ='Activo'";
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
                registros[7] = rs.getString(8);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error insert: "+ex);
        }
    }
    //Buscar Cliente por Id
    public void buscarRegistroIDCliente(String TxCliente, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Cliente","Nombres","Apellidos","Sexo","Cedula","Telefono","Email","Direccion"};
            String [] registros =  new String[8];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select ID_Cliente,Nombres,Apellidos,Sexo,Cedula,Telefono,Email,Direccion"
                    + " from clientes where ID_Cliente like '%"+TxCliente+"%' and Estado ='Activo'";
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
                registros[7] = rs.getString(8);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error insert: "+ex);
        }
    }
    //Buscar cliente por cedula
    public void buscarRegistroCedulaCliente(String TxCliente, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Cliente","Nombres","Apellidos","Sexo","Cedula","Telefono","Email","Direccion"};
            String [] registros =  new String[8];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select ID_Cliente,Nombres,Apellidos,Sexo,Cedula,Telefono,Email,Direccion"
                    + " from clientes where Cedula like '%"+TxCliente+"%' and Estado ='Activo'";
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
                registros[7] = rs.getString(8);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error insert: "+ex);
        }
    }
    //Buscar cliente eliminado por nombre
    public void buscarRegistroClienteEliminado(String TxCliente, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Cliente","Nombres","Apellidos","Sexo","Cedula","Telefono","Email","Direccion"};
            String [] registros =  new String[8];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select ID_Cliente,Nombres,Apellidos,Sexo,Cedula,Telefono,Email,Direccion"
                    + " from clientes where (Nombres like '%"+TxCliente+"%' or Apellidos like '%"+TxCliente+"%') and Estado ='Inactivo'";
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
                registros[7] = rs.getString(8);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error insert: "+ex);
        }
    }
    //Editar los datos de Rol
    public void  editarCliente(int idRegistroEditar, Cliente_model registroEditar){
    String consultaActualizar = "update clientes set Nombres=?,Apellidos=?,Sexo=?,Cedula=?,Telefono=?,Email=?,Direccion=? where ID_Cliente = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getNombres());
            stm.setString(2, registroEditar.getApellidos());
            stm.setString(3, registroEditar.getSexo());
            stm.setString(4, registroEditar.getCedula());
            stm.setString(5, registroEditar.getTelefono());
            stm.setString(6, registroEditar.getEmail());
            stm.setString(7, registroEditar.getDireccion());
            stm.setInt(8, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Recuperar Cliente
    public void  RecuperarCliente(int idRegistroEditar,Cliente_model registroEditar){
    String consultaActualizar = "update clientes set Estado=? where ID_Cliente = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getEstado());
            stm.setInt(2, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Recuperado");
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Eliminar Cliente solo desactiva el estado
    public void  EliminarCliente(int idRegistroEditar,Cliente_model registroEditar){
    String consultaActualizar = "update clientes set Estado=? where ID_Cliente = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getEstado());
            stm.setInt(2, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Eliminar completamente
    public void  EliminarClienteBase(int idRegistroEditar){
    String consultaActualizar = "delete from clientes where ID_Cliente = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setInt(1, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
