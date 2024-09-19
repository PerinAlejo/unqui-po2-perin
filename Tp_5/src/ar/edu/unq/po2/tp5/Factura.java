package ar.edu.unq.po2.tp5;

public abstract class Factura {
    protected double monto;

    public Factura(double monto) {
        this.monto = monto;
    }

    public abstract double calcularMonto();
    
    public double getMonto() {
        return monto;
    }
}