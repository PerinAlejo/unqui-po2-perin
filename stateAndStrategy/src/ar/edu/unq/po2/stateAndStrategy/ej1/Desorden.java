package ar.edu.unq.po2.stateAndStrategy.ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Desorden implements TipoDeEncripcion{
	
	Map<String,String> cadenasEncriptadas = new HashMap<>();

	@Override
	public String encriptar(String input) {
		
		// Convertir la cadena en una lista de caracteres
        List<Character> caracteres = new ArrayList<>();
        for (char c : input.toCharArray()) {
            caracteres.add(c);
        }
		
        Collections.shuffle(caracteres);
        
        // Convertir la lista de caracteres de nuevo en una cadena
        StringBuilder result = new StringBuilder(caracteres.size());
        for (char c : caracteres) {
            result.append(c);
        }
        
        cadenasEncriptadas.put(result.toString(), input);
        
        return result.toString();
	}
	
	public String desencriptar(String input) {
	    String original = cadenasEncriptadas.get(input);
	    if (original == null) {
	        return "Cadena no encontrada o no encriptada previamente.";
	    }
	    return original;
	}

	
}
