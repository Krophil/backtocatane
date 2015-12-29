package model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ModelGestPlat {

	//int[][] tuiles = new int[4][37];  //37 tuiles jouables
	//int[][] sommets = new int [4][54];
	private ArrayList<ModelPlateau> TabPlat;
	private ArrayList<ModelJoueur> TabJ;
	private String[] tabResSup;

	//Accesseurs

	public String[] getTabResSup(){
		return tabResSup;
	}


	public ModelGestPlat(){
		tabResSup[0] = "bois";
		tabResSup[1] = "brique";
		tabResSup[2] = "res1";
		tabResSup[3] = "res2";
	}

	public ModelPlateau getTabPlat(int i){
		return TabPlat.get(i);
	}

	public void lancerDes(ModelJoueur J, ModelTown Tow, ModelTuile Tui) {

		int de1 = ThreadLocalRandom.current().nextInt(1, 7);
		int de2 = ThreadLocalRandom.current().nextInt(1, 7);
		int som = de1+de2;

		if(Tow.getUpdate() == false)
		{
			if(Tow.getIDJoueur() == J.getIDJoueur() ){
				J.getRessources().add(Tui.getTypeRes());
			}
		}else
		{
			if(Tow.getIDJoueur() == J.getIDJoueur() ){
				J.getRessources().add(Tui.getTypeRes());
				J.getRessources().add(Tui.getTypeRes());
			}
		}

		if(J.getRessources().size() > 7){
			int a = ThreadLocalRandom.current().nextInt(1, 4);
			int b = ThreadLocalRandom.current().nextInt(1, 4);
			int c = ThreadLocalRandom.current().nextInt(1, 4);
			int compteur = 0;

			while(compteur < (J.getRessources().size()/2)){
				for (int j=0; j<J.getRessources().size(); j++){
					if(J.getRessources().get(j) == tabResSup[a] || J.getRessources().get(j) == tabResSup[b] || J.getRessources().get(j) == tabResSup[c]){
						J.getRessources().remove(j);
						compteur++;
					}
				}
			}
		}

		deplacerVoleur();

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
					this.TabPlat.get(i).getSommets().get(idsearch).getMystructure().add(new ModelTown());
				}
				int iter=0;
				for(boolean routes:Som.getRoutes()) {
					if(routes){
						int idsearch = GP.getTabPlat(J.getIDPlateauJoueur()).getSommets().indexOf(Som);
						this.TabPlat.get(i).getSommets().get(idsearch).setRoute(iter, true);
						for(int[] v:Som.getVoisin()) {
							int searchedVois = GP.getTabPlat(J.getIDPlateauJoueur()).getSommets().indexOf(v);
							this.TabPlat.get(i).getSommets().get(idsearch).setRoute(iter, true);
						}
					}
				}
				iter++;
			}
		}
	}

}
