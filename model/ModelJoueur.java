package model;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;



public class ModelJoueur {

	private int IDJoueur;
	private List<ModelRessource> Ressources;
	private List<ModelDeveloppement> Developpements;
	private int IDplateau;


	public ModelJoueur(){
		this.IDJoueur = 0;
		this.Ressources = null;
		this.Developpements = null;
		this.IDplateau = 0;
	}


	public ModelJoueur(int newId, List<ModelRessource> newRessources, List<ModelDeveloppement> newDeveloppements, int newIDplateau){
		this.IDJoueur = newId;
		this.Ressources = newRessources;
		this.Developpements = newDeveloppements;
		this.IDplateau = newIDplateau;
	}

	public ModelJoueur(ModelJoueur joueur){
		this.IDJoueur = joueur.IDJoueur;
		for(int i=0; i<joueur.Ressources.size(); i++){

		}
	}

	public void activeDev() {
	}

	public Integer lancerDes() {
		//nextInt is normally exclusive of the top value,
		//so add 1 to make it inclusive
		int des1 = ThreadLocalRandom.current().nextInt(1, 7);


		return null;
	}

	public void echange(ModelJoueur joueur) {
	}

	public Integer constructionPossible() {
		return null;
	}

	public void construire() {
	}

}