package model;

import java.util.ArrayList;

public class ModelTown extends ModelStructure {

	//Attributs
	private boolean update;

	//Corps de la classe

	public ModelTown() {
		update = false;
	}

	public boolean getUpdate() {
		return update;
	}

	public void contruire(ModelJoueur J){
		/**
		 *  Suppression des ressources correspondants à la construction de la ville dans la main du joueur concerné.
		 */
		ArrayList<String> s = new ArrayList<>();
		s.add("bois");
		s.add("brique");
		s.add("res1");

		J.getRessources().removeAll(s);

	}

	public void toUpdate(){
		this.update = true;
	}

	/**
	 * A partir de l'époque du plateau, on va répercuter sa création dans les plateaux suivants.
	 * @param P
	 */
	public void repercution(ModelStructure S, ModelJoueur J, ModelPlateau P, ModelSommet Som, ModelGestPlat GP){

		if(S.getIDJoueur() == J.getIDJoueur()){
			for(int i = J.getIDPlateauJoueur(); i<4; i++){
				if(Som.getBusy() == false){
					int idsearch = GP.getTabPlat(J.getIDPlateauJoueur()).getSommets().indexOf(Som);
					GP.getTabPlat(i).getSommets().get(idsearch).getMystructure().add(new ModelTown());
				}
			}
		}
	}




}