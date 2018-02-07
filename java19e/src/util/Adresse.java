package util;

public class Adresse {
	//Attribut de la classe Adresse
	private String voie;
	private String complement;
	private String codePostal;
	private String ville;
	
	/**
	 * Constructeur vide la classe Adresse
	 */
	public Adresse() {
		this.voie = "";
		this.complement = "";
		this.codePostal = "";
		this.ville = "";
	}
	
	/**
	 * Constructeur de la classe Adresse sans le complement
	 * 
	 * @param uneVoie
	 * @param unCodePostal
	 * @param uneVille
	 */
	public Adresse(String uneVoie, String unCodePostal, String uneVille) {
		this.voie = uneVoie;
		this.complement = "";
		this.codePostal = unCodePostal;
		this.ville = uneVille;
	}
	
	/**
	 * Constructeur de la classe Adresse entier
	 * 
	 * @param uneVoie
	 * @param unComplement
	 * @param unCodePostal
	 * @param uneVille
	 */
	public Adresse(String uneVoie, String unComplement, String unCodePostal, String uneVille) {
		this.voie = uneVoie;
		this.complement = unComplement;
		this.codePostal = unCodePostal;
		this.ville = uneVille;
	}
	
	/**
	 * Accesseur de l'attribut voie
	 * 
	 * @return String
	 */
	public String getVoie() {
		return this.voie;
	}
	
	/**
	 * Mutateur de l'attribut voie
	 * 
	 * @param uneVoie
	 */
	public void setVoie(String uneVoie) {
		this.voie = uneVoie;
	}
	
	/**
	 * Accesseur de l'attribut complement
	 * 
	 * @return String
	 */
	public String getComplement() {
		return this.complement;
	}
	
	/**
	 * Mutateur de l'attribut complement
	 * 
	 * @param uneVoie
	 */
	public void setComplement(String unComplement) {
		this.complement = unComplement;
	}
	
	/**
	 * Accesseur de l'attribut codePostal
	 * 
	 * @return String
	 */
	public String getCodePostal() {
		return this.codePostal;
	}
	
	/**
	 * Mutateur de l'attribut codePostal
	 * 
	 * @param unCodePostal
	 */
	public void setCodePostal(String unCodePostal) {
		this.codePostal = unCodePostal;
	}
	
	/**
	 * Accesseur de l'attribut ville
	 * 
	 * @return String
	 */
	public String getVille() {
		return this.ville;
	}
	
	/**
	 * Mutateur de l'attribut ville
	 * 
	 * @param uneVille
	 */
	public void setVille(String uneVille) {
		this.ville = uneVille;
	}
	
	/**
	 * Fonction permettant d'afficher l'adresse
	 * 
	 * @return String
	 */
	public String affiche() {
		return this.voie + " " + this.complement + " " + this.codePostal + " " + this.ville;
	}
}
