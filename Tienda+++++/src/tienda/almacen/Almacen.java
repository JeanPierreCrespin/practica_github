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
public class Almacen {
    //atributos
    String nombre_empresa;
    String direccion;
    //getter y setter
    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //to string

    @Override
    public String toString() {
        return "Almacen{" + "nombre_empresa=" + nombre_empresa + ", direccion=" + direccion + '}';
    }
    
    
    
}
