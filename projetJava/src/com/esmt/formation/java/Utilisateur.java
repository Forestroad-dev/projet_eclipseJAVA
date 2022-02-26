package com.esmt.formation.java;

public abstract class Utilisateur {
	public int id;
	public String nom;
	public String prenom;
	public String login ;
	public String password ;
	public String email;
	public int numTel;
	
	
	public Utilisateur(int id, String nom, String prenom, String login, String password, String email, int numTel) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.email = email;
		this.numTel = numTel;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getLogin() {
		return login;
	}




	public void setLogin(String login) {
		this.login = login;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public int getNumTel() {
		return numTel;
	}




	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}




	public void seConnecter() {
		
		
	}

}
