package ar.edu.unq.po2.mockito.ej3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {

    private static final String POKER = "Poker";
    private static final String TRIO = "Trio";
    private static final String COLOR = "Color";
    private static final String NADA = "Nada";

    public Jugada verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        List<Carta> cartas = Arrays.asList(carta1, carta2, carta3, carta4, carta5);

        Map<ValorCartas, Integer> conteoCartas = obtenerValor(cartas);
        Map<Palos, Integer> conteoPalos = obtenerPalos(cartas);

        if (hayPoker(conteoCartas)) {
            return new Jugada(POKER, obtenerValorMayor(conteoCartas));
        } else if (hayTrio(conteoCartas)) {
            return new Jugada(TRIO, obtenerValorMayor(conteoCartas));
        } else if (hayColor(conteoPalos)) {
            return new Jugada(COLOR, obtenerValorMayor(conteoCartas));
        } else {
            return new Jugada(NADA, null); // Sin jugada
        }
    }

    private boolean hayPoker(Map<ValorCartas, Integer> conteoCartas) {
        return conteoCartas.values().contains(4);
    }

    private boolean hayColor(Map<Palos, Integer> conteoPalos) {
        return conteoPalos.values().contains(5);
    }

    private boolean hayTrio(Map<ValorCartas, Integer> conteoCartas) {
        return conteoCartas.values().contains(3);
    }

    private Map<Palos, Integer> obtenerPalos(List<Carta> cartas) {
        Map<Palos, Integer> conteoPalos = new HashMap<>();

        for (Carta carta : cartas) {
            Palos palo = carta.getPalo();
            conteoPalos.put(palo, conteoPalos.getOrDefault(palo, 0) + 1);
        }

        return conteoPalos;
    }

    private Map<ValorCartas, Integer> obtenerValor(List<Carta> cartas) {
        Map<ValorCartas, Integer> conteoCartas = new HashMap<>();

        for (Carta carta : cartas) {
            ValorCartas valor = carta.getValor();
            conteoCartas.put(valor, conteoCartas.getOrDefault(valor, 0) + 1);
        }

        return conteoCartas;
    }

    private ValorCartas obtenerValorMayor(Map<ValorCartas, Integer> conteoCartas) {
        return conteoCartas.keySet().stream()
                .max((valor1, valor2) -> Integer.compare(valor1.ordinal(), valor2.ordinal()))
                .orElse(null);
    }

    public String determinarGanador(Jugada jugada1, Jugada jugada2) {
        if (jugada1.getTipo().equals(jugada2.getTipo())) {
            // Desempate por valor de carta
            if (jugada1.getValor().ordinal() > jugada2.getValor().ordinal()) {
                return "Ganador: Jugada 1 con " + jugada1.getTipo();
            } else {
                return "Ganador: Jugada 2 con " + jugada2.getTipo();
            }
        }
        
        // Comparar tipos de jugadas
        return compararTipoJugadas(jugada1, jugada2);
    }

    private String compararTipoJugadas(Jugada jugada1, Jugada jugada2) {
        if (jugada1.getTipo().equals(POKER)) {
            return "Ganador: Jugada 1 con " + POKER;
        } else if (jugada2.getTipo().equals(POKER)) {
            return "Ganador: Jugada 2 con " + POKER;
        } else if (jugada1.getTipo().equals(COLOR) && jugada2.getTipo().equals(TRIO)) {
            return "Ganador: Jugada 1 con " + COLOR;
        } else if (jugada1.getTipo().equals(TRIO) && jugada2.getTipo().equals(COLOR)) {
            return "Ganador: Jugada 2 con " + COLOR;
        } else {
            return "No hay un ganador";
        }
    }
}