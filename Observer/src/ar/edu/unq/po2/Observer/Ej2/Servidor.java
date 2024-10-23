package ar.edu.unq.po2.Observer.Ej2;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements Observer {
    
	private String nombre;
    private List<String> deportesInteresados;
    private GestorDePartidos gestor; // Mantener una referencia al gestor

    public Servidor(String nombre, GestorDePartidos gestor) {
        this.nombre = nombre;
        this.deportesInteresados = new ArrayList<>();
        this.gestor = gestor;
    }

    public void suscribirDeporte(String deporte) {
        deportesInteresados.add(deporte);
        gestor.agregarObserver(this);  // Suscribirse al gestor
    }

    public void desuscribirDeporte(String deporte) {
        deportesInteresados.remove(deporte);
        if (deportesInteresados.isEmpty()) {
            gestor.eliminarObserver(this);  // Desuscribirse si no hay más deportes de interés
        }
    }

    @Override
    public void actualizar(String deporte, String resultado, List<String> contrincantes) {
        if (deportesInteresados.contains(deporte)) {
            System.out.println("Servidor " + nombre + " recibió actualización:");
            System.out.println("Deporte: " + deporte + ", Resultado: " + resultado + ", Contrincantes: " + contrincantes);
        }
    }
}
