package model;
import java.util.ArrayList;

public class Empresa {
	
	    private String nombre;
	    private String cuit;
	    private ArrayList<Empleado> empleados = new ArrayList<>();

	    public Empresa(String nombre, String cuit, ArrayList<Empleado> empleados){
	        this.nombre = nombre;
	        this.cuit = cuit;
	        this.empleados = empleados;
	    }


	    public int totalSueldoBruto() {
	    	int sueldoBruto = 0;
	        for (Empleado empleado : empleados) {
	            sueldoBruto += empleado.sueldoBruto();
	        }
	        return sueldoBruto;
	    }

	    public int totalSueldoNeto() {
	        int sueldoNeto = 0;
	    	for (Empleado empleado : empleados) {
	            sueldoNeto += empleado.sueldoNeto();
	        }
	        return sueldoNeto;
	    }

	    public int totalRetenciones() {
	    	int retenciones = 0;
	        for (Empleado empleado : empleados) {
	            retenciones += empleado.retenciones();
	        }
	        return retenciones;
	    }

	    public void liquidarSueldo() {
	        for (Empleado empleado : empleados) {
	            empleado.setRecibo(new ReciboSueldo(empleado));
	        }
	    }
	}
