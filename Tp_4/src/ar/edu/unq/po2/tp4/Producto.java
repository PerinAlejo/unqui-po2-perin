package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	private double precioBase;
	private boolean precioCuidado;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precioBase = precio;
		this.precioCuidado = false;
	}
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
		this.nombre = nombre;
		this.precioBase = precio;
		this.precioCuidado = precioCuidado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precioBase;
	}
	
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precioBase += aumento;
	}
}
