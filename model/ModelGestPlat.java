package model;

import java.util.ArrayList;

public class ModelGestPlat {

	int[][] tuiles = new int[4][37];  //37 tuiles jouables
	int[][] sommets = new int [4][54];
	private ArrayList<ModelPlateau> TabPlat;

	public ModelGestPlat(){

	}

	public ModelPlateau getTabPlat(int i){
		return TabPlat.get(i);
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
                for(boolean routes:Som.getRoutes())
                    if(routes){
                        int idsearch = GP.getTabPlat(J.getIDPlateauJoueur()).getSommets().indexOf(Som);
                        this.TabPlat.get(i).getSommets().get(idsearch).setRoute(iter, true);
                        for(int[] v:Som.getVoisin()) {
                            int searchedVois = GP.getTabPlat(J.getIDPlateauJoueur()).getSommets().indexOf(v);
                            this.TabPlat.get(i).getSommets().get(idsearch).setRoute(iter, true);
                        }
                    }
                iter++;
            }
        }
    }

}
