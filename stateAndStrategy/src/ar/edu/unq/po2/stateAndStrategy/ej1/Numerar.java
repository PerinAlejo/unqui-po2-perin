package ar.edu.unq.po2.stateAndStrategy.ej1;

public class Numerar implements TipoDeEncripcion {

	@Override
	public String encriptar(String input) {
		StringBuilder resultado = new StringBuilder();

        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                
                int valorNumerico = c - 'a' + 1;
                resultado.append(valorNumerico);
            } else if (c == ' ') {
                
                resultado.append(0);
            }

            
            resultado.append(",");
        }

        
        if (resultado.length() > 0) {
            resultado.setLength(resultado.length() - 1);
        }

        return resultado.toString();
	}

	@Override
	public String desencriptar(String input) {
		 StringBuilder resultado = new StringBuilder();
	        String[] numeros = input.split(",");

	        for (String numeroStr : numeros) {
	            int numero = Integer.parseInt(numeroStr.trim());
	            if (numero == 0) {
	                resultado.append(" "); 
	            } else if (numero >= 1 && numero <= 26) {
	                
	                char letra = (char) ('a' + numero - 1);
	                resultado.append(letra);
	            }
	        }

	        return resultado.toString();
	}

}
