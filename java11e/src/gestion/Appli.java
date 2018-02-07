package gestion;

import util.Compteur;

public class Appli {

	public static void main(String[] args) {
		//Première instance de la classe Compteur
		Compteur c1 = new Compteur();
		//Incrementation de l'instance c1
		c1.increment();
		//Affichage de l'instace c1
		c1.affiche();
		//Lecture de l'instance c1
		int n1 = c1.lireCount();
		System.out.println("n: " + n1);
		
		//Initialisation de c1 à O
		c1.init();
		//Affichage de c1
		c1.affiche();
		
		//Deuxième instance de la classe Compteur
		Compteur c2 = new Compteur();
		//Initialisation de l'instance c2 à 15
		c2.init(15);
		//Affichage de l'instance c2
		c2.affiche();
		
		//Initialisation de l'instance c1 avec le compteur c2
		c1.init(c2);
		//Affichage de l'instance c1
		c1.affiche();
		
	}

}
