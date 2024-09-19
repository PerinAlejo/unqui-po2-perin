package ar.edu.unq.po2.tp5;

public class Impuesto implements Factura{
	
	private double tasaDeServicio;
	
	public Impuesto(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}
	
	public double montoPagar() {
		return this.tasaDeServicio;
	}

}
