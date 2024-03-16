
package Modelo;

/**
 *
 * @author jhony
 */
public class Cliente_model {
    //Atributos
    private int ID_Cliente;
    private String Nombres;
    private String Apellidos;
    private String Sexo;
    private String Cedula;
    private String Telefono;
    private String Email;
    private String Direccion;
    private String Estado;
    
    //Constructor
    public Cliente_model(){
        this.ID_Cliente = 0;
        this.Nombres = "";
        this.Apellidos = "";
        this.Sexo = "";
        this.Cedula = "";
        this.Telefono = "";
        this.Email = "";
        this.Direccion = "";
        this.Estado = "";
    }
    
    //Set and Get

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
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

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
