/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.proveedor;

/**
 *
 * @author Camilo
 */
public class ProveedorService {
    
    public Proveedor ingresarProveedor(String telefono, int NIT, String direccion, int cantidad, String producto, String nombre_proveedor) throws Exception{
        Proveedor proveedor = new Proveedor();
        try {
            if (telefono==null||telefono.isEmpty())
                throw new Exception("Favor indicar telefono");
            if (NIT==0)
                throw new Exception("Favor indicar NIT");
            if (direccion==null||direccion.isEmpty())
                throw new Exception("Favor indicar direccion");
            if(cantidad<0)
                throw new Exception("Indicar cantidad válida mayor a 0");
            if (producto==null||producto.isEmpty())
                throw new Exception("Indicar producto");
            if(nombre_proveedor==null||nombre_proveedor.isEmpty())
                throw new Exception ("Indicar nombre proveedor");
            
            proveedor.setTelefono(telefono);
            proveedor.setNIT(NIT);
            proveedor.setDireccion(direccion);
            proveedor.setCantidad(cantidad);
            proveedor.setProducto(producto);
            proveedor.setNombre_proveedor(nombre_proveedor);
                           
            return proveedor;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error ingresando proveedor");
        }
    }
    
    public void ventaDirecta(String producto, double precio, int cantidad)throws Exception{
        VentaService ventaS = new VentaService();
        try {
            ventaS.venta(producto, precio, cantidad);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error implementando venta directa");
        }
        
    }
    
    public void pedidosEspeciales () throws Exception{
        
    }
    
}
