package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto("Manzana", 3.0);

		p1.setPrecio(-5);
		System.out.println(p1.getPrecio());

		double precioPromo = p1.calcularPrecioPromo(50);
		System.out.println("El valor con descuento es: " + precioPromo);
	}

}
