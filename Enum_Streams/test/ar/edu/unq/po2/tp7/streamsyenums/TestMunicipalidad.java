package ar.edu.unq.po2.tp7.streamsyenums;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestMunicipalidad {

	public static void main(String[] args) {
		
			ActividadSemanal futJueves = new ActividadSemanal(DiaDeSemana.JUEVES, LocalTime.of(14, 30), 2, Deporte.FUTBOL);
			ActividadSemanal jabMartes = new ActividadSemanal(DiaDeSemana.MARTES, LocalTime.of(14, 30), 2, Deporte.JABALINA);
			ActividadSemanal jabLunes = new ActividadSemanal(DiaDeSemana.LUNES, LocalTime.of(14, 30), 4, Deporte.JABALINA);
			ActividadSemanal runMartes = new ActividadSemanal(DiaDeSemana.MARTES, LocalTime.of(14, 30), 2, Deporte.RUNNING);
			ActividadSemanal tenMiercoles = new ActividadSemanal(DiaDeSemana.MIERCOLES, LocalTime.of(14, 30), 2, Deporte.TENNIS);
			ActividadSemanal basSabado = new ActividadSemanal(DiaDeSemana.SABADO, LocalTime.of(14, 30), 2, Deporte.BASKET);
			ActividadSemanal futMier = new ActividadSemanal(DiaDeSemana.MIERCOLES, LocalTime.of(14, 30), 1, Deporte.FUTBOL);
			
			List<ActividadSemanal> actividades = Arrays.asList(futJueves, jabMartes, jabLunes, runMartes, tenMiercoles, basSabado, futMier);
			
			Municipio brown = new Municipio(actividades);
			
			 Map<Deporte, ActividadSemanal> actividadPorDeporte = brown.actividadMasBarata();
			
			 System.out.println("Tamaño de Lista: " + brown.getActividades().size());
			 System.out.println("Tamaño del Map: " + actividadPorDeporte.size());
			 for (Map.Entry<Deporte, ActividadSemanal> entry : actividadPorDeporte.entrySet()) {
		            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
		        }

	}

}
