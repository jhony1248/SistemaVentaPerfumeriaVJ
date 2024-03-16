/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author jhony
 */
public class Conexion {
    
    private Connection conexion = null;
    /*
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:33065/bdperfumeriavj?useSSL=false";
    */

    private String user = "sql10630109";
    private String password = "HX9zpBufDE";
    private String url = "jdbc:mysql://sql10.freemysqlhosting.net/sql10630109";
    
    public Conexion (){
    
        try{
            conexion = DriverManager.getConnection(url, user, password);
            if(conexion == null){
                System.out.println("Conexion fallida!");
            }
        }catch (SQLException e) {
            System.out.println(e);
        }   
    }
    public Connection getConexion(){
        return conexion;
    }
    
}
