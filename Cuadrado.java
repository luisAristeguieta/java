package com.krakedev;

public class Cuadrado {
	private int lado;
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		return lado*lado;
	}
	
	public double calcularPerimetro() {
		return lado*4;
	}
}
