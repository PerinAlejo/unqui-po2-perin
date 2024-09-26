package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

	    @Test
	    void testGetSueldoNetoAnual() {
	        Banco banco = new Banco();
	        Cliente cliente = new Cliente("Juan", "Pérez", "Calle Falsa 123", 30, 5000, banco);
	        assertEquals(60000, cliente.getSueldoNetoAnual());
	    }

	    @Test
	    void testSolicitarCreditoPersonal() {
	        Banco banco = new Banco();
	        Cliente cliente = new Cliente("Ana", "Gómez", "Calle Real 123", 28, 7000, banco);
	        
	        // Solicita un crédito personal
	        cliente.solicitarCreditoPersonal(20000, 12);
	        
	        // Verificamos que el crédito ha sido agregado correctamente
	        assertEquals(1, banco.getSolicitudes().size());
	        assertTrue(banco.getSolicitudes().get(0) instanceof SolicitudCreditoPersonal);
	    }

	    @Test
	    void testSolicitarCreditoHipotecario() {
	        Banco banco = new Banco();
	        Cliente cliente = new Cliente("Carlos", "López", "Calle Verde 123", 40, 8000, banco);
	        Propiedad propiedad = new Propiedad("Casa", "Calle Principal 456", 100000);

	        // Solicita un crédito hipotecario
	        cliente.solicitarCreditoHipotecario(50000, 240, propiedad);

	        // Verificamos que el crédito hipotecario ha sido agregado correctamente
	        assertEquals(1, banco.getSolicitudes().size());
	        assertTrue(banco.getSolicitudes().get(0) instanceof SolicitudCreditoHipotecario);
	    }
	}

