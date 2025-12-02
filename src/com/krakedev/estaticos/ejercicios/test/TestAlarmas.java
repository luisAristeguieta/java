package com.krakedev.estaticos.ejercicios.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicios.entidades.Alarma;
import com.krakedev.estaticos.ejercicios.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicios.utils.DiasSemanas;

public class TestAlarmas {

	public static void main(String[] args) {
		
		// Instancio varias alarmas:
		
		Alarma a1 = new Alarma(DiasSemanas.LUNES, 5, 0);
		Alarma a2 = new Alarma(DiasSemanas.MARTES, 6, 0);
		Alarma a3 = new Alarma(DiasSemanas.MIERCOLES, 7, 0);
		Alarma a4 = new Alarma(DiasSemanas.JUEVES, 8, 0);
		Alarma a5 = new Alarma(DiasSemanas.VIERNES, 9, 0);
		Alarma a6 = new Alarma(DiasSemanas.SABADO, 10, 0);
		Alarma a7 = new Alarma(DiasSemanas.DOMINGO, 11, 0);
		
		// Instancio Adminatrador: 
		
		AdminAlarmas admin = new AdminAlarmas();
		
		// Agrego alarmas: 
		
		admin.agregarAlarma(a1);
		admin.agregarAlarma(a2);
		admin.agregarAlarma(a3);
		admin.agregarAlarma(a4);
		admin.agregarAlarma(a5);
		admin.agregarAlarma(a6);
		admin.agregarAlarma(a7);
		
		// Recupera lista:
		
		ArrayList<Alarma> alarmasActuales = admin.getListaAlarma();
		
		// Muestro informacion: 
		
		System.out.println(alarmasActuales);
		
	}

}
