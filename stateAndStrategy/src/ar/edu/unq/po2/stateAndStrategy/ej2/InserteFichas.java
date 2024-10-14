package ar.edu.unq.po2.stateAndStrategy.ej2;

public class InserteFichas implements GameState {

	@Override
	public void next(MaquinaJuego maquina) {
		if(maquina.getFichas() == 1) {
			maquina.setEstado(new UnJugador());
		} else if (maquina.getFichas() > 1){
			maquina.setEstado(new DosJugadores());
		} 
	}

	@Override
	public String accion() {
		return "Inserte Fichas";
	}

}
