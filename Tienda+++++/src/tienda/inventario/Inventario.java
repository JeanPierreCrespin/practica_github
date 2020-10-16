package tienda.inventario;

public class Inventario {
	
	private Long numeroDeSolicitud;
	
	public Inventario() {}

	public Long getNumeroDeSolicitud() {
		return numeroDeSolicitud;
	}

	public void setNumeroDeSolicitud(Long numeroDeSolicitud) {
		this.numeroDeSolicitud = numeroDeSolicitud;
	}

	@Override
	public String toString() {
		return "Inventario [numeroDeSolicitud=" + numeroDeSolicitud + "]";
	}
	
	

}
