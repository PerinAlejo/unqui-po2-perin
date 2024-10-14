package ar.edu.unq.po2.stateAndStrategy.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNaiveTest {

	EncriptadorNaive encriptador;
	
	@BeforeEach
	void setUp() throws Exception {
		
		encriptador = new EncriptadorNaive();
	}

	@Test
	void testEncriptadoNumerar() {
		
		encriptador.setTipoEncriptado(new Numerar());
		String cadenaEncriptada = encriptador.encriptar("Diego");
		assertEquals("4,9,5,7,15", cadenaEncriptada);
		assertEquals("diego", encriptador.desencriptar(cadenaEncriptada));
		
		
	}
	
	@Test
	void testEncriptadoVocal() {
	    encriptador.setTipoEncriptado(new CambioVocal());
	    
	    String palabra = "Diego";
	    String codificado = encriptador.encriptar(palabra);
	    assertEquals("Doigu", codificado);
	    
	    String desencriptado = encriptador.desencriptar(codificado);
	    assertEquals("Diego", desencriptado);
	}

}
