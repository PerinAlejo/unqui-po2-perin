package model;

import java.time.LocalDate;

public class ReciboSueldo {
	private Empleado empleado;
	private String direccion;
	private LocalDate fechaEmision;
	private int sueldoBruto;
	private int sueldoNeto;
	
	public ReciboSueldo(Empleado empleado) {
		this.empleado = empleado;
		this.direccion = empleado.getDireccion();
		this.fechaEmision = LocalDate.now();
		this.sueldoBruto = empleado.sueldoBruto();
		this.sueldoNeto = empleado.sueldoNeto();						
	}
}
