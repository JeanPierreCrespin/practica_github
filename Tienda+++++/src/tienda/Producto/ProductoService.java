/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.Producto;

/**
 *
 * @author octav
 */
public class ProductoService {
    
    public Producto crearProducto(Long idProducto, String nombre, Double precio, Integer cantidad) throws Exception{
        
        try{
            
            if(idProducto == null || idProducto < 0){
                throw new Exception("Error idProducto invalido");
            }
            
            if(nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Error nombre invalido");
            }
            
            if(precio == null || precio < 0){
                throw new Exception("Error precio invalido");
            }
            
            if(cantidad == null || cantidad < 0){
                throw new Exception("Error cantidad invalida");
            }
            
            Producto producto = new Producto(idProducto, nombre, precio, cantidad);
            
            return producto;
            
        }catch(Exception ex){
            throw ex;
        }
        
    }
    
    
    public void asignacion(){}
    public void retorno(){} 
    
}
