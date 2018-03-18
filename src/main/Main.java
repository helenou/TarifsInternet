package main;

import src.Connexion;

public class Main {

	public static void main(String[] args) {
		Connexion connectNet = new Connexion();
		
		connectNet.initTarifs();
//		connectNet.printTarifsMap();
		
		boolean b= true;
		
	
		connectNet.collectData();
		
		connectNet.getListConnect();
		
		System.out.println("Vous étiez connecté " +connectNet.calcDuree(connectNet.getHdebut(), connectNet.getHfin()) +
				" heures, entre " +connectNet.getHdebut()+ " et " +connectNet.getHfin() );
		System.out.println("pour un montant total de :"+connectNet.calcResultat() +" francs.");

	}
	

}
