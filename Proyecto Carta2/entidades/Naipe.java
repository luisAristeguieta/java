package entidades;

import java.util.ArrayList;

import servicios.Random;

public class Naipe {

	private ArrayList<Numero> numerosPosibles;
    private ArrayList<Carta> cartas;

    public Naipe() {
    	
        numerosPosibles = new ArrayList<Numero>();
        cartas = new ArrayList<Carta>();

        // Carga los 13 números con sus valores : 
        
        numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));

        // Crea las 52 cartas combinando números con palos usando la clase palos:
        
        Palos palos = new Palos();
        String[] todosLosPalos = {
            palos.getCorazonRojo(),
            palos.getCorazonNegro(),
            palos.getDiamante(),
            palos.getTrebol()
        };

        for (int i = 0; i < todosLosPalos.length; i++) {
            String palo = todosLosPalos[i];
            for (int j = 0; j < numerosPosibles.size(); j++) {
                Numero num = numerosPosibles.get(j);
                cartas.add(new Carta(num, palo));
            }
        }
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    // Se usa para barajar que inicien con estado N con 100 iteraciones aleatorias: 
    public ArrayList<Carta> barajar() {
        ArrayList<Carta> auxiliar = new ArrayList<Carta>();

        for (int i = 0; i < cartas.size(); i++) {
            cartas.get(i).setEstado("N");
        }

        for (int i = 0; i < 100; i++) {
            int posicion = Random.obtenerPosicion(); // 0..51
            Carta carta = cartas.get(posicion);

            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");
            }
        }

        // Agregar las cartas que quedaron con estado "N"
        for (int i = 0; i < cartas.size(); i++) {
            Carta carta = cartas.get(i);
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");
            }
        }

        // auxiliar ahora tiene las 52 cartas en orden aleatorio
        return auxiliar;
    }
    
}
