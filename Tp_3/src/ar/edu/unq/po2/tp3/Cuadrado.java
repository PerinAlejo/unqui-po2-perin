package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

	public Cuadrado(int base) {	
		super(base, base);	
	}
	
	@Override
	public String posicion() {
		return "Es un Cuadrado";
	}

}
