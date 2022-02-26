package com.esmt.formation.java;

public class Module {
	
	private String nom;
	private String enseignant;
	public String etatPaiement;
	private int nbreHeuresTotales;
	private int nbreHeuresDispens�es;
	private int nbreHeuresRestantes;
	private double coutHoraire;
	private String isValide;
	
	
	public Module(String nom, String enseignant, String etatPaiement, int nbreHeuresTotales, int nbreHeuresDispens�es,
			int nbreHeuresRestantes, double coutHoraire, String isValide) {
		super();
		this.nom = nom;
		this.enseignant = enseignant;
		this.etatPaiement = etatPaiement;
		this.nbreHeuresTotales = nbreHeuresTotales;
		this.nbreHeuresDispens�es = nbreHeuresDispens�es;
		this.nbreHeuresRestantes = nbreHeuresRestantes;
		this.coutHoraire = coutHoraire;
		this.isValide = isValide;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEnseignant() {
		return enseignant;
	}


	public void setEnseignant(String enseignant) {
		this.enseignant = enseignant;
	}


	public String getEtatPaiement() {
		return etatPaiement;
	}


	public void setEtatPaiement(String etatPaiement) {
		this.etatPaiement = etatPaiement;
	}


	public int getNbreHeuresTotales() {
		return nbreHeuresTotales;
	}


	public void setNbreHeuresTotales(int nbreHeuresTotales) {
		this.nbreHeuresTotales = nbreHeuresTotales;
	}


	public int getNbreHeuresDispens�es() {
		return nbreHeuresDispens�es;
	}


	public void setNbreHeuresDispens�es(int nbreHeuresDispens�es) {
		this.nbreHeuresDispens�es = nbreHeuresDispens�es;
	}


	public int getNbreHeuresRestantes() {
		return nbreHeuresRestantes;
	}


	public void setNbreHeuresRestantes(int nbreHeuresRestantes) {
		this.nbreHeuresRestantes = nbreHeuresRestantes;
	}


	public double getCoutHoraire() {
		return coutHoraire;
	}


	public void setCoutHoraire(double coutHoraire) {
		this.coutHoraire = coutHoraire;
	}


	public String getIsValide() {
		return isValide;
	}


	public void setIsValide(String isValide) {
		this.isValide = isValide;
	}
	
	
	

	

}
