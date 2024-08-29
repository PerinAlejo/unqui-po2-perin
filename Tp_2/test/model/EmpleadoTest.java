package model;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
