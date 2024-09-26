package ar.edu.unq.po2.tp6;

public class SolicitudCreditoHipotecario extends SolicitudCredito {

	private Propiedad garantia;

	public SolicitudCreditoHipotecario(Cliente cliente, double monto, int plazo, Propiedad garantia) {
		super(cliente, monto, plazo);
		this.garantia = garantia;
	}
	
	@Override
	public boolean evaluar() {
		double cuotaMensual = this.getCuotaMensual();
        return cuotaMensual <= cliente.getSueldoNetoMensual() * 0.5 &&
               this.monto <= garantia.getValorFiscal() * 0.7 &&
               cliente.getEdad() + (this.plazo / 12) <= 65;
	}

}
