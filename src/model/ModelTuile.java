package src.model;

import java.util.ArrayList;


public class ModelTuile {

	//Attributs
	private int coord;
	private int valeur;
	private boolean playable; //true = playable; false = notplayabe

	private boolean tannen;//true = is tannen; false = not Tannen
	private String typeRes;

	private ArrayList<ModelSommet> mysommet;

	//Accesseurs
	public ArrayList<ModelSommet> getMysommet(){
		return mysommet;
	}

	public boolean getTannen(){
		return tannen;
	}

	public void setTannen(boolean T){
		this.tannen = true;
	}

	public String getTypeRes(){
		return typeRes;
	}

	public boolean isTannen() {
		return tannen;
	}

	public void setTypeRes(String R){
		this.typeRes = R;
	}

	public int getCoord(){
		return coord;
	}

	public void setCoord(int i){
		coord = i;
	}

	public boolean getPlayable(){
		return playable ;
	}

	public void setPlayable(boolean playable){
		this.playable = playable;
	}

	//Corps de la classe

	public ModelTuile(){

	}

	public ModelTuile(String R){
		this.typeRes = R;
	}



}