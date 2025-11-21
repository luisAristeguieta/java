package com.krakedev.clearminds2.test;

import com.krakedev.clearminds2.maquina.MaquinaDulces;

public class TestConfiguracion {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		maquina.mostrarConfiguracion();

	}

}
