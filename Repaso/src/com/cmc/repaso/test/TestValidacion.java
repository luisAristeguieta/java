package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion v1 = new Validacion();

        boolean r1 = v1.validarMonto(10);
        boolean r2 = v1.validarMonto(0);

        System.out.println(r1);
        System.out.println(r2);
	}

}
