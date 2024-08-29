package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	Counter contador;
	
	@BeforeEach
	void setUp() throws Exception {		
		contador = new Counter();	
	}
	
	
	@Test
	void masParesTest() {
		contador.add(1234);
		contador.add(1111);
		contador.add(2222);
		
		assertEquals(4, contador.cantPares(2222));
		assertEquals(2222, contador.masPares());
	}

	@Test
	void counterTest() {
		
		//Se agregan los numeros. Un solo par y nueve impares
				contador.add(1);
				contador.add(3);
				contador.add(5);
				contador.add(7);
				contador.add(9);
				contador.add(1);
				contador.add(27);
				contador.add(1);
				contador.add(1);
				contador.add(4);
		
		assertEquals(1, contador.contarPares());
		assertEquals(9, contador.contarImpares());
		assertEquals(3, contador.contarMutiplos(3));
	}
	
	@Test
	void maxMultiploTest() {
		assertEquals(999, contador.maxMultiplo(3, 9));
	}

}
