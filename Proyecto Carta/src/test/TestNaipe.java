package test;

import entidades.Naipe;
import entidades.Carta;
import java.util.ArrayList;

public class TestNaipe {

    public static void main(String[] args) {

        Naipe naipe = new Naipe();

        ArrayList<Carta> cartas = naipe.getCartas();
        System.out.println("Cantidad de cartas en el naipe: " + cartas.size());

        if (cartas.size() == 52) {
            System.out.println("El naipe tiene 52 cartas (correcto).");
        } else {
            System.out.println("El naipe NO tiene 52 cartas (error).");
        }

        System.out.println("Algunas cartas del naipe original:");
        for (int i = 0; i < 5; i++) {
            Carta c = cartas.get(i);
            System.out.println(c.mostrar());
        }

        // Probar barajar creando un ArrayList: 
        
        ArrayList<Carta> barajado = naipe.barajar();
        System.out.println("Cantidad de cartas en el naipe barajado: " + barajado.size());

        System.out.println("Algunas cartas del naipe barajado:");
        for (int i = 0; i < 5; i++) {
            Carta c = barajado.get(i);
            System.out.println(c.mostrar());
        }
    }
}
