package ar.edu.unq.po2.template.ej2;

public abstract class Empleado {
    protected String nombre;
    protected int hijos;
    protected boolean casado;

    public Empleado(String nombre, int hijos, boolean casado) {
        this.nombre = nombre;
        this.hijos = hijos;
        this.casado = casado;
    }

    // Método de plantilla
    public final double sueldo() {
        double sueldoBase = this.calcularSueldoBase();
        double plus = this.calcularPlus();
        double descuento = this.descuento(); // Descuento del 13%
        return sueldoBase + plus - descuento;
    }
    
    private double descuento() {
    	return calcularSueldoBase() * 0.13;
    }

    protected abstract double calcularSueldoBase(); // Método abstracto
    protected abstract double calcularPlus(); // Método abstracto
}