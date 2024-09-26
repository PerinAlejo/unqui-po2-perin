package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudCreditoHipotecarioTest {

    @Test
    void testEvaluarSolicitudHipotecariaAceptada() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("Carlos", "López", "Calle Verde 123", 40, 8000, banco);
        Propiedad propiedad = new Propiedad("Casa", "Calle Principal 456", 100000);

        SolicitudCreditoHipotecario solicitud = new SolicitudCreditoHipotecario(cliente, 50000, 240, propiedad);

        // Evaluar si la solicitud es aceptada
        assertTrue(solicitud.evaluar());
    }

    @Test
    void testEvaluarSolicitudHipotecariaRechazada() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("Pedro", "Martínez", "Calle Azul 789", 60, 4000, banco);
        Propiedad propiedad = new Propiedad("Casa", "Calle Segunda 789", 60000);

        SolicitudCreditoHipotecario solicitud = new SolicitudCreditoHipotecario(cliente, 50000, 240, propiedad);

        // Evaluar si la solicitud es rechazada (el cliente es mayor y el valor es muy alto)
        assertFalse(solicitud.evaluar());
    }
}