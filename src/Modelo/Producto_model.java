
package Modelo;

import java.io.File;

/**
 *
 * @author jhony
 */
public class Producto_model {
    //Atributos
    private int ID_Productos;
    private String Nombre;
    private String Marca;
    private String Contenido_Neto;
    private String Descripcion;
    private int Stock;
    private double Precio;
    private byte[] Imagen;
    private String Estado;
    
    //Constructor
    public Producto_model(){
        this.ID_Productos = 0;
        this.Nombre = "";
        this.Marca = "";
        this.Contenido_Neto = "";
        this.Descripcion = "";
        this.Stock = 0;
        this.Precio = 0;
        this.Estado = "";
    } 

    public int getID_Productos() {
        return ID_Productos;
    }

    public void setID_Productos(int ID_Productos) {
        this.ID_Productos = ID_Productos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getContenido_Neto() {
        return Contenido_Neto;
    }

    public void setContenido_Neto(String Contenido_Neto) {
        this.Contenido_Neto = Contenido_Neto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    

    public byte[] getImagen() {
        return Imagen;
    }

    public void setImagen(byte[] Imagen) {
        this.Imagen = Imagen;
    }
   
    
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
      
}
