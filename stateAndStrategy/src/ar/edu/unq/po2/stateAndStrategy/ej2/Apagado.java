package ar.edu.unq.po2.stateAndStrategy.ej2;

public class Apagado implements GameState {

	@Override
	public void next(MaquinaJuego maquina) {
		maquina.setEstado(new InserteFichas());
	}

	@Override
	public String accion() {	
		return "Preciona el boton de Inicio";
	}

}
