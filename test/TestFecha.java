package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha newFecha = new Fecha();
		
		newFecha.setAnio(2025);
		newFecha.setMes(11);
		newFecha.setDia(12);
		// Solo estoy probando la modificacion directa en el repositorio remoto y se vean los cambios.
		System.out.println("La fecha es: " +  newFecha.getAnio() + "-" + newFecha.getMes() + "-" + newFecha.getDia());
	}

}
