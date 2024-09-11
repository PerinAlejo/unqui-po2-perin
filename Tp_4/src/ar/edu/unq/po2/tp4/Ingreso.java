package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	private String mesDePercepcion;
	private String concepto;
	private int montoRecibido;
	
	public Ingreso(String mesDePercepcion, String concepto, int monto) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoRecibido = monto;
	}
	
	public int getMontoImponible() {
		return this.montoRecibido;
	}
	
	public int getTotalPercibido() {
		return this.montoRecibido;
	}
}
