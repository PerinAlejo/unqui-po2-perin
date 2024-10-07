package ar.edu.unq.po2.mockito;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class PokerStatus {

	public String verificar(String string1, String string2, String string3, String string4, String string5) {
        // Mapa para contar cuántas veces aparece cada cadena
        Map<String, Integer> conteo = new HashMap<>();

        // Agregamos las cadenas al map 
        String[] strings = {string1, string2, string3, string4, string5};
        for (String s : strings) {
        	if(s.substring(0,2).equals("10")) {
        		String carta = s.substring(0,2);
        		conteo.put(carta, conteo.getOrDefault(carta, 0) + 1);
        	} else {
        		String carta = s.substring(0,1);
        		conteo.put(carta, conteo.getOrDefault(carta, 0) + 1);
        	}
        	
        }

        // Verificamos si alguna cadena aparece 4 o más veces
        for (int cantidad : conteo.values()) {
            if (cantidad >= 4) {
                return "Poker"; // Si encontramos una cadena que aparece 4 o más veces
        }

        return false; // Si no hay ninguna cadena con 4 o más apariciones
    }

}
