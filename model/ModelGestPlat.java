package model;

import java.util.ArrayList;

public class ModelGestPlat {

	int[][] tuiles = new int[4][37];  //37 tuiles jouables
	int[][] sommets = new int [4][54];
	private ArrayList<ModelPlateau> TabPlat;

	public ModelGestPlat(){

	}

	public ModelPlateau getTabPlat(int i){
		return TabPlat.get(i);
	}


}
