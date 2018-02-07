package java09e;

public class Appli {

	public static void main(String[] args) {
		//Première instance de Compteur
		Compteur c1 = new Compteur();
		//Incrémentation de l'instance c1
		c1.increment();
		//Affichage de l'instance c1
		c1.affiche();
		
		//Deuxième instance de Compteur
		Compteur c2 = new Compteur();
		//Incrémentation de l'instance c2
		c2.increment();
		//Affichage de l'instance c2
		c2.affiche();
	}

}
