package ar.edu.unq.po2.Observer.Ej2;

public interface Subject {

	void agregarObserver(Observer o);
	void eliminarObserver(Observer o);
	void notificarObserver(Partido Partido);
	
}
