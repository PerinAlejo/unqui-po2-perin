package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	private List<Integer> numList;
	
    public Multioperador(ArrayList<Integer> numeros) {
        this.numList = new ArrayList<>(numeros);
    }
	
	public int sumar() {
		int total = 0;
		for (int x : numList) {
			total += x;
		}
		
		return total;
	}
	
	public int restar() {
		int total = numList.get(0);
		for (int i = 1; i < numList.size(); i++) {
			total -= numList.get(i);
		}
		
		return total;
	}
	
	public int multiplicar() {
		int total = 1;
		for (int x : numList) {
			total *= x;
		}
		
		return total;
	}
	
	// Método principal para probar la clase
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        Multioperador operador = new Multioperador(numeros);

        System.out.println("Suma: " + operador.sumar());        			// Salida: 9
        System.out.println("Resta: " + operador.restar());      			// Salida: -5 (2 - 3 - 4)
        System.out.println("Multiplicación: " + operador.multiplicar()); 	// Salida: 24 (2 * 3 * 4)
    }
}

