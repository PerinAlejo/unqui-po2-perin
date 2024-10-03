package ar.edu.unq.po2.template.ej3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockWikipediaPage implements WikipediaPage {
    private String title;
    private List<WikipediaPage> links;
    private Map<String, WikipediaPage> infobox;

    public MockWikipediaPage(String title) {
        this.title = title;
        this.links = new ArrayList<>();
        this.infobox = new HashMap<>();
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public List<WikipediaPage> getLinks() {
        return this.links;
    }

    @Override
    public Map<String, WikipediaPage> getInfobox() {
        return this.infobox;
    }

    // Métodos para agregar links e infobox para simular una página real
    public void addLink(WikipediaPage page) {
        this.links.add(page);
    }

    public void addInfoboxProperty(String key, WikipediaPage page) {
        this.infobox.put(key, page);
    }
}
