package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {

	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

	// Metodo recuperarIncorrectos
	
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> incorrectos = new ArrayList<Telefono>();
		
		for(int i = 0; i<telefonos.size();i++) {
			Telefono t = telefonos.get(i);
			if(t.getEstado().equalsIgnoreCase("E")) {
				incorrectos.add(t);
			}
		}
		return incorrectos;
	}
	
	
	// Metodo mostrarTelefonos:

	public void mostrarTelefonos() {
		System.out.println("Telefono con estado 'C'");
		for(int i = 0; i<telefonos.size();i++) {
			Telefono t = telefonos.get(i);
			System.out.println("Numero: " + t.getNumero() + ", " + t.getTipo());
		}	
	}
	
	// Metodo agregarTelefono:

	public void agregarTelefono(Telefono t) {

		if (t == null) {
			System.out.println("Verificar los valores del telefono.");
		} else {
			telefonos.add(t);
		}

	}

	// Constructor:
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Get and set:

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	// Mostrar segun ejercicio:

	public void imprimir() {
		System.out.println("***" + getNombre() + " " + getApellido() + "***");
		if (getDireccion() != null) {
			System.out.println(
					"Direccion: " + getDireccion().getCallePrincipal() + " y " + getDireccion().getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una direccion");
		}

	}

}
