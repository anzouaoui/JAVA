package gestion;

import util.Compteur;

public class Appli {

	public static void main(String[] args) {
		//Premiere instance de la classe Compteur
		Compteur c1 = new Compteur();
		//Incréementation de l'instance c1
		c1.increment();
		//Affiche l'instance c1
		c1.affiche();
		
		//Lecture du compteur c1
		int n = c1.lireCount();
		//Affichage de la lecture
		System.out.println("n: "+n);

		//Initialisation de l'instance c1 à 0
		c1.init();
		//Affichage de l'instance c1
		c1.affiche();
		
		//Deuxieme instance de la classe Compteur
		Compteur c2 = new Compteur();
		//Initialisation de l'instance c2 à 15
		c2.init(15);
		//Affichage de l'instance c2
		c2.affiche();
		
		//Initialisation de l'instance c1 avec le compteur c2
		c1.init(c2);
		//Affichage de l'instance c1
		c1.affiche();
		
		//Troisieme instance de la classe Compteur  avec le constructeur ayant un autre compteur
		Compteur c3 = new Compteur(c2);
		//Affichage de l'instance c3
		c3.affiche();

		//Incrémentation et affichage de l'instance c3
		c3.increment().affiche();
		//Ajout du compteur c3 au compteur c2 et affichage du compteur c2
		c2.add(c3).affiche();
	}

}
