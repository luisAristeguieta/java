package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item i1 = new Item();

		i1.setNombre("Remeras");
		i1.setProductosActuales(20);
		
		i1.imprimir();
		i1.vender(3);
		i1.imprimir();
		i1.devolver(3);
		i1.imprimir();

		Item i2 = new Item();
		i2.setNombre("Pantalonetas");
		i2.setProductosActuales(50);

		i2.imprimir();
		i2.vender(10);
		i2.imprimir();
		i2.devolver(5);
		i2.imprimir();

	}

}
