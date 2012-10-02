package fr.iutValence.java.projet.TarotAfricain;

/**
 * @author CLUZE - THEODORE
 * Classe définissant un "Joueur".
 * Un joueur possède des points de vie
 * une main composée de cartes
 * d'un choix de mise d'une valeur.
 */
public class Joueur {

	/**
	 * nombre de vie du joueur
	 */
	public int nbVie;

	/**
	 * Main du joueur
	 * -> Ensemble de cartes
	 */
	public Carte main[];

	/**
	 * Valeur de la mise 
	 * Nombre de plis espérés
	 */
	public int mise;

	/**
	 * Attribut pointant la carte posée par le joueur pendant le pli
	 */
	public Carte cartePosee;

	/**
	 * Entier représentant le nombre de plis remportés durant un tour.
	 */
	public int pliRemporte;
	
	/**
	 * Constructeur d'un joueur
	 */
	public Joueur() {
		this.nbVie=14;
	}
	
	
	/**
	 * @return nbVie du joueur
	 */
	public int getValeur() {
		return this.nbVie;
	}


	/**
	 * @param nbCarte
	 * @return La mise
	 */
	public int mise(int nbCarte) {
		return 0;
	}


	/**
	 * @return une carte
	 */
	public Carte poserCarte() {
		Carte carteEnCours = new Carte();
		return carteEnCours;
	}
}
