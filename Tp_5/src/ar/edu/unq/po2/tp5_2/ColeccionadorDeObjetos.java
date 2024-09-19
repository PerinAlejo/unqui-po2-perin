package ar.edu.unq.po2.tp5_2;

import java.util.Collection;
import java.util.List;

/*Teniendo en cuenta el funcionamiento y protocolo de Collection, List, ArrayList y LinkedList
 * Considere la siguiente clase: 

public class ColeccionadorDeObjetos {

	public getFirstFrom(XXX collection) {
		return collection.get(0);
	}
	
	public void addLast(Object element, YYY collection) {
		collection.add(element);
	}
	
	public Collection getSubCollection(ZZZ collection, int from, int to) {
		return collection.subList(from,to);
	}
	
	public Boolean containsElement (WWW collection, Object element) {
		return collection.contains(element);
	}
}
	
	Como notar, los tipos de las colecciones no estan definidos. ¿Que ocurrira 
	si utiliza en lugar de XXX, YYY, WWW, ZZZ las clases e interfaces recientemente estudiadas */
	
public class ColeccionadorDeObjetos {

    // Método para obtener el primer elemento de una List
    public Object getFirstFrom(List<?> collection) {
        return collection.get(0);
    }

    // Método para añadir un elemento al final de una List
    public void addLast(Object element, List<Object> collection) {
        collection.add(element);
    }

    // Método para obtener una sublista de una List
    public List<?> getSubCollection(List<?> collection, int from, int to) {
        return collection.subList(from, to);
    }

    // Método para verificar si un elemento está en una Collection
    public Boolean containsElement(Collection<?> collection, Object element) {
        return collection.contains(element);
    }
}

/*
Resumen
	getFirstFrom: Debe utilizar List porque solo las listas tienen un método get(int index).
	addLast: Puede usar List para agregar elementos al final de la colección.
	getSubCollection: Debe utilizar List porque subList es un método de List.
	containsElement: Puede usar Collection porque contains está definido en Collection.
Si se usan implementaciones específicas como ArrayList o LinkedList, los métodos seguirán funcionando sin 
problemas ya que ambas implementaciones son subclases de List.
 * */
 