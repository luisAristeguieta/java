package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono t1) {
		if (t1.getOperadora().equals("movi")) {
			t1.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		
		int contarmovi = 0;
		if (t1.getOperadora().equals("movi")) {
			contarmovi++;
		}
		if (t2.getOperadora().equals("movi")) {
			contarmovi++;
		}
		if (t3.getOperadora().equals("movi")) {
			contarmovi++;
		}
		return contarmovi;
	}
	
	public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
		
		int contarClaro = 0;
		if (t1.getOperadora().equals("claro")) {
			contarClaro++;
		}
		if (t2.getOperadora().equals("claro")) {
			contarClaro++;
		}
		if (t3.getOperadora().equals("claro")) {
			contarClaro++;
		}
		if (t4.getOperadora().equals("claro")) {
			contarClaro++;
		}
		return contarClaro;
	}
}
