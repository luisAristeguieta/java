package com.krakedev;

public class Rectangulo {
	private int base;
	private int altura;
	
	// Agrego constructor con parametro:
	
	public Rectangulo (int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public int areaRectangulo() {
		return altura*base;
	}
	
	public double perimetrRectangulo() {
		return (2*altura + 2*base);
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
}
