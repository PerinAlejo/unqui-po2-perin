package ar.edu.unq.po2.tp6;

public class SolicitudCreditoPersonal extends SolicitudCredito {
	
	public SolicitudCreditoPersonal(Cliente cliente, double monto, int plazo) {
		super(cliente, monto, plazo);
	}

	@Override
	public boolean evaluar() {
		double sueldoAnual = cliente.getSueldoNetoAnual();
        double cuotaMensual = this.getCuotaMensual();
        return sueldoAnual >= 15000 && cuotaMensual <= cliente.getSueldoNetoMensual() * 0.7;
	}
}

	
	
