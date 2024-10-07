package ar.edu.unq.po2.tp7.streamsyenums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Municipio {

	private List<ActividadSemanal> actividades = new ArrayList<>();
	private Stream<ActividadSemanal> streamActividades; 
	
	public Municipio(List<ActividadSemanal> actividades) {
		this.actividades = actividades;
		streamActividades = actividades.stream();
	}
	
	public List<ActividadSemanal> getActividades() {
		return actividades;
	}
	
	public List<ActividadSemanal> actividadesFutbol() {
		return streamActividades.filter(a -> a.getDeporte() == Deporte.FUTBOL).toList();
	}
	
	public int horasTotales() {
		return streamActividades.mapToInt(a -> a.getDuracion()).sum();
	}
	
	public List<ActividadSemanal> actividadesConComplejidad(int complejidad) {
		return streamActividades.filter(a -> a.getDeporte().getComplejidad() == complejidad).toList();
	}
	
	public Optional<ActividadSemanal> actividadDeMenorCosto(Deporte deporte) {
		return streamActividades.filter(a ->  a.getDeporte() == deporte).min(ActividadSemanal :: compareTo);
	//	return streamActividades.filter(a ->  a.getDeporte() == deporte).min(Comparator.comparingInt(ActividadSemanal::getCosto)); //Otra Opcion
	}
	
	 public Map<Deporte, ActividadSemanal> actividadMasBarata() {
	        return streamActividades.collect(Collectors.toMap
	        		(ActividadSemanal :: getDeporte, 
	        				Function.identity(), (a1,a2) -> a1.getCosto() < a2.getCosto() ? a1 :a2));
	    }
   
	
}
