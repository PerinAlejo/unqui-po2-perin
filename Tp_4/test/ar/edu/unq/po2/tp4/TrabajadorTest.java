package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	Trabajador juan;
	Ingreso ingresoJuan;
	Trabajador jose;
	IngresoHorasExtras ingresoJose;

	@BeforeEach
	void setUp() throws Exception {
		ingresoJuan = new Ingreso("Mayo", "Trabajo", 10000);
		ingresoJose = new IngresoHorasExtras("Mayo", "Trabajo", 10000, 10, 200);
		juan = new Trabajador(ingresoJuan);
		jose = new Trabajador(ingresoJose);
		
	}

	@Test
	void test() {
		assertEquals(10000, juan.getTotalPercibido());
		assertEquals(12000, jose.getTotalPercibido());
		assertEquals(10000, jose.getMontoImponible());
		assertEquals(10000, juan.getMontoImponible());
		assertEquals(2000, juan.getImpuestosAPagar());
		assertEquals(2000, jose.getImpuestosAPagar());
	}

}
