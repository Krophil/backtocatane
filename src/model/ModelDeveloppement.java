package src.model;

import java.util.concurrent.ThreadLocalRandom;


public class ModelDeveloppement {

	private int IDDeveloppement;

    public int getIDDeveloppement(){
        return IDDeveloppement;
    }
    public ModelDeveloppement() {
        IDDeveloppement = ThreadLocalRandom.current().nextInt(1, 5);
    }
   

}