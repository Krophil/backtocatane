package src.model;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by bombeur toto and krophil on 14/12/15.
 */

/******* MAIL DU PROF lamine.benmimoune@utbm.fr *********/

public class Main {

    public static void main(String[] args) {


        // TODO code application logic here

        /******Génération des plateaux*****/
        ModelPlateau p1985 = new ModelPlateau(1);

        ModelPlateau p1955 = new ModelPlateau(2);
        ModelPlateau p2015 = new ModelPlateau(3);
        ModelPlateau p1885 = new ModelPlateau(4);

        ArrayList<ModelPlateau> listPlat = new ArrayList<ModelPlateau>();

        listPlat.add(p1885);
        listPlat.add(p1955);
        listPlat.add(p1985);
        listPlat.add(p2015);

        /*******Génération des joueurs*******/

        ArrayList<String> ResListe1 = new ArrayList<String>();
        ArrayList<String> ResListe2 = new ArrayList<String>();
        ArrayList<String> ResListe3 = new ArrayList<String>();
        ArrayList<String> ResListe4 = new ArrayList<String>();

        ResListe1.add("res2");
        ResListe1.add("bois");
        ResListe1.add("res2");

        ResListe2.add("brique");
        ResListe2.add("res1");
        ResListe2.add("bois");

        ResListe3.add("res1");
        ResListe3.add("res1");
        ResListe3.add("brique");

        ResListe4.add("brique");
        ResListe4.add("bois");
        ResListe4.add("brique");

        ArrayList<ModelDeveloppement> DevListe1 = new ArrayList<ModelDeveloppement>();
        ArrayList<ModelDeveloppement> DevListe2 = new ArrayList<ModelDeveloppement>();
        ArrayList<ModelDeveloppement> DevListe3 = new ArrayList<ModelDeveloppement>();
        ArrayList<ModelDeveloppement> DevListe4 = new ArrayList<ModelDeveloppement>();

        ModelJoueur J1 = new ModelJoueur(1,ResListe1,DevListe1,1,false);
        ModelJoueur J2 = new ModelJoueur(2,ResListe2,DevListe2,1,true);
        ModelJoueur J3 = new ModelJoueur(3,ResListe3,DevListe3,1,false);
        ModelJoueur J4 = new ModelJoueur(4,ResListe4,DevListe4,1,true);

        System.out.println(J1);
        System.out.println(J2);
        System.out.println(J3);
        System.out.println(J4);

        ArrayList<ModelJoueur> listJoueurs = new ArrayList<ModelJoueur>();

        listJoueurs.add(J1);
        listJoueurs.add(J2);
        listJoueurs.add(J3);
        listJoueurs.add(J4);

        ModelGestPlat GestPlat = new ModelGestPlat(listPlat,listJoueurs);

        ModelTown colonie = new ModelTown();
        ModelRoute route = new ModelRoute();

        MyAliases aliases = new MyAliases();

        System.out.println(aliases.mapTuiles.containsKey(19));
        System.out.println(p1985.getTuile(21).getTypeRes());
        colonie.construire(J2,p1985.getTuile(21).getMysommet().get(2),p1985);


        GestPlat.lancerDes();

        System.out.println(J1);
        System.out.println(J2);
        System.out.println(J3);
        System.out.println(J4);
        J2.setIDPlateauJoueur(2);
        System.out.println(p1885.getTuile(21).getMysommet().get(2).getBusy());
        System.out.println(p1985.getTuile(21).getMysommet().get(2).getBusy());
        System.out.println(p2015.getTuile(21).getMysommet().get(2).getBusy());

        GestPlat.repercution(colonie,J2,p1985,p1985.getTuile(21).getMysommet().get(2));

        System.out.println(p1885.getTuile(21).getMysommet().get(2).getBusy());
        System.out.println(p1985.getTuile(21).getMysommet().get(2).getBusy());
        System.out.println(p2015.getTuile(21).getMysommet().get(2).getBusy());








    }



}
