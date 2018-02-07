package util;

/**
 * Classe Compteur
 * @author anoukzouaoui
 *
 */
public class Compteur {
	//Attribut privé cpt de la classe Compteur
	private int cpt;
	
	/**
	 * Fonction permettant d'incrémenter le compteur cpt
	 */
	public void increment() {
		++ cpt;
	}
	
	/**
	 * Fonction permettant d'afficher le compteur cpt
	 */
	public void affiche() {
		System.out.println("Valeur: " + cpt);
	}
	
	/**
	 * Fonction permettant de retourner le compteur
	 * @return int cpt
	 */
	public int lireCount() {
		return cpt;
	}
	
	/**
	 * Fonction permettant d'initialiser un compteur à 0
	 */
	public void init() {
		cpt = 0;
	}
	
	/**
	 * Fonction permettant d'initialiser un compteur avec un entier
	 * 
	 * @param entier
	 */
	public void init(int entier) {
		cpt = entier;
	}
	
	/**
	 * Fonction permettant d'initialiser un compteur avec un autre compteur
	 * 
	 * @param compteur
	 */
	public void init(Compteur compteur) {
		cpt = compteur.cpt;
	}
}
