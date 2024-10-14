package ar.edu.unq.po2.stateAndStrategy.ej1;

public enum Vocales {

	A('a', 'e', 'u'),
    E('e', 'i', 'a'),
    I('i', 'o', 'e'),
    O('o', 'u', 'i'),
    U('u', 'a', 'o');
	
	private char actual;
    private char siguiente;
    private char previa;
	
    Vocales(char actual, char siguiente, char previa) {
        this.actual = actual;
        this.siguiente = siguiente;
        this.previa = previa;
    }
   
    public static char vocalSiguiente(char c) {
        for (Vocales vocal : Vocales.values()) {
            if (vocal.actual == c) {
                return vocal.siguiente;
            }
        }
        
        return c;
    }
    
    public static char vocalAnterior(char c) {
        for (Vocales vocal : Vocales.values()) {
            if (vocal.actual == c) {
                return vocal.previa;
            }
        }
        
        return c;
    }
    
}
