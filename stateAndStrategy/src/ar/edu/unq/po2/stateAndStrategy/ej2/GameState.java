package ar.edu.unq.po2.stateAndStrategy.ej2;

public interface GameState {

	public void next(MaquinaJuego maquina);
	
	public String accion();
}
