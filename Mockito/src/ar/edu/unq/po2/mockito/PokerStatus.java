package ar.edu.unq.po2.mockito;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class PokerStatus {

    private static final String POKER = "Poker";
    private static final String TRIO = "Trio";
    private static final String COLOR = "Color";
    private static final String NADA = "Nada";

    public String verificar(String string1, String string2, String string3, String string4, String string5) {
        String[] cartas = { string1, string2, string3, string4, string5 };

        Map<String, Integer> conteoCartas = obtenerCartas(cartas);
        Map<Character, Integer> conteoPalos = obtenerPalos(cartas);

        if (hayPoker(conteoCartas)) {
            return POKER;
        } else if (hayTrio(conteoCartas)) {
            return TRIO;
        } else if (hayColor(conteoPalos)) {
            return COLOR;
        } else {
            return NADA;
        }
    }

    private boolean hayPoker(Map<String, Integer> conteoCartas) {
        return conteoCartas.values().contains(4);
    }

    private boolean hayColor(Map<Character, Integer> conteoPalos) {
        return conteoPalos.values().contains(5);
    }

    private boolean hayTrio(Map<String, Integer> conteoCartas) {
        return conteoCartas.values().contains(3);
    }

    private Map<Character, Integer> obtenerPalos(String[] cartas) {
        Map<Character, Integer> conteoPalos = new HashMap<>();

        for (String carta : cartas) {
            char palo = carta.charAt(carta.length() - 1);
            conteoPalos.put(palo, conteoPalos.getOrDefault(palo, 0) + 1);
        }

        return conteoPalos;
    }

    private Map<String, Integer> obtenerCartas(String[] cartas) {
        Map<String, Integer> conteoCartas = new HashMap<>();

        for (String carta : cartas) {
            // Obtiene el valor de la carta: 2, 10, J, etc.
            String valor = carta.length() == 3 ? carta.substring(0, 2) : carta.substring(0, 1);
            conteoCartas.put(valor, conteoCartas.getOrDefault(valor, 0) + 1);
        }

        return conteoCartas;
    }
}
