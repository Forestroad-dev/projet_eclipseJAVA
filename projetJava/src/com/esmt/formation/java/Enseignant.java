package com.esmt.formation.java;

public class Enseignant extends Utilisateur{

	public Enseignant(int id, String nom, String prenom, String login, String password, String email, int numTel) {
		super(id, nom, prenom, login, password, email, numTel);
		// TODO Auto-generated constructor stub
	}
	
	private String modules;

	public Enseignant(int id, String nom, String prenom, String login, String password, String email, int numTel,
			String modules) {
		super(id, nom, prenom, login, password, email, numTel);
		this.modules = modules;
	}

	public String getModules() {
		return modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}
	
	public void validerModifications() {
			
		}
	
	public void rejeterModification() {
		
	}
	
	public void consulterEtatPaiement() {
		
	}
	
	public void voirEmploisDuTemps() {
		
	}
	
	public void reporterCours() {
		
	}
	
	public void annulerCours() {
		
	}
}
