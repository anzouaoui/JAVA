package pers;

import util.Adresse;
import pers.Personne;

public class Appli {

	public static void main(String[] args) {
		//Premier instance de la classe Perosnne
		Personne martin = new Personne();
		//Modification du nom de l'instance martin
		martin.setNom("MARTIN");
		//Modification du prenom de l'instance martin
		martin.setPrenom("Pierre");
		//Modification de l'age de l'instance martin
		martin.setAge(28);
		//Modification de l'adresse de l'instance martin
		martin.setAdresse(new Adresse("3, rue de la Pompe","", "75013", "Paris"));
		//Affichage de l'instance martin
		System.out.println(martin.affiche());
		
		//Deuxieme instance de la classe Personne avec le constructeur complet
		Personne durand = new Personne("DURAND","Alain",30, new Adresse("Bd Gambetta","","78300","Poissy"));
		//Récupération du nom de l'instance durant
		String nom = durand.getNom();
		//Récupération du prénom de l'instance durant
		String prenom = durand.getPrenom();
		//Récupération de l'age de l'instance durant
		int age = durand.getAge();
		//Récupération de l'adresse de l'instance durant
		Adresse adresse = durand.getAdresse();
		//Affichage des information de l'instance durant
		System.out.println(nom + " " + prenom + " " + age + " " + adresse.affiche()); 
	}

}
