package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura{
	
	private double tasaDeServicio;
   
    public Impuesto(double tasa) {
        super(0);
        this.tasaDeServicio = tasa;
        
    }

    @Override
    public double calcularMonto() {
        this.monto = this.tasaDeServicio;
        return this.monto;
    }
}