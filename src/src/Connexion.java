package src;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
//import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
//import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Connexion {

int hkey; // heure debutOUfin
int Hdebut;
int Hfin;
int tarifHeure;
int resultat=0; 
int nbHeures;
HashMap<Integer, Integer> mapHourPrice= new HashMap<>();
List<Integer> listConnect = new ArrayList<Integer>();

public Connexion(){
		
		mapHourPrice.put(0,5);
		mapHourPrice.put(1,5);
		mapHourPrice.put(2,5);
		mapHourPrice.put(3,5);
		mapHourPrice.put(4,5);
		mapHourPrice.put(5,5);
		mapHourPrice.put(6,5);

		mapHourPrice.put(7,10);
		mapHourPrice.put(8,10);
		mapHourPrice.put(9,10);
		mapHourPrice.put(10,10);
		mapHourPrice.put(11,10);
		mapHourPrice.put(12,10);
		mapHourPrice.put(13,10);
		mapHourPrice.put(14,10);
		mapHourPrice.put(15,10);
		mapHourPrice.put(16,10);
		mapHourPrice.put(17,10);

		mapHourPrice.put(18,5);
		mapHourPrice.put(19,5);
		mapHourPrice.put(20,5);
		mapHourPrice.put(21,5);	
		mapHourPrice.put(22,5);
		mapHourPrice.put(23,5);
		mapHourPrice.put(24,5);
	}


	Scanner sc= new Scanner(System.in);


	public void collectData() {
		System.out.println("Bonjour, veuiller entrer l'heure de début de connexion?");
		Hdebut= sc.nextInt();
		System.out.println("veuiller entrer l'heure de fin de connexion?");
		Hfin= sc.nextInt();


		if(Hdebut<Hfin) {
			for(hkey=Hdebut; hkey<Hfin; hkey++) {
				listConnect.add(hkey);
			}
		}else {
			System.out.println("L'horaire de début doit etre inferieur a la fin!");
		}
//		System.out.println("Let's do a check of hours connected: ");
//		for (int temp : listConnect) {
//			System.out.println(temp);
//		}

		sc.close();
	}




	/** Print the content of the hashMap */
//	public void printTarifsMap() {
//		Set<Entry<Integer,Integer>> hashSet=mapHourPrice.entrySet();
//		for(Entry entry:hashSet ) {
//
//			System.out.println("Key="+entry.getKey()+", Value="+entry.getValue());
//		}
//	}
	
//	System.out.println("-----------------------------");
	// Print the size of hashMap
//	System.out.println("HashMap size="+mapHourPrice.size());
	



	public int calcDuree(int start, int end){
//		start= listConnect.get(0);
//		end= listConnect.get(1);

		nbHeures= Hfin - Hdebut ;

		return nbHeures;
	}

	public int calcResultat() {
		for(int hkey=Hdebut; hkey<Hfin; hkey++) {
			tarifHeure= mapHourPrice.get(hkey);
			resultat += tarifHeure; 
		}
		return resultat;
	}


	// Getters and Setters
	public int getHdebut() {
		return Hdebut;
	}


	public int getHfin() {
		return Hfin;
	}

	public List<Integer> getListConnect() {
		return listConnect;
	}

}//end class