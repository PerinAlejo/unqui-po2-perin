package ar.edu.unq.po2.template.ej5;

public class CajaDeAhorro extends CuentaBancaria {
	 
	private int limite;
	 
	public CajaDeAhorro(String titular, int limite){
	 super(titular);
	 this.limite=limite;
	}
	 
	public int getLimite(){
		return this.limite;
	}
	 
	@Override
	public void extraer(int monto) {
		if(this.getSaldo()>=monto && this.getLimite()>=monto){
			this.setSaldo(this.getSaldo()-monto);
			this.agregarMovimientos("Extraccion");
		}
	}
}