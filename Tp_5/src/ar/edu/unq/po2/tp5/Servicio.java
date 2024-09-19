package ar.edu.unq.po2.tp5;

public class Servicio implements Factura{
	
	private double costoUnidad; 
	private int unidadesConsumidas;
	
	public Servicio(double costoUnidad, int unidadesConsumidas) {
		this.costoUnidad = costoUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	public double montoPagar() {
		return this.costoUnidad * this.unidadesConsumidas;
	}
	
}
