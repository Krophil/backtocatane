package model;
import com.sun.javafx.sg.prism.NGShape;

import java.util.ArrayList;

public class ModelPlateau {

	//Attribut
	private int IDPlateau;


	private ArrayList<ModelTuile> tuiles;
	private ArrayList<ModelSommet> sommets;

	//Accesseur
	public ArrayList<ModelSommet> getSommets(){
		return sommets;
	}

	public ModelSommet getSommet(int a){
		return sommets.get(a);
	}

    public ModelSommet getSommet(int[] id, int plateau){
        for(ModelSommet s:this.sommets){
            if(id == s.getId()){
                return s;
            }
        }
    }

	public int getSizeSommets(){
		return sommets.size();
	}

	//Corps de la classe

	public int getIDPlateau(){
		return IDPlateau;
	}

	public void setIDPlateau(int newIDPlateau){
		this.IDPlateau = newIDPlateau;
	}

	public ModelPlateau(){
		sommets = new ArrayList<ModelSommet>();
		//Sommet de type 1 & ajout au tableau de sommets
		for(int i=1; i<62; i++){
			if( (i%8 == 0 && (i/8)%2!=0) || (i%8 == 7 && (i/8)%2 == 0) || (i%8<7 && i%8>0) ){
				if ((i / 8) % 2 == 0) {
					ModelSommet somtmp = new ModelSommet(true, new int[]{i, i + 8, i + 7});
					sommets.add(somtmp);
				} else {
					ModelSommet somtmp = new ModelSommet(true, new int[]{i, i + 9, i + 8});
					sommets.add(somtmp);
				}

			}
		}

		//Sommet de type 2 & ajout au tableau de sommets
		for(int i=0; i<62; i++){
			if((i+1)%8 != 0){
				if( (i/8)%2 != 0){
					ModelSommet somtmp = new ModelSommet(false, new int[]{i+9, i, i+1});
					sommets.add(somtmp);
				} else{
					ModelSommet somtmp = new ModelSommet(false, new int[]{i+8, i, i+1});
					sommets.add(somtmp);
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