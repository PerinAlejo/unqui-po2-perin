package ar.edu.unq.po2.template.ej3;

import java.util.Set;
import java.util.stream.Collectors;

public class PropiedadEnComun extends Filtro {

	@Override
	public boolean esSimilar(WikipediaPage pageOne, WikipediaPage pageTwo) {
		
        Set<WikipediaPage> propiedadesOne = pageOne.getInfobox().values().stream().collect(Collectors.toSet());
        Set<WikipediaPage> propiedadesTwo = pageTwo.getInfobox().values().stream().collect(Collectors.toSet());
        return propiedadesOne.stream().anyMatch(propiedadesTwo::contains);
	}

}
