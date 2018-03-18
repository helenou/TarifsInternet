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
		
//		for(int h=0; h<7; h++) {
//			mapHourPrice.put(h, 5);
//		}
//		for(int h=17; h<24; h++) {
//			mapHourPrice.put(h, 5);
//		}
//
//		for(int h=7; h<17; h++) {
//			mapHourPrice.put(h, 10);
//		}
//		
	}


	public void initTarifs() {
		for(int h=0; h<7; h++) {
			mapHourPrice.put(h, 5);
		}
		for(int h=17; h<24; h++) {
			mapHourPrice.put(h, 5);
		}

		for(int h=7; h<17; h++) {
			mapHourPrice.put(h, 10);
		}
				
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