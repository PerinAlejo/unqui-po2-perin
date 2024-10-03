package ar.edu.unq.po2.template.ej3;

import java.util.List;
import java.util.stream.Stream;

public abstract class Filtro {
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page,List<WikipediaPage> wikipedia){
		Stream<WikipediaPage> wikipediaPages= wikipedia.stream();
		return wikipediaPages.filter(pageTwo -> this.esSimilar(page, pageTwo)).toList();
		
	}
	
	public abstract boolean esSimilar(WikipediaPage pageOne, WikipediaPage pageTwo);
	
}

