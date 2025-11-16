package com.cmc.directorio.entidades;

public class Contacto {
	private String apellido;
	private boolean activo;
	private Telefono telefono;
	private double peso;
	
	
	
	public Contacto(String apellido, Telefono telefono, double peso) {
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}
	
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public void imprimir1 () {
		System.out.println("════════════════════════");
		System.out.println("Los datos de contactos son: ");
		System.out.println("✔️ Apellido: " + getApellido());
		System.out.println("✔️ Está activo? " + isActivo());
		System.out.println("📲 Los datos telefonicos son  : ");
		System.out.println(	"📡 Operadora: "+ getTelefono().getOperadora());
		System.out.println(	" 🔢 Número: "+ getTelefono().getNumero());
		System.out.println(	"✔️ Tiene Whatsapp?: "+ getTelefono().isTieneWhatsapp());
		System.out.println("El peso(Kg.) : " + getPeso());
		System.out.println("════════════════════════");
	}
	
	
	
}
