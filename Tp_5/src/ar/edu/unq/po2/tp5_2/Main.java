package ar.edu.unq.po2.tp5_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Nombreable> lista = new ArrayList<>();
		
		Mascota perro = new Mascota("Noah", "Perro");
		Mascota gato = new Mascota("Peich", "Gato");
		Persona lirin = new Persona("Lirin", LocalDate.of(2003, 9, 29));
		Persona alejo = new Persona("Alejo", LocalDate.of(2003, 5, 27));
		
		lista.add(alejo);
		lista.add(lirin);
		lista.add(perro);
		lista.add(gato);
		
		for(Nombreable nom : lista) {
			System.out.println(nom.getNombre());
		}

	}

}
