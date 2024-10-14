package ar.edu.unq.po2.stateAndStrategy.ej1;

public class EncriptadorNaive {

	private TipoDeEncripcion tipoEncriptado; 
	
	
	public EncriptadorNaive() {
		this.tipoEncriptado = new Desorden();
	}
	
	public String encriptar(String input) {
		return tipoEncriptado.encriptar(input);
	}
	
	public String desencriptar(String input) {
		return tipoEncriptado.desencriptar(input);
	}
	
	public void setTipoEncriptado(TipoDeEncripcion encriptado) {
		this.tipoEncriptado = encriptado;
	}
	
	public static void main(String[] args) {
		
		EncriptadorNaive encriptador = new EncriptadorNaive();
		encriptador.setTipoEncriptado(new CambioVocal());
		
		String palabra = "Diego";
        String codificado = encriptador.encriptar(palabra);
        System.out.println("Codificado: " + codificado);
        
        String desencriptado = encriptador.desencriptar(codificado);
        System.out.println("Decodificado: " + desencriptado);
		
	}
	
}
