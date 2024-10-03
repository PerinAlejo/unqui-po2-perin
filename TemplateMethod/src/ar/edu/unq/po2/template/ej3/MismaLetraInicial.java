package ar.edu.unq.po2.template.ej3;

public class MismaLetraInicial extends Filtro {

	@Override
	public boolean esSimilar(WikipediaPage pageOne, WikipediaPage pageTwo) {
		char charOne = pageOne.getTitle().charAt(0); 
		char charTwo = pageTwo.getTitle().charAt(0); 
		return charOne == charTwo;
	}

}

