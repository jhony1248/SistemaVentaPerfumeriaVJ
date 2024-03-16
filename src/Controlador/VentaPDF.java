
package Controlador;

import Vista.Ventas;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jhony
 */
public class VentaPDF {
    Conexion conn= new Conexion();
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    private String nombreCliente;
    private String cedulaCliente;
    private String telefonoCliente;
    private String direccionCliente;
    
    private String fechaActual="";
    private String nombreArchivoPDFVenta="";
    private String Num_Fact=""; 
    
    public void DatosCliente(int idCliente){
        
        try{
            String queryBuscar = "SELECT * FROM `clientes` WHERE ID_Cliente = '"+idCliente+"'";
            stm = conn.getConexion().prepareStatement(queryBuscar);
            rs = stm.executeQuery();
            while (rs.next()) {
                nombreCliente = rs.getString("Nombres") + " "+rs.getString("Apellidos");
                cedulaCliente = rs.getString("Cedula");
                telefonoCliente = rs.getString("Telefono");
                direccionCliente = rs.getString("Direccion");
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener datos del cliente: "+ex);
        }
    }
    
    public void generarFacturaPDF(){
        try{
            
            Date date = new Date();
            fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
            String fechaNueva = "";
            for (int i = 0; i < fechaActual.length(); i++){
                if(fechaActual.charAt(i)== '/'){
                    fechaNueva = fechaActual.replace("/", "_");                   
                } 
            }
            
            Num_Fact = Ventas.txtNumeroVenta.getText();
            nombreArchivoPDFVenta = "PDFVenta_" + nombreCliente + "_" + fechaNueva + "_" + Num_Fact + ".pdf";            
            
            String crearCarpeta = "PDF";
            File c = new File(crearCarpeta);
            c.mkdirs();
            
            FileOutputStream archivo;          
            File file = new File("PDF\\" + nombreArchivoPDFVenta); 
            archivo = new FileOutputStream(file);
            
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            Image img = Image.getInstance("Imagenes/ventas.png");
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE); //agregar una nueva linea
            fecha.add("Factura:" + Num_Fact + "\nFecha: " + fechaActual + "\n\n");
            
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);//quitar borde tabla
            //tamaño de celdas
            float [] ColumnaEncabezado = new float[]{20f,30f,70f,40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);          
            //Agregar Celdas
            Encabezado.addCell(img);
            
            String ruc = "1713233615001";
            String nombre = "Perfumería VJ"; //Nombre de la empresa
            String telefono = "0979290238"; // Telefono de la empresa
            String direccion = "San-Bartolo"; //Direccion de la empresa
            String razon = "MANTECA BORJA RAMON FERNANDO"; //Razon
            
            Encabezado.addCell("");//celda vacia
            Encabezado.addCell("RUC: " + ruc + "\nNOMBRE: " + nombre + "\nTELEFONO: " + telefono + "\nDIRECCIÓN: " + direccion + "\nRAZON SOCIAL: " + razon);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            //Cuerpo
            Paragraph cliente = new Paragraph();
            fecha.add(Chunk.NEWLINE); //agregar una nueva linea
            fecha.add("Datos del cliente: " + "\n\n");
            doc.add(cliente);
            
            //DATOS DEL CLIENTE
            PdfPTable tablaCliente = new PdfPTable(4);
            tablaCliente.setWidthPercentage(100);
            tablaCliente.getDefaultCell().setBorder(0);//quitar borde tabla
            //tamaño de celdas
            float [] ColumnaCliente = new float[]{25f, 45f, 30f, 40f};
            tablaCliente.setWidths(ColumnaCliente);
            tablaCliente.setHorizontalAlignment(Element.ALIGN_LEFT);   
            PdfPCell cliente1 = new PdfPCell(new Phrase("Cedula: ", negrita));
            PdfPCell cliente2 = new PdfPCell(new Phrase("Nombre: ", negrita));
            PdfPCell cliente3 = new PdfPCell(new Phrase("Telefono: ", negrita));
            PdfPCell cliente4 = new PdfPCell(new Phrase("Dirección: ", negrita));
            //quitar bordes
            cliente1.setBorder(0);
            cliente2.setBorder(0);
            cliente3.setBorder(0);
            cliente4.setBorder(0);
            //agg celda a la tabla 
            tablaCliente.addCell(cliente1);
            tablaCliente.addCell(cliente2);
            tablaCliente.addCell(cliente3);
            tablaCliente.addCell(cliente4);
            tablaCliente.addCell(cedulaCliente);
            tablaCliente.addCell(nombreCliente);
            tablaCliente.addCell(telefonoCliente);
            tablaCliente.addCell(direccionCliente);
            //agregar al documento
            doc.add(tablaCliente);
            
            //Espacio en blanco
            Paragraph espacio = new Paragraph();
            espacio.add(Chunk.NEWLINE); //agregar una nueva linea
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_LEFT);
            doc.add(espacio);
            
            //agregar los productos
            PdfPTable tablaProducto = new PdfPTable(4);
            tablaProducto.setWidthPercentage(100);
            tablaProducto.getDefaultCell().setBorder(0);//quitar borde tabla
            //tamaño de celdas
            float [] ColumnaProducto = new float[]{15f, 50f, 15f, 20f};
            tablaProducto.setWidths(ColumnaProducto);
            tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT); 
            PdfPCell producto1 = new PdfPCell(new Phrase("Cantidad: ", negrita));
            PdfPCell producto2 = new PdfPCell(new Phrase("Descripción: ", negrita));
            PdfPCell producto3 = new PdfPCell(new Phrase("Precio Unitario: ", negrita));
            PdfPCell producto4 = new PdfPCell(new Phrase("Total a Pagar: ", negrita));
            //quitar borde
            producto1.setBorder(0);
            producto2.setBorder(0);
            producto3.setBorder(0);
            producto4.setBorder(0);
            //agregar color al encabezado del producto 
            producto1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto4.setBackgroundColor(BaseColor.LIGHT_GRAY);
            //agg celda a la tabla 
            tablaProducto.addCell(producto1);
            tablaProducto.addCell(producto2);
            tablaProducto.addCell(producto3);
            tablaProducto.addCell(producto4);
            
            for(int i = 0; i < Ventas.tblDetalleProducto.getRowCount(); i++){
                String producto =  Ventas.tblDetalleProducto.getValueAt(i, 1).toString();
                String cantidad =  Ventas.tblDetalleProducto.getValueAt(i, 2).toString();
                String precio =  Ventas.tblDetalleProducto.getValueAt(i, 3).toString();
                String total =  Ventas.tblDetalleProducto.getValueAt(i, 4).toString();
                
                tablaProducto.addCell(cantidad);
                tablaProducto.addCell(producto);
                tablaProducto.addCell(precio);
                tablaProducto.addCell(total);
            } 
            //agregar al documento 
            doc.add(tablaProducto);
            //Total a pagar
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total a pagar: " + Ventas.txtTotalPagar.getText());
            info.setAlignment(Element.ALIGN_RIGHT);
            //agregar al documento 
            doc.add(info);
            
            //Firma
            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE); //agregar una nueva linea
            firma.add("      Firma\n\n");
            firma.add("________________________");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);
            
            //Mensaje
            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE); //agregar una nueva linea
            mensaje.add("¡Gracias por su compra!");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);
            
            //cerrar el documento y el archivo
            doc.close();
            archivo.close();
            
            //Abrir el documento al ser generado
            Desktop.getDesktop().open(file);
            
        }catch (DocumentException | IOException ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex);          
        }
    }
}
