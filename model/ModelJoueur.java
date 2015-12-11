package model;
import java.lang.reflect.Array;
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

    /**
     *
     * @return a result between 2 and 12, simulation of a dice
     */
	public int lancerDes() {
		//nextInt is normally exclusive of the top value,
		//so add 1 to make it inclusive
		int de1 = ThreadLocalRandom.current().nextInt(1, 7);
        int de2 = ThreadLocalRandom.current().nextInt(1, 7);
        return de1+de2;
	}

    /**
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
     *
     * @param joueur : joueur
     * @param askedRes
     * @param givRes
     */
	public void echange(ModelJoueur joueur, ArrayList<String> askedRes, ArrayList<String> givRes) {
        for(String a: askedRes){
            this.Ressources.add(a);
            joueur.Ressources.remove(a);
            askedRes.remove(a);
        }
        for(String g: givRes){
            joueur.Ressources.add(g);
            this.Ressources.remove(g);
            askedRes.remove(g);
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

    /**
     *
     * @return a string of the Player object
     */
    public String toString(){
        String str = "Joueur";
        str+=IDJoueur+"\n";
        for(String r: Ressources){
            str+=r+"\n";
        }
        if(hasDelorean)
            str+="He has the Delorean !";
        return str;
    }

}