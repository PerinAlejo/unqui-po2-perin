package ar.edu.unq.po2.Observer.Ej1;

import java.util.ArrayList;
import java.util.List;

public class SistemaPublicacion implements Observable {

	private List<Observer> listaSuscriptores;
	private List<Articulo> listaArticulos;
	
	public SistemaPublicacion() {
	    listaSuscriptores = new ArrayList<>();
	    listaArticulos = new ArrayList<>();
	}
	
	public void agregarArticulo(Articulo articulo) {
		listaArticulos.add(articulo);
		this.notifyObservers(articulo);
	}

	@Override
	public void removeObserver(Observer observer) {
		listaSuscriptores.remove(observer);

	}

	@Override
	public void notifyObservers(Articulo articulo) {
		listaSuscriptores.stream().forEach(suscriptor -> suscriptor.update(articulo));

	}

	@Override
	public void registerObserver(Observer observer) {
		listaSuscriptores.add(observer);
		
	}

}
