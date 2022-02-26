package com.esmt.formation.java;

public class ChefClasse extends Utilisateur {

	public ChefClasse(int id, String nom, String prenom, String login, String password, String email, int numTel) {
		super(id, nom, prenom, login, password, email, numTel);
		// TODO Auto-generated constructor stub
	}  
	
	public String classe;

	public ChefClasse(int id, String nom, String prenom, String login, String password, String email, int numTel,
			String classe) {
		super(id, nom, prenom, login, password, email, numTel);
		this.classe = classe;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	
	
	

}
