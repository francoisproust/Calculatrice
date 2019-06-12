package com.beans;

public abstract class Calcul {
	private String nombreUn;
	private String nombreDeux;
	
	public Calcul(String nombreUn, String nombreDeux) {
		super();
		this.nombreUn = nombreUn;
		this.nombreDeux = nombreDeux;
	}
	
	public abstract String operation(String valeurUn, String valeurDeux);
	
	public String getNombreUn() {
		return nombreUn;
	}
	public void setNombreUn(String nombreUn) {
		this.nombreUn = nombreUn;
	}
	public String getNombreDeux() {
		return nombreDeux;
	}
	public void setNombreDeux(String nombreDeux) {
		this.nombreDeux = nombreDeux;
	}	
}