package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

    @Test
    void testCobrarFacturaServicio() {
        Factura f1 = new Servicio(10, 5);  // 10 por unidad, 5 unidades consumidas
        Caja caja = new Caja();
        caja.registrarPago(f1);

        assertEquals(50, caja.getTotal());
    }

    @Test
    void testCobrarFacturaImpuesto() {
        Factura f2 = new Impuesto(100);  // TasaDeServicio 100
        Caja caja = new Caja();
        caja.registrarPago(f2);

        assertEquals(100, caja.getTotal());
    }
}