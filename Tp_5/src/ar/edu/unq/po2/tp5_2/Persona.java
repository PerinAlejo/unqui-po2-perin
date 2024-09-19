package ar.edu.unq.po2.tp5_2;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombreable{

	private String nombre;
	private LocalDate fechaNac;
	
	public Persona(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaNac = fecha;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaNac() {
		return this.fechaNac;
	}
	
	public int getEdad() {
		LocalDate fechaActual = LocalDate.now();
		return Period.between(fechaNac, fechaActual).getYears();
	}
	
	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	
	
}
