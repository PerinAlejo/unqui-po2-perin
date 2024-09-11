package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;


public class Supermercado {
	private String nombre;
	private String direccion;
	
	private List<Producto> productos = new ArrayList<>(); 
	
	public Supermercado(String nombre, String direccion) {
		this.direccion = direccion;
		this.nombre = nombre;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public double getPrecioTotal() {
		double precio = 0;
		for (Producto porducto : productos) {
			precio += porducto.getPrecio();
		}
		return precio;
	}
	
	
	
}
