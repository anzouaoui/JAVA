package pers;

import util.Adresse;

public class Personne {
	//Attribut de la classe Personne
	private String nom;
	private String prenom;
	private int age;
	private Adresse adresse;
	
	/**
	 * Constructeur vide de la classe Personne
	 */
	public Personne() {
		this.nom = "";
		this.prenom = "";
		this.age = 0;
		this.adresse = new Adresse();
	}
	
	/**
	 * Constructeur complet de la classe Personne
	 * 
	 * @param unNom
	 * @param unPrenom
	 * @param unAge
	 * @param uneAdresse
	 */
	public Personne(String unNom, String unPrenom, int unAge, Adresse uneAdresse) {
		this.nom = unNom;
		this.prenom = unPrenom;
		this.age = unAge;
		this.adresse = uneAdresse;
	}
	
	/**
	 * Accesseur de l'attribut nom
	 * 
	 * @return String
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Mutateur de l'attribut nom
	 * 
	 * @param unNom
	 */
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	/**
	 * Accesseur de l'attribut prenom
	 * 
	 * @return String
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	/**
	 * Mutateur de l'attribut prenom
	 * 
	 * @param unPrenom
	 */
	public void setPrenom(String unPrenom) {
		this.prenom = unPrenom;
	}
	
	/**
	 * Accesseur de l'attribut age
	 * 
	 * @return int
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Mutateur de l'attribut age
	 * 
	 * @param unAge
	 */
	public void setAge(int unAge) {
		this.age = unAge;
	}
	
	/**
	 * Accesseur de l'attribut adresse
	 * 
	 * @return Adresse
	 */
	public Adresse getAdresse() {
		return this.adresse;
	}
	
	/**
	 * Mutateur de l'attribut adresse
	 * 
	 * @param uneAdresse
	 */
	public void setAdresse(Adresse uneAdresse) {
		this.adresse = uneAdresse;
	}
	
	/**
	 * Fonction permettant d'afficher l'ensemble des informations d'une personne
	 * 
	 * @return String
	 */
	public String affiche() {
		return this.nom + " " + this.prenom + " " + this.age + " " + this.adresse.affiche();
	}
}
