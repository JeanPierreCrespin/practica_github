package tienda.inventario;

public class InventarioService {
	
	public Inventario crearInventario(Long numeroDeSolicitud) {
		Inventario i = new Inventario();
		i.setNumeroDeSolicitud(numeroDeSolicitud);
		
		return i;
	}
	public void registroDeProducto() {}
	
	public void existencias() {}

}
