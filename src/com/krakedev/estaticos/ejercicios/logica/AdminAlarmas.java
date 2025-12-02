package com.krakedev.estaticos.ejercicios.logica;

import java.util.ArrayList;
import com.krakedev.estaticos.ejercicios.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> listaAlarma = new ArrayList<>();
	
	public void agregarAlarma(Alarma alarma) {
		
		if (alarma ==  null) { 
			System.out.println("No se puede agregar una alarma null");
			return;
		} else {
			listaAlarma.add(alarma);
			System.out.println("La alarma con hora: " + alarma.getHora() +  " se agrego correctamente");
		}
	}

	public ArrayList<Alarma> getListaAlarma() {
		return listaAlarma;
	}
	
}
