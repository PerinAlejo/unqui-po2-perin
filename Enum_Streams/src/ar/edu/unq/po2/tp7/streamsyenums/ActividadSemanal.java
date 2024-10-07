package ar.edu.unq.po2.tp7.streamsyenums;

import java.time.LocalTime;

public class ActividadSemanal implements Comparable<ActividadSemanal>{

	DiaDeSemana dia;
	LocalTime horaInicio;
	int duracion;
	Deporte deporte;
	
	public ActividadSemanal(DiaDeSemana dia, LocalTime horaInicio, int duracion, Deporte deporte) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	public double getCosto() {
		return this.duracion * this.precioPorHora() + this.deporte.getComplejidad() * 200;
										
	}

	private int precioPorHora() {
		return this.dia.ordinal() < 3 ? 500 : 1000;
	}
	
	public Deporte getDeporte() {
		return this.deporte;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	@Override
	public int compareTo(ActividadSemanal actividad) {
        if (this.getCosto() < actividad.getCosto()) {
            return -1; 
        } else if (this.getCosto() > actividad.getCosto()) {
            return 1; 
        } else {
            return 0; 
        }
	}
	
	 @Override
	    public String toString() {
	        return "ActividadSemanal {" +
	                "dia=" + dia +
	                ", hora=" + horaInicio +
	                ", duracion=" + duracion + "hs" +
	                ", deporte=" + deporte +
	                ", costo=" + this.getCosto() +
	                '}';
	    }
}
