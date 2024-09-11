package ar.edu.unq.po2.tp4;

public class Trabajador {

	private Ingreso ingresos;
	
	public Trabajador(Ingreso ingreso) {
		this.ingresos = ingreso;
	}
	
	public int getTotalPercibido() {
		return ingresos.getTotalPercibido();
	}
	
	public int getMontoImponible() {
		return ingresos.getMontoImponible();
	}
	
	public double getImpuestosAPagar() {
		return this.getMontoImponible() * 0.2;
	}
	
}
