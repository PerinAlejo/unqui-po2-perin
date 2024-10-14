package ar.edu.unq.po2.Observer.Ej1;

import java.util.List;

public class Articulo {

	private String titulo;
	private List<Investigador> autores;
	private List<String> filiaciones;
	private String tipo;
	private String lugarPublicacion;
	private List<String> palabrasClaves;
	
	public Articulo(String titulo, List<Investigador> autores, List<String> filiaciones, String tipo, String lugarPublicacion, List<String> palabrasClaves) {
	    this.titulo = titulo;
	    this.autores = autores;
	    this.filiaciones = filiaciones;
	    this.tipo = tipo;
	    this.lugarPublicacion = lugarPublicacion;
	    this.palabrasClaves = palabrasClaves;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public List<Investigador> getAutores() {
		return autores;
	}
	
	public List<String> getFiliaciones() {
		return filiaciones;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getLugarPublicacion() {
		return lugarPublicacion;
	}
	
	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}
	
}
