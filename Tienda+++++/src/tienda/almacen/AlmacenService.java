/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.almacen;

/**
 *
 * @author Pao
 */
public class AlmacenService {
    
    public void nuevoAlmacen(String nombre, String domicilio)throws Exception{
    
    Almacen almacen = new Almacen();
        
        try {
            if (nombre ==null) 
            throw new Exception("Error nombre almacén vacío");
                    
            
        
                    
                   
                    
            almacen.setNombre_empresa(nombre);
            almacen.setDireccion(domicilio);
            
        }
    catch (Exception e) {
            
            e.printStackTrace();
            throw new Exception ("Error creando cliente");
            
    }
            
}
    
    public void venta(){
        
    }
    
    public void recibirPedido(){
        
    }
    
    public void recibirPago(){
        
    }
}
