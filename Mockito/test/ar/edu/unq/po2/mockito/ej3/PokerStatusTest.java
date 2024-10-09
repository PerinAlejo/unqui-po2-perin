package ar.edu.unq.po2.mockito.ej3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PokerStatusTest {

    PokerStatus mano;  // Instancia de la clase a probar

    Carta AD;  // As de Diamantes
    Carta AP;  // As de Picas
    Carta AT;  // As de Tréboles
    Carta AC;  // As de Corazones
    Carta JC;  // Jota de Corazones
    Carta QC;  // Reina de Corazones
    Carta KC;  // Rey de Corazones
    Carta DOSC;  // Dos de Corazones

    @BeforeEach
    void setUp() throws Exception {
        mano = new PokerStatus();

        // Mockeamos las cartas
        AD = mock(Carta.class);
        AP = mock(Carta.class);
        AT = mock(Carta.class);
        AC = mock(Carta.class);
        JC = mock(Carta.class);
        QC = mock(Carta.class);
        KC = mock(Carta.class);
        DOSC = mock(Carta.class);

        // Configurar los valores y palos de las cartas mockeadas
        when(AD.getValor()).thenReturn(ValorCartas.A);
        when(AP.getValor()).thenReturn(ValorCartas.A);
        when(AT.getValor()).thenReturn(ValorCartas.A);
        when(AC.getValor()).thenReturn(ValorCartas.A);
        when(JC.getValor()).thenReturn(ValorCartas.J);
        when(QC.getValor()).thenReturn(ValorCartas.Q);
        when(KC.getValor()).thenReturn(ValorCartas.K);
        when(DOSC.getValor()).thenReturn(ValorCartas.DOS);

        // Configurar los palos de las cartas mockeadas
        when(AD.getPalo()).thenReturn(Palos.DIAMANTE);
        when(AP.getPalo()).thenReturn(Palos.PICAS);
        when(AT.getPalo()).thenReturn(Palos.TREBOL);
        when(AC.getPalo()).thenReturn(Palos.CORAZON);
        when(JC.getPalo()).thenReturn(Palos.CORAZON);
        when(QC.getPalo()).thenReturn(Palos.CORAZON);
        when(KC.getPalo()).thenReturn(Palos.CORAZON);
        when(DOSC.getPalo()).thenReturn(Palos.CORAZON);
    }

    @Test
    void verificarSiEnLaJugadaExistePoker() {
        // Ases de diferentes palos + una carta cualquiera
        Jugada resultado = mano.verificar(AD, AP, AT, AC, JC);
        assertEquals("Poker", resultado.getTipo());
    }

    @Test
    void verificarSiEnLaJugadaExisteTrio() {
        // Tres Ases de diferentes palos + dos cartas diferentes
        Jugada resultado = mano.verificar(AD, AP, AT, QC, JC);
        assertEquals("Trio", resultado.getTipo());
    }

    @Test
    void verificarSiEnLaJugadaExisteColor() {
        // Cinco cartas del mismo palo (Corazones)
        Jugada resultado = mano.verificar(DOSC, KC, AC, QC, JC);
        assertEquals("Color", resultado.getTipo());
    }

    @Test
    void verificarSiEnLaJugadaNoHayNada() {
        // Mano sin combinaciones relevantes
        Jugada resultado = mano.verificar(AD, AP, KC, QC, JC);
        assertEquals("Nada", resultado.getTipo());
    }
}
