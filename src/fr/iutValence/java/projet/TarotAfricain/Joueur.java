package fr.iutValence.java.projet.TarotAfricain;



/**
 * @author CLUZE - THEODORE
 * Classe définissant un "Joueur".
 * Un joueur possède des points de vie
 * une main composée de cartes
 * d'un choix de mise d'une valeur.
 */
public class Joueur {

	// FIXME réfléchir à la visibilité
	/**
	 * nombre de vies du joueur
	 */
	public int pointDeVie;

	// FIXME réfléchir à la visibilité
	/**
	 * Main du joueur
	 * -> Ensemble de cartes
	 */
	public Carte[] main;

	// FIXME réfléchir à la visibilité
	/**
	 * Valeur de la mise 
	 * Nombre de plis espérés
	 */
	public int mise;

	// FIXME réfléchir à la visibilité
	/**
	 * Attribut mettant en valeur la carte posée lors d'un pli.
	 */
	public Carte cartePosee;

	// FIXME réfléchir à la visibilité
	/**
	 * Entier représentant le nombre de plis remportés durant une phase.
	 */
	public int pliRemporte;
	

	/**
	 * Constructeur d'un Joueur
	 * Alloue 14 points de vie
	 * etc
	 */
	public Joueur() {
		this.pointDeVie=14;
	}
	



	/**
	 *  Mise définie par le joueur en fonction des cartes qu'il possède dans sa main
	 * @param nbCarte 
	 * @return int La mise
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
