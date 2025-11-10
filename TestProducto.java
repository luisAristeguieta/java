package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto  productoA = new Producto ();
		
		productoA.nombre = "Alcohol";
		productoA.descripcion ="Antiseptico";
		productoA.precio = 2.5;
		productoA.stockActual = 60;
		
		
		Producto  productoB = new Producto ();
		
		productoB.nombre = "Paracetamol";
		productoB.descripcion ="Pastillas";
		productoB.precio = 0.5;
		productoB.stockActual = 200;
		
		
		Producto  productoC = new Producto ();
		
		productoC.nombre = "Jeringas";
		productoC.descripcion ="De 5 cc";
		productoC.precio = 1.2;
		productoC.stockActual = 100;
		
		System.out.println("Producto A: ");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion);
		System.out.println("Valor : " + productoA.precio);
		System.out.println("Stock : " + productoA.stockActual);
		
		System.out.println("**************************");
		System.out.println("Producto B: ");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion);
		System.out.println("Valor : " + productoB.precio);
		System.out.println("Stock : " + productoB.stockActual);
		
		System.out.println("**************************");
		System.out.println("Producto C: ");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion);
		System.out.println("Valor : " + productoC.precio);
		System.out.println("Stock : " + productoC.stockActual);
		

	}

}
