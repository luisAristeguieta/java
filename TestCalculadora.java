package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora  calcu = new Calculadora ();
		int resultadoSuma = calcu.sumar(10, 5);
		int resultadoResta = calcu.restar(10, 3);
		double resultadomultiplicar = calcu.multiplicar(2,7);
		double resultadodividir = calcu.dividir(10,2);
		double resultadopromedio = calcu.promedio(10,10,10);
		System.out.println("La Suma es: " +resultadoSuma);
		System.out.println("La Resta es: " +resultadoResta);
		System.out.println("La Multiplicacion es: " +resultadomultiplicar); 
		System.out.println("La Division es: " +resultadodividir); 
		System.out.println("La Multiplicacion es: " +resultadomultiplicar);
		System.out.println("EL Promedio es: "+resultadopromedio);
		calcu.mostrarResultado();
	}
}
