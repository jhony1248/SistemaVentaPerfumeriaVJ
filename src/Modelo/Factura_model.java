
package Modelo;

import java.sql.Date;



/**
 *
 * @author jhony
 */
public class Factura_model {
    
    //Atributos
    private String Num_Factura;
    private Date Fecha;
    private double VentaTotal;
    private double Descuento;
    private double SubTotal;
    private double Iva;
    private double Total;
    private String Estado;
    private int ID_Cliente;
    private String Usuario;
    
    //Constructor
    public Factura_model(){       
        this.Num_Factura = "";
        this.Fecha = null;
        this.VentaTotal = 0;
        this.Descuento = 0;
        this.SubTotal = 0;
        this.Iva = 0;
        this.Total = 0;
        this.Estado = "";
        this.ID_Cliente = 0;
        this.Usuario = "";
    }
    
    //Set and Get

    public String getNum_Factura() {
        return Num_Factura;
    }

    public void setNum_Factura(String Num_Factura) {
        this.Num_Factura = Num_Factura;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public double getVentaTotal() {
        return VentaTotal;
    }

    public void setVentaTotal(double VentaTotal) {
        this.VentaTotal = VentaTotal;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double SubTotal) {
        this.SubTotal = SubTotal;
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }    
    
}
