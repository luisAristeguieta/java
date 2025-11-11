package com.krakedev;

public class Calculadora {
	public int sumar (int v1, int v2) {
	int resultado = v1+v2;
	return resultado;
	}
	
	public int restar (int v1, int v2) {
		return v1-v2;
	}
	
	public double multiplicar (double v1, double v2) {
		return v1*v2;
	}
	
	public double dividir (double v1, double v2) {
		return v1/v2;
	}
	
	public double promedio (double v1, double v2, double v3) {
		return (v1+v2+v3)/3;
	}
	
	public void mostrarResultado () {
		System.out.println("Ahorita no Joven, Sali al almuerzo. Regreso en 15 min");
	}
}
