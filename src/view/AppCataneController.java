package src.view;

import java.awt.Label;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import src.model.ModelDeveloppement;
import src.model.ModelGestPlat;
import src.model.ModelJoueur;
import src.model.ModelPlateau;
import src.model.ModelRoute;
import src.model.ModelSommet;
import src.model.ModelTown;
import src.model.ModelTuile;
import src.model.MyAliases;

/**
 * Created by Pierre Brunet on 30/12/15.
 * Modify by Pierre ROMET on 31/12/15
 * Project name : backtocatane
 * File name :
 */

public class AppCataneController {

	@FXML
	private Label A0;
	@FXML
	private Label B0;
	@FXML
	private Label C0;
	@FXML
	private Label D0;
	@FXML
	private Label E0;
	@FXML
	private Label F0;
	@FXML
	private Label G0;
	@FXML
	private Label H0;
	@FXML
	private Label I0;
	@FXML
	private Label J0;
	@FXML
	private Label K0;
	@FXML
	private Label L0;
	@FXML
	private Label M0;
	@FXML
	private Label N0;
	@FXML
	private Label O0;
	@FXML
	private Label P0;
	@FXML
	private Label Q0;
	@FXML
	private Label R0;
	@FXML
	private Label S0;

	//A1
	private Label A1;
	@FXML
	private Label B1;
	@FXML
	private Label C1;
	@FXML
	private Label D1;
	@FXML
	private Label E1;
	@FXML
	private Label F1;
	@FXML
	private Label G1;
	@FXML
	private Label H1;
	@FXML
	private Label I1;
	@FXML
	private Label J1;
	@FXML
	private Label K1;
	@FXML
	private Label L1;
	@FXML
	private Label M1;
	@FXML
	private Label N1;
	@FXML
	private Label O1;
	@FXML
	private Label P1;
	@FXML
	private Label Q1;
	@FXML
	private Label R1;
	@FXML
	private Label S1;

	//A2	
	private Label A2;
	@FXML
	private Label B2;
	@FXML
	private Label C2;
	@FXML
	private Label D2;
	@FXML
	private Label E2;
	@FXML
	private Label F2;
	@FXML
	private Label G2;
	@FXML
	private Label H2;
	@FXML
	private Label I2;
	@FXML
	private Label J2;
	@FXML
	private Label K2;
	@FXML
	private Label L2;
	@FXML
	private Label M2;
	@FXML
	private Label N2;
	@FXML
	private Label O2;
	@FXML
	private Label P2;
	@FXML
	private Label Q2;
	@FXML
	private Label R2;
	@FXML
	private Label S2;

	//A3
	private Label A3;
	@FXML
	private Label B3;
	@FXML
	private Label C3;
	@FXML
	private Label D3;
	@FXML
	private Label E3;
	@FXML
	private Label F3;
	@FXML
	private Label G3;
	@FXML
	private Label H3;
	@FXML
	private Label I3;
	@FXML
	private Label J3;
	@FXML
	private Label K3;
	@FXML
	private Label L3;
	@FXML
	private Label M3;
	@FXML
	private Label N3;
	@FXML
	private Label O3;
	@FXML
	private Label P3;
	@FXML
	private Label Q3;
	@FXML
	private Label R3;
	@FXML
	private Label S3;


	private ModelGestPlat gestPlat;

	private MyAliases alias;

	public Label getA() {
		return A;
	}

	public Label getB() {
		return B;
	}

	public Label getC() {
		return C;
	}

	public Label getD() {
		return D;
	}

	public Label getE() {
		return E;
	}

	public Label getF() {
		return F;
	}

	public Label getG() {
		return G;
	}

	public Label getH() {
		return H;
	}

	public Label getI() {
		return I;
	}

	public Label getJ() {
		return J;
	}

	public Label getK() {
		return K;
	}

	public Label getL() {
		return L;
	}

	public Label getM() {
		return M;
	}

	public Label getN() {
		return N;
	}

	public Label getO() {
		return O;
	}

	public Label getP() {
		return P;
	}

	public Label getQ() {
		return Q;
	}

	public Label getR() {
		return R;
	}

	public Label getS() {
		return S;
	}

	public void setA(Label a) {
		A = a;
	}

	public void setB(Label b) {
		B = b;
	}

	public void setC(Label c) {
		C = c;
	}

	public void setD(Label d) {
		D = d;
	}

	public void setE(Label e) {
		E = e;
	}

	public void setF(Label f) {
		F = f;
	}

	public void setG(Label g) {
		G = g;
	}

	public void setH(Label h) {
		H = h;
	}

	public void setI(Label i) {
		I = i;
	}

	public void setJ(Label j) {
		J = j;
	}

	public void setK(Label k) {
		K = k;
	}

	public void setL(Label l) {
		L = l;
	}

	public void setM(Label m) {
		M = m;
	}

	public void setN(Label n) {
		N = n;
	}

	public void setO(Label o) {
		O = o;
	}

	public void setP(Label p) {
		P = p;
	}

	public void setQ(Label q) {
		Q = q;
	}

	public void setR(Label r) {
		R = r;
	}

	public void setS(Label s) {
		S = s;
	}

	public AppCataneController(){

	}
	//IICICICICICI
	@FXML
	private void initialize(){
	}

	private void test(){

	}

	private void setTextTuiles(){
		A.setText(String.valueOf(alias.mapTuiles.get(19)));
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
		S.setText(String.valueOf(alias.mapTuiles.get(53)));


	}

	public void setMain(ModelGestPlat gestPlat){
		this.gestPlat = gestPlat;
	}

	/**
	 * Called whenthe user clicks on the "Joueur suivant" button
	 */
	@FXML
	private void joueurSuivant(ModelGestPlat GP){
		for(int i=0; i<GP.getTabJ().size(); i++){
			GP.getTabJ().get(i);
			if(i == GP.getTabJ().size()){
				i=0;
			}
		}
	}

	/**
	 * Called when the user clicks on the "Lancer Dés" button
	 */
	@FXML
	private void lancerDes(ModelGestPlat GP) {

		GP.lancerDes();


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
	private void activateDev(ModelJoueur J, ModelDeveloppement d, ModelGestPlat GP, ModelSommet a, ModelSommet b, ModelTuile newTannen){
		switch (d.getIDDeveloppement()){
		case 1:
			/**
			 * interaction avec le joueur pour déplacer le Tannen
			 */
			GP.deplacerVoleur(newTannen, J);
			GP.repercutTannen(coordTanFournie); //recuperer coord de la tuile par un clic de sourie sur la tuile souhaité.

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













}
