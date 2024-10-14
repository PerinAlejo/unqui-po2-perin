package ar.edu.unq.po2.Observer.Ej1;

import java.util.List;

public class Criterio {
	
	private String tipoArticulo;
	private String lugarPublicacion;
	private List<String> palabrasClaves;
	
	 public Criterio(String tipoArticulo, String lugarPublicacion, List<String> palabrasClaves) {
	        this.tipoArticulo = tipoArticulo;
	        this.lugarPublicacion = lugarPublicacion;
	        this.palabrasClaves = palabrasClaves;
	}
	
	public boolean esDeInteres(Articulo articulo) {
		return 	this.contienePalabrasClaves(articulo) ||
				this.tipoArticulo(articulo) ||
				this.lugarDePublicacion(articulo);
	}
	
	private boolean contienePalabrasClaves(Articulo articulo) {
		return articulo.getPalabrasClaves().stream().anyMatch(this.palabrasClaves::contains);			
	}
	
	private boolean lugarDePublicacion(Articulo articulo) {
		return this.lugarPublicacion.equals(articulo.getLugarPublicacion());
	}
	
	private boolean tipoArticulo(Articulo articulo) {
		return this.tipoArticulo.equals(articulo.getTipo());
	}
	
}
