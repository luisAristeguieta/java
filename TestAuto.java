package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// Modifica para tener constructores con parametros: 
		Auto auto1 = new Auto("Ford", 2025, 10000);

		/*auto1.setMarca("Ford");
		auto1.setAnio(2025);
		auto1.setPrecio(10000.00);*/
		
		System.out.println("Auto 1:");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Anio: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());
		System.out.println("**************************");
		
		// Modifica para tener constructores con parametros: 
		Auto auto2 = new Auto("Chevrolet",2022,22000.00);
		
		/*auto2.setMarca("Chevrolet");
		auto2.setAnio(2022);
		auto2.setPrecio(20000.00);*/
		
		System.out.println("Auto 2: ");
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Anio: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
		System.out.println("**************************");
		
	}

}
