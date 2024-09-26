package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes; 
	private List<SolicitudCredito> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<>();
		this.solicitudes = new ArrayList<>();
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void addSolicitudCredito(SolicitudCredito solicitud) {
        if (solicitud.evaluar()) {
            this.solicitudes.add(solicitud);
            System.out.println("Solicitud aceptada y agregada al banco.");
        } else {
            System.out.println("Solicitud rechazada.");
        }
    }
	
	public double montoADesembolsar() {
		double total = 0;
        for (SolicitudCredito solicitud : solicitudes) {
            total += solicitud.getMonto();
        }
        return total;
	}

	public List<SolicitudCredito> getSolicitudes() {
		return this.solicitudes;
	}
	
	public List<Cliente> getClientes() {
		return this.clientes;
	}
	
	
	
}
