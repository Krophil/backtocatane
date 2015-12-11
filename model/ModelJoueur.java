package model;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;



public class ModelJoueur {

	private int IDJoueur;
	private ArrayList<String> Ressources;
	private ArrayList<ModelDeveloppement> Developpements;
	private int IDplateau;
    private boolean hasDelorean;


	public ModelJoueur(){
		this.IDJoueur = 0;
		this.Ressources = null;
		this.Developpements = null;
		this.IDplateau = 0;
        this.hasDelorean = false;
	}


	public ModelJoueur(int newId, ArrayList<String> newRessources, ArrayList<ModelDeveloppement> newDeveloppements, int newIDplateau, boolean hasDelorean){
		this.IDJoueur = newId;
		this.Ressources = newRessources;
		this.Developpements = newDeveloppements;
		this.IDplateau = newIDplateau;
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

	public int lancerDes() {
		//nextInt is normally exclusive of the top value,
		//so add 1 to make it inclusive
		int de1 = ThreadLocalRandom.current().nextInt(1, 7);
        int de2 = ThreadLocalRandom.current().nextInt(1, 7);
        return de1+de2;
	}

	public void echange(ModelJoueur joueur) {
	}

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
            int briques = 0;
            int res1 = 0;
            int res2 = 0;
            for (String s : Ressources) {
                if (s.equals("brique"))
                    briques++;
                else if (s.equals("res1"))
                    res1++;
                else if (s.equals("res2"))
                    res2++;
            }
            if (briques >= 3 && res1 >= 2)
                constructions.add("update");
            if (res1 >= 2 && res2 >= 1) {
                if (hasDelorean)
                    constructions.add("reparer");
                else
                    constructions.add("delorean");

            }
        }
        return constructions;
	}

	public void construire() {
	}

}