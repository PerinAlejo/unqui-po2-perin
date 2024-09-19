package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

	Impuesto impuesto;
	Servicio servicio;
	Caja caja;
	Agencia agencia;
	
	
	@BeforeEach
	void setUp() throws Exception {
		impuesto = new Impuesto(10d);
		servicio = new Servicio(10d, 5);
		caja = new Caja();
		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
