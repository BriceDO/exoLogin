package models;

public class Formation {

	String titre;
	String programme;
	int nbEleve;
	
	public Formation(String titre, String programme, int nbEleve) {
		this.setTitre(titre);
		this.setProgramme(programme);
		this.setNbEleve(nbEleve);
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public int getNbEleve() {
		return nbEleve;
	}

	public void setNbEleve(int nbEleve) {
		this.nbEleve = nbEleve;
	}
	
	
	
}
