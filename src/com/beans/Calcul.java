package com.beans;

public class Calcul {
	private String nombreUn;
	private String nombreDeux;
	
	public Calcul(String nombreUn, String nombreDeux) {
		super();
		this.nombreUn = nombreUn;
		this.nombreDeux = nombreDeux;
	}
	
	public String addition(String nombreUn,String nombreDeux) {
		String resultat;
		float valeurUn = verificationConversion(nombreUn);
		float valeurDeux = verificationConversion(nombreDeux);
		resultat = conversionString(valeurUn + valeurDeux);
		return resultat;
	}
	
	public String soustraction(String nombreUn,String nombreDeux) {
		String resultat;
		float valeurUn = verificationConversion(nombreUn);
		float valeurDeux = verificationConversion(nombreDeux);
		resultat = conversionString(valeurUn - valeurDeux);
		return resultat;
	}
	
	public String division(String nombreUn,String nombreDeux) {
		String resultat;
		float valeurUn = verificationConversion(nombreUn);
		float valeurDeux = verificationConversion(nombreDeux);
		resultat = conversionString(valeurUn / valeurDeux);
		return resultat;
	}
	
	public String multiplication(String nombreUn,String nombreDeux) {
		String resultat;
		float valeurUn = verificationConversion(nombreUn);
		float valeurDeux = verificationConversion(nombreDeux);
		resultat = conversionString(valeurUn * valeurDeux);
		return resultat;
	}
	
	private float verificationConversion(String nombreString) {
		float resultat;
		nombreString = verifierValeur(nombreString);
		resultat = conversionFloat(nombreString);
		return resultat;
	}
	
	public String verifierValeur (String nombre) {
		if (nombre == "") {
			nombre = "0";
		}
		return nombre;
	}
	protected Float conversionFloat(String nombre) {
		Float nombreConverti = Float.parseFloat(nombre);
		return nombreConverti;
	}
	protected String conversionString(float nombre) {
		String nombreString = Float.toString(nombre);
		return nombreString;
	}
	
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