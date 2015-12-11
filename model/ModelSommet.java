package model;
import java.util.ArrayList;


public class ModelSommet {

	//Attributs
	private int[] id;	//tableau identification du sommet (ex: X,Y,Z)
	private boolean type; //true=type1 ; false=type2

	private ArrayList<ModelStructure> mystructure;


	//Corps de la classe
	public void construire(ModelStructure struct) {
	}

	//accesseur
	public int[] getId() {
		return id;
	}

	public void setId(int[] id) {
		this.id = id;
	}

	public boolean getType(){
		return type;
	}

	public void setType(boolean type){
		this.type = type;
	}

}