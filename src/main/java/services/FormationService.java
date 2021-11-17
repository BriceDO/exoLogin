package services;

import java.util.ArrayList;
import java.util.List;

import models.Eleve;
import models.Formation;

/**
 * Pour créer une liste de formation
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

	}

	// méthode static pour récupérer l'instance de ma classe
	public static FormationService getInstance() {
		if (FormationService.instance == null) {
			FormationService.instance = new FormationService();
		}
		return instance;
	}
	
	// Méthode qui renvoi le tableau des formations
	public List<Formation> getFormations() {
		return this.formations; 
	}
	
	// Méthode qui permet de récupèrer un article selon son nom
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
}
