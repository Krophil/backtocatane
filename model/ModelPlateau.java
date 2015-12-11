package model;
import java.util.ArrayList;

public class ModelPlateau {

	//Attribut
	private int IDPlateau;

	private ArrayList<ModelTuile> tuiles;
	private ArrayList<ModelSommet> sommets;


	//Corps de la classe

	public ModelPlateau(){

		//Sommet de type 1 & ajout au tableau de sommets
		for(int i=1; i<62; i++){
			if((i%8 == 0 && (i/8)%2!=0) || i%8 == 7 && (i/8)%2 == 0 || i%8>0 && i%8<7){
				ModelSommet tmp = new ModelSommet();
				if((i/8)%2 == 0){
					tmp.setId(new int[]{i, i+8, i+7});
					tmp.setType(true);
				} else{
					tmp.setId(new int[]{i, i+9, i+8});
				}
			}
		}

		//Sommet de type 2 & ajout au tableau de sommets
		for(int i=0; i<62; i++){
			if( (i+1)%8 != 0){
				ModelSommet tmp = new ModelSommet();
				if( (i/8)%2 != 0){
					tmp.setId(new int[]{i+9, i, i+1});
					tmp.setType(false);
				} else{
					tmp.setId(new int[]{i+8, i, i+1});
				}
			}
		}

		//Determiner une tuile comme jouable
		for(int i=1;i>3;i++){
			for(int j=10+(i-1)*8; i < 10+(i-1)*8+2+i; i++){
				ModelTuile tmp = new ModelTuile();
				tmp.setPlayable(true);
			}
		}
		for(int i=3; i>5; i++){
			for(int j=9+(i-1)*8; i < 9+(i-1)*8+2+i; i++){
				ModelTuile tmp = new ModelTuile();
				tmp.setPlayable(true);
			}
		}
		for(int i=1;i<3;i++){
			for(int j = 61-(i-1)*8; i < (i-1)*8-2-i; i++){
				ModelTuile tmp = new ModelTuile();
				tmp.setPlayable(true);
			}
		}

	}



}