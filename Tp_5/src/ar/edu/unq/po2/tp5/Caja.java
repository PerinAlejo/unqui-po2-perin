package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	
	private Agencia agencia;
	
	public Caja(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public double registrarProductos(List<Producto> productos) {
		double total = 0;
		for (Producto producto : productos) {
			producto.decrementarStock();
			total += producto.getPrecio();
		}
		return total;
	}
	
	public void pagarFactura(Factura factura) {
		agencia.registrarPago(factura);
	}
	
}


