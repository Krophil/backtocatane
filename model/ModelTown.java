package model;

import java.util.ArrayList;

public class ModelTown extends ModelStructure {

	//Attributs
	private boolean update;
    private ModelSommet place;
	//Corps de la classe

	public ModelTown() {
		update = false;
        place = new ModelSommet();
	}

    public ModelTown(ModelSommet p){
        update=false;
        place=p;
    }

	public boolean getUpdate() {
		return update;
	}

    public ModelSommet getPlace(){
        return place;
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






}