package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono t = new Telefono("movi","0985170915",36);
		Contacto c = new Contacto("Gutierrez", t, 83);
		
		c.imprimir1();
		
		AdminContactos ac = new AdminContactos();
		
		t.setTieneWhatsapp(true);
		ac.activarUsuario(c);
		
		c.imprimir1();
	
	}

}
