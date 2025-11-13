package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto  productoA = new Producto ();
		
		productoA.setNombre("Alcohol");
		productoA.setDescripcion("Antiseptico");
		productoA.setPrecio(2.5);
		productoA.setStockActual(60);
		
		
		Producto  productoB = new Producto ();
		
		productoB.setNombre("Paracetamol");
		productoB.setDescripcion("Pastillas");
		productoB.setPrecio(0.5);
		productoB.setStockActual(200);
		
		
		Producto  productoC = new Producto ();
		
		productoC.setNombre("Jeringas");
		productoC.setDescripcion("De 5 cc");
		productoC.setPrecio(1.2);
		productoC.setStockActual(100);
		
		System.out.println("Producto A: ");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Valor : " + productoA.getPrecio());
		System.out.println("Stock : " + productoA.getStockActual());
		
		System.out.println("**************************");
		System.out.println("Producto B: ");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Valor : " + productoB.getPrecio());
		System.out.println("Stock : " + productoB.getStockActual());
		
		System.out.println("**************************");
		System.out.println("Producto C: ");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Valor : " + productoC.getPrecio());
		System.out.println("Stock : " + productoC.getStockActual());
		

	}

}
