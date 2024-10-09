package ar.edu.unq.po2.mockito.ej3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadasTest {

    private PokerStatus pokerStatus;

    @BeforeEach
    void setUp() {
        pokerStatus = new PokerStatus();
    }

    @Test
    void testVerificarPoker() {
        // Crear cartas mockeadas
        Carta carta1 = mock(Carta.class);
        Carta carta2 = mock(Carta.class);
        Carta carta3 = mock(Carta.class);
        Carta carta4 = mock(Carta.class);
        Carta carta5 = mock(Carta.class);
        
        // Definir comportamiento de las cartas mockeadas
        when(carta1.getValor()).thenReturn(ValorCartas.A);
        when(carta2.getValor()).thenReturn(ValorCartas.A);
        when(carta3.getValor()).thenReturn(ValorCartas.A);
        when(carta4.getValor()).thenReturn(ValorCartas.A);
        when(carta5.getValor()).thenReturn(ValorCartas.K);
        
        when(carta1.getPalo()).thenReturn(Palos.CORAZON);
        when(carta2.getPalo()).thenReturn(Palos.DIAMANTE);
        when(carta3.getPalo()).thenReturn(Palos.TREBOL);
        when(carta4.getPalo()).thenReturn(Palos.PICAS);
        when(carta5.getPalo()).thenReturn(Palos.CORAZON);

        Jugada resultado = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Poker", resultado.getTipo());
    }

    @Test
    void testVerificarColor() {
        Carta carta1 = mock(Carta.class);
        Carta carta2 = mock(Carta.class);
        Carta carta3 = mock(Carta.class);
        Carta carta4 = mock(Carta.class);
        Carta carta5 = mock(Carta.class);
        
        when(carta1.getValor()).thenReturn(ValorCartas.A);
        when(carta2.getValor()).thenReturn(ValorCartas.DIEZ);
        when(carta3.getValor()).thenReturn(ValorCartas.J);
        when(carta4.getValor()).thenReturn(ValorCartas.Q);
        when(carta5.getValor()).thenReturn(ValorCartas.K);
        
        when(carta1.getPalo()).thenReturn(Palos.CORAZON);
        when(carta2.getPalo()).thenReturn(Palos.CORAZON);
        when(carta3.getPalo()).thenReturn(Palos.CORAZON);
        when(carta4.getPalo()).thenReturn(Palos.CORAZON);
        when(carta5.getPalo()).thenReturn(Palos.CORAZON);

        Jugada resultado = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Color", resultado.getTipo());
    }

    @Test
    void testVerificarTrio() {
        Carta carta1 = mock(Carta.class);
        Carta carta2 = mock(Carta.class);
        Carta carta3 = mock(Carta.class);
        Carta carta4 = mock(Carta.class);
        Carta carta5 = mock(Carta.class);
        
        when(carta1.getValor()).thenReturn(ValorCartas.A);
        when(carta2.getValor()).thenReturn(ValorCartas.A);
        when(carta3.getValor()).thenReturn(ValorCartas.A);
        when(carta4.getValor()).thenReturn(ValorCartas.K);
        when(carta5.getValor()).thenReturn(ValorCartas.Q);
        
        when(carta1.getPalo()).thenReturn(Palos.CORAZON);
        when(carta2.getPalo()).thenReturn(Palos.DIAMANTE);
        when(carta3.getPalo()).thenReturn(Palos.TREBOL);
        when(carta4.getPalo()).thenReturn(Palos.PICAS);
        when(carta5.getPalo()).thenReturn(Palos.CORAZON);

        Jugada resultado = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Trio", resultado.getTipo());
    }

    @Test
    void testDeterminarGanadorPokerVsTrio() {
        Jugada jugada1 = new Jugada("Poker", ValorCartas.A);
        Jugada jugada2 = new Jugada("Trio", ValorCartas.K);

        String resultado = pokerStatus.determinarGanador(jugada1, jugada2);
        assertEquals("Ganador: Jugada 1 con Poker", resultado);
    }

    @Test
    void testDeterminarGanadorColorVsTrio() {
        Jugada jugada1 = new Jugada("Color", ValorCartas.K);
        Jugada jugada2 = new Jugada("Trio", ValorCartas.A);

        String resultado = pokerStatus.determinarGanador(jugada1, jugada2);
        assertEquals("Ganador: Jugada 1 con Color", resultado);
    }

    @Test
    void testDeterminarGanadorTrioVsColor() {
        Jugada jugada1 = new Jugada("Trio", ValorCartas.A);
        Jugada jugada2 = new Jugada("Color", ValorCartas.K);

        String resultado = pokerStatus.determinarGanador(jugada1, jugada2);
        assertEquals("Ganador: Jugada 2 con Color", resultado);
    }

    @Test
    void testDeterminarGanadorEmpate() {
        Jugada jugada1 = new Jugada("Trio", ValorCartas.A);
        Jugada jugada2 = new Jugada("Trio", ValorCartas.A);

        String resultado = pokerStatus.determinarGanador(jugada1, jugada2);
        assertEquals("Ganador: Jugada 2 con Trio", resultado); // Actualizar mensaje de empate
    }
}
