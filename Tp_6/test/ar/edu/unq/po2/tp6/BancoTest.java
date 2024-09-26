package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

    @Test
    void testAgregarCliente() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("Juan", "Pérez", "Calle Falsa 123", 30, 5000, banco);
        
        assertEquals(1, banco.getClientes().size());
        assertEquals(cliente, banco.getClientes().get(0));
    }

    @Test
    void testAgregarSolicitudCredito() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("Ana", "Gómez", "Calle Real 123", 28, 7000, banco);
        
        SolicitudCreditoPersonal solicitud = new SolicitudCreditoPersonal(cliente, 15000, 12);
        banco.addSolicitudCredito(solicitud);
        
        assertEquals(1, banco.getSolicitudes().size());
        assertTrue(banco.getSolicitudes().get(0).evaluar());
    }

    @Test
    void testMontoADesembolsar() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("Carlos", "López", "Calle Verde 123", 40, 8000, banco);
        
        SolicitudCreditoPersonal solicitud1 = new SolicitudCreditoPersonal(cliente, 20000, 12);
        SolicitudCreditoPersonal solicitud2 = new SolicitudCreditoPersonal(cliente, 30000, 24);
        
        banco.addSolicitudCredito(solicitud1);
        banco.addSolicitudCredito(solicitud2);
        
        assertEquals(50000, banco.montoADesembolsar());
    }
}
