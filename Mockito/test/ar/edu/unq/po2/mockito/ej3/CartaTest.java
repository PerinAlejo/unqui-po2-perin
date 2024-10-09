package ar.edu.unq.po2.mockito.ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {

	Carta dosPica;
	Carta tresTrebol;
	Carta reyDiamante;
	
	@BeforeEach
	void setUp() throws Exception {
		dosPica = new Carta(ValorCartas.DOS, Palos.PICAS);
		tresTrebol = new Carta(ValorCartas.TRES, Palos.TREBOL);
		reyDiamante = new Carta(ValorCartas.K, Palos.DIAMANTE);
		
	}

	@Test
	void obtenerValorYPalosDeLasCartas() {
		assertEquals(ValorCartas.DOS, dosPica.getValor());
		assertEquals(Palos.PICAS, dosPica.getPalo());
		
		
	}
	
	@Test 
	void compararQueCartaEsMasGrande() {
		assertTrue(tresTrebol.compareTo(dosPica) > 0);
		assertFalse(tresTrebol.compareTo(reyDiamante) > 0);
	}

}
