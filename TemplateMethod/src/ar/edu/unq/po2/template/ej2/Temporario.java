package ar.edu.unq.po2.template.ej2;

public class Temporario extends Empleado {
    private double horasTrabajadas;

    public Temporario(String nombre, int hijos, boolean casado, double horasTrabajadas) {
        super(nombre, hijos, casado);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected double calcularSueldoBase() {
        return (horasTrabajadas * 5) + 1000; // $5 por hora más sueldo básico
    }

    @Override
    protected double calcularPlus() {
        return casado || hijos > 0 ? 100 : 0; // Plus por hijos o estado civil
    }
}