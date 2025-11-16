package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi","0985170913",20);
		Contacto c1 = new Contacto("Perez", t1, 85);
		
		Telefono t2 = new Telefono("movi","0985170914",25);
		Contacto c2 = new Contacto("Zamora", t2, 75);
		
		AdminContactos ac = new AdminContactos();
		
		Contacto c = ac.buscarMasPesado(c1, c2);
		boolean op = ac.compararOperadoras2(c1, c2);
		
		c.imprimir1();
		
		System.out.println("Las operadoras son iguales? " + op );

	}

}
