package servicios;

import java.util.ArrayList;

import entidades.Carta;
import entidades.Naipe;

public class Juego {

	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<ArrayList<Carta>> cartasJugadores;

	// Constructor vacio : 
	public Juego() {
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();
	}

	// Constructor que recibe los jugadores enfocado en solo la cantidad: 
	public Juego(ArrayList<String> jugadores) {
		this(); 
		cartasJugadores = new ArrayList<ArrayList<Carta>>();

		for (int i = 0; i < jugadores.size(); i++) {
			cartasJugadores.add(new ArrayList<Carta>());
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public ArrayList<Carta> getNaipeBarajado() {
		return naipeBarajado;
	}

	// Metodo entregarCartas:
	public void entregarCartas(int cartasPorJugador) {
		int indiceCarta = 0;

		for (int i = 0; i < cartasPorJugador; i++) {
			for (int j = 0; j < cartasJugadores.size(); j++) {
				Carta carta = naipeBarajado.get(indiceCarta);
				cartasJugadores.get(j).add(carta);
				indiceCarta++;
			}
		}
	}

	// Metodo devolverTotal:
	public int devolverTotal(int idJugador) {
		ArrayList<Carta> mano = cartasJugadores.get(idJugador - 1);
		int suma = 0;

		for (int i = 0; i < mano.size(); i++) {
			Carta c = mano.get(i);
			suma += c.getNumero().getValor();
		}

		return suma;
	}

	// Metodo determinarGanador:
	public int determinarGanador() {
		int idGanador = 1;
		int sumaGanador = devolverTotal(1);

		for (int i = 2; i <= cartasJugadores.size(); i++) {
			int sumaActual = devolverTotal(i);

			if (sumaActual >= sumaGanador) {
				sumaGanador = sumaActual;
				idGanador = i;
			}
		}

		return idGanador;
	}
}
