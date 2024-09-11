package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, int descuento) {
		super(nombre, precio, precioCuidado);
		this.descuento = 1 - (descuento / 100.0);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, int descuento) {
		super(nombre, precio);
		this.descuento = 1 - (descuento / 100.0);
	}


	@Override
	public double getPrecio() {
		return super.getPrecio() * descuento;
	}
}
