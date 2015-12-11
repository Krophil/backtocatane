package model;

import java.util.ArrayList;


public class ModelTuile {

	//Attributs
	private int coord;
	private int valeur;
	private boolean playable; //true = playable; false = notplayabe
	private boolean tannen;

	private ArrayList<ModelSommet> mysommet;

	//Corps de la classe

	public ModelTuile(){

	}

	public boolean getPlayable(){
		return playable ;
	}

	public void setPlayable(boolean playable){
		this.playable = playable;
	}

}