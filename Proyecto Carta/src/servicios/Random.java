package servicios;

public class Random {
	
	// Objetivo retornar un numero entre 0 y 51 incluidos: 
	
    public static int obtenerPosicion() {
        double r = Math.random(); // [0.0, 1.0)
        int posicion = (int)(r * 52); // 0..51
        return posicion;
    }
}
