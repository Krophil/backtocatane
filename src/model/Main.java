package src.model;

import java.util.ArrayList;


/**
 * Created by bombeur toto and krophil on 14/12/15.
 */

/******* MAIL DU PROF lamine.benmimoune@utbm.fr *********/

public class Main {

    public static void main(String[] args) {


        // TODO code application logic here



        ArrayList<String> ResListe1 = new ArrayList<String>();
        ArrayList<String> ResListe2 = new ArrayList<String>();

        ArrayList<String> asklist = new ArrayList<String>();
        ArrayList<String> givlist = new ArrayList<String>();



        ArrayList<ModelDeveloppement> DevListe1 = new ArrayList<ModelDeveloppement>();
        ArrayList<ModelDeveloppement> DevListe2 = new ArrayList<ModelDeveloppement>();



        ResListe1.add("res2");
        ResListe1.add("bois");
        ResListe1.add("res2");

        ResListe2.add("brique");
        ResListe2.add("res1");
        ResListe2.add("bois");

        givlist.add("bois");

        asklist.add("brique");
        asklist.add("res1");

        ModelPlateau p1 = new ModelPlateau();

        ModelJoueur J1;
        ModelJoueur J2;

        J1 = new ModelJoueur(1,ResListe1,DevListe1,1,false);
        J2 = new ModelJoueur(2,ResListe2,DevListe2,1,true);


        System.out.println(J1);
        System.out.println(J2);


        System.out.println("\nCONSTRUCTION POSSIBLE \n");
        System.out.println(J1.constructionPossible());
        System.out.println(J2.constructionPossible());

        System.out.println("\n\nTEST D'ECHANGE:\n");
        J1.echange(J2,asklist,givlist);

        System.out.println("\n");
        System.out.println(J1);
        System.out.println(J2);


        System.out.println("\n\nTEST DE LANCER DE DES:\n");
        System.out.println(J1.lancerDes());


        for(int a=0;a<p1.getSizeSommets();a++){
            System.out.println("Sommet n°"+(1+a));
            for(int id: p1.getSommet(a).getId()){
                System.out.println(id);
            }
            for(int i=0;i<3;i++){
                System.out.println("Sommet voisin n°"+(i+1));
                for(int j=0;j<3;j++){
                    System.out.println("Tuile voisine n°"+(j+1));
                    System.out.println(p1.getSommet(a).getVoisin(i,j));
                }
            }


        }



    }



}
