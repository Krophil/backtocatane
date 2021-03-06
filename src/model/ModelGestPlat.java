package src.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import src.view.AppCataneController;



public class ModelGestPlat {

	private ArrayList<ModelPlateau> TabPlat;
	private ArrayList<ModelJoueur> TabJ;
	private String[] tabResSup;

	//Accesseurs



	public String[] getTabResSup(){
		return tabResSup;
	}

	public String getTabResSup(int i){
		return tabResSup[i];
	}

	public ArrayList<ModelPlateau> getTabPlat(){
		return TabPlat;
	}

	public ArrayList<ModelJoueur> getTabJ(){
		return TabJ;
	}

	public ModelPlateau getTabPlat(int i){
		return TabPlat.get(i);
	}

	//Corps de la classe

	public ModelGestPlat(){
		tabResSup = new String[4];
		tabResSup[0] = "bois";
		tabResSup[1] = "brique";
		tabResSup[2] = "res1";
		tabResSup[3] = "res2";

		TabJ = new ArrayList<ModelJoueur>();
		TabPlat = new ArrayList<ModelPlateau>();



	}

	public ModelGestPlat(ArrayList<ModelPlateau> newTabPlat, ArrayList<ModelJoueur> newTabJ){
		tabResSup = new String[4];
		tabResSup[0] = "bois";
		tabResSup[1] = "brique";
		tabResSup[2] = "res1";
		tabResSup[3] = "res2";

		TabJ = new ArrayList<ModelJoueur>(newTabJ);
		TabPlat = new ArrayList<ModelPlateau>(newTabPlat);

	}

	public String lancerDes() {

		int de1 = ThreadLocalRandom.current().nextInt(1, 7);
		int de2 = ThreadLocalRandom.current().nextInt(1, 7);
		int som = de1+de2;
		//int som = 5;
		System.out.println(som);
		for(ModelTuile t:getTabPlat(0).getTuiles()){
			if(t.getValeur()==som){
				for(int i=0; i<4;i++){
					for(ModelSommet s: this.TabPlat.get(i).getTuile(t.getCoord()).getMysommet()){
						if(s.getBusy())
						{
                            for(ModelJoueur joueur:TabJ){
                                ressourceMining(joueur,s.getTown(), t);
                            }
						}
					}
				}
			}
		}
        return ""+som;

	}

	public void ressourceMining(ModelJoueur J, ModelTown Tow, ModelTuile Tui){

		if(!(Tow.getUpdate()) && !(Tui.isTannen()))
		{
			if(Tow.getIDJoueur() == J.getIDJoueur() ){
				J.setRessources(Tui.getTypeRes());
			}
		}else if(Tow.getUpdate() && !(Tui.isTannen()))
		{
			if(Tow.getIDJoueur() == J.getIDJoueur() ){
				J.setRessources(Tui.getTypeRes());
				J.setRessources(Tui.getTypeRes());
			}
		}

		if(Tui.getValeur()==7){
            if(J.getRessources().size() > 7){
                int a = ThreadLocalRandom.current().nextInt(1, 4);
                int b = ThreadLocalRandom.current().nextInt(1, 4);
                int c = ThreadLocalRandom.current().nextInt(1, 4);
                int compteur = 0;

                while(compteur < (J.getRessources().size()/2)){
                    for (int j=0; j<J.getRessources().size(); j++){
                        if(J.getRessources().get(j) == tabResSup[a] || J.getRessources().get(j) == tabResSup[b] || J.getRessources().get(j) == tabResSup[c]){
                            ArrayList<String> res = J.getRessources();
                            res.remove(j);
                            J.setRessources(res);
                            compteur++;
                        }
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
	public void repercution(ModelStructure S, ModelJoueur J, ModelPlateau P, ModelSommet Som){
		if(Som.getBusy()){
			int i=J.getIDPlateauJoueur(); //i = le plateau du joueur
			if(Som.getTown().getIDJoueur()==J.getIDJoueur()){ //Si le sommet a une ville, don't l'id joueur == id du joueur actuel
				int idsearch = this.getTabPlat(J.getIDPlateauJoueur()).getSommets().indexOf(Som); //Dans le plateau actu du joueur, on recupère le sommet dans le tableau de sommet
				for(int j=i+1;j<4;j++){
					ModelTown t = new ModelTown(J.getIDJoueur());
					this.TabPlat.get(j).getSommets().get(idsearch).setBusy(true);
					//t.addToASommet(Som);
					t.setIDJoueur(J.getIDJoueur());
					//t.addToASommet(this.TabPlat.get(j).getSommets().get(idsearch));
					this.TabPlat.get(j).getSommets().get(idsearch).setTown(t);
				}
			}
		}
		int iterator=0;
		for(int b=0;b<Som.getRoutes().length;b++){
			if(Som.getRoute(b)){
				int idsearch = this.getTabPlat(J.getIDPlateauJoueur()).getSommets().indexOf(Som);// idsearch contient un index, c'est a dire un int
				for(int j=J.getIDPlateauJoueur()+1;j<4;j++){//PK +1 à l'id du joueur et pas à l'idplateaujoueur ?
					ModelRoute r = new ModelRoute(J.getIDJoueur()); //TODO : TROUVER LES SOMMETS A ET B de la route de base
					r.addToASommet(this.TabPlat.get(j).getSommet(idsearch)); //ajoute a myStructure ce que contient le tableau de ModelSommet a l'index (idsearch)
                    this.TabPlat.get(j).getSommet(idsearch).setRoute(iterator, true);
                    int[] v = Som.getVoisin(b);
                    int searchedVois=-1;
                    for(ModelSommet s: this.getTabPlat(J.getIDPlateauJoueur()).getSommets()){
                        boolean equal = true;
                        for(int V=0;V<3;V++){
                            if(v[V]!=s.getId()[V]){
                                equal=false;
                            }
                        }
                        if(equal)
                            searchedVois=this.getTabPlat(J.getIDPlateauJoueur()).getSommets().indexOf(s);
                    }
                    //int searchedVois = this.getTabPlat(J.getIDPlateauJoueur()).getSommets().indexOf(v); //searchVoisin contient un index (int)
                    //System.out.println("searched voisin :" + searchedVois + v[0]+v[1]+v[2]);
                    if(searchedVois!=-1){
                        r.addToASommet(this.TabPlat.get(j).getSommet(searchedVois));
                        //r.addRoute(this.TabPlat.get(j).getSommet(searchedVois), searchedVois);
                        this.TabPlat.get(j).getSommet(searchedVois).setRoute(iterator, true);
                        //this.TabPlat.get(j).getSommet(searchedVois).displayRoute();
                    }

				}
			}
			iterator++;
		}

    }


    public boolean fin(){
        for(ModelJoueur j:this.TabJ) {
            if(j.getCompteurJeu()+j.getCompteurDev()>=10)
                return true;
        }
        return false;
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
        //Déplacer sur la tuile newTannen
        for(ModelPlateau p: this.getTabPlat())
        {
            for(ModelTuile t: p.getTuiles()){
                if((t.getCoord()!=27 && t.getCoord()!=37 && t.getCoord()!=43) && t.isTannen())
                    t.setTannen(false);
            }
        }

        newTannen.setTannen(true);

        repercutTannen(newTannen.getCoord()); //Deplacer Tannen dans les autres plateaux
        hasMoved = true;
        //System.out.println("test");
        /**
         * tannen vole une ressource
         * Pour une tuile donné repercuté a chaque tableau, on regarde ses sommets,
         * si un sommets est occupé par une ville, on prend une resource au joueur concerné.
         */
        int i=J.getIDPlateauJoueur();
        for(ModelSommet s: this.TabPlat.get(i).getTuile(newTannen.getCoord()).getMysommet()){
            System.out.println(s+""+s.getTown());
            if(s.getBusy())
            {
                if (s.getTown().getIDJoueur()!=-1 && s.getTown().getIDJoueur()!=J.getIDJoueur())
                {
                    System.out.println("Joueur = "+s.getTown().getIDJoueur());
                    if(this.TabJ.get(s.getTown().getIDJoueur()).getRessources().size()>0){
                        J.getRessources().add(this.TabJ.get(s.getTown().getIDJoueur()).getRessources().get(0));
                        //System.out.println(this.TabJ.get(s.getTown().getIDJoueur()).getRessources());
                        this.TabJ.get(s.getTown().getIDJoueur()).getRessources().remove(0);
                        //System.out.println(this.TabJ.get(s.getTown().getIDJoueur()).getRessources());
                    }

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


	public void showAppCatane() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ModelGestPlat.class.getResource("view/AppCatane.fxml"));
			AnchorPane AppCatane = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			//rootLayout.setCenter(MultiPlat);

			// Give the controller access to the main app.
			AppCataneController controller = loader.getController();
			controller.setMain(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}




}
