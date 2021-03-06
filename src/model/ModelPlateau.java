package src.model;
//import com.sun.javafx.sg.prism.NGShape;

import com.sun.javafx.sg.prism.NGShape;

import java.util.ArrayList;
import java.util.Arrays;

public class ModelPlateau {

	//Attribut
	private int IDPlateau;

	private ArrayList<ModelTuile> tuiles;
	private ArrayList<ModelSommet> sommets;

	//Accesseur
	public int getSizeSommets(){
		return sommets.size();
	}

	public int getIDPlateau(){
		return IDPlateau;
	}

	public void setIDPlateau(int newIDPlateau){
		this.IDPlateau = newIDPlateau;
	}

	public ArrayList<ModelSommet> getSommets(){
		return sommets;
	}

	public ModelSommet getSommet(int a){
		return sommets.get(a);
	}

    public void setSommets(ArrayList<ModelSommet> sommets) {
        this.sommets = sommets;
    }

    public void setTuiles(ArrayList<ModelTuile> tuiles) {
        this.tuiles = tuiles;
    }

    public ArrayList<ModelTuile> getTuiles(){
		return tuiles;
	}

	public ModelTuile getTuile(int a){
		return tuiles.get(a);
	}


	//Corps de la classe
	//Trouve un sommet du plateau sur lequel le joueur se trouve en fournissant un tableau d'identifiant
	public ModelSommet getSommet(int[] id){
		ModelSommet som = new ModelSommet();
		for(ModelSommet s:this.sommets){
			if(id == s.getId()){
				som = s;
			}
		}
		return som;
	}

	public ModelPlateau(int id){
        IDPlateau = id;
        tuiles = new ArrayList<ModelTuile>();
        MyAliases aliases = new MyAliases();
        for(int i=0;i<8;i++){
            String tmp;
            for(int j=0;j<8;j++){
                if(aliases.mapTuiles.containsKey(8*i+j)){
                    tuiles.add(new ModelTuile(8*i+j, aliases.mapTuiles.get(8*i+j), aliases.ResDResource.get(8*i+j)));
                } else {
                    tuiles.add(new ModelTuile(8*i+j, 1, "neither"));
                }
            }
        }
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
		for(int i=1;i<3;i++){
			for(int j=10+(i-1)*8; i < 10+(i-1)*8+2+i; i++){
				ModelTuile tmp = new ModelTuile();
				tmp.setPlayable(true);
			}
		}
		for(int i=3; i<5; i++){
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

		for(ModelTuile t: tuiles){
			for(ModelSommet s:sommets){
				for(int i : s.getId()) {
					if (i == t.getCoord()) {
						t.addSommet(s);
					}
				}
            }
        }

	}



}