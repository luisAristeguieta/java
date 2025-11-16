package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi", "0999075802",30);
		Telefono t2 = new Telefono("claro", "0999075802",30);
		Telefono t3 = new Telefono("movi", "0999075802",30);
		AdminTelefono at = new AdminTelefono();

		int contador = at.contarMovi(t1, t2, t3);
		
		System.out.println("Los clientes movis son: " + contador);
	}

}
