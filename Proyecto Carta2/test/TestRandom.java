package test;

import servicios.Random;

public class TestRandom {

    public static void main(String[] args) {

        boolean arrojoCeroUno = false;

        // Con este for se testea el metodo Random : 
        
        for (int i = 0; i < 100; i++) {
            int posicion = Random.obtenerPosicion();
            System.out.println("Posicion obtenida : " + posicion);

            if (posicion == 0 || posicion == 1) {
                arrojoCeroUno = true;
            }
        }

        if (!arrojoCeroUno) {
            System.out.println("El método obtenerPosicion no ha arrojado 0 o 1.");
        } else {
            System.out.println("El método obtenerPosicion sí arrojó 0 o 1 al menos una vez.");
        }
    }
}
