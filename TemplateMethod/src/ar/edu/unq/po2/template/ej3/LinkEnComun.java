package ar.edu.unq.po2.template.ej3;

import java.util.List;

public class LinkEnComun extends Filtro {

	@Override
	public boolean esSimilar(WikipediaPage pageOne, WikipediaPage pageTwo) {
		List<WikipediaPage> pagesOne = pageOne.getLinks();
		List<WikipediaPage> pagesTwo = pageTwo.getLinks();
		
		return pagesOne.stream().anyMatch(page -> pagesTwo.contains(page));
	}

}
