package fr.treeptik.initiationjava.fichier;

import java.io.Serializable;

public class Patron implements Serializable{
	private String nom;
	private String prenom;
	
	public Patron(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Patron(){
		
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

}
