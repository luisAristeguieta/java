package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha newFecha = new Fecha();
		
		newFecha.setAnio(2025);
		newFecha.setMes(11);
		newFecha.setDia(12);
		
		System.out.println("La fecha es: " +  newFecha.getAnio() + "-" + newFecha.getMes() + "-" + newFecha.getDia());

	}

}
