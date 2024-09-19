package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	Producto banana;
	Producto leche;
	Producto aceite;

	Caja caja;
	
	@BeforeEach
	void setUp() throws Exception {
		
		banana = new Producto("banana", 10d, 2);
		leche = new ProductoCooperativa("leche", 10d, 1);
		aceite = new Producto("aceite", 10d, 2);
		caja = new Caja();
	}
	
	@Test
	void productos() {
		assertEquals(2, banana.getStock());
		banana.decrementarStock(1);
		assertEquals(1, banana.getStock());
		assertEquals(new Double(10), banana.getPrecio());
		assertEquals(new Double(9), leche.getPrecio());
	}
	
	@Test
	void caja() {
		caja.agregarProducto(aceite, 2);
		caja.agregarProducto(banana, 1);
		caja.agregarProducto(leche, 1);
		
		assertEquals(new Double(39) , caja.getTotal());
		assertEquals(1, banana.getStock());
		assertEquals(0, leche.getStock());
		assertEquals(0, aceite.getStock());
	}

}
