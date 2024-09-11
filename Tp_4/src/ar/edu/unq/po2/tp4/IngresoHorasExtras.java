package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso {

	private int horasExtras;
	private int precioHoras;
	
	public IngresoHorasExtras(String mesDePercepcion, String concepto, int monto, int horasExtra, int precio) {
		super(mesDePercepcion, concepto, monto);
		this.horasExtras = horasExtra;
		this.precioHoras = precio;
		
	}
	
	public int getTotalPercibido() {
		return super.getTotalPercibido() + this.horasExtras * this.precioHoras;
	}

	
	
}
