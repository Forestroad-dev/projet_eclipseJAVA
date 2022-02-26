package com.esmt.formation.java;

public class Cours {
	private String jour;
	private String contenu;
	private int heureDebut;
	private int heureFin;
	private boolean isDispense;
	private String commentaire;
	
	
	public Cours(String jour, String contenu, int heureDebut, int heureFin, boolean isDispense, String commentaire) {
		super();
		this.jour = jour;
		this.contenu = contenu;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.isDispense = isDispense;
		this.commentaire = commentaire;
	}


	public String getJour() {
		return jour;
	}


	public void setJour(String jour) {
		this.jour = jour;
	}


	public String getContenu() {
		return contenu;
	}


	public void setContenu(String contenu) {
		this.contenu = contenu;
	}


	public int getHeureDebut() {
		return heureDebut;
	}


	public void setHeureDebut(int heureDebut) {
		this.heureDebut = heureDebut;
	}


	public int getHeureFin() {
		return heureFin;
	}


	public void setHeureFin(int heureFin) {
		this.heureFin = heureFin;
	}


	public boolean isDispense() {
		return isDispense;
	}


	public void setDispense(boolean isDispense) {
		this.isDispense = isDispense;
	}


	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
	
}