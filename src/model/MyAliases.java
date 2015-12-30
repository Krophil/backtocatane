package src.model;

import java.util.HashMap;
import java.util.Map;

public class MyAliases {

	Map<Integer, Integer> mapTuiles = new HashMap<Integer, Integer> ();
	Map<Integer, String> ResDResource = new HashMap<Integer, String>();

	public MyAliases(){
		//Table de correspondance des tuiles du tableaux (Integer) <-> résultat dés (Integer)
		mapTuiles.put(19,6);
		mapTuiles.put(20,2);
		mapTuiles.put(21,5);
		mapTuiles.put(26,6);
		mapTuiles.put(27,7);
		mapTuiles.put(28,8);
		mapTuiles.put(29,3);
		mapTuiles.put(34,5);
		mapTuiles.put(35,12);
		mapTuiles.put(36,10);
		mapTuiles.put(37,7);
		mapTuiles.put(38,2);
		mapTuiles.put(42,4);
		mapTuiles.put(43,7);
		mapTuiles.put(44,11);
		mapTuiles.put(45,9);
		mapTuiles.put(51,3);
		mapTuiles.put(52,12);
		mapTuiles.put(53,4);

		ResDResource.put(6, "brique");		
		ResDResource.put(2, "bois");
		ResDResource.put(5, "res2");		
		ResDResource.put(6, "brique");
		ResDResource.put(7, "bois");		
		ResDResource.put(8, "res1");
		ResDResource.put(3, "brique");		
		ResDResource.put(5, "res2");
		ResDResource.put(12, "brique");		
		ResDResource.put(10, "desert");
		ResDResource.put(7, "brique");		
		ResDResource.put(2, "res2");
		ResDResource.put(4, "res2");		
		ResDResource.put(7, "bois");
		ResDResource.put(11, "brique");		
		ResDResource.put(9, "brique");
		ResDResource.put(3, "res1");
		ResDResource.put(12, "brique");		
		ResDResource.put(4, "res1");

	}
}
