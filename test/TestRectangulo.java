package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(10,5);
		Rectangulo r2 = new Rectangulo(3,4);
		
		/*r1.setAltura(5);
		r1.setBase(10);
		r2.setAltura(4);
		r2.setBase(3);*/
		
		int resultadoArea1 = r1.areaRectangulo();
		int resultadoArea2 = r2.areaRectangulo();
		System.out.println("El area del rectangulo 1 es: "+ resultadoArea1);
		System.out.println("El area del rectangulo 2 es: "+ resultadoArea2);
		
		double resultadoPerimetro1 = r1.perimetrRectangulo();
		double resultadoPerimetro2 = r2.perimetrRectangulo();
		System.out.println("el perimetro del R1 es: "+ resultadoPerimetro1);
		System.out.println("el perimetro del R2 es: "+ resultadoPerimetro2);
		
	}

}
