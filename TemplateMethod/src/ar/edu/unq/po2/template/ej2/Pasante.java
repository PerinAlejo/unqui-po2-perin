package ar.edu.unq.po2.template.ej2;

public class Pasante extends Empleado {
    private double horasTrabajadas;

    public Pasante(String nombre, int hijos, boolean casado, double horasTrabajadas) {
        super(nombre, hijos, casado);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected double calcularSueldoBase() {
        return horasTrabajadas * 40; // $40 por hora trabajada
    }

    @Override
    protected double calcularPlus() {
        return 0; // No tiene plus
    }
}