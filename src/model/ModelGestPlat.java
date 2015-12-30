package src.model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ModelGestPlat {

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

		TabJ = null;
		TabPlat = null;

	}

	public ModelGestPlat(ArrayList<ModelPlateau> newTabPlat, ArrayList<ModelJoueur> newTabJ){
		tabResSup[0] = "bois";
		tabResSup[1] = "brique";
		tabResSup[2] = "res1";
		tabResSup[3] = "res2";

		TabJ = newTabJ;
		TabPlat = newTabPlat;

	}



	public ModelPlateau getTabPlat(int i){
		return TabPlat.get(i);
	}

	//Corps de la classe

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
				/**
				 * Demander au joueur la tuile,
				 */
				//deplacerVoleur(t, J);
			}
		}
	}

	/**
	 * A partir de l'époque du plateau, on repercute la création de la ville dans les plateaux suivants.
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

	/**
	 * A partir de l'époque du plateau, on repercute Tannen dans les plateaux suivants.
	 */
	public void repercutTannen(int coordTanFournie){
		/**
		 * on a la tuile ou se trouve Tannen dans le tableau donné.
		 * On doit le répercuter dans tous les autre tableau peut importe l'ordre.		 * 
		 */
		for (int i=0; i<4;i++){
			if(this.TabPlat.get(i).getTuile(coordTanFournie).getTannen() == false){ //si dans un autre tableau, la tuile n'as pas de tannen, on lui met le boolean Tannen à true
				this.TabPlat.get(i).getTuile(coordTanFournie).setTannen(true);
			}
		}

	}

	public boolean deplacerVoleur(ModelTuile newTannen, ModelJoueur J){
		Boolean hasMoved = false;
		for(ModelTuile t:TabPlat.get(J.getIDPlateauJoueur()).getTuiles()){ //Parcours les tuiles du plateau
			if(t.isTannen()) {//On cherche la tuile possédant précédemment le voleur
				if (t.getCoord() != newTannen.getCoord()) {//La nouvelle tuile tiré a une coordonnée diiférente que celle ou se trouve le voleur

					//Déplacer sur la tuile newTannen
					t.setTannen(false);
					newTannen.setTannen(true);

					repercutTannen(newTannen.getCoord()); //Deplacer Tannen dans les autres plateaux

					/**
					 * tannen vole une ressource
					 * Pour une tuile donné repercuté a chaque tableau, on regarde ses sommets,
					 * si un sommets est occupé par une ville, on prend une resource au joueur concerné.
					 */
					for(int i=0; i<4;i++){
						for(int j=0; j<this.TabPlat.get(i).getTuile(newTannen.getCoord()).getMysommet().size(); j++ ){
							if(this.TabPlat.get(i).getTuile(newTannen.getCoord()).getMysommet().get(j).getBusy() == true)
							{
								for(ModelStructure s:this.TabPlat.get(i).getTuile(newTannen.getCoord()).getMysommet().get(j).getMystructure()){
									if (s.getClass().getName().equals("ModelTown"))
									{
										s.getIDJoueur();
										int a = ThreadLocalRandom.current().nextInt(1, 4);

										for(int w=0; w< J.getJoueur(s.getIDJoueur()).getRessources().size(); w++){
											if(J.getJoueur(s.getIDJoueur()).getRessources().get(w) == tabResSup[a]){
												J.getJoueur(s.getIDJoueur()).getRessources().remove(w);
											}
										}										
									}									
								}					
							}
						}
					}
					hasMoved = true;

				} else {//c'est la même tuile, le joueur devra recommencer (c'est dans la view)
					hasMoved = false;
				}
			}
		}
		return hasMoved;
	}

	public void activateDev(ModelJoueur J, ModelDeveloppement d){
		switch (d.getIDDeveloppement()){
		case 1:
			/**
			 * interaction avec le joueur pour déplacer le Tannen
			 */
			break;
		case 2:
			/**
			 * interaction pour la création de 2 routes
			 */
			break;
		case 3:
			/**
			 * interaction pour récupérer 2 ressources supplémentaires
			 */
			break;
		case 4:
			J.setCompteurDev(J.getCompteurDev()+1);
		}
	}

	public void creerDelorean(ModelJoueur J){
		/**
		 *  Suppression des ressources correspondants à la construction de la Delorean dans la main du joueur concerné.
		 */
		ArrayList<String> C = new ArrayList<>();
		C.add("res1");
		C.add("res1");
		C.add("res2");

		J.getRessources().removeAll(C);
		J.setHasDelorean(true);
	}

	public void reparerDelorean(ModelJoueur J){
		/**
		 *  Suppression des ressources correspondants à la construction de la Delorean dans la main du joueur concerné.
		 */
		ArrayList<String> R = new ArrayList<>();
		R.add("res1");
		R.add("res1");
		R.add("res2");

		J.getRessources().removeAll(R);
		J.setGarageDelorean(true);
	}







}
