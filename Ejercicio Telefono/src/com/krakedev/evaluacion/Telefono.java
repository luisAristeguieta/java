package com.krakedev.evaluacion;

public class Telefono {

	private String numero;
	private String tipo;
	private String estado;

	// Constructor:
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		this.estado = validarTipo(numero, tipo);
	}

	// Validacion si el numero de telefono y el tipo de telefono es correcto:
	// Por ser un metodo solo para la clase telefono se coloco private

	private String validarTipo(String numero, String tipo) {

		if (numero == null || tipo == null) {
			return "E";
		}

		if (!(tipo.equalsIgnoreCase("Movil") || tipo.equalsIgnoreCase("Convencional"))) {
			return "E";
		}

		if ((tipo.equalsIgnoreCase("Movil") && numero.length() == 10)
				|| (tipo.equalsIgnoreCase("Convencional") && numero.length() == 7)) {
			return "C";
		} else {
			return "E";
		}
	}

	// Get:
	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

}
