
package Modelo;

/**
 *
 * @author jhony
 */
public class Usuario_model {
    
    //Atributos
    private String Usuario;
    private String Clave;
    private String Nombres;
    private String Apellidos;
    private String Sexo;
    private String Cedula;
    private String Email;
    private String Direccion;
    private String Telefono;
    private String Estado;
    private int ID_Rol;
    private String Nombre_Rol;
    
    //Constructor
    public Usuario_model(){
        this.Usuario = "";
        this.Clave = "";
        this.Nombres = "";
        this.Apellidos = "";
        this.Sexo = "";
        this.Cedula = "";
        this.Email = "";
        this.Direccion = "";
        this.Telefono = "";
        this.Estado = "";
        this.ID_Rol = 0;
        this.Nombre_Rol = "";
    }
    
    //Set and Get

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

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
    
    
}
