package model;

import java.time.LocalDate;

public class Contratado extends Empleado {
	
	private int numDeContrato;
	private String medioDePago;
	
	public Contratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, int sueldoBasico,
			int numDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.numDeContrato = numDeContrato;
		this.medioDePago = medioDePago;
	}

	@Override
	public int sueldoBruto() {
		
		return this.getSueldoBasico();
	}

	@Override
	public int retenciones() {
		return 50;
	}

	@Override
	public int aportesObraSocial() {
		return 0;
	}

	@Override
	public int aportesJubilatorios() {
		return 0;
	}

}
