package gestion;

import util.Compteur;

public class Appli {

	public static void main(String[] args) {
		//Première instance de la classe Compteur
		Compteur c1 = new Compteur();
		//Incrémentation de l'instance
		c1.increment();
		//Affichage de l'instance c1
		c1.affiche();
		
		//Lecture du compteur
		int n = c1.lireCount();
		//Affichage de la lecture
		System.out.println("n: "+n);
		
		//Initialisation de l'instance c1 à 0
		c1.init();
		//Affichage de l'instance c1
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
		
		//Troisième instance de la classe Compteur
		Compteur c3 = new Compteur(c2);
		//Affichage de l'instance c3
		c3.affiche();
		
		//Test d'égalité entre les références des compteurs c1 et c2
		if (c1.compare(c2)) {
			System.out.println("c1 et c2 ont le meme etat");
		} else {
			System.out.println("c1 et c2 ont des etats differents");
		}
	}

}
