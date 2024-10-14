package ar.edu.unq.po2.Observer.Ej1;

public class Investigador implements Observer {
	
	private String nuevoArticulo;
	private Criterio criterio;
	private String nombre;	
	
	public Investigador(String nombre, Criterio criterio) {
        this.nombre = nombre;
        this.criterio = criterio;
    }
	
	public String getNuevoArticulo() {
		return nuevoArticulo;
	}

	public void suscribirse(SistemaPublicacion sistema) {
		sistema.registerObserver(this);
	}
	
	@Override
	public void update(Articulo articulo) {
		
		if(criterio.esDeInteres(articulo)) {
			this.nuevoArticulo = "Se publico un nuevo Articulo:" + articulo.getTitulo();
		}
	}

}
