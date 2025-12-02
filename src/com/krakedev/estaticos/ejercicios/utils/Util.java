package com.krakedev.estaticos.ejercicios.utils;

public class Util {

	 public static String formatearHora(int numero) {
	        String valor = numero + "";
	        if (valor.length() == 1) {
	            valor = "0" + valor;
	        }
	        return valor;
	    }
	 
	 public static String formatearDia(int dia) {
		   
		 // Crea arreglo interno: 
		 String[] dias = { "Lunes","Martes", "Miercoles","Jueves","Viernes","Sabado","Domingo"};

		    if (dia >= 0 && dia < dias.length) {
		        return dias[dia];
		    } else {
		    	String mensaje = "No existe el dia en el rango";
		        return mensaje;
		    }
		}
}