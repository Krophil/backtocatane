package model;
import java.util.ArrayList;



public class ModelJoueur {

	//Attributs
	private int IDJoueur;
	private int IDPlateauJoueur;

	private ArrayList<String> Ressources; //main du joueur
	private ArrayList<ModelDeveloppement> Developpements;

	private boolean hasDelorean; //possess Delorean (0=No; 1=Yes)
	private boolean garageDelorean; //state of Delorean (0=broken; 1=usable)

	private int compteurJeu=0;
	private int compteurDev=0;

	public boolean playing=false;//true : the player is currently playing


	//Accesseurs
	public boolean getGarageDelorean(){
		return garageDelorean;
	}

	public void setGarageDelorean(boolean B){
		this.garageDelorean = true;
	}

	public boolean getHasDelorean(){
		return hasDelorean;
	}

	public void setHasDelorean(boolean B){
		this.hasDelorean = B;
	}

	public int getCompteurJeu(){
		return compteurJeu;
	}

	public int getCompteurDev(){
		return compteurDev;
	}

	public void setCompteurJeu(int i){
		compteurJeu = i;
	}

	public void setCompteurDev(int i){
		compteurDev = i;
	}

	public ArrayList<String> getRessources(){
		return Ressources;
	}

	public void setRessources(String R){
		Ressources.add(R);
	}

	public int getIDPlateauJoueur(){
		return IDPlateauJoueur;
	}

	public int getIDJoueur(){
		return IDJoueur;
	}

	public ModelJoueur getJoueur(int i){
		return getJoueur(i);
	}

	public void setIDPlateauJoueur(int newIDPlateauJ){
		this.IDPlateauJoueur = newIDPlateauJ;
	}

	//Corps de la classe
	public ModelJoueur(){
		this.IDJoueur = 0;
		this.Ressources = null;
		this.Developpements = null;
		this.IDPlateauJoueur = 0;
		this.hasDelorean = false;
	}


	public ModelJoueur(int newId, ArrayList<String> newRessources, ArrayList<ModelDeveloppement> newDeveloppements, int newIDplateau, boolean hasDelorean){
		this.IDJoueur = newId;
		for(int i=0; i<newRessources.size(); i++) {
			this.Ressources = new ArrayList<String>(newRessources);
		}
		for(int i=0; i<newDeveloppements.size(); i++) {
			this.Developpements = new ArrayList<ModelDeveloppement>(newDeveloppements);
		}
		this.IDPlateauJoueur = newIDplateau;
		this.hasDelorean = hasDelorean;
	}

	public ModelJoueur(ModelJoueur joueur){
		this.IDJoueur = joueur.IDJoueur;
		for(int i=0; i<joueur.Ressources.size(); i++){
			this.Ressources.add(joueur.Ressources.get(i));
		}
	}


	public void activeDev() {
	}

	/**
	 * Checks if the player has all the ressources given in the list
	 *
	 * @param ressources : list of possible ressources
	 * @return if the player has every ressource of the list ressources
	 */
	public boolean hasRessources(ArrayList<String> ressources) {
		ArrayList<String> tmp = new ArrayList<>(this.Ressources);
		int i=0;
		for(String r: ressources) {
			if(tmp.contains(r)) {
				tmp.remove(r);
				i++;
			}
		}
		return (ressources.size() == i);
	}

	/**
	 * exchange method between two players
	 *
	 * @param joueur : player who accepted or requested exchange
	 * @param askedRes : Ressources asked by the player
	 * @param givRes : Ressources proposed by the player
	 */
	public void echange(ModelJoueur joueur, ArrayList<String> askedRes, ArrayList<String> givRes) {


		for(String a: askedRes){
			this.Ressources.add(a);
		}

		for(String g: givRes){
			joueur.Ressources.add(g);
		}

		for(int i=0; i<askedRes.size();i++){
			String Ressource = askedRes.get(i);
			int j =0;
			while(!joueur.Ressources.get(j).equals(Ressource)){
				j++;
			}
			joueur.Ressources.remove(j);
		}

		for(int i=0; i<givRes.size();i++){
			String Ressource = givRes.get(i);
			int j =0;
			while(!this.Ressources.get(j).equals(Ressource)){
				j++;
			}
			this.Ressources.remove(j);
		}


	}

	/**
	 *
	 * @return a list of possibilities for the player
	 */
	public ArrayList<String> constructionPossible() {
		ArrayList<String> constructions = new ArrayList<>();
		if(Ressources.contains("bois")) {
			if (Ressources.contains("brique")) {
				constructions.add("route");
				if (Ressources.contains("res1")) {
					constructions.add("ville");
				}
				if (Ressources.contains("res2")) {
					constructions.add("dev");
				}
			}
		}
		int briques = 0;
		int res1 = 0;
		int res2 = 0;
		for (String s : Ressources) {
			if (s.equals("brique")) {
				briques++;
			} else if (s.equals("res1")) {
				res1++;
			} else if (s.equals("res2")) {
				res2++;
			}
		}
		if (briques >= 3 && res1 >= 2) {
			constructions.add("update");
		}
		if (res1 >= 2 && res2 >= 1) {
			if (hasDelorean) {
				constructions.add("reparer");
			} else {
				constructions.add("delorean");
			}

		}
		return constructions;
	}


	/**
	 *
	 * @return a string of the Player object
	 */
	@Override
	public String toString(){
		String str = "Joueur";
		str+=IDJoueur+"\n";
		for(String r: Ressources){
			str+=r+"\n";
		}
		if(hasDelorean) {
			str+="He has the Delorean !";
		}
		return str;
	}

	public void changerPlateau(int newIDPlateau){
		setIDPlateauJoueur(newIDPlateau); //changement de plateau opéré
		setGarageDelorean(false);	//Delorean Cassé (comme dans les films)
	}

}