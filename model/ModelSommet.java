package model;
import java.util.ArrayList;


public class ModelSommet {

	//Attributs
	private int[] id;	//tableau identification du sommet (ex: X,Y,Z)
	private boolean type; //true=type1 ; false=type2

	private int[][] voisin;	//Tableau
	private ArrayList<ModelStructure> mystructure;


	//Corps de la classe
	public ModelSommet(boolean type, int[] tab){
		//Generation des sommets voisins d'un sommet donné
		this.setType(type);
		
		id = tab;
		voisin = new int[3][3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				voisin[i][j] = 0;
			}
		}
		
		int b;

		if(this.type==true){
			if((this.id[0]/8)%2 == 0){
				b = 8;
			}else{
				b = 7;
			}
			voisin[0][0]=this.id[1] + b;
			voisin[0][1]=this.id[2];
			voisin[0][2]=this.id[1];

			voisin[1][0]=this.id[2];
			voisin[1][1]=this.id[0]-1;
			voisin[1][2]=this.id[0];

			voisin[2][0]=this.id[1];
			voisin[2][1]=this.id[0];
			voisin[2][2]=this.id[0]+1;

		}else{
			if((this.id[0]/8)%2==0) {
				b = 8;
			} else {
				b = 7;
			}
			voisin[0][0]=this.id[1] - b;
			voisin[0][1]=this.id[2];
			voisin[0][2]=this.id[1];

			voisin[1][0]=this.id[2];
			voisin[1][1]=this.id[0]+1;
			voisin[1][2]=this.id[0];

			voisin[2][0]=this.id[1];
			voisin[2][1]=this.id[0];
			voisin[2][2]=this.id[0]-1;

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

	public int getVoisin(int id, int idTuiles){
		return voisin[id][idTuiles];
	}

	public String toString(){
		String str = "Sommet"+this.id;



		return str;
	}





}