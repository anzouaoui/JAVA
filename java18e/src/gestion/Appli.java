package gestion;

import util.Compteur;

public class Appli {

	public static void main(String[] args) {
		//Premiere instance de la classe Compteur
		Compteur c1 = new Compteur();
		//Incrementation de l'instance c1
		c1.increment();
		//Affichage de l'instance c1
		c1.affiche();
		
		//Lecture du compteur c1
		int n=c1.lireCount();
		//Affichage du la lecture
		System.out.println("n: "+n);
		
		//Initialisation à 0 de l'instance c1
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
		
		//Troisieme instance de la classe Compteur
		Compteur c3 = new Compteur(c2);
		//Affichage de l'instance c3
		c3.affiche();
		
		//Incrementation et affichage de l'instance c3
		c3.increment().affiche();
		//Ajout de c3 à l'instance c2 et affichage
		c2.add(c3).affiche();
		
		//Calcul du nombre d'instance de la classe Compteur créé
		int nb = Compteur.lireNbCompteur();
		//Affichage du nombre de compteurs créés
		System.out.println("nombre d'objets Compteur crees: "+nb);
	}

}
