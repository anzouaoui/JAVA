package java16e;

public class Tableau {

	public static void main(String[] args) {
		//Initialisation d'un tableau de 20 entiers
		int [] tab  = new int [20];
		int puissance = 2;
		//Boucle permettant de remplir le tableau
		for (int i=0 ; i<20 ; i++) {
			tab[i] = (int) Math.pow(puissance, i);
		}
		
		//Boucle permettant d'afficher l'ensemble des éléments du tableau
		for (int i=0 ; i<20 ; i++) {
			System.out.println(tab[i]);
		}
	}

}
