package services;

import java.util.ArrayList;
import java.util.List;

import models.Eleve;
import models.Formation;

/**
 * Pour créer une liste de formation et d'élèves
 * Cela va éviter de faire passer les informations par la session HTTP
 * @author brice
 *
 */

public class FormationService {
	
	// instance de ma classe EleveService
	private static FormationService instance = null;
	
	// Liste d'élève vide
	List<Eleve> eleves = new ArrayList<Eleve>();
	
	// liste formation vide 
	List<Formation> formations = new ArrayList<Formation>();
	
	private FormationService() {
		
		// Création de 5 formations à mettre dans la liste
		for (int i = 1; i <= 5; i++) {
			formations.add(new Formation("Informatique"+i, "JAVA"+i, 10));
		}
		
		// Création de 10 élèves à mettre dans la liste
		for (int i = 1; i <= 10; i++) {
			eleves.add(new Eleve("nom"+i, "prenom"+i, 15, 19, formations.get(1)));
		}
	}

	// méthode static pour récupérer l'instance de ma classe
	public static FormationService getInstance() {
		if (FormationService.instance == null) {
			FormationService.instance = new FormationService();
		}
		return instance;
	}
	
	// Méthode qui renvoi la liste des eleves
	public List<Eleve> getEleves() {
		return this.eleves; 
	}
	
	// Méthode qui renvoi la liste des formations
	public List<Formation> getFormations() {
		return this.formations; 
	}
	
	// Méthode qui permet de récupèrer un article par son nom
		public Formation getFormationByTitre(String titre) {
			Formation response = null;
			for (Formation form : formations) {
				if (form.getTitre().equals(titre)) {
					response = form;
					break;
				}
			}
			return response;
	}
		
	// Méthode qui permet de récupèrer un eleve par son nom
	public Eleve getEleveByNom(String nom) {
		Eleve response = null;
		for (Eleve el : eleves) {
			if (el.getNom().equals(nom)) {
				response = el;
				break;
			}
		}
		return response;
	}
}
