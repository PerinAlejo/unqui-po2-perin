package ar.edu.unq.po2.adapter.ej7;

import javax.swing.DefaultListModel;


public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel<String> {
    private ListaDePalabrasOrdenadas lista;

    public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas lista) {
        this.lista = lista;
    }

    @Override
    public void addElement(String string) {
        lista.agregarPalabra(string);  // Agregar a la lista ordenada
        super.addElement(string);  // Agregar al modelo

        // Para asegurarnos de que el modelo de lista esté ordenado, se debe vaciar y volver a llenar
        this.clear();  // Limpiar el modelo de lista actual
        for (int i = 0; i < lista.cantidadDePalabras(); i++) {
            super.addElement(lista.getPalabraDePosicion(i));  // Agregar las palabras ordenadas al modelo
        }
    }
    
    public String getPalabraDePosicion(int posicion) {
        return lista.getPalabraDePosicion(posicion);
    }

    public Integer cantidadDePalabras() {
        return lista.cantidadDePalabras();
    }
}
