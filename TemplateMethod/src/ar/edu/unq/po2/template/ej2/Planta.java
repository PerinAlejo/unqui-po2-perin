package ar.edu.unq.po2.template.ej2;

public class Planta extends Empleado {
    public Planta(String nombre, int hijos, boolean casado) {
        super(nombre, hijos, casado);
    }

    @Override
    protected double calcularSueldoBase() {
        return 3000; // Sueldo básico de planta
    }

    @Override
    protected double calcularPlus() {
        return hijos * 150; // Plus por cada hijo
    }
}