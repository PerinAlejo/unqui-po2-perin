package model;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

class EmpleadoTest {

	EmpleadoPermanente empleado; 
	
	@BeforeEach
    void setup() throws Exception {
         LocalDate fechaNac = LocalDate.of(2003, 5, 27);
         empleado = new EmpleadoPermanente("Alejo Perin", "Calle Falsa 123", "Casado", fechaNac, 50000, 0, 1);
    }

	@Test
	void test() {
		assertEquals(21, empleado.edad());
		assertEquals(50150, empleado.sueldoBruto());
	}

}
