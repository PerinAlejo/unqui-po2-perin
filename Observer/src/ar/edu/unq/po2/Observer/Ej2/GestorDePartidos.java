package ar.edu.unq.po2.Observer.Ej2;

import java.util.List;

public class GestorDePartidos implements Subject {

	private List<Partido> partidos;
	private List<Observer> suscriptores;
	
	@Override
	public void agregarObserver(Observer o) {
		this.getSuscriptores().add(o);
	}

	@Override
	public void eliminarObserver(Observer o) {
		this.getSuscriptores().remove(o);
	}

	@Override
	public void notificarObserver(Partido partido) {
		for (Observer observer : suscriptores) {
            observer.actualizar(partido.getDeporte(), partido.getResultado(), partido.getContrincantes());
        }	
	}
	
	public void agregarPartido(Partido partido) {
		this.getPartidos().add(partido);
		this.notificarObserver(partido);
	}
	
	public List<Observer> getSuscriptores() {
		return suscriptores;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}
	
	

}
