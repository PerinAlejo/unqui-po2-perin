package ar.edu.unq.po2.tp5_2;

public class Mascota implements Nombreable{
	
	private String nombre;
	private String raza;
	
	public Mascota(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getRaza() {
		return this.raza;
	}
	
}
