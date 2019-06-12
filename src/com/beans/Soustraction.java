package com.beans;

public class Soustraction extends Calcul {
	public String resultat;
	
	public Soustraction(String nombreUn, String nombreDeux) {
		super(nombreUn, nombreDeux);
	}

	@Override
	public String operation(String valeurUn, String valeurDeux) {
		double resultatDouble;
		double nombreUn = Double.parseDouble(valeurUn);
		double nombreDeux = Double.parseDouble(valeurDeux);
		resultatDouble = nombreUn - nombreDeux;
		resultat = new Double(resultatDouble).toString();
		return resultat;
	}
}
