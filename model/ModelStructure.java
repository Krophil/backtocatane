package model;

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

	public ModelStructure(int idJ){
		this.IDJoueur = idJ;
	}
}