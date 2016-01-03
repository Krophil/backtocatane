package src.view;

import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import javax.swing.text.html.ListView;

import src.model.ModelDeveloppement;
import src.model.ModelGestPlat;
import src.model.ModelJoueur;
import src.model.ModelPlateau;
import src.model.ModelRoute;
import src.model.ModelSommet;
import src.model.ModelTown;
import src.model.MyAliases;

/**
 * Created by Pierre Brunet on 30/12/15.
 * Modify by Pierre ROMET on 31/12/15
 * Project name : backtocatane
 * File name :
 */

public class AppCataneController {

	@FXML
	private Label PtVictoire;
	@FXML
	private Label resultDes;

	@FXML
	private Button Joueursuiv;
	@FXML
	private Button Lancerdes;
	@FXML
	private Button UseDev;
	@FXML
	private Button ConstruireR;
	@FXML
	private Button ConstruireV;

	@FXML
	private ListView listRes;


	@FXML
	private Button A0;
	@FXML
	private Button B0;
	@FXML
	private Button C0;
	@FXML
	private Button D0;
	@FXML
	private Button E0;
	@FXML
	private Button F0;
	@FXML
	private Button G0;
	@FXML
	private Button H0;
	@FXML
	private Button I0;
	@FXML
	private Button J0;
	@FXML
	private Button K0;
	@FXML
	private Button L0;
	@FXML
	private Button M0;
	@FXML
	private Button N0;
	@FXML
	private Button O0;
	@FXML
	private Button P0;
	@FXML
	private Button Q0;
	@FXML
	private Button R0;
	@FXML
	private Button S0;

	//A1
	@FXML
	private Button A1;
	@FXML
	private Button B1;
	@FXML
	private Button C1;
	@FXML
	private Button D1;
	@FXML
	private Button E1;
	@FXML
	private Button F1;
	@FXML
	private Button G1;
	@FXML
	private Button H1;
	@FXML
	private Button I1;
	@FXML
	private Button J1;
	@FXML
	private Button K1;
	@FXML
	private Button L1;
	@FXML
	private Button M1;
	@FXML
	private Button N1;
	@FXML
	private Button O1;
	@FXML
	private Button P1;
	@FXML
	private Button Q1;
	@FXML
	private Button R1;
	@FXML
	private Button S1;

	//A2
	@FXML
	private Button A2;
	@FXML
	private Button B2;
	@FXML
	private Button C2;
	@FXML
	private Button D2;
	@FXML
	private Button E2;
	@FXML
	private Button F2;
	@FXML
	private Button G2;
	@FXML
	private Button H2;
	@FXML
	private Button I2;
	@FXML
	private Button J2;
	@FXML
	private Button K2;
	@FXML
	private Button L2;
	@FXML
	private Button M2;
	@FXML
	private Button N2;
	@FXML
	private Button O2;
	@FXML
	private Button P2;
	@FXML
	private Button Q2;
	@FXML
	private Button R2;
	@FXML
	private Button S2;

	//A3
	@FXML
	private Button A3;
	@FXML
	private Button B3;
	@FXML
	private Button C3;
	@FXML
	private Button D3;
	@FXML
	private Button E3;
	@FXML
	private Button F3;
	@FXML
	private Button G3;
	@FXML
	private Button H3;
	@FXML
	private Button I3;
	@FXML
	private Button J3;
	@FXML
	private Button K3;
	@FXML
	private Button L3;
	@FXML
	private Button M3;
	@FXML
	private Button N3;
	@FXML
	private Button O3;
	@FXML
	private Button P3;
	@FXML
	private Button Q3;
	@FXML
	private Button R3;
	@FXML
	private Button S3;


	private ModelGestPlat gestPlat;

	private MyAliases alias;




	public AppCataneController(){

	}

	@FXML
	private void initialize(ModelJoueur J){
		tabres.setCellValueFactory(cellData -> cellData.getValue().);

	}

	private void test(){

	}

	private void setTextTuiles(){
		/*A.setText(String.valueOf(alias.mapTuiles.get(19)));
		B.setText(String.valueOf(alias.mapTuiles.get(20)));
		C.setText(String.valueOf(alias.mapTuiles.get(21)));
		D.setText(String.valueOf(alias.mapTuiles.get(26)));
		E.setText(String.valueOf(alias.mapTuiles.get(27)));
		F.setText(String.valueOf(alias.mapTuiles.get(28)));
		G.setText(String.valueOf(alias.mapTuiles.get(29)));
		H.setText(String.valueOf(alias.mapTuiles.get(34)));
		I.setText(String.valueOf(alias.mapTuiles.get(35)));
		J.setText(String.valueOf(alias.mapTuiles.get(36)));
		K.setText(String.valueOf(alias.mapTuiles.get(37)));
		L.setText(String.valueOf(alias.mapTuiles.get(38)));
		M.setText(String.valueOf(alias.mapTuiles.get(42)));
		N.setText(String.valueOf(alias.mapTuiles.get(43)));
		O.setText(String.valueOf(alias.mapTuiles.get(44)));
		P.setText(String.valueOf(alias.mapTuiles.get(45)));
		Q.setText(String.valueOf(alias.mapTuiles.get(51)));
		R.setText(String.valueOf(alias.mapTuiles.get(52)));
		S.setText(String.valueOf(alias.mapTuiles.get(53)));*/


	}

	public void setMain(ModelGestPlat gestPlat){
		this.gestPlat = gestPlat;
	}

	/**
	 * Called when the user clicks on the "Joueur suivant" button
	 */
	@FXML
	private void joueurSuivant(ModelGestPlat GP){
		for(int i=0; i<GP.getTabJ().size(); i++){
			GP.getTabJ().get(i).setPlaying(true);
			if(i>0 && i<4){
				GP.getTabJ().get(i-1).setPLaying(false);
			} else {
				GP.getTabJ().get(i+4).setPLaying(false);
			}
			//donne les pt de victoire du joueur actuel
			PtVictoire.setText(GP.getTabJ().get(i).toStringComp()); 
			//affiche le tableau de resources du joueur actuel


		}
	}

	/**
	 * Called when the user clicks on the "Lancer Dés" button
	 */
	@FXML
	private void lancerDes(ModelGestPlat GP) {

		GP.lancerDes();
		resultDes.setText(GP.lancerDes());
	}



	/**
	 * Called when the user clicks on the "construire Ville" button
	 */
	@FXML
	private void construireVille(ModelJoueur J, ModelSommet S, ModelPlateau P){
		/**
		 *  Suppression des ressources correspondants à la construction de la ville dans la main du joueur concerné.
		 */
		ModelTown t = new ModelTown(J.getIDJoueur());
		t.construire(J,S,P);
	}

	/**
	 * Called when the user clicks on the "construire Route" button
	 */
	@FXML
	private void construireRoute(ModelJoueur J, ModelSommet a, ModelSommet b, ModelGestPlat GP){
		ModelRoute r = new ModelRoute(J.getIDJoueur());
		r.construire(J,a,b,GP);
	}

	/**
	 * Called when the user clicks on the "Activer Developpement" button
	 */
	@FXML
	private void activateDev(ModelJoueur J, ModelDeveloppement d, ModelGestPlat GP, ModelSommet a, ModelSommet b){
		switch (d.getIDDeveloppement()){
		case 1:
			/**
			 * interaction avec le joueur pour déplacer le Tannen
			 */
			A0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(19), J); GP.repercutTannen(19);});
			B0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(20), J); GP.repercutTannen(20);});
			C0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(21), J); GP.repercutTannen(21);});
			D0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(26), J); GP.repercutTannen(26);});
			E0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(27), J); GP.repercutTannen(27);});
			F0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(28), J); GP.repercutTannen(28);});
			G0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(29), J); GP.repercutTannen(29);});
			H0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(34), J); GP.repercutTannen(34);});
			I0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(35), J); GP.repercutTannen(35);});
			J0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(36), J); GP.repercutTannen(36);});
			K0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(37), J); GP.repercutTannen(37);});
			L0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(38), J); GP.repercutTannen(38);});
			M0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(42), J); GP.repercutTannen(42);});
			N0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(43), J); GP.repercutTannen(43);});
			O0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(44), J); GP.repercutTannen(44);});
			P0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(45), J); GP.repercutTannen(45);});
			Q0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(51), J); GP.repercutTannen(51);});
			R0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(52), J); GP.repercutTannen(52);});
			S0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(53), J); GP.repercutTannen(53);});

			A1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(19), J); GP.repercutTannen(19);});
			B1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(20), J); GP.repercutTannen(20);});
			C1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(21), J); GP.repercutTannen(21);});
			D1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(26), J); GP.repercutTannen(26);});
			E1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(27), J); GP.repercutTannen(27);});
			F1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(28), J); GP.repercutTannen(28);});
			G1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(29), J); GP.repercutTannen(29);});
			H1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(34), J); GP.repercutTannen(34);});
			I1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(35), J); GP.repercutTannen(35);});
			J1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(36), J); GP.repercutTannen(36);});
			K1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(37), J); GP.repercutTannen(37);});
			L1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(38), J); GP.repercutTannen(38);});
			M1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(42), J); GP.repercutTannen(42);});
			N1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(43), J); GP.repercutTannen(43);});
			O1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(44), J); GP.repercutTannen(44);});
			P1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(45), J); GP.repercutTannen(45);});
			Q1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(51), J); GP.repercutTannen(51);});
			R1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(52), J); GP.repercutTannen(52);});
			S1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(53), J); GP.repercutTannen(53);});

			A2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(19), J); GP.repercutTannen(19);});
			B2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(20), J); GP.repercutTannen(20);});
			C2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(21), J); GP.repercutTannen(21);});
			D2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(26), J); GP.repercutTannen(26);});
			E2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(27), J); GP.repercutTannen(27);});
			F2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(28), J); GP.repercutTannen(28);});
			G2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(29), J); GP.repercutTannen(29);});
			H2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(34), J); GP.repercutTannen(34);});
			I2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(35), J); GP.repercutTannen(35);});
			J2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(36), J); GP.repercutTannen(36);});
			K2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(37), J); GP.repercutTannen(37);});
			L2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(38), J); GP.repercutTannen(38);});
			M2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(42), J); GP.repercutTannen(42);});
			N2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(43), J); GP.repercutTannen(43);});
			O2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(44), J); GP.repercutTannen(44);});
			P2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(45), J); GP.repercutTannen(45);});
			Q2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(51), J); GP.repercutTannen(51);});
			R2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(52), J); GP.repercutTannen(52);});
			S2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(53), J); GP.repercutTannen(53);});

			A3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(19), J); GP.repercutTannen(19);});
			B3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(20), J); GP.repercutTannen(20);});
			C3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(21), J); GP.repercutTannen(21);});
			D3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(26), J); GP.repercutTannen(26);});
			E3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(27), J); GP.repercutTannen(27);});
			F3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(28), J); GP.repercutTannen(28);});
			G3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(29), J); GP.repercutTannen(29);});
			H3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(34), J); GP.repercutTannen(34);});
			I3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(35), J); GP.repercutTannen(35);});
			J3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(36), J); GP.repercutTannen(36);});
			K3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(37), J); GP.repercutTannen(37);});
			L3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(38), J); GP.repercutTannen(38);});
			M3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(42), J); GP.repercutTannen(42);});
			N3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(43), J); GP.repercutTannen(43);});
			O3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(44), J); GP.repercutTannen(44);});
			P3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(45), J); GP.repercutTannen(45);});
			Q3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(51), J); GP.repercutTannen(51);});
			R3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(52), J); GP.repercutTannen(52);});
			S3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(53), J); GP.repercutTannen(53);});


			break;
		case 2:
			/**
			 * interaction pour la création de 2 routes
			 */
			ModelRoute i = new ModelRoute(J.getIDJoueur());
			i.construire(J, a, b, GP);
			//ajouter répercution ok

			ModelRoute j = new ModelRoute(J.getIDJoueur());
			j.construire(J, a, b, GP);
			//ajouter repercution ok
			break;
		case 3:
			/**
			 * interaction pour récupérer 2 ressources supplémentaires
			 */
			int x = ThreadLocalRandom.current().nextInt(1,4);
			int y = ThreadLocalRandom.current().nextInt(1,4);

			ArrayList<String> s = new ArrayList <>();
			s.add(GP.getTabResSup(x));
			s.add(GP.getTabResSup(y));

			J.getRessources().addAll(s);

			break;
		case 4:
			J.setCompteurDev(J.getCompteurDev()+1);
		}
	}


	public Button getA0() {
		return A0;
	}

	public Button getB0() {
		return B0;
	}

	public Button getC0() {
		return C0;
	}

	public Button getD0() {
		return D0;
	}

	public Button getE0() {
		return E0;
	}

	public Button getF0() {
		return F0;
	}

	public Button getG0() {
		return G0;
	}

	public Button getH0() {
		return H0;
	}

	public Button getI0() {
		return I0;
	}

	public Button getJ0() {
		return J0;
	}

	public Button getK0() {
		return K0;
	}

	public Button getL0() {
		return L0;
	}

	public Button getM0() {
		return M0;
	}

	public Button getN0() {
		return N0;
	}

	public Button getO0() {
		return O0;
	}

	public Button getP0() {
		return P0;
	}

	public Button getQ0() {
		return Q0;
	}

	public Button getR0() {
		return R0;
	}

	public Button getS0() {
		return S0;
	}

	//
	public Button getA1() {
		return A1;
	}

	public Button getB1() {
		return B1;
	}

	public Button getC1() {
		return C1;
	}

	public Button getD1() {
		return D1;
	}

	public Button getE1() {
		return E1;
	}

	public Button getF1() {
		return F1;
	}

	public Button getG1() {
		return G1;
	}

	public Button getH1() {
		return H1;
	}

	public Button getI1() {
		return I1;
	}

	public Button getJ1() {
		return J1;
	}

	public Button getK1() {
		return K1;
	}

	public Button getL1() {
		return L1;
	}

	public Button getM1() {
		return M1;
	}

	public Button getN1() {
		return N1;
	}

	public Button getO1() {
		return O1;
	}

	public Button getP1() {
		return P1;
	}

	public Button getQ1() {
		return Q1;
	}

	public Button getR1() {
		return R1;
	}

	public Button getS1() {
		return S1;
	}
	//
	public Button getA2() {
		return A2;
	}

	public Button getB2() {
		return B2;
	}

	public Button getC2() {
		return C2;
	}

	public Button getD2() {
		return D2;
	}

	public Button getE2() {
		return E2;
	}

	public Button getF2() {
		return F2;
	}

	public Button getG2() {
		return G2;
	}

	public Button getH2() {
		return H2;
	}

	public Button getI2() {
		return I2;
	}

	public Button getJ2() {
		return J2;
	}

	public Button getK2() {
		return K2;
	}

	public Button getL2() {
		return L2;
	}

	public Button getM2() {
		return M2;
	}

	public Button getN2() {
		return N2;
	}

	public Button getO2() {
		return O2;
	}

	public Button getP2() {
		return P2;
	}

	public Button getQ2() {
		return Q2;
	}

	public Button getR2() {
		return R2;
	}

	public Button getS2() {
		return S2;
	}
	//
	public Button getA3() {
		return A3;
	}

	public Button getB3() {
		return B3;
	}

	public Button getC3() {
		return C3;
	}

	public Button getD3() {
		return D3;
	}

	public Button getE3() {
		return E3;
	}

	public Button getF3() {
		return F3;
	}

	public Button getG3() {
		return G3;
	}

	public Button getH3() {
		return H3;
	}

	public Button getI3() {
		return I3;
	}

	public Button getJ3() {
		return J3;
	}

	public Button getK3() {
		return K3;
	}

	public Button getL3() {
		return L3;
	}

	public Button getM3() {
		return M3;
	}

	public Button getN3() {
		return N3;
	}

	public Button getO3() {
		return O3;
	}

	public Button getP3() {
		return P3;
	}

	public Button getQ3() {
		return Q3;
	}

	public Button getR3() {
		return R3;
	}

	public Button getS3() {
		return S3;
	}
	//SETTER
	public void setA0(Button a) {
		A0 = a;
	}

	public void setB0(Button b) {
		B0 = b;
	}

	public void setC0(Button c) {
		C0= c;
	}

	public void setD0(Button d) {
		D0 = d;
	}

	public void setE0(Button e) {
		E0 = e;
	}

	public void setF0(Button f) {
		F0= f;
	}

	public void setG0(Button g) {
		G0 = g;
	}

	public void setH0(Button h) {
		H0 = h;
	}

	public void setI0(Button i) {
		I0 = i;
	}

	public void setJ0(Button j) {
		J0 = j;
	}

	public void setK0(Button k) {
		K0 = k;
	}

	public void setL0(Button l) {
		L0 = l;
	}

	public void setM0(Button m) {
		M0= m;
	}

	public void setN0(Button n) {
		N0 = n;
	}

	public void setO0(Button o) {
		O0 = o;
	}

	public void setP0(Button p) {
		P0 = p;
	}

	public void setQ0(Button q) {
		Q0 = q;
	}

	public void setR0(Button r) {
		R0= r;
	}

	public void setS0(Button s) {
		S0 = s;
	}
	//A1
	public void setA1(Button a) {
		A1 = a;
	}

	public void setB1(Button b) {
		B1 = b;
	}

	public void setC1(Button c) {
		C1 = c;
	}

	public void setD1(Button d) {
		D1 = d;
	}

	public void setE1(Button e) {
		E1 = e;
	}

	public void setF1(Button f) {
		F1 = f;
	}

	public void setG1(Button g) {
		G1= g;
	}

	public void setH1(Button h) {
		H1 = h;
	}

	public void setI1(Button i) {
		I1 = i;
	}

	public void setJ1(Button j) {
		J1 = j;
	}

	public void setK1(Button k) {
		K1 = k;
	}

	public void setL1(Button l) {
		L1 = l;
	}

	public void setM1(Button m) {
		M1 = m;
	}

	public void setN1(Button n) {
		N1 = n;
	}

	public void setO1(Button o) {
		O1 = o;
	}

	public void setP1(Button p) {
		P1 = p;
	}

	public void setQ1(Button q) {
		Q1 = q;
	}

	public void setR1(Button r) {
		R1 = r;
	}

	public void setS1(Button s) {
		S1 = s;
	}
	//A2
	public void setA2(Button a) {
		A2= a;
	}

	public void setB2(Button b) {
		B2 = b;
	}

	public void setC2(Button c) {
		C2 = c;
	}

	public void setD2(Button d) {
		D2 = d;
	}

	public void setE2(Button e) {
		E2 = e;
	}

	public void setF2(Button f) {
		F2 = f;
	}

	public void setG2(Button g) {
		G2 = g;
	}

	public void setH2(Button h) {
		H2= h;
	}

	public void setI2(Button i) {
		I2 = i;
	}

	public void setJ2(Button j) {
		J2 = j;
	}

	public void setK2(Button k) {
		K2 = k;
	}

	public void setL2(Button l) {
		L2 = l;
	}

	public void setM2(Button m) {
		M2 = m;
	}

	public void setN2(Button n) {
		N2 = n;
	}

	public void setO2(Button o) {
		O2 = o;
	}

	public void setP2(Button p) {
		P2= p;
	}

	public void setQ2(Button q) {
		Q2 = q;
	}

	public void setR2(Button r) {
		R2 = r;
	}

	public void setS2(Button s) {
		S2 = s;
	}
	//A3
	public void setA3(Button a) {
		A3 = a;
	}

	public void setB3(Button b) {
		B3 = b;
	}

	public void setC3(Button c) {
		C3 = c;
	}

	public void setD3(Button d) {
		D3 = d;
	}

	public void setE3(Button e) {
		E3 = e;
	}

	public void setF3(Button f) {
		F3 = f;
	}

	public void setG3(Button g) {
		G3 = g;
	}

	public void setH3(Button h) {
		H3 = h;
	}

	public void setI3(Button i) {
		I3 = i;
	}

	public void setJ3(Button j) {
		J3 = j;
	}

	public void setK3(Button k) {
		K3 = k;
	}

	public void setL3(Button l) {
		L3 = l;
	}

	public void setM3(Button m) {
		M3 = m;
	}

	public void setN3(Button n) {
		N3 = n;
	}

	public void setO3(Button o) {
		O3 = o;
	}

	public void setP3(Button p) {
		P3 = p;
	}

	public void setQ3(Button q) {
		Q3 = q;
	}

	public void setR3(Button r) {
		R3 = r;
	}

	public void setS3(Button s) {
		S3 = s;
	}












}
