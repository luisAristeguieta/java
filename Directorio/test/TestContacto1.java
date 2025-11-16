package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("claro","0985170912",15);
		Contacto c = new Contacto("Gonzalez", telef, 75);
		
		c.imprimir1();
		
		// Continuacion del ejercicio # 3
		
		Telefono telef2 = new Telefono("movi","0985170913",20);
		Contacto c2 = new Contacto("Junin", telef2, 90);
		
		AdminContactos ac = new AdminContactos();
		
		Contacto cont = ac.buscarMasPesado(c, c2);
		boolean op = ac.compararOperadoras2(c, c2);
		
		System.out.println("Este contacto que tiene mas peso es: ");
		cont.imprimir1();
		
		System.out.println("Las operadoras son iguales? " + op );
		
	}

}
