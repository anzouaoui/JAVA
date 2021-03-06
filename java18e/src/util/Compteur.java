package util;

/**
 * Classe Compteur
 * @author anoukzouaoui
 *
 */
public class Compteur {
	//Attribut privé cpt de la classe Compteur
		private int cpt;
	//Attribut static et privé de la classe Compteur
		private static int nbCompteur;
		
		/**
		 * Constructeur sans paramètre de la classe Compteur
		 */
		public Compteur() {
			this.cpt = 0;
			nbCompteur++;
		}
		
		/**
		 * Constructeur avec un entier en pramètre de la classe Compteur
		 * 
		 * @param entier
		 */
		public Compteur(int entier) {
			this.cpt = entier;
			nbCompteur++;
		}
		
		/**
		 * Contructeur avec un compteur en paramètre de la classe Compteur
		 * 
		 * @param compteur
		 */
		public Compteur(Compteur compteur) {
			this.cpt = compteur.cpt;
			nbCompteur++;
		}
		
		/**
		 * Fonction permettant d'incrémenter un compteur
		 * 
		 * @return Compteur
		 */
		public Compteur increment() {
			cpt++;
			return this;
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
			return this.cpt;
		}
		
		/**
		 * Fonction permettant d'initialiser un compteur à 0
		 */
		public void init() {
			this.cpt = 0;
		}
		
		/**
		 * Fonction permettant d'initialiser un compteur avec un entier
		 * 
		 * @param entier
		 */
		public void init(int entier) {
			this.cpt = entier;
		}
		
		/**
		 * Fonction permettant d'initialiser un compteur avec un autre compteur
		 * 
		 * @param compteur
		 */
		public void init(Compteur compteur) {
			this.cpt = compteur.cpt;
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
		
		/**
		 * Fonction permettant d'ajouter un compteur à un autre
		 * @param compteur
		 * @return Compteur
		 */
		public Compteur add(Compteur compteur) {
			this.cpt = this.cpt + compteur.cpt;
			return this;
		}
		
		/**
		 * Fonction permettant de lire nombre de compteur
		 * @return
		 */
		public static int lireNbCompteur() {
			return nbCompteur;
		}
}
