package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Albert");
		Estudiante e2 = new Estudiante("Maria");

		e1.calificar(10);
		e2.calificar(5);
		
		System.out.println("El estudiante " + e1.getNombre() + " tiene un nota de: " + e1.getNota() + " y un estado de " + e1.getResultado());
		System.out.println("El estudiante " + e2.getNombre() + " tiene un nota de: " + e2.getNota() + " y un estado de " + e2.getResultado());
	}

}
