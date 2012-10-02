package fr.iutValence.java.projet.TarotAfricain;

// FIXME corriger le commentaire
/**
 * @author CLUZE - THEODORE
 * Classe définissant un "Joueur".
 * Un joueur possède des points de vie
 * une main composée de cartes
 * d'un choix de mise d'une valeur.
 */
public class Joueur {

	// FIXME renommer l'attribut
	// FIXME réfléchir à la visibilité
	/**
	 * nombre de vies du joueur
	 */
	public int nbVie;

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
	// FIXME corriger le commentaire
	/**
	 * Attribut pointant la carte posée par le joueur pendant le pli
	 */
	public Carte cartePosee;

	// FIXME réfléchir à la visibilité
	// FIXME corriger le commentaire
	/**
	 * Entier représentant le nombre de plis remportés durant un tour.
	 */
	public int pliRemporte;
	
	// FIXME détailler le commentaire
	/**
	 * Constructeur d'un joueur
	 */
	public Joueur() {
		this.nbVie=14;
	}
	
	// FIXME corriger le commentaire
	/**
	 * @return nbVie du joueur
	 */
	public int getValeur() {
		return this.nbVie;
	}

	// FIXME corriger le commentaire
	/**
	 * @param nbCarte
	 * @return La mise
	 */
	public int mise(int nbCarte) {
		return 0;
	}

	// FIXME corriger le commentaire
	/**
	 * @return une carte
	 */
	public Carte poserCarte() {
		Carte carteEnCours = new Carte();
		return carteEnCours;
	}
}
