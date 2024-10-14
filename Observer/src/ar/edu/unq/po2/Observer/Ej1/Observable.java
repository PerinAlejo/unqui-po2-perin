package ar.edu.unq.po2.Observer.Ej1;

public interface Observable {

	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(Articulo articulo);
	
}
