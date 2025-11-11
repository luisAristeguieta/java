package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		c1.lado = 4;
		c2.lado = 12;
		c3.lado = 5;
		
		double area1 = c1.calcularArea();
		double area2 = c2.calcularArea();
		double area3 = c3.calcularArea();
		double p1 = c1.calcularPerimetro();
		double p2 = c2.calcularPerimetro();
		double p3 = c3.calcularPerimetro();
		System.out.println("El area de C1 es: "+ area1 + "y el perimetro es: " + p1);
		System.out.println("El area de C2 es: "+ area2 + "y el perimetro es: " + p2);
		System.out.println("El area de C3 es: "+ area3 + "y el perimetro es: " + p3);
	}

}
