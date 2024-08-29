package model;
import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	
	private LocalDate fechaFin;
	private int horasExtra;
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, int sueldoBasico, int horasExtra, LocalDate fechaFin) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.fechaFin = fechaFin;
		this.horasExtra = horasExtra;
	}

	@Override
	public int sueldoBruto() {
		return this.getSueldoBasico() + 40 * this.horasExtra;
	}

	@Override
	public int retenciones() {
		return this.aportesJubilatorios() + this.aportesJubilatorios() ;
	}

	@Override
	public int aportesObraSocial() {
		int montoPorEdad = 0;
		if(this.edad() > 50) {
			montoPorEdad = 25;
		}
		return (int) (this.sueldoBruto() * 0.1) + montoPorEdad;
	}

	@Override
	public int aportesJubilatorios() {
		return (int) (this.sueldoBruto() * 0.1) + 5 * this.horasExtra;
	}

}
