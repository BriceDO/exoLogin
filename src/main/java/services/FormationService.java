package services;

import java.util.ArrayList;
import java.util.List;

import models.Eleve;
import models.Formation;

/**
 * Pour cr�er une liste de formation
 * @author brice
 *
 */

public class FormationService {
	
	// instance de ma classe EleveService
	private static FormationService instance = null;
	
	// Liste d'�l�ve vide
	List<Eleve> eleves = new ArrayList<Eleve>();
	
	// liste formation vide 
	List<Formation> formations = new ArrayList<Formation>();
	
	private FormationService() {
		
		// Cr�ation de 5 formations � mettre dans la liste
		for (int i = 1; i <= 5; i++) {
			formations.add(new Formation("Informatique"+i, "JAVA"+i, 10));
		}
		
		// Cr�ation de 10 �l�ves � mettre dans la liste

	}

	// m�thode static pour r�cup�rer l'instance de ma classe
	public static FormationService getInstance() {
		if (FormationService.instance == null) {
			FormationService.instance = new FormationService();
		}
		return instance;
	}
	
	// M�thode qui renvoi le tableau des formations
	public List<Formation> getFormations() {
		return this.formations; 
	}
	
	// M�thode qui permet de r�cup�rer un article selon son nom
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
