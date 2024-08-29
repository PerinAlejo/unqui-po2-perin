package model;

import java.time.LocalDate;


public class EmpleadoPermanente extends Empleado {
	
	private int cantHijos;
	private int antiguedad;

	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, int sueldoBasico, int cantHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}

	@Override
	public int sueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar();
	}
	
	public int salarioFamiliar() {
		return this.aportePorHijos(150) + this.asignacionPorConyugue() + this.aporteAntiguedad(50);
	}
	
	public int aporteAntiguedad(int aporte) {
		return aporte * this.antiguedad;
	}
	
	public int asignacionPorConyugue() {
		if(this.getEstadoCivil() == "Casado") {
			return 100;
		}
		else {
			return 0;
		}
	}
	
	public int aportePorHijos(int aporte) {
		return aporte * this.cantHijos;
	}

	@Override
	public int retenciones() {
		return this.aportesJubilatorios() + this.aportePorHijos(20) + this.aportesObraSocial();
	}

	@Override
	public int aportesObraSocial() {
		return (int) (0.1 * this.sueldoBruto());
	}

	@Override
	public int aportesJubilatorios() {
		// TODO Auto-generated method stub
		return (int) (0.15 * this.sueldoBruto());
	}

}
