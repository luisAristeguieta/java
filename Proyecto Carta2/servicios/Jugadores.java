package servicios;

import java.util.ArrayList;

public class Jugadores {

    private ArrayList<String> jugadores;

    // Constructor vacio: 
    public Jugadores() {
        jugadores = new ArrayList<String>();
    }

    // Get and Set: 
    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    // Método jugar pedido en el ejercicio :
    public void jugar() {

       // Agrega 3 jugadores:
        jugadores = new ArrayList<String>();
        jugadores.add("jugador 1");
        jugadores.add("jugador 2");
        jugadores.add("jugador 3");

        // Crear juego con esa lista
        Juego juego = new Juego(jugadores);

        // Entregar 5 cartas a cada jugador
        juego.entregarCartas(5);

        // Mostrar el total de cada jugador
        for (int i = 0; i < jugadores.size(); i++) {
            int id = i + 1;
            int total = juego.devolverTotal(id);
            System.out.println("Total de " + jugadores.get(i) + ": " + total);
        }

        // Determinar ganador
        int idGanador = juego.determinarGanador();
        System.out.println("El ganador es: jugador " + idGanador);
    }
}