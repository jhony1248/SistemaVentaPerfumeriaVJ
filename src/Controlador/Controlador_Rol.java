/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Rol_model;
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
public class Controlador_Rol {
    Conexion conn= new Conexion();
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    //metodo para crear Rol
    public void insertarRolNuevo(Rol_model RolNuevo){
        try {
            String queryInsert = "insert into rol (Nombre_Rol,Estado) values(?,?)";
            stm = conn.getConexion().prepareStatement(queryInsert);
            stm.setString(1, RolNuevo.getNombre_Rol());
            stm.setString(2, RolNuevo.getEstado());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro creado correctamente");
                   
        } catch (SQLException ex) {
            System.err.println("Error insert: "+ex);
        }
    }

    //Vefificar si existe Rol
    public boolean ExisteRol(String rolNombre){
        
        boolean respuesta = false;
        
        try{
            String queryBuscar = "SELECT Nombre_Rol FROM `rol` WHERE Nombre_Rol = '"+ rolNombre +"'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "El Rol que Ingreso ya existe en el Sistema");
                respuesta = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        return respuesta;
    }   
    //Buscar Rol mostrar primero los del estado Activos
    public void buscarRegistroRol(JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Rol","Nombre_Rol", "Estado"};
            String [] registros =  new String[3];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select * from rol ORDER BY Estado ASC";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                //String registro = rs.getInt(1) +" "+ rs.getString(2)+" "+rs.getInt(4);
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error insert: "+ex);
        }
    }
    //Buscar Rol atraves de Nombre Rol     
    public void buscarRegistroNombreRol(String TxUsuario, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Rol","Nombre_Rol", "Estado"};
            String [] registros =  new String[3];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select * from rol where Nombre_Rol like '%"+TxUsuario+"%' ORDER BY Estado ASC";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                //String registro = rs.getInt(1) +" "+ rs.getString(2)+" "+rs.getInt(4);
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error insert: "+ex);
        }
    }        
    //Buscar Rol atraves de ID Rol     
    public void buscarRegistoID_Rol(String TxUsuario, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"ID_Rol","Nombre_Rol", "Estado"};
            String [] registros =  new String[3];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select * from rol where ID_Rol like '%"+TxUsuario+"%' ORDER BY Estado ASC";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                //String registro = rs.getInt(1) +" "+ rs.getString(2)+" "+rs.getInt(4);
                registros[0] = String.valueOf(rs.getInt(1));
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error insert: "+ex);
        }
    }
    //Editar los datos de Rol
    public void  editarRol(int idRegistroEditar, Rol_model registroEditar){
    String consultaActualizar = "update rol set Nombre_Rol = ?, Estado = ? where ID_Rol = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getNombre_Rol());
            stm.setString(2, registroEditar.getEstado());
            stm.setInt(3, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Rol_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Eliminar Rol solo desactiva el estado
    public void  eliminarRol(int idRegistroEditar){
    String consultaActualizar = "delete from rol where ID_Rol = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setInt(1, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado Correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Rol_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

