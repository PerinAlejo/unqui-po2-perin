package model;
import java.time.LocalDate;
import java.time.Period;

abstract public class Empleado {
	
	 private String nombre;
	    private String direccion;
	    private String estadoCivil;
	    private LocalDate fechaNac;
	    private int sueldoBasico;
	    private ReciboSueldo recibo;

	    public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, int sueldoBasico) {
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.estadoCivil = estadoCivil;
	        this.fechaNac = fechaNac;
	        this.sueldoBasico = sueldoBasico;
	    }
	    
	    public String getDireccion() {
	    	return this.direccion;
	    }
	    
	    public String getNombre() {
	    	return this.nombre;
	    }
	    
	    public int getSueldoBasico() {
	    	return this.sueldoBasico;
	    }
	    
	    public String getEstadoCivil() {
	    	return this.estadoCivil;
	    }
	    
	    public void setRecibo(ReciboSueldo recibo) {
	    	this.recibo = recibo;
	    }

	    public int edad() {
	    	LocalDate fechaActual = LocalDate.now();
	        return Period.between(fechaNac, fechaActual).getYears();
	    }
	    

	    public int sueldoNeto() {
	    	return this.sueldoBruto() - this.retenciones();
	    }
	    
	    abstract public int sueldoBruto();
	    
	    abstract public int retenciones();
	    
	    abstract public int aportesObraSocial();
	    
	    abstract public int aportesJubilatorios();
	    
}
