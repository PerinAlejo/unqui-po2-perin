package ar.edu.unq.po2.mockito.ej3;

public class Carta implements Comparable<Carta> {
	
	ValorCartas valor;
	Palos palo; 
	
	public Carta(ValorCartas valor, Palos palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	@Override
	public int compareTo(Carta otraCarta) {
		return this.valor.compareTo(otraCarta.valor);
	}
	
	public ValorCartas getValor() {
		return valor;
	}

	public Palos getPalo() {
		return palo;
	}
}
	
