package ar.edu.unq.po2.template.ej3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MismaLetraInicialTest {

	@Test
    void testMismaLetraInicial() {
        WikipediaPage bernal = new MockWikipediaPage("Bernal");
        WikipediaPage quilmes = new MockWikipediaPage("Quilmes");
        WikipediaPage buenosAires = new MockWikipediaPage("Buenos Aires");
        
        List<WikipediaPage> paginas = Arrays.asList(bernal, quilmes, buenosAires);

        MismaLetraInicial filtro = new MismaLetraInicial();
        List<WikipediaPage> similares = filtro.getSimilarPages(bernal, paginas);
        
        assertTrue(similares.contains(bernal));
        assertFalse(similares.contains(quilmes));
        assertTrue(similares.contains(buenosAires));
    }
}
