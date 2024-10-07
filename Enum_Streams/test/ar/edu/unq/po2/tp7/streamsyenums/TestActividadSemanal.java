package ar.edu.unq.po2.tp7.streamsyenums;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestActividadSemanal {

	ActividadSemanal futbol;
	ActividadSemanal jabalina;
	
	@BeforeEach
	void setUp() throws Exception {
		futbol = new ActividadSemanal(DiaDeSemana.JUEVES, LocalTime.of(14, 30), 2, Deporte.FUTBOL);
		jabalina = new ActividadSemanal(DiaDeSemana.MARTES, LocalTime.of(14, 30), 2, Deporte.JABALINA);
	}

	@Test
	void test() {
		assertEquals(2400, futbol.getCosto());
		assertEquals(1800, jabalina.getCosto());
	}

}
