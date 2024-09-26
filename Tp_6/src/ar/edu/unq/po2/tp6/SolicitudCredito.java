package ar.edu.unq.po2.tp6;

public abstract class SolicitudCredito {
	
	protected Cliente cliente;
	protected double monto;
	protected int plazo;
	
	public SolicitudCredito(Cliente cliente, double monto, int plazo) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}
	
	public abstract boolean evaluar();
	
	public double getMonto() {
		return this.monto;
	}
	
	public double getCuotaMensual() {
		return this.monto / this.plazo;
	}
	
}


