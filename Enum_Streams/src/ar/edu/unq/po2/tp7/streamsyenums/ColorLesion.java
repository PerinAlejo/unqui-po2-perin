package ar.edu.unq.po2.tp7.streamsyenums;

public enum ColorLesion {
	
	ROJO("Lesión en fase inicial", 1) {
		@Override
		public ColorLesion proximo() {
			return GRIS;
		}
	},GRIS("Lesión en fase intermedia", 2){
		@Override
		public ColorLesion proximo() {
			return AMARILLO;
		}
	},AMARILLO("Lesión en fase avanzada", 3){
		@Override
		public ColorLesion proximo() {
			return MIEL;
		}
	},MIEL("Lesión en fase final", 4){
		@Override
		public ColorLesion proximo() {
			return ROJO;
		}
	};
	
	String descripcion;
	int nivelRiesgo;
	
	ColorLesion (String desc, int riesgo) {
		this.descripcion = desc;
		this.nivelRiesgo = riesgo;
	}
	
	public String getDescripcion() {
        return descripcion;
    }

    public int getNivelRiesgo() {
        return nivelRiesgo;
    }
	
	public abstract ColorLesion proximo();
	
	
}
