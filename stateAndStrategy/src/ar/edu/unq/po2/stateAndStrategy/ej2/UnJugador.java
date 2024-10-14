package ar.edu.unq.po2.stateAndStrategy.ej2;

public class UnJugador implements GameState {

	@Override
	public void next(MaquinaJuego maquina) {
		maquina.setEstado(new InserteFichas());
	}

	@Override
	public String accion() {
		// TODO Auto-generated method stub
		return "Modo un Jugador";
	}

}
