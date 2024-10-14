package ar.edu.unq.po2.stateAndStrategy.ej1;

import java.util.ArrayList;
import java.util.List;

public class CambioVocal implements TipoDeEncripcion {

	
	@Override
	public String encriptar(String input) {
        StringBuilder resultado = new StringBuilder();

        for (char c : input.toCharArray()) {
            
            if ("aeiouAEIOU".indexOf(c) != -1) {
                
                if (Character.isLowerCase(c)) {
                    resultado.append(Vocales.vocalSiguiente(c));
                } else {
                    resultado.append(Character.toUpperCase(Vocales.vocalSiguiente(Character.toLowerCase(c))));
                }
            } else {
                
                resultado.append(c);
            }
        }

        return resultado.toString();
    }

	@Override
	public String desencriptar(String input) {
		StringBuilder resultado = new StringBuilder();

        for (char c : input.toCharArray()) {
            
            if ("aeiouAEIOU".indexOf(c) != -1) {
                
                if (Character.isLowerCase(c)) {
                    resultado.append(Vocales.vocalAnterior(c));
                } else {
                    resultado.append(Character.toUpperCase(Vocales.vocalAnterior(Character.toLowerCase(c))));
                }
            } else {
                
                resultado.append(c);
            }
        }

        return resultado.toString();
	}
	
	public static void main(String[] args) {
		
		TipoDeEncripcion encriptador = new CambioVocal();
		
		String palabra = "Diego";
        String codificado = encriptador.encriptar(palabra);
        System.out.println("Codificado: " + codificado);
        
        String desencriptado = encriptador.desencriptar(codificado);
        System.out.println("Decodificado: " + desencriptado);
		
	}
	
}
