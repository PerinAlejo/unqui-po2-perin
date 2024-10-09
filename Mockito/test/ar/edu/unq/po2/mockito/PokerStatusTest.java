package ar.edu.unq.po2.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	PokerStatus mano;
	
	String manoConPoker;
	String manoConTrio;
	String manoConColor;
	String manoConNada;
	
	@BeforeEach
	void setUp() throws Exception {
		
		mano = new PokerStatus(); 
		
		manoConPoker = mano.verificar("QD","QP","QC", "QT", "5D");
		manoConTrio = mano.verificar("QD","QP","QC", "6T", "5D");
		manoConColor = mano.verificar("QD","4D","KD", "10D", "5D");
		manoConNada = mano.verificar("10D","10P","1C", "1T", "5D");
	
	}

	@Test
	void verificarSiEnLaJugadaExistePoker() {
		assertEquals("Poker" ,manoConPoker);
		assertEquals("Trio" ,manoConTrio);
		assertEquals("Color" ,manoConColor);
		assertEquals("Nada" ,manoConNada);
	}

}
