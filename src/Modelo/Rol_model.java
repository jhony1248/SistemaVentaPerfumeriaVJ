/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jhony
 */
public class Rol_model {
   
        //Atributos
    private int ID_Rol;
    private String Nombre_Rol;
    private String Estado;
    
        //Constructor
    public Rol_model(){
        this.ID_Rol = 0;
        this.Nombre_Rol = "";
        this.Estado = "";
    }
    
    //Set and Get

    public int getID_Rol() {
        return ID_Rol;
    }

    public void setID_Rol(int ID_Rol) {
        this.ID_Rol = ID_Rol;
    }

    public String getNombre_Rol() {
        return Nombre_Rol;
    }

    public void setNombre_Rol(String Nombre_Rol) {
        this.Nombre_Rol = Nombre_Rol;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
