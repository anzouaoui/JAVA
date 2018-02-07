package java09e;

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
}
