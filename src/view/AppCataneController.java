package src.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.control.ListView;
import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.scene.shape.Circle;
import src.model.*;

/**
 * Created by Pierre Brunet on 30/12/15.
 * Modify by Pierre ROMET on 31/12/15
 * Project name : backtocatane
 * File name :
 */

public class AppCataneController {

	@FXML
	private Line SS0;
	@FXML
	private Line SS1;
	@FXML
	private Line SS2;
	@FXML
	private Line SS3;
	@FXML
	private Line SS4;
	@FXML
	private Line SS5;
	@FXML
	private Line SS6;
	@FXML
	private Line SS7;
	@FXML
	private Line SS8;
	@FXML
	private Line SS9;
	@FXML
	private Line SS10;
	@FXML
	private Line SS11;
	@FXML
	private Line SS12;
	@FXML
	private Line SS13;
	@FXML
	private Line SS14;
	@FXML
	private Line SS15;
	@FXML
	private Line SS16;
	@FXML
	private Line SS17;
	@FXML
	private Line SS18;
	@FXML
	private Line SS19;
	@FXML
	private Line SS20;
	@FXML
	private Line SS21;
	@FXML
	private Line SS22;
	@FXML
	private Line SS23;
	@FXML
	private Line SS24;
	@FXML
	private Line SS25;
	@FXML
	private Line SS26;
	@FXML
	private Line SS27;
	@FXML
	private Line SS28;
	@FXML
	private Line SS29;
	@FXML
	private Line SS30;
	@FXML
	private Line SS31;
	@FXML
	private Line SS32;
	@FXML
	private Line SS33;
	@FXML
	private Line SS34;
	@FXML
	private Line SS35;
	@FXML
	private Line SS36;
	@FXML
	private Line SS37;
	@FXML
	private Line SS38;
	@FXML
	private Line SS39;
	@FXML
	private Line SS40;
	@FXML
	private Line SS41;
	@FXML
	private Line SS42;
	@FXML
	private Line SS43;
	@FXML
	private Line SS44;
	@FXML
	private Line SS45;
	@FXML
	private Line SS46;
	@FXML
	private Line SS47;
	@FXML
	private Line SS48;
	@FXML
	private Line SS49;
	@FXML
	private Line SS50;
	@FXML
	private Line SS51;
	@FXML
	private Line SS52;
	@FXML
	private Line SS53;
	@FXML
	private Line SS54;
	@FXML
	private Line SS55;
	@FXML
	private Line SS56;
	@FXML
	private Line SS57;
	@FXML
	private Line SS58;
	@FXML
	private Line SS59;
	@FXML
	private Line SS60;
	@FXML
	private Line SS61;
	@FXML
	private Line SS62;
	@FXML
	private Line SS63;
	@FXML
	private Line SS64;
	@FXML
	private Line SS65;
	@FXML
	private Line SS66;
	@FXML
	private Line SS67;
	@FXML
	private Line SS68;
	@FXML
	private Line SS69;
	@FXML
	private Line SS70;
	@FXML
	private Line SS71;
	@FXML
	private Line T0;
	@FXML
	private Line T1;
	@FXML
	private Line T2;
	@FXML
	private Line T3;
	@FXML
	private Line T4;
	@FXML
	private Line T5;
	@FXML
	private Line T6;
	@FXML
	private Line T7;
	@FXML
	private Line T8;
	@FXML
	private Line T9;
	@FXML
	private Line T10;
	@FXML
	private Line T11;
	@FXML
	private Line T12;
	@FXML
	private Line T13;
	@FXML
	private Line T14;
	@FXML
	private Line T15;
	@FXML
	private Line T16;
	@FXML
	private Line T17;
	@FXML
	private Line T18;
	@FXML
	private Line T19;
	@FXML
	private Line T20;
	@FXML
	private Line T21;
	@FXML
	private Line T22;
	@FXML
	private Line T23;
	@FXML
	private Line T24;
	@FXML
	private Line T25;
	@FXML
	private Line T26;
	@FXML
	private Line T27;
	@FXML
	private Line T28;
	@FXML
	private Line T29;
	@FXML
	private Line T30;
	@FXML
	private Line T31;
	@FXML
	private Line T32;
	@FXML
	private Line T33;
	@FXML
	private Line T34;
	@FXML
	private Line T35;
	@FXML
	private Line T36;
	@FXML
	private Line T37;
	@FXML
	private Line T38;
	@FXML
	private Line T39;
	@FXML
	private Line T40;
	@FXML
	private Line T41;
	@FXML
	private Line T42;
	@FXML
	private Line T43;
	@FXML
	private Line T44;
	@FXML
	private Line T45;
	@FXML
	private Line T46;
	@FXML
	private Line T47;
	@FXML
	private Line T48;
	@FXML
	private Line T49;
	@FXML
	private Line T50;
	@FXML
	private Line T51;
	@FXML
	private Line T52;
	@FXML
	private Line T53;
	@FXML
	private Line T54;
	@FXML
	private Line T55;
	@FXML
	private Line T56;
	@FXML
	private Line T57;
	@FXML
	private Line T58;
	@FXML
	private Line T59;
	@FXML
	private Line T60;
	@FXML
	private Line T61;
	@FXML
	private Line T62;
	@FXML
	private Line T63;
	@FXML
	private Line T64;
	@FXML
	private Line T65;
	@FXML
	private Line T66;
	@FXML
	private Line T67;
	@FXML
	private Line T68;
	@FXML
	private Line T69;
	@FXML
	private Line T70;
	@FXML
	private Line T71;
	@FXML
	private Line U0;
	@FXML
	private Line U1;
	@FXML
	private Line U2;
	@FXML
	private Line U3;
	@FXML
	private Line U4;
	@FXML
	private Line U5;
	@FXML
	private Line U6;
	@FXML
	private Line U7;
	@FXML
	private Line U8;
	@FXML
	private Line U9;
	@FXML
	private Line U10;
	@FXML
	private Line U11;
	@FXML
	private Line U12;
	@FXML
	private Line U13;
	@FXML
	private Line U14;
	@FXML
	private Line U15;
	@FXML
	private Line U16;
	@FXML
	private Line U17;
	@FXML
	private Line U18;
	@FXML
	private Line U19;
	@FXML
	private Line U20;
	@FXML
	private Line U21;
	@FXML
	private Line U22;
	@FXML
	private Line U23;
	@FXML
	private Line U24;
	@FXML
	private Line U25;
	@FXML
	private Line U26;
	@FXML
	private Line U27;
	@FXML
	private Line U28;
	@FXML
	private Line U29;
	@FXML
	private Line U30;
	@FXML
	private Line U31;
	@FXML
	private Line U32;
	@FXML
	private Line U33;
	@FXML
	private Line U34;
	@FXML
	private Line U35;
	@FXML
	private Line U36;
	@FXML
	private Line U37;
	@FXML
	private Line U38;
	@FXML
	private Line U39;
	@FXML
	private Line U40;
	@FXML
	private Line U41;
	@FXML
	private Line U42;
	@FXML
	private Line U43;
	@FXML
	private Line U44;
	@FXML
	private Line U45;
	@FXML
	private Line U46;
	@FXML
	private Line U47;
	@FXML
	private Line U48;
	@FXML
	private Line U49;
	@FXML
	private Line U50;
	@FXML
	private Line U51;
	@FXML
	private Line U52;
	@FXML
	private Line U53;
	@FXML
	private Line U54;
	@FXML
	private Line U55;
	@FXML
	private Line U56;
	@FXML
	private Line U57;
	@FXML
	private Line U58;
	@FXML
	private Line U59;
	@FXML
	private Line U60;
	@FXML
	private Line U61;
	@FXML
	private Line U62;
	@FXML
	private Line U63;
	@FXML
	private Line U64;
	@FXML
	private Line U65;
	@FXML
	private Line U66;
	@FXML
	private Line U67;
	@FXML
	private Line U68;
	@FXML
	private Line U69;
	@FXML
	private Line U70;
	@FXML
	private Line U71;
	@FXML
	private Line V0;
	@FXML
	private Line V1;
	@FXML
	private Line V2;
	@FXML
	private Line V3;
	@FXML
	private Line V4;
	@FXML
	private Line V5;
	@FXML
	private Line V6;
	@FXML
	private Line V7;
	@FXML
	private Line V8;
	@FXML
	private Line V9;
	@FXML
	private Line V10;
	@FXML
	private Line V11;
	@FXML
	private Line V12;
	@FXML
	private Line V13;
	@FXML
	private Line V14;
	@FXML
	private Line V15;
	@FXML
	private Line V16;
	@FXML
	private Line V17;
	@FXML
	private Line V18;
	@FXML
	private Line V19;
	@FXML
	private Line V20;
	@FXML
	private Line V21;
	@FXML
	private Line V22;
	@FXML
	private Line V23;
	@FXML
	private Line V24;
	@FXML
	private Line V25;
	@FXML
	private Line V26;
	@FXML
	private Line V27;
	@FXML
	private Line V28;
	@FXML
	private Line V29;
	@FXML
	private Line V30;
	@FXML
	private Line V31;
	@FXML
	private Line V32;
	@FXML
	private Line V33;
	@FXML
	private Line V34;
	@FXML
	private Line V35;
	@FXML
	private Line V36;
	@FXML
	private Line V37;
	@FXML
	private Line V38;
	@FXML
	private Line V39;
	@FXML
	private Line V40;
	@FXML
	private Line V41;
	@FXML
	private Line V42;
	@FXML
	private Line V43;
	@FXML
	private Line V44;
	@FXML
	private Line V45;
	@FXML
	private Line V46;
	@FXML
	private Line V47;
	@FXML
	private Line V48;
	@FXML
	private Line V49;
	@FXML
	private Line V50;
	@FXML
	private Line V51;
	@FXML
	private Line V52;
	@FXML
	private Line V53;
	@FXML
	private Line V54;
	@FXML
	private Line V55;
	@FXML
	private Line V56;
	@FXML
	private Line V57;
	@FXML
	private Line V58;
	@FXML
	private Line V59;
	@FXML
	private Line V60;
	@FXML
	private Line V61;
	@FXML
	private Line V62;
	@FXML
	private Line V63;
	@FXML
	private Line V64;
	@FXML
	private Line V65;
	@FXML
	private Line V66;
	@FXML
	private Line V67;
	@FXML
	private Line V68;
	@FXML
	private Line V69;
	@FXML
	private Line V70;
	@FXML
	private Line V71;



	@FXML
	private Circle W0;
	@FXML
	private Circle W1;
	@FXML
	private Circle W2;
	@FXML
	private Circle W3;
	@FXML
	private Circle W4;
	@FXML
	private Circle W5;
	@FXML
	private Circle W6;
	@FXML
	private Circle W7;
	@FXML
	private Circle W8;
	@FXML
	private Circle W9;
	@FXML
	private Circle W10;
	@FXML
	private Circle W11;
	@FXML
	private Circle W12;
	@FXML
	private Circle W13;
	@FXML
	private Circle W14;
	@FXML
	private Circle W15;
	@FXML
	private Circle W16;
	@FXML
	private Circle W17;
	@FXML
	private Circle W18;
	@FXML
	private Circle W19;
	@FXML
	private Circle W20;
	@FXML
	private Circle W21;
	@FXML
	private Circle W22;
	@FXML
	private Circle W23;
	@FXML
	private Circle W24;
	@FXML
	private Circle W25;
	@FXML
	private Circle W26;
	@FXML
	private Circle W27;
	@FXML
	private Circle W28;
	@FXML
	private Circle W29;
	@FXML
	private Circle W30;
	@FXML
	private Circle W31;
	@FXML
	private Circle W32;
	@FXML
	private Circle W33;
	@FXML
	private Circle W34;
	@FXML
	private Circle W35;
	@FXML
	private Circle W36;
	@FXML
	private Circle W37;
	@FXML
	private Circle W38;
	@FXML
	private Circle W39;
	@FXML
	private Circle W40;
	@FXML
	private Circle W41;
	@FXML
	private Circle W42;
	@FXML
	private Circle W43;
	@FXML
	private Circle W44;
	@FXML
	private Circle W45;
	@FXML
	private Circle W46;
	@FXML
	private Circle W47;
	@FXML
	private Circle W48;
	@FXML
	private Circle W49;
	@FXML
	private Circle W50;
	@FXML
	private Circle W51;
	@FXML
	private Circle W52;
	@FXML
	private Circle W53;
	@FXML
	private Circle X0;
	@FXML
	private Circle X1;
	@FXML
	private Circle X2;
	@FXML
	private Circle X3;
	@FXML
	private Circle X4;
	@FXML
	private Circle X5;
	@FXML
	private Circle X6;
	@FXML
	private Circle X7;
	@FXML
	private Circle X8;
	@FXML
	private Circle X9;
	@FXML
	private Circle X10;
	@FXML
	private Circle X11;
	@FXML
	private Circle X12;
	@FXML
	private Circle X13;
	@FXML
	private Circle X14;
	@FXML
	private Circle X15;
	@FXML
	private Circle X16;
	@FXML
	private Circle X17;
	@FXML
	private Circle X18;
	@FXML
	private Circle X19;
	@FXML
	private Circle X20;
	@FXML
	private Circle X21;
	@FXML
	private Circle X22;
	@FXML
	private Circle X23;
	@FXML
	private Circle X24;
	@FXML
	private Circle X25;
	@FXML
	private Circle X26;
	@FXML
	private Circle X27;
	@FXML
	private Circle X28;
	@FXML
	private Circle X29;
	@FXML
	private Circle X30;
	@FXML
	private Circle X31;
	@FXML
	private Circle X32;
	@FXML
	private Circle X33;
	@FXML
	private Circle X34;
	@FXML
	private Circle X35;
	@FXML
	private Circle X36;
	@FXML
	private Circle X37;
	@FXML
	private Circle X38;
	@FXML
	private Circle X39;
	@FXML
	private Circle X40;
	@FXML
	private Circle X41;
	@FXML
	private Circle X42;
	@FXML
	private Circle X43;
	@FXML
	private Circle X44;
	@FXML
	private Circle X45;
	@FXML
	private Circle X46;
	@FXML
	private Circle X47;
	@FXML
	private Circle X48;
	@FXML
	private Circle X49;
	@FXML
	private Circle X50;
	@FXML
	private Circle X51;
	@FXML
	private Circle X52;
	@FXML
	private Circle X53;
	@FXML
	private Circle Y0;
	@FXML
	private Circle Y1;
	@FXML
	private Circle Y2;
	@FXML
	private Circle Y3;
	@FXML
	private Circle Y4;
	@FXML
	private Circle Y5;
	@FXML
	private Circle Y6;
	@FXML
	private Circle Y7;
	@FXML
	private Circle Y8;
	@FXML
	private Circle Y9;
	@FXML
	private Circle Y10;
	@FXML
	private Circle Y11;
	@FXML
	private Circle Y12;
	@FXML
	private Circle Y13;
	@FXML
	private Circle Y14;
	@FXML
	private Circle Y15;
	@FXML
	private Circle Y16;
	@FXML
	private Circle Y17;
	@FXML
	private Circle Y18;
	@FXML
	private Circle Y19;
	@FXML
	private Circle Y20;
	@FXML
	private Circle Y21;
	@FXML
	private Circle Y22;
	@FXML
	private Circle Y23;
	@FXML
	private Circle Y24;
	@FXML
	private Circle Y25;
	@FXML
	private Circle Y26;
	@FXML
	private Circle Y27;
	@FXML
	private Circle Y28;
	@FXML
	private Circle Y29;
	@FXML
	private Circle Y30;
	@FXML
	private Circle Y31;
	@FXML
	private Circle Y32;
	@FXML
	private Circle Y33;
	@FXML
	private Circle Y34;
	@FXML
	private Circle Y35;
	@FXML
	private Circle Y36;
	@FXML
	private Circle Y37;
	@FXML
	private Circle Y38;
	@FXML
	private Circle Y39;
	@FXML
	private Circle Y40;
	@FXML
	private Circle Y41;
	@FXML
	private Circle Y42;
	@FXML
	private Circle Y43;
	@FXML
	private Circle Y44;
	@FXML
	private Circle Y45;
	@FXML
	private Circle Y46;
	@FXML
	private Circle Y47;
	@FXML
	private Circle Y48;
	@FXML
	private Circle Y49;
	@FXML
	private Circle Y50;
	@FXML
	private Circle Y51;
	@FXML
	private Circle Y52;
	@FXML
	private Circle Y53;
	@FXML
	private Circle Z0;
	@FXML
	private Circle Z1;
	@FXML
	private Circle Z2;
	@FXML
	private Circle Z3;
	@FXML
	private Circle Z4;
	@FXML
	private Circle Z5;
	@FXML
	private Circle Z6;
	@FXML
	private Circle Z7;
	@FXML
	private Circle Z8;
	@FXML
	private Circle Z9;
	@FXML
	private Circle Z10;
	@FXML
	private Circle Z11;
	@FXML
	private Circle Z12;
	@FXML
	private Circle Z13;
	@FXML
	private Circle Z14;
	@FXML
	private Circle Z15;
	@FXML
	private Circle Z16;
	@FXML
	private Circle Z17;
	@FXML
	private Circle Z18;
	@FXML
	private Circle Z19;
	@FXML
	private Circle Z20;
	@FXML
	private Circle Z21;
	@FXML
	private Circle Z22;
	@FXML
	private Circle Z23;
	@FXML
	private Circle Z24;
	@FXML
	private Circle Z25;
	@FXML
	private Circle Z26;
	@FXML
	private Circle Z27;
	@FXML
	private Circle Z28;
	@FXML
	private Circle Z29;
	@FXML
	private Circle Z30;
	@FXML
	private Circle Z31;
	@FXML
	private Circle Z32;
	@FXML
	private Circle Z33;
	@FXML
	private Circle Z34;
	@FXML
	private Circle Z35;
	@FXML
	private Circle Z36;
	@FXML
	private Circle Z37;
	@FXML
	private Circle Z38;
	@FXML
	private Circle Z39;
	@FXML
	private Circle Z40;
	@FXML
	private Circle Z41;
	@FXML
	private Circle Z42;
	@FXML
	private Circle Z43;
	@FXML
	private Circle Z44;
	@FXML
	private Circle Z45;
	@FXML
	private Circle Z46;
	@FXML
	private Circle Z47;
	@FXML
	private Circle Z48;
	@FXML
	private Circle Z49;
	@FXML
	private Circle Z50;
	@FXML
	private Circle Z51;
	@FXML
	private Circle Z52;
	@FXML
	private Circle Z53;

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

	private MainApp mainApp;




	public AppCataneController(){

	}

	@FXML
	private void initialize(ModelJoueur J){
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
	public void joueurSuivant(ModelGestPlat gestPlat){
		for(int i=0; i<gestPlat.getTabJ().size(); i++){
			gestPlat.getTabJ().get(i).setPlaying(true);
			if(i>0 && i<4){
				gestPlat.getTabJ().get(i-1).setPlaying(false);
			} else {
				gestPlat.getTabJ().get(i+4).setPlaying(false);
			}
			//donne les pt de victoire du joueur actuel
			PtVictoire.setText(gestPlat.getTabJ().get(i).toStringComp()); 
			//affiche le tableau de resources du joueur actuel
			for (int j=0; j < gestPlat.getTabJ().get(i).getRessources().size(); j++) {
				listRes.getItems().add(gestPlat.getTabJ().get(i).getRessources(j));
			}

		}
	}

	/**
	 * Called when the user clicks on the "Lancer Dés" button
	 */
	@FXML
	private void lancerDes(ModelGestPlat gestPlat) {

		gestPlat.lancerDes();
		resultDes.setText(gestPlat.lancerDes());
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
	private void construireRoute(ModelJoueur J, ModelSommet a, ModelSommet b, ModelGestPlat gestPlat){
		ModelRoute r = new ModelRoute(J.getIDJoueur());
		r.construire(J,a,b,gestPlat);
	}

	/**
	 * Called when the user clicks on the "Activer Developpement" button
	 */
	@FXML
	private void activateDev(ModelJoueur J, ModelDeveloppement d, ModelSommet a, ModelSommet b){
		switch (d.getIDDeveloppement()){
		case 1:
			/**
			 * interaction avec le joueur pour déplacer le Tannen
			 */
			A0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(19), J); gestPlat.repercutTannen(19);});
			B0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(20), J); gestPlat.repercutTannen(20);});
			C0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(21), J); gestPlat.repercutTannen(21);});
			D0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(26), J); gestPlat.repercutTannen(26);});
			E0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(27), J); gestPlat.repercutTannen(27);});
			F0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(28), J); gestPlat.repercutTannen(28);});
			G0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(29), J); gestPlat.repercutTannen(29);});
			H0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(34), J); gestPlat.repercutTannen(34);});
			I0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(35), J); gestPlat.repercutTannen(35);});
			J0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(36), J); gestPlat.repercutTannen(36);});
			K0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(37), J); gestPlat.repercutTannen(37);});
			L0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(38), J); gestPlat.repercutTannen(38);});
			M0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(42), J); gestPlat.repercutTannen(42);});
			N0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(43), J); gestPlat.repercutTannen(43);});
			O0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(44), J); gestPlat.repercutTannen(44);});
			P0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(45), J); gestPlat.repercutTannen(45);});
			Q0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(51), J); gestPlat.repercutTannen(51);});
			R0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(52), J); gestPlat.repercutTannen(52);});
			S0.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(53), J); gestPlat.repercutTannen(53);});

			A1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(19), J); gestPlat.repercutTannen(19);});
			B1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(20), J); gestPlat.repercutTannen(20);});
			C1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(21), J); gestPlat.repercutTannen(21);});
			D1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(26), J); gestPlat.repercutTannen(26);});
			E1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(27), J); gestPlat.repercutTannen(27);});
			F1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(28), J); gestPlat.repercutTannen(28);});
			G1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(29), J); gestPlat.repercutTannen(29);});
			H1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(34), J); gestPlat.repercutTannen(34);});
			I1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(35), J); gestPlat.repercutTannen(35);});
			J1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(36), J); gestPlat.repercutTannen(36);});
			K1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(37), J); gestPlat.repercutTannen(37);});
			L1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(38), J); gestPlat.repercutTannen(38);});
			M1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(42), J); gestPlat.repercutTannen(42);});
			N1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(43), J); gestPlat.repercutTannen(43);});
			O1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(44), J); gestPlat.repercutTannen(44);});
			P1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(45), J); gestPlat.repercutTannen(45);});
			Q1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(51), J); gestPlat.repercutTannen(51);});
			R1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(52), J); gestPlat.repercutTannen(52);});
			S1.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(53), J); gestPlat.repercutTannen(53);});

			A2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(19), J); gestPlat.repercutTannen(19);});
			B2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(20), J); gestPlat.repercutTannen(20);});
			C2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(21), J); gestPlat.repercutTannen(21);});
			D2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(26), J); gestPlat.repercutTannen(26);});
			E2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(27), J); gestPlat.repercutTannen(27);});
			F2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(28), J); gestPlat.repercutTannen(28);});
			G2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(29), J); gestPlat.repercutTannen(29);});
			H2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(34), J); gestPlat.repercutTannen(34);});
			I2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(35), J); gestPlat.repercutTannen(35);});
			J2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(36), J); gestPlat.repercutTannen(36);});
			K2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(37), J); gestPlat.repercutTannen(37);});
			L2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(38), J); gestPlat.repercutTannen(38);});
			M2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(42), J); gestPlat.repercutTannen(42);});
			N2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(43), J); gestPlat.repercutTannen(43);});
			O2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(44), J); gestPlat.repercutTannen(44);});
			P2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(45), J); gestPlat.repercutTannen(45);});
			Q2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(51), J); gestPlat.repercutTannen(51);});
			R2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(52), J); gestPlat.repercutTannen(52);});
			S2.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(53), J); gestPlat.repercutTannen(53);});

			A3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(19), J); gestPlat.repercutTannen(19);});
			B3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(20), J); gestPlat.repercutTannen(20);});
			C3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(21), J); gestPlat.repercutTannen(21);});
			D3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(26), J); gestPlat.repercutTannen(26);});
			E3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(27), J); gestPlat.repercutTannen(27);});
			F3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(28), J); gestPlat.repercutTannen(28);});
			G3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(29), J); gestPlat.repercutTannen(29);});
			H3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(34), J); gestPlat.repercutTannen(34);});
			I3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(35), J); gestPlat.repercutTannen(35);});
			J3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(36), J); gestPlat.repercutTannen(36);});
			K3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(37), J); gestPlat.repercutTannen(37);});
			L3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(38), J); gestPlat.repercutTannen(38);});
			M3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(42), J); gestPlat.repercutTannen(42);});
			N3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(43), J); gestPlat.repercutTannen(43);});
			O3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(44), J); gestPlat.repercutTannen(44);});
			P3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(45), J); gestPlat.repercutTannen(45);});
			Q3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(51), J); gestPlat.repercutTannen(51);});
			R3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(52), J); gestPlat.repercutTannen(52);});
			S3.setOnAction((ActionEvent e) -> {gestPlat.deplacerVoleur(gestPlat.getTabPlat(J.getIDPlateauJoueur()).getTuile(53), J); gestPlat.repercutTannen(53);});


			break;
		case 2:
			/**
			 * interaction pour la création de 2 routes
			 */
			ModelRoute i = new ModelRoute(J.getIDJoueur());
			i.construire(J, a, b, gestPlat);
			//ajouter répercution ok

			ModelRoute j = new ModelRoute(J.getIDJoueur());
			j.construire(J, a, b, gestPlat);
			//ajouter repercution ok
			break;
		case 3:
			/**
			 * interaction pour récupérer 2 ressources supplémentaires
			 */
			int x = ThreadLocalRandom.current().nextInt(1,4);
			int y = ThreadLocalRandom.current().nextInt(1,4);

			ArrayList<String> s = new ArrayList <>();
			s.add(gestPlat.getTabResSup(x));
			s.add(gestPlat.getTabResSup(y));

			J.getRessources().addAll(s);

			break;
		case 4:
			J.setCompteurDev(J.getCompteurDev()+1);
		}
	}

    @FXML
    private void construireVille(){
        int i=0;
        while(!gestPlat.getTabJ().get(i).isPlaying()){
            i++;
        }
        ModelTown t = new ModelTown(gestPlat.getTabJ().get(i).getIDJoueur());
        final int ok = i;
        W0.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(0), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W1.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(1), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W2.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(2), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W3.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(3), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W4.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(4), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W5.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(5), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W6.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(6), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W7.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(7), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W8.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(8), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W9.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(9), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W10.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(10), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W11.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(11), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W12.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(12), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W13.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(13), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W14.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(14), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W15.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(15), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W16.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(16), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W17.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(17), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W18.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(18), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W19.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(19), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W20.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(20), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W21.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(21), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W22.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(22), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W23.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(23), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W24.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(24), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W25.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(25), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W26.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(26), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W27.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(27), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W28.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(28), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W29.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(29), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W30.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(30), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W31.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(31), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W32.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(32), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W33.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(33), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W34.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(34), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W35.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(35), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W36.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(36), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W37.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(37), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W38.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(38), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W39.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(39), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W40.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(40), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W41.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(41), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W42.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(42), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W43.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(43), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W44.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(44), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W45.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(45), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W46.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(46), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W47.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(47), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W48.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(48), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W49.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(49), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W50.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(50), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W51.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(51), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W52.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(52), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        W53.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(53), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        

        X0.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(0), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X1.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(1), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X2.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(2), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X3.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(3), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X4.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(4), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X5.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(5), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X6.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(6), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X7.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(7), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X8.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(8), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X9.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(9), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X10.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(10), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X11.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(11), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X12.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(12), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X13.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(13), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X14.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(14), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X15.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(15), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X16.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(16), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X17.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(17), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X18.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(18), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X19.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(19), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X20.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(20), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X21.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(21), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X22.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(22), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X23.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(23), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X24.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(24), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X25.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(25), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X26.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(26), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X27.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(27), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X28.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(28), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X29.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(29), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X30.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(30), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X31.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(31), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X32.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(32), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X33.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(33), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X34.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(34), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X35.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(35), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X36.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(36), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X37.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(37), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X38.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(38), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X39.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(39), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X40.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(40), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X41.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(41), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X42.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(42), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X43.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(43), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X44.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(44), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X45.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(45), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X46.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(46), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X47.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(47), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X48.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(48), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X49.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(49), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X50.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(50), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X51.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(51), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X52.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(52), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        X53.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(53), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
       
        Y0.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(0), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y1.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(1), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y2.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(2), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y3.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(3), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y4.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(4), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y5.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(5), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y6.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(6), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y7.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(7), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y8.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(8), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y9.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(9), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y10.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(10), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y11.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(11), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y12.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(12), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y13.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(13), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y14.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(14), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y15.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(15), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y16.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(16), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y17.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(17), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y18.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(18), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y19.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(19), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y20.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(20), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y21.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(21), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y22.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(22), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y23.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(23), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y24.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(24), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y25.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(25), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y26.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(26), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y27.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(27), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y28.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(28), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y29.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(29), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y30.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(30), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y31.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(31), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y32.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(32), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y33.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(33), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y34.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(34), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y35.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(35), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y36.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(36), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y37.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(37), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y38.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(38), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y39.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(39), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y40.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(40), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y41.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(41), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y42.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(42), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y43.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(43), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y44.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(44), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y45.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(45), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y46.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(46), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y47.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(47), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y48.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(48), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y49.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(49), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y50.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(50), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y51.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(51), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y52.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(52), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Y53.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(53), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        
        Z0.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(0), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z1.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(1), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z2.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(2), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z3.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(3), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z4.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(4), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z5.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(5), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z6.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(6), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z7.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(7), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z8.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(8), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z9.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(9), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z10.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(10), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z11.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(11), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z12.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(12), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z13.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(13), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z14.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(14), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z15.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(15), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z16.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(16), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z17.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(17), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z18.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(18), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z19.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(19), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z20.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(20), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z21.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(21), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z22.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(22), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z23.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(23), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z24.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(24), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z25.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(25), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z26.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(26), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z27.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(27), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z28.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(28), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z29.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(29), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z30.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(30), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z31.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(31), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z32.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(32), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z33.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(33), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z34.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(34), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z35.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(35), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z36.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(36), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z37.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(37), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z38.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(38), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z39.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(39), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z40.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(40), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z41.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(41), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z42.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(42), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z43.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(43), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z44.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(44), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z45.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(45), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z46.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(46), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z47.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(47), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z48.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(48), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z49.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(49), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z50.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(50), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z51.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(51), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z52.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(52), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
        Z53.setOnMouseClicked((MouseEvent e)->{t.construire(gestPlat.getTabJ().get(ok), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()).getSommet(53), gestPlat.getTabPlat().get(gestPlat.getTabJ().get(ok).getIDJoueur()));});
       

    }

    @FXML
    private void construireRoute(){
        int i=0;
        while(!gestPlat.getTabJ().get(i).isPlaying()){
            i++;
        }
        ModelRoute r = new ModelRoute(gestPlat.getTabJ().get(i).getIDJoueur());
        final int ok = i;
        W0.setOnMouseClicked((MouseEvent e)->{r.construire(gestPlat.getTabJ().get(ok),,gestPlat);});
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



	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
	}










}
