package com.cmc.repaso.entidades;

public class Estudiante {
	private String nombre;
	private double nota;
	private String resultado;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Estudiante(String nombre) {
		this.nombre = nombre;
	}

	public void calificar(double nota) {
		this.nota = nota;
		if (nota < 8) {
			this.resultado = "F";
			System.out.println("Resultado F");
		} else {
			this.resultado = "A";
			System.out.println("Resultado A");
		}
	}

}
