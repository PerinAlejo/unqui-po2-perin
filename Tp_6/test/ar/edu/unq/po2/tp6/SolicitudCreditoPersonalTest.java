package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudCreditoPersonalTest {

    @Test
    void testEvaluarSolicitudAceptada() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("Juan", "Pérez", "Calle Falsa 123", 30, 5000, banco);

        SolicitudCreditoPersonal solicitud = new SolicitudCreditoPersonal(cliente, 20000, 12);

        // Evaluar si la solicitud es aceptada (en este caso debería ser aceptada)
        assertTrue(solicitud.evaluar());
    }

    @Test
    void testEvaluarSolicitudRechazada() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("Ana", "Gómez", "Calle Real 123", 28, 7000, banco);

        // Solicitud de crédito con monto muy alto
        SolicitudCreditoPersonal solicitud = new SolicitudCreditoPersonal(cliente, 100000, 12);

        // Evaluar si la solicitud es rechazada (por superar el 70% del sueldo)
        assertFalse(solicitud.evaluar());
    }
}