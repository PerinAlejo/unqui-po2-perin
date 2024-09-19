package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	Producto banana;
	Producto leche;
	Producto frutilla;
	Producto aceite;
	
	List<Producto> compras;
	Caja caja;
	
	@BeforeEach
	void setUp() throws Exception {
		
		banana = new Producto("banana", 10d, 2);
		leche = new ProductoCooperativa("leche", 10d, 1);
		frutilla = new Producto("frutilla", 10d, 2);
		aceite = new Producto("aceite", 10d, 2);
		caja = new Caja();
		
		compras = new ArrayList<>();
		compras.add(aceite);
		compras.add(leche);
		compras.add(banana);
		compras.add(frutilla);
	}

	@Test
	void productos() {
		assertEquals(2, banana.getStock());
		banana.decrementarStock();
		assertEquals(1, banana.getStock());
		assertEquals(new Double(10), banana.getPrecio());
		assertEquals(new Double(9), leche.getPrecio());
	}
	
	@Test
	void caja() {
		assertEquals(new Double(39) , caja.registrarProductos(compras));
		assertEquals(1, banana.getStock());
		assertEquals(0, leche.getStock());
		assertEquals(1, frutilla.getStock());
		assertEquals(1, aceite.getStock());
	}

}
