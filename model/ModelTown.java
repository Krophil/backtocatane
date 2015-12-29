package model;

import java.util.ArrayList;

public class ModelTown extends ModelStructure {

	//Attributs
	private boolean update; //true == Ville; false == colonnie

	//Accesseurs
	public boolean getUpdate() {
		return update;
	}

	//Corps de la classe

	public ModelTown() {
		update = false;
	}

	public void contruire(ModelJoueur J, ModelSommet S, ModelPlateau P){
		/**
		 *  Suppression des ressources correspondants à la construction de la ville dans la main du joueur concerné.
		 */
		ArrayList<String> s = new ArrayList<>();
		s.add("bois");
		s.add("brique");
		s.add("res1");

		J.getRessources().removeAll(s);

		for(int i=0; i<3; i++){
			P.getSommet(S.getVoisin(i)).setBusy(true);

		}


	}

	public void toUpdate(){
		this.update = true;
	}






}