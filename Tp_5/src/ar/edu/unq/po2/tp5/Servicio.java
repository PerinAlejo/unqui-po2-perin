package ar.edu.unq.po2.tp5;

public class Servicio extends Factura{
	
	private double costoPorUnidad;
    private int cantidadConsumida;

    public Servicio(double costoPorUnidad, int cantidadConsumida) {
        super(0);
        this.costoPorUnidad = costoPorUnidad;
        this.cantidadConsumida = cantidadConsumida;
    }

    @Override
    public double calcularMonto() {
        this.monto = costoPorUnidad * cantidadConsumida;
        return this.monto;
    }
}