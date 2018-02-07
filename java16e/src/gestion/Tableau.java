package gestion;

import util.Compteur;

public class Tableau {

	public static void main(String[] args) {
		//Initialisation d'un tableau de 20 entiers
		int [] tab  = new int [20];
		//Initialisation d'un tableau de 20 compteurs
		Compteur [] tc = new Compteur [20];
		int puissance = 2;
		//Boucle permettant de remplir le tableau
		for (int i=0 ; i<tab.length ; i++) {
			tab[i] = (int) Math.pow(puissance, i);
		}
		
		//Boucle permettant d'afficher l'ensemble des éléments du tableau
		for (int i=0 ; i<20 ; i++) {
			System.out.println(tab[i]);
		}
		
		System.out.println();
		 
		int puissance2 = 1;
		//Boucle permettant de remir le tableau
		for(int i=0 ; i<tc.length ; i++) {
			tc[i] = new Compteur(puissance2);
			puissance2 *= 2;
		}
		
		//Boucle permettant d'afficher l'ensemble des éléments du tableau
		for (int i=0 ; i<tc.length ; i++) {
			tc[i].affiche();
		}
	}

}
