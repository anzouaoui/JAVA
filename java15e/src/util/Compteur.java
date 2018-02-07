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
		 * Constructeur sans paramètre de la classe Compteur
		 */
		public Compteur() {
			cpt = 0;
		}
		
		/**
		 * Constructeur avec un entier en pramètre de la classe Compteur
		 * 
		 * @param entier
		 */
		public Compteur(int entier) {
			cpt = entier;
		}
		
		/**
		 * Contructeur avec un compteur en paramètre de la classe Compteur
		 * 
		 * @param compteur
		 */
		public Compteur(Compteur compteur) {
			cpt = compteur.cpt;
		}
		
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
		
		/**
		 * Fonction permettant de comparer les références de deux compteurs.
		 * 
		 * @param compteur
		 * @return boolean
		 */
		public boolean compare(Compteur compteur) {
			if (this.cpt == compteur.cpt) {
				return true;
			} else {
				return false;
			}
		}
}
