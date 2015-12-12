package model;

public abstract class ModelStructure {

	private int IDJoueur;

	public ModelStructure(){
		this.IDJoueur = 0;
	}

	public ModelStructure(int idJ){
		this.IDJoueur = idJ;
	}
}