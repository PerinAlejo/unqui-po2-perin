package ar.edu.unq.po2.tp7.streamsyenums;

public class TestColorLesion {
    public static void main(String[] args) {
        for (ColorLesion color : ColorLesion.values()) {
            System.out.println("Color: " + color);
            System.out.println("Descripción: " + color.getDescripcion());
            System.out.println("Nivel de riesgo: " + color.getNivelRiesgo());
            System.out.println("Próximo color en el proceso de maduración: " + color.proximo());
            System.out.println();
        }
    }
}

