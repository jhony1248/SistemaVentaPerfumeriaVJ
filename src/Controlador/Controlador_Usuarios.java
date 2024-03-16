
package Controlador;
import Modelo.Cliente_model;
import Modelo.Usuario_model;
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
public class Controlador_Usuarios {
    Conexion conn= new Conexion();
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    //Login usuario
    public boolean LoginUsuario(Usuario_model objeto){
        
        boolean respuesta = false;
        
        try{
            String queryBuscar = "SELECT Usuario, Clave, Nombres, Apellidos, ID_Rol, Sexo, Cedula, Email, Telefono, Direccion, Estado FROM `usuario` WHERE Usuario = '"+ objeto.getUsuario() +"'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            
            while (rs.next()) {             
                respuesta = true;        
                objeto.setClave(rs.getString(2));
                objeto.setNombres(rs.getString(3));
                objeto.setApellidos(rs.getString(4));
                objeto.setID_Rol(rs.getInt(5));
                objeto.setSexo(rs.getString(6));
                objeto.setCedula(rs.getString(7));
                objeto.setEmail(rs.getString(8));
                objeto.setTelefono(rs.getString(9));
                objeto.setDireccion(rs.getString(10));
                objeto.setEstado(rs.getString(11));
            }
        } catch (SQLException ex) {
            System.err.println("Error insert: "+ex);
            JOptionPane.showMessageDialog(null,"Error insert: "+ex);
        }
        return respuesta;
    }
    
    public boolean LoginUsuarioDatos(Usuario_model objeto){
        
        boolean respuesta = false;
        
        try{
            String queryBuscar = "SELECT Usuario, Clave, Nombres, Apellidos, ID_Rol, Sexo, Cedula, Email, Telefono, Direccion FROM `usuario` WHERE Usuario = '"+ objeto.getUsuario() +"'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            
            while (rs.next()) {             
                respuesta = true;        
                objeto.setClave(rs.getString(2));
                objeto.setNombres(rs.getString(3));
                objeto.setApellidos(rs.getString(4));
                objeto.setID_Rol(rs.getInt(5));
                objeto.setSexo(rs.getString(6));
                objeto.setCedula(rs.getString(7));
                objeto.setEmail(rs.getString(8));
                objeto.setTelefono(rs.getString(9));
                objeto.setDireccion(rs.getString(10));
            }
        } catch (SQLException ex) {
            System.err.println("Error insert: "+ex);
            JOptionPane.showMessageDialog(null,"Error insert: "+ex);
        }
        return respuesta;
    }
    //metodo para crear Usuario
    public void insertarUsuarioNuevo(Usuario_model UsuarioNuevo){
        try {
            String queryInsert = "insert into usuario (Usuario,Clave,Nombres,Apellidos,Sexo,Cedula,Email,Direccion,Telefono,Estado,ID_Rol)"
                    + " values(?,?,?,?,?,?,?,?,?,?,?)";
            stm = conn.getConexion().prepareStatement(queryInsert);
            stm.setString(1, UsuarioNuevo.getUsuario());
            stm.setString(2, UsuarioNuevo.getClave());
            stm.setString(3, UsuarioNuevo.getNombres());
            stm.setString(4, UsuarioNuevo.getApellidos());
            stm.setString(5, UsuarioNuevo.getSexo());
            stm.setString(6, UsuarioNuevo.getCedula());
            stm.setString(7, UsuarioNuevo.getEmail());                      
            stm.setString(8, UsuarioNuevo.getDireccion());
            stm.setString(9, UsuarioNuevo.getTelefono());
            stm.setString(10, UsuarioNuevo.getEstado());           
            stm.setInt(11, UsuarioNuevo.getID_Rol());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro creado correctamente");
                   
        } catch (SQLException ex) {
            System.err.println("Error insert: "+ex);
        }
    }
    //Vefificar si existe Usuario
    public boolean ExisteUsuario(String Usuario,String Cedula){     
        boolean respuesta = false;    
        try{
            String queryBuscar = "SELECT Usuario, Cedula FROM `usuario` WHERE Usuario = '"+ Usuario+"' or Cedula = '"+ Cedula +"'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "El Usuario que Ingreso ya existe en el Sistema Verifique la Cedula o el Usuario");
                respuesta = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        return respuesta;
    } 
    
    //Vefificar si existe Usuario
    public boolean ExisteUsuarioCedula(String Cedula){     
        boolean respuesta = false;    
        try{
            String queryBuscar = "SELECT Usuario, Cedula FROM `usuario` WHERE Cedula = '"+ Cedula +"'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "La Cedula Ingresada ya existe en el Sistema.");
                respuesta = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        return respuesta;
    } 
    
    //Buscar Usuario mostrar primero los del estado Activos
    public void buscarRegistroUsuarios(JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"Usuario","Nombres","Apellidos","Sexo","Cedula","Email","Direccion","Telefono","ID_Rol","Nombre_rol"};
            String [] registros =  new String[10];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select Usuario,Nombres,Apellidos,Sexo,Cedula,Email,Direccion,Telefono,usuario.ID_Rol,Nombre_rol from usuario INNER JOIN rol  ON usuario.ID_Rol = rol.ID_Rol AND usuario.Estado='Activo'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                registros[7] = rs.getString(8);
                registros[8] = String.valueOf(rs.getInt(9));
                registros[9] = rs.getString(10);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error buscar: "+ex);
        }
    }
    //Buscar Usuario por Nombre y apellidos
    public void buscarRegistroNombreUsuarios(String TxUsuario, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"Usuario","Nombres","Apellidos","Sexo","Cedula","Email","Direccion","Telefono","ID_Rol","Nombre_rol"};
            String [] registros =  new String[10];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select Usuario,Nombres,Apellidos,Sexo,Cedula,Email,Direccion,Telefono,usuario.ID_Rol,Nombre_rol "
                    + "from usuario INNER JOIN rol  ON (usuario.Nombres like '%"+TxUsuario+"%' or usuario.Apellidos like '%"+TxUsuario+"%') AND usuario.ID_Rol = rol.ID_Rol AND usuario.Estado='Activo'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                registros[7] = rs.getString(8);
                registros[8] = String.valueOf(rs.getInt(9));
                registros[9] = rs.getString(10);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error buscar: "+ex);
        }
    }
    //Buscar Usuario por la clave principal
    public void buscarRegistroUsuariosU(String TxUsuario, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"Usuario","Nombres","Apellidos","Sexo","Cedula","Email","Direccion","Telefono","ID_Rol","Nombre_rol"};
            String [] registros =  new String[10];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select Usuario,Nombres,Apellidos,Sexo,Cedula,Email,Direccion,Telefono,usuario.ID_Rol,Nombre_rol "
                    + "from usuario INNER JOIN rol  ON (usuario.Usuario like '%"+TxUsuario+"%') AND usuario.ID_Rol = rol.ID_Rol AND usuario.Estado='Activo'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                registros[7] = rs.getString(8);
                registros[8] = String.valueOf(rs.getInt(9));
                registros[9] = rs.getString(10);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error buscar: "+ex);
        }
    }
    //Buscar Usuario Cedula
    public void buscarRegistroUsuariosCedula(String TxUsuario, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"Usuario","Nombres","Apellidos","Sexo","Cedula","Email","Direccion","Telefono","ID_Rol","Nombre_rol"};
            String [] registros =  new String[10];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select Usuario,Nombres,Apellidos,Sexo,Cedula,Email,Direccion,Telefono,usuario.ID_Rol,Nombre_rol "
                    + "from usuario INNER JOIN rol  ON (usuario.Cedula like '%"+TxUsuario+"%') AND usuario.ID_Rol = rol.ID_Rol AND usuario.Estado='Activo'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                registros[7] = rs.getString(8);
                registros[8] = String.valueOf(rs.getInt(9));
                registros[9] = rs.getString(10);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error buscar: "+ex);
        }
    }
    //Buscar Usuario por Nombre y apellidos y usuarios eliminados
    public void buscarRegistroUsuariosEliminados(String TxUsuario, JTable tablaDatos){
        try {
            DefaultTableModel modeloTabla;
            String [] col = {"Usuario","Nombres","Apellidos","Sexo","Cedula","Email","Direccion","Telefono","ID_Rol","Nombre_rol"};
            String [] registros =  new String[10];
            modeloTabla = new DefaultTableModel(null, col);
            String queryBuscar = "Select Usuario,Nombres,Apellidos,Sexo,Cedula,Email,Direccion,Telefono,usuario.ID_Rol,Nombre_rol "
                    + "from usuario INNER JOIN rol  ON (usuario.Nombres like '%"+TxUsuario+"%' or usuario.Apellidos like '%"+TxUsuario+"%') AND usuario.ID_Rol = rol.ID_Rol AND usuario.Estado='Inactivo'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                registros[7] = rs.getString(8);
                registros[8] = String.valueOf(rs.getInt(9));
                registros[9] = rs.getString(10);
                modeloTabla.addRow(registros);
            }
            tablaDatos.setModel(modeloTabla);
        } catch (SQLException ex) {
            System.out.println("Error buscar: "+ex);
        }
    }
    //Editar los datos de Usuario
    public void  editarUsuario(String idRegistroEditar, Usuario_model registroEditar){
    String consultaActualizar = "update usuario set Nombres=?,Apellidos=?,Sexo=?,Cedula=?,Telefono=?,Email=?,Direccion=?,ID_Rol = ? where Usuario = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getNombres());
            stm.setString(2, registroEditar.getApellidos());
            stm.setString(3, registroEditar.getSexo());
            stm.setString(4, registroEditar.getCedula());
            stm.setString(5, registroEditar.getTelefono());
            stm.setString(6, registroEditar.getEmail());  
            stm.setString(7, registroEditar.getDireccion());  
            stm.setInt(8, registroEditar.getID_Rol());
            stm.setString(9, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Editar el administrar perfil
    public void  AdministrarPerfil(String idRegistroEditar, Usuario_model registroEditar){
    String consultaActualizar = "update usuario set Clave=?,Nombres=?,Apellidos=?,Sexo=?,Cedula=?,Telefono=?,Email=?,Direccion=? where Usuario = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getClave());
            stm.setString(2, registroEditar.getNombres());
            stm.setString(3, registroEditar.getApellidos());
            stm.setString(4, registroEditar.getSexo());
            stm.setString(5, registroEditar.getCedula());
            stm.setString(6, registroEditar.getTelefono());
            stm.setString(7, registroEditar.getEmail());  
            stm.setString(8, registroEditar.getDireccion());  
            stm.setString(9, idRegistroEditar);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Eliminar Usuario solo desactiva el estado
    public void  EliminarUsuario(String idRegistroEditar,Usuario_model registroEditar){
    String consultaActualizar = "update usuario set Estado=? where Usuario = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getEstado());
            stm.setString(2, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Recuperar Usuario eliminado
    public void  RecuperarUsuario(String idRegistroEditar,Usuario_model registroEditar){
    String consultaActualizar = "update usuario set Estado=? where Usuario = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, registroEditar.getEstado());
            stm.setString(2, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Recuperado");
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Eliminar usuario base
    public void  EliminarUsuarioBase(String idRegistroEditar){
    String consultaActualizar = "delete from usuario where Usuario = ?";
        try {
            stm = conn.getConexion().prepareStatement(consultaActualizar);
            stm.setString(1, idRegistroEditar);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
