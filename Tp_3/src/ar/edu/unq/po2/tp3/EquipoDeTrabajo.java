package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EquipoDeTrabajo {
	
	String nombre;
	List<Persona> empleados;
	
	public EquipoDeTrabajo(String nombre, List<Persona> empleados) {
		this.nombre = nombre;
		this.empleados = empleados;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int promedioEdad() {
		int sumaEdad = 0;
		for(Persona empleado : empleados) {
			sumaEdad += empleado.getEdad();
		}
		return sumaEdad / empleados.size();
	}
	
	public static void main(String[] args) {
		
		Persona juan = new Persona("Juan", LocalDate.of(2003, 5, 27));
		Persona jose = new Persona("Jose", LocalDate.of(2003, 5, 27));
		Persona loan = new Persona("Loan", LocalDate.of(2003, 5, 27));
		Persona alejo = new Persona("Alejo", LocalDate.of(2003, 5, 27));
		Persona pepe = new Persona("Pepe", LocalDate.of(2003, 5, 27));
		
		List<Persona> empleados = Arrays.asList(juan, jose, loan, alejo, pepe);
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("MAC", empleados);
	
		System.out.println(equipo.promedioEdad());
	
	}

}
