package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	String nombre;
	LocalDate fechaNac;
	
	 public Persona(String nombre, LocalDate fechaNacimiento) {
	        this.nombre = nombre;
	        this.fechaNac = fechaNacimiento;
	    }
	 
	 public static Persona crearPersona(String nombre, LocalDate fechaNacimiento) {
	        return new Persona(nombre, fechaNacimiento);
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
