package ar.edu.unq.po2.Observer.Ej2;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil implements Observer {
    private String usuario;
    private List<String> deportesInteresados;
    private List<String> contrincantesInteresados;
    private GestorDePartidos gestor;

    public AplicacionMovil(String usuario, GestorDePartidos gestor) {
        this.usuario = usuario;
        this.deportesInteresados = new ArrayList<>();
        this.contrincantesInteresados = new ArrayList<>();
        this.gestor = gestor;
    }

    public void suscribirDeporte(String deporte) {
        deportesInteresados.add(deporte);
        gestor.agregarObserver(this);  // Suscribirse al gestor
    }

    public void suscribirContrincante(String contrincante) {
        contrincantesInteresados.add(contrincante);
        gestor.agregarObserver(this);  // Suscribirse al gestor
    }

    public void desuscribirDeporte(String deporte) {
        deportesInteresados.remove(deporte);
        if (deportesInteresados.isEmpty() && contrincantesInteresados.isEmpty()) {
            gestor.eliminarObserver(this);  // Desuscribirse si ya no le interesa nada
        }
    }

    public void desuscribirContrincante(String contrincante) {
        contrincantesInteresados.remove(contrincante);
        if (deportesInteresados.isEmpty() && contrincantesInteresados.isEmpty()) {
            gestor.eliminarObserver(this);  // Desuscribirse si ya no le interesa nada
        }
    }

    @Override
    public void actualizar(String deporte, String resultado, List<String> contrincantes) {
        boolean deporteCoincide = deportesInteresados.contains(deporte);
        boolean contrincanteCoincide = contrincantes.stream().anyMatch(contrincantesInteresados::contains);

        if (deporteCoincide || contrincanteCoincide) {
            System.out.println("App " + usuario + " recibió actualización:");
            System.out.println("Deporte: " + deporte + ", Resultado: " + resultado + ", Contrincantes: " + contrincantes);
        }
    }
}