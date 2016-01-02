package src.view;

import java.awt.Label;

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
	@FXML
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
	@FXML
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
	@FXML
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

	public Label getA0() {
		return A0;
	}

	public Label getB0() {
		return B0;
	}

	public Label getC0() {
		return C0;
	}

	public Label getD0() {
		return D0;
	}

	public Label getE0() {
		return E0;
	}

	public Label getF0() {
		return F0;
	}

	public Label getG0() {
		return G0;
	}

	public Label getH0() {
		return H0;
	}

	public Label getI0() {
		return I0;
	}

	public Label getJ0() {
		return J0;
	}

	public Label getK0() {
		return K0;
	}

	public Label getL0() {
		return L0;
	}

	public Label getM0() {
		return M0;
	}

	public Label getN0() {
		return N0;
	}

	public Label getO() {
		return O;
	}

	public Label getP0() {
		return P0;
	}

	public Label getQ0() {
		return Q0;
	}

	public Label getR0() {
		return R0;
	}

	public Label getS0() {
		return S0;
	}

	//
	public Label getA1() {
		return A1;
	}

	public Label getB1() {
		return B1;
	}

	public Label getC1() {
		return C1;
	}

	public Label getD1() {
		return D1;
	}

	public Label getE1() {
		return E1;
	}

	public Label getF1() {
		return F1;
	}

	public Label getG1() {
		return G1;
	}

	public Label getH1() {
		return H1;
	}

	public Label getI1() {
		return I1;
	}

	public Label getJ1() {
		return J1;
	}

	public Label getK1() {
		return K1;
	}

	public Label getL1() {
		return L1;
	}

	public Label getM1() {
		return M1;
	}

	public Label getN1() {
		return N1;
	}

	public Label getO1() {
		return O1;
	}

	public Label getP1() {
		return P1;
	}

	public Label getQ1() {
		return Q1;
	}

	public Label getR1() {
		return R1;
	}

	public Label getS1() {
		return S1;
	}
	//
	public Label getA2() {
		return A2;
	}

	public Label getB2() {
		return B2;
	}

	public Label getC2() {
		return C2;
	}

	public Label getD2() {
		return D2;
	}

	public Label getE2() {
		return E2;
	}

	public Label getF2() {
		return F2;
	}

	public Label getG2() {
		return G2;
	}

	public Label getH2() {
		return H2;
	}

	public Label getI2() {
		return I2;
	}

	public Label getJ2() {
		return J2;
	}

	public Label getK2() {
		return K2;
	}

	public Label getL2() {
		return L2;
	}

	public Label getM(2) {
		return M2;
	}

	public Label getN2() {
		return N2;
	}

	public Label getO2() {
		return O2;
	}

	public Label getP2() {
		return P2;
	}

	public Label getQ2() {
		return Q2;
	}

	public Label getR2() {
		return R2;
	}

	public Label getS2() {
		return S2;
	}
	//
	public Label getA3() {
		return A3;
	}

	public Label getB3() {
		return B3;
	}

	public Label getC3() {
		return C3;
	}

	public Label getD3() {
		return D3;
	}

	public Label getE3() {
		return E3;
	}

	public Label getF3() {
		return F3;
	}

	public Label getG3() {
		return G3;
	}

	public Label getH3() {
		return H3;
	}

	public Label getI3() {
		return I3;
	}

	public Label getJ3() {
		return J3;
	}

	public Label getK3() {
		return K3;
	}

	public Label getL3() {
		return L3;
	}

	public Label getM3() {
		return M3;
	}

	public Label getN3() {
		return N3;
	}

	public Label getO3() {
		return O3;
	}

	public Label getP3() {
		return P3;
	}

	public Label getQ3() {
		return Q3;
	}

	public Label getR3() {
		return R3;
	}

	public Label getS3() {
		return S3;
	}
	//SETTER
	public void setA0(Label a) {
		A0 = a;
	}

	public void setB0(Label b) {
		B0 = b;
	}

	public void setC0(Label c) {
		C0= c;
	}

	public void setD0(Label d) {
		D0 = d;
	}

	public void setE0(Label e) {
		E0 = e;
	}

	public void setF0(Label f) {
		F0= f;
	}

	public void setG0(Label g) {
		G0 = g;
	}

	public void setH0(Label h) {
		H0 = h;
	}

	public void setI0(Label i) {
		I0 = i;
	}

	public void setJ0(Label j) {
		J0 = j;
	}

	public void setK0(Label k) {
		K0 = k;
	}

	public void setL0(Label l) {
		L0 = l;
	}

	public void setM0(Label m) {
		M0= m;
	}

	public void setN0(Label n) {
		N0 = n;
	}

	public void setO0(Label o) {
		O0 = o;
	}

	public void setP0(Label p) {
		P0 = p;
	}

	public void setQ0(Label q) {
		Q0 = q;
	}

	public void setR0(Label r) {
		R0= r;
	}

	public void setS0(Label s) {
		S0 = s;
	}
	//A1
	public void setA1(Label a) {
		A1 = a;
	}

	public void setB1(Label b) {
		B1 = b;
	}

	public void setC1(Label c) {
		C1 = c;
	}

	public void setD1(Label d) {
		D1 = d;
	}

	public void setE1(Label e) {
		E1 = e;
	}

	public void setF1(Label f) {
		F1 = f;
	}

	public void setG1(Label g) {
		G1= g;
	}

	public void setH1(Label h) {
		H1 = h;
	}

	public void setI1(Label i) {
		I1 = i;
	}

	public void setJ1(Label j) {
		J1 = j;
	}

	public void setK1(Label k) {
		K1 = k;
	}

	public void setL1(Label l) {
		L1 = l;
	}

	public void setM1(Label m) {
		M1 = m;
	}

	public void setN1(Label n) {
		N1 = n;
	}

	public void setO1(Label o) {
		O1 = o;
	}

	public void setP1(Label p) {
		P1 = p;
	}

	public void setQ1(Label q) {
		Q1 = q;
	}

	public void setR1(Label r) {
		R1 = r;
	}

	public void setS1(Label s) {
		S1 = s;
	}
	//A2
	public void setA2(Label a) {
		A2= a;
	}

	public void setB2(Label b) {
		B2 = b;
	}

	public void setC2(Label c) {
		C2 = c;
	}

	public void setD2(Label d) {
		D2 = d;
	}

	public void setE2(Label e) {
		E2 = e;
	}

	public void setF2(Label f) {
		F2 = f;
	}

	public void setG2(Label g) {
		G2 = g;
	}

	public void setH2(Label h) {
		H2= h;
	}

	public void setI2(Label i) {
		I2 = i;
	}

	public void setJ2(Label j) {
		J2 = j;
	}

	public void setK2(Label k) {
		K2 = k;
	}

	public void setL2(Label l) {
		L2 = l;
	}

	public void setM2(Label m) {
		M2 = m;
	}

	public void setN2(Label n) {
		N2 = n;
	}

	public void setO2(Label o) {
		O2 = o;
	}

	public void setP2(Label p) {
		P2= p;
	}

	public void setQ2(Label q) {
		Q2 = q;
	}

	public void setR2(Label r) {
		R2 = r;
	}

	public void setS2(Label s) {
		S2 = s;
	}
	//A3
	public void setA3(Label a) {
		A3 = a;
	}

	public void setB3(Label b) {
		B3 = b;
	}

	public void setC3(Label c) {
		C3 = c;
	}

	public void setD3(Label d) {
		D3 = d;
	}

	public void setE3(Label e) {
		E3 = e;
	}

	public void setF3(Label f) {
		F3 = f;
	}

	public void setG3(Label g) {
		G3 = g;
	}

	public void setH3(Label h) {
		H3 = h;
	}

	public void setI3(Label i) {
		I3 = i;
	}

	public void setJ3(Label j) {
		J3 = j;
	}

	public void setK3(Label k) {
		K3 = k;
	}

	public void setL3(Label l) {
		L3 = l;
	}

	public void setM3(Label m) {
		M3 = m;
	}

	public void setN3(Label n) {
		N3 = n;
	}

	public void setO3(Label o) {
		O3 = o;
	}

	public void setP3(Label p) {
		P3 = p;
	}

	public void setQ3(Label q) {
		Q3 = q;
	}

	public void setR3(Label r) {
		R3 = r;
	}

	public void setS3(Label s) {
		S3 = s;
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
			A0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(19, J), GP.repercutTannen(19)};
			B0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(20, J), GP.repercutTannen(20)};
			C0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(21, J), GP.repercutTannen(21)};
			D0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(26, J), GP.repercutTannen(26)};
			E0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(27, J), GP.repercutTannen(27)};
			F0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(28, J), GP.repercutTannen(28)};
			G0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(29, J), GP.repercutTannen(29)};
			H0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(34, J), GP.repercutTannen(34)};
			I0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(35, J), GP.repercutTannen(35)};
			J0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(36, J), GP.repercutTannen(36)};
			K0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(37, J), GP.repercutTannen(37)};
			L0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(38, J), GP.repercutTannen(38)};
			M0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(42, J), GP.repercutTannen(42)};
			N0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(43, J), GP.repercutTannen(43)};
			O0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(44, J), GP.repercutTannen(44)};
			P0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(45, J), GP.repercutTannen(45)};
			Q0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(51, J), GP.repercutTannen(51)};
			R0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(52, J), GP.repercutTannen(52)};
			S0.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(53, J), GP.repercutTannen(53)};

			A1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(19, J), GP.repercutTannen(19)};
			B1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(20, J), GP.repercutTannen(20)};
			C1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(21, J), GP.repercutTannen(21)};
			D1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(26, J), GP.repercutTannen(26)};
			E1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(27, J), GP.repercutTannen(27)};
			F1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(28, J), GP.repercutTannen(28)};
			G1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(29, J), GP.repercutTannen(29)};
			H1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(34, J), GP.repercutTannen(34)};
			I1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(35, J), GP.repercutTannen(35)};
			J1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(36, J), GP.repercutTannen(36)};
			K1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(37, J), GP.repercutTannen(37)};
			L1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(38, J), GP.repercutTannen(38)};
			M1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(42, J), GP.repercutTannen(42)};
			N1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(43, J), GP.repercutTannen(43)};
			O1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(44, J), GP.repercutTannen(44)};
			P1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(45, J), GP.repercutTannen(45)};
			Q1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(51, J), GP.repercutTannen(51)};
			R1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(52, J), GP.repercutTannen(52)};
			S1.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(53, J), GP.repercutTannen(53)};

			A2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(19, J), GP.repercutTannen(19)};
			B2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(20, J), GP.repercutTannen(20)};
			C2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(21, J), GP.repercutTannen(21)};
			D2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(26, J), GP.repercutTannen(26)};
			E2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(27, J), GP.repercutTannen(27)};
			F2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(28, J), GP.repercutTannen(28)};
			G2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(29, J), GP.repercutTannen(29)};
			H2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(34, J), GP.repercutTannen(34)};
			I2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(35, J), GP.repercutTannen(35)};
			J2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(36, J), GP.repercutTannen(36)};
			K2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(37, J), GP.repercutTannen(37)};
			L2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(38, J), GP.repercutTannen(38)};
			M2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(42, J), GP.repercutTannen(42)};
			N2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(43, J), GP.repercutTannen(43)};
			O2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(44, J), GP.repercutTannen(44)};
			P2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(45, J), GP.repercutTannen(45)};
			Q2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(51, J), GP.repercutTannen(51)};
			R2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(52, J), GP.repercutTannen(52)};
			S2.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(53, J), GP.repercutTannen(53)};

			A3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(19, J), GP.repercutTannen(19)};
			B3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(20, J), GP.repercutTannen(20)};
			C3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(21, J), GP.repercutTannen(21)};
			D3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(26, J), GP.repercutTannen(26)};
			E3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(27, J), GP.repercutTannen(27)};
			F3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(28, J), GP.repercutTannen(28)};
			G3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(29, J), GP.repercutTannen(29)};
			H3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(34, J), GP.repercutTannen(34)};
			I3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(35, J), GP.repercutTannen(35)};
			J3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(36, J), GP.repercutTannen(36)};
			K3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(37, J), GP.repercutTannen(37)};
			L3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(38, J), GP.repercutTannen(38)};
			M3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(42, J), GP.repercutTannen(42)};
			N3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(43, J), GP.repercutTannen(43)};
			O3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(44, J), GP.repercutTannen(44)};
			P3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(45, J), GP.repercutTannen(45)};
			Q3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(51, J), GP.repercutTannen(51)};
			R3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(52, J), GP.repercutTannen(52)};
			S3.setOnAction((ActionEvent e) -> {GP.deplacerVoleur(53, J), GP.repercutTannen(53)};

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
