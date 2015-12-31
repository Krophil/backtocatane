package src.model;

import java.util.ArrayList;


public class ModelTuile {

	//Attributs
	private int coord;
	private int valeur;
	private boolean playable; //true = playable; false = notplayable

	private boolean tannen;//true = is tannen; false = not Tannen
	private String typeRes;

	private ArrayList<ModelSommet> mysommet;

	//Accesseurs
	public ArrayList<ModelSommet> getMysommet(){
		return mysommet;
	}

    public int getValeur(){
        return valeur;
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
		coord = 0;
		valeur = 0;
		playable = false;

		tannen = false;
		typeRes = "";

		mysommet = new ArrayList<ModelSommet>();
	}

	public ModelTuile(String R){
		coord = 0;
		valeur = 0;
		playable = false;

		tannen = false;
		typeRes = R;

		mysommet = new ArrayList<ModelSommet>();
	}

    public ModelTuile(int coord, int valeur, String R){
		this.coord = coord;
		this.valeur = valeur;
		playable = false;

		tannen = false;
		typeRes = R;

		mysommet = new ArrayList<ModelSommet>();
    }

	public void addSommet(ModelSommet s){
		mysommet.add(s);
	}


}