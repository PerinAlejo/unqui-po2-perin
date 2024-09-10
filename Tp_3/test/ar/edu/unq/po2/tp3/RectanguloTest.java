package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {

	Rectangulo rectangulo;
	Cuadrado cuadrado;
	
	@BeforeEach
	void setUp() throws Exception {
		
		rectangulo = new Rectangulo(10, 5);
		cuadrado = new Cuadrado(5);
		
	}

	@Test
	void test() {
		assertEquals(25, cuadrado.area());
		assertEquals(50, rectangulo.area());
		assertEquals(20, cuadrado.perimetro());
		assertEquals("Es un Cuadrado", cuadrado.posicion());
		assertEquals("es Horizontal", rectangulo.posicion());
	}

}
