package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	Point tamaño;
	
	public Rectangulo(int base, int altura) {
		this.tamaño = new Point(base, altura);
	
	}
	
	public int area() {
		return tamaño.getX() * tamaño.getY();
	}
	
	public int perimetro() {
		return 2 * tamaño.getX() + 2 * tamaño.getY();
	}
	
	public String posicion() {
		return tamaño.getX() > tamaño.getY() ? "es Horizontal" : "es Vertical";
	}

}
