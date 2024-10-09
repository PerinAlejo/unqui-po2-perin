package ar.edu.unq.po2.mockito.ej3;

public class Jugada {
    private String tipo;
    private ValorCartas valor;

    public Jugada(String tipo, ValorCartas valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public ValorCartas getValor() {
        return valor;
    }
}