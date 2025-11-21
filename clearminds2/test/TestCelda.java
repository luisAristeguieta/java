package com.krakedev.clearminds2.test;

import com.krakedev.clearminds2.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());
		
		/* La linea donde se genera el error es la linea 7 que al intentar imprimir en la linea 
		8. La variable no obtiene el nombre en la clase producto porque no esta asignado este atributo en la clase celda. */
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}
