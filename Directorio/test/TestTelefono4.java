package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("claro", "0958917612", 40);
		Telefono t2 = new Telefono("claro", "0958917611", 50);
		Telefono t3 = new Telefono("movi", "0958917613", 60);
		Telefono t4 = new Telefono("claro", "0958917615", 40);
		
		AdminTelefono at = new AdminTelefono();

		int contadorClaro = at.contarClaro(t1, t2, t3, t4);
		
		System.out.println("La cantidad de numeros Claro es: "+ contadorClaro);
	}

}
