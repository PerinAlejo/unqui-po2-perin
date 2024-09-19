package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Agencia{
	
	 private ArrayList<Producto> productos;
	    private double total;

	    public Caja() {
	        productos = new ArrayList<>();
	        total = 0.0;
	    }

	    public void agregarProducto(Producto p, int cantidad) {
	        if (p.getStock() >= cantidad) {
	            p.decrementarStock(cantidad);
	            total += p.getPrecio() * cantidad;
	            productos.add(p);
	        } else {
	            System.out.println("No hay suficiente stock para " + p.getNombre());
	        }
	    }

	    public double getTotal() {
	        return total;
	    }
	    
	    @Override
	    public void registrarPago(Factura factura) {
	        double montoFactura = factura.calcularMonto();
	        total += montoFactura;
	    }
	}

