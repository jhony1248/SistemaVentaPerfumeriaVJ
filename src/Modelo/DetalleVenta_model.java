
package Modelo;

/**
 *
 * @author jhony
 */
public class DetalleVenta_model {
    
    //Atributos
    private String Num_Factura;   
    private int ID_Producto;
    private double Cantidad;
    
    //Constructor
    public DetalleVenta_model(){       
        this.Num_Factura = "";
        this.ID_Producto = 0;
        this.Cantidad = 0;
    }
    
    //Set and Get

    public String getNum_Factura() {
        return Num_Factura;
    }

    public void setNum_Factura(String Num_Factura) {
        this.Num_Factura = Num_Factura;
    }

    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
