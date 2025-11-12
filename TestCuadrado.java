package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// Modifico con parametro con constructor: 
		Cuadrado c1 = new Cuadrado(4);
		Cuadrado c2 = new Cuadrado(12);
		Cuadrado c3 = new Cuadrado(5);
		
		/*c1.setLado(4);
		c2.setLado(12);
		c3.setLado(5);*/
		
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
