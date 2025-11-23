package com.krakedev.evaluacion;

public class Direccion {

	private String callePrincipal;
	private String calleSecundaria;
	
	// Get and Set:
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	
	// Constructor se adicciona que no tenga valores null
	public Direccion(String callePrincipal, String calleSecundaria) {

	    if (callePrincipal == null) {
	        this.callePrincipal = "La calle principal tiene un valor null";
	    } else {
	        this.callePrincipal = callePrincipal;
	    }

	    if (calleSecundaria == null) {
	        this.calleSecundaria = "La calle secundaria tiene un valor null";
	    } else {
	        this.calleSecundaria = calleSecundaria;
	    }
	}
	
	
	
}
