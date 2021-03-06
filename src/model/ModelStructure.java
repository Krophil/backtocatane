package src.model;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public abstract class ModelStructure {
	//Paramètres
	private int IDJoueur;

	//Accesseur
	public int getIDJoueur(){
		return IDJoueur;
	}


	//corps de la classe
	public ModelStructure(){
		this.IDJoueur = 0;
	}

    /**
     *
     * @param idJ : Id du joueur possédant la structure
     */
	public ModelStructure(int idJ){
		this.IDJoueur = idJ;
	}

    public void setIDJoueur(int IDJoueur){
        this.IDJoueur = IDJoueur;
    }

	public void addToASommet(ModelSommet s){
		s.addMystructure(this);
	}

    public String toString(){
        return ""+IDJoueur+ (this instanceof ModelRoute);
    }
}