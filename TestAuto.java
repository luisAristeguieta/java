package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();

		auto1.marca = "Ford";
		auto1.anio = 2025;
		auto1.precio = 10000.00;
		System.out.println("Auto 1:");
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Anio: " + auto1.anio);
		System.out.println("Precio: " + auto1.precio);
		System.out.println("**************************");
		
		
		Auto auto2 = new Auto();
		
		auto2.marca = "Chevrolet";
		auto2.anio = 2022;
		auto2.precio = 20000.00;
		System.out.println("Auto 2: ");
		System.out.println("Marca: " + auto2.marca);
		System.out.println("Anio: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);
		System.out.println("**************************");
		
	}

}
