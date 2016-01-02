package src.view;

import javafx.scene.control.Label;
import javafx.fxml.FXML;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import src.model.ModelDeveloppement;
import src.model.ModelGestPlat;
import src.model.ModelJoueur;
import src.model.ModelPlateau;
import src.model.ModelRoute;
import src.model.ModelSommet;
import src.model.ModelStructure;
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
	private Label A;
	@FXML
	private Label B;
	@FXML
	private Label C;
	@FXML
	private Label D;
	@FXML
	private Label E;
	@FXML
	private Label F;
	@FXML
	private Label G;
	@FXML
	private Label H;
	@FXML
	private Label I;
	@FXML
	private Label J;
	@FXML
	private Label K;
	@FXML
	private Label L;
	@FXML
	private Label M;
	@FXML
	private Label N;
	@FXML
	private Label O;
	@FXML
	private Label P;
	@FXML
	private Label Q;
	@FXML
	private Label R;
	@FXML
	private Label S;

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
	private void activateDev(ModelJoueur J, ModelDeveloppement d){
		switch (d.getIDDeveloppement()){
		case 1:
			/**
			 * interaction avec le joueur pour déplacer le Tannen
			 */
			break;
		case 2:
			/**
			 * interaction pour la création de 2 routes
			 */
			break;
		case 3:
			/**
			 * interaction pour récupérer 2 ressources supplémentaires
			 */
			break;
		case 4:
			J.setCompteurDev(J.getCompteurDev()+1);
		}
	}













}
