package src.model;
import java.util.ArrayList;

public class ModelTown extends ModelStructure {

	//Attributs
	private boolean update; //true == Ville; false == colonnie

	//Accesseurs
	public boolean getUpdate() {
		return update;
	}

	//Corps de la classe

	public ModelTown(int IDJoueur) {
		super(IDJoueur);
		update = false;
	}

	/**
	 *  Suppression des ressources correspondants à la construction de la ville dans la main du joueur concerné.
	 */

	public void construire(ModelJoueur J, ModelSommet S, ModelPlateau P){

		ArrayList<String> s = new ArrayList<>();
		s.add("bois");
		s.add("brique");
		s.add("res1");

		J.getRessources().removeAll(s);

		S.setBusy(true);
		//this.addToASommet(S);
		S.setTown(new ModelTown(J.getIDJoueur()));
		this.setIDJoueur(J.getIDJoueur());

		for(int i=0; i<3; i++){
			P.getSommet(S.getVoisin(i)).setBusy(true);
		}



	}

	@Override
	public String toString(){
		if(getIDJoueur()>-1) {
			return ""+ getIDJoueur() + "update="+update;
		} else {
			return "There is no town";
		}
	}

	public void toUpdate(){
		this.update = true;
	}






}