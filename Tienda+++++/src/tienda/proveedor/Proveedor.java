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
public class Proveedor {
    private String telefono;
    private int NIT;
    private String direccion;
    private int cantidad;
    private String producto;
    private String nombre_proveedor;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    @Override
    public String toString() {
        return "proveedor{" + "telefono=" + telefono + ", NIT=" + NIT + ", direccion=" + direccion + ", cantidad=" + cantidad + ", producto=" + producto + ", nombre_proveedor=" + nombre_proveedor + '}';
    }
    
    
    
}
