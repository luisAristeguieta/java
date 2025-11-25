package com.cmc.evaluacion;

public class Prestamo {

	private double monto;
	private double interes;
	private int plazo;
	private Cuota[] cuotas; // Arrglo que se agrega despues de crear Clase Cuota.
	private Cliente cliente;

	// Se agrega esta funcion al final del ejericio para que pueda ser llamada desde el TestPrestamo: 
	public void mostrarPrestamo() {
	    System.out.println("[monto=" + monto + 
	                       ", interes=" + interes + 
	                       ", plazo=" + plazo + "]");
	}
	
	// Genera constructor 3 parametros: 
	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		this.cuotas = new Cuota[plazo]; // tamaño = plazo
	}
	
	// Get and Set: 
	
	public Cuota[] getCuotas() {
		return cuotas;
	}
	
	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}	