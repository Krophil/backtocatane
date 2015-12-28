package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ModelRoute extends ModelStructure{

	private ModelSommet A;
	private ModelSommet B;

	public ModelRoute(){
        super();
		this.A = null;
		this.B = null;
	}

	/**
	 *
	 * @param newA Sommet de départ
	 * @param newB Sommet d'arrivée
	 */
	public ModelRoute(int idJ, ModelSommet newA, ModelSommet newB){
		super(idJ);
        this.A = newA;
		this.B = newB;
	}

    /**
     * Suppression des ressources correspondants à la structure route
     * @param J Le Joueur
     */
    public void construire(ModelJoueur J){
        ArrayList<String> s = new ArrayList<>();
        s.add("bois");
        s.add("brique");
        J.getRessources().removeAll(s);
    }

    public void repercution(ModelStructure S, ModelJoueur J, ModelPlateau P, ModelSommet Som, ModelGestPlat GP){

    }

}

