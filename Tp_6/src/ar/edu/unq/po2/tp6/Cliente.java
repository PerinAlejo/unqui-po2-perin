package ar.edu.unq.po2.tp6;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private Banco banco;
	private SolicitudCredito solicitudCredito;

	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual, Banco banco) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.banco = banco;
		
		banco.addCliente(this);
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public double getSueldoNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}
	
	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public void solicitarCreditoPersonal(double monto, int plazo) {
		this.solicitudCredito = new SolicitudCreditoPersonal(this, monto, plazo);
		this.banco.addSolicitudCredito(this.solicitudCredito);
	}
	
	public void solicitarCreditoHipotecario(double monto, int plazo, Propiedad propiedad) {
		this.solicitudCredito = new SolicitudCreditoHipotecario(this, monto, plazo, propiedad);
		this.banco.addSolicitudCredito(this.solicitudCredito);
	}
	
}
