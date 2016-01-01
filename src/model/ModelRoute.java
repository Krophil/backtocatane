package src.model;


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
	/* FONCTION PARTIE DANS LE CONTROLLER*/
	 public void construire(ModelJoueur J, ModelSommet a, ModelSommet b, ModelGestPlat GP){
        ArrayList<String> s = new ArrayList<>();
        s.add("bois");
        s.add("brique");
        J.getRessources().removeAll(s);
        ModelRoute route = new ModelRoute(J.getIDJoueur(),a,b);
        if(isConstructible(a, b, J, GP)){
            GP.getTabPlat(J.getIDPlateauJoueur()).getSommet(a.getId()).getMystructure().add(route);
            a.setRoute(a.numVoisin(b.getId()), true);
            b.setRoute(b.numVoisin(a.getId()), true);
        }
    }


	public boolean isConstructible(ModelSommet a, ModelSommet b, ModelJoueur J, ModelGestPlat GP) {
		Boolean town = false;
		if (a.getBusy()) {
			for (ModelStructure s : GP.getTabPlat(J.getIDPlateauJoueur()).getSommet(a.getId()).getMystructure()) {
				if (s.getClass().getName() == "ModelTown") {
					if (s.getIDJoueur() == J.getIDJoueur()) {
						town = true;
					}
				}
			}
		} else if (b.getBusy()) {
			for (ModelStructure s : GP.getTabPlat(J.getIDPlateauJoueur()).getSommet(b.getId()).getMystructure()) {
				if (s.getClass().getName() == "ModelTown") {
					if (s.getIDJoueur() == J.getIDJoueur()) {
						town = true;
					}
				}
			}
		}
		Boolean noroad = a.getRoute(a.numVoisin(b.getId()));
		return town && noroad;

	}

}

