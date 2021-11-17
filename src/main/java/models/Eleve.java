package models;

import java.util.List;

public class Eleve {

	String nom;
	String prenom;
	String age;
	int note;
	Formation formation;
	
	public Eleve(String nom, String prenom, String age, int note, List<Formation> fomations) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAge(age);
		this.setNote(note);
		this.setFormation(formation);
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	
	
	
	
}
