package ar.edu.unq.po2.tp5;


public class Producto {

	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public void decrementarStock() {
		this.stock--;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public int getStock() {
		return this.stock;
	}

	
}
