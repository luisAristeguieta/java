package com.krakedev.clearminds2.test;

import com.krakedev.clearminds2.componentes.Producto;
import com.krakedev.clearminds2.maquina.MaquinaDulces;

public class TestCargarProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		maquina.mostrarProductos();
	}
}
