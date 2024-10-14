package ar.edu.unq.po2.stateAndStrategy.ej2;

public class MaquinaJuego {

	GameState estado;
	int cantFichas;
	
	public MaquinaJuego() {
		this.estado = new Apagado();
	}
	
	public String estadoActual() {
		return this.estado.accion();
	}
	
	public void botonInicio(){
		this.estado.next(this);
	}
	
	public void insertarFichas() {
		this.cantFichas++;
	}
	
	public void setEstado(GameState estado) {
		this.estado = estado;
	}

	public int getFichas() {
		return this.cantFichas;
	}
	
	public static void main(String[] args) {
		
		MaquinaJuego maquina = new MaquinaJuego(); 
		System.out.println(maquina.estadoActual());
		maquina.botonInicio();
		System.out.println(maquina.estadoActual());
		maquina.insertarFichas();
		maquina.botonInicio();
		System.out.println(maquina.estadoActual());
		maquina.botonInicio();
		System.out.println(maquina.estadoActual());
		 
	}
	
	
}
