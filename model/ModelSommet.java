package model;
import java.util.ArrayList;


public class ModelSommet {

	//Attributs
	private int[] id;	//tableau identification du sommet (ex: X,Y,Z)
	private boolean type; //true=type1 ; false=type2

	private ModelSommet[][] voisin;	//Tableau doubleEntrée 
	private ArrayList<ModelStructure> mystructure;


	//Corps de la classe
	public ModelSommet(){
		//Generation des sommets voisins d'un sommet donnée
		ModelSommet[] voisin = new ModelSommet[3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				voisin[i].id[j] = 0;
			}
		}
		int b;
		if(this.type==false){
			if((this.id[0]/8)%2 == 0){
				b = 7;
			}else{
				b = 8;
			}
			voisin[0].id[0]=this.id[1] + b;
			voisin[0].id[1]=this.id[2];
			voisin[0].id[2]=this.id[1];

			voisin[1].id[0]=this.id[2];
			voisin[1].id[1]=this.id[0]-1;
			voisin[1].id[2]=this.id[0];

			voisin[2].id[0]=this.id[1];
			voisin[2].id[1]=this.id[0];
			voisin[2].id[2]=this.id[0]+1;

		}else{
			if((this.id[0]/8)%2==0) {
				b = 8;
			} else {
				b = 7;
			}
			voisin[0].id[0]=this.id[1] - b;
			voisin[0].id[1]=this.id[2];
			voisin[0].id[2]=this.id[1];

			voisin[1].id[0]=this.id[2];
			voisin[1].id[1]=this.id[0]+1;
			voisin[1].id[2]=this.id[0];

			voisin[2].id[0]=this.id[1];
			voisin[2].id[1]=this.id[0];
			voisin[2].id[2]=this.id[0]-1;

		}
	}

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