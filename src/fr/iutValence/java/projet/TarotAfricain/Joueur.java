package fr.iutValence.java.projet.TarotAfricain;

/**
 * @author CLUZE - THEODORE Classe définissant un "Joueur". Un joueur possède
 *         des points de vie une main composée de cartes d'un choix de mise
 *         d'une valeur.
 */
public abstract class Joueur {

	// FIXME détailler (en quoi cela est lié au jeu ?)
	/**
	 * nombre de vies du joueur
	 */
	private int pointDeVie;

	/**
	 * Main du joueur -> Ensemble de cartes
	 */
	private Carte[] main;

	/**
	 * Valeur de la mise Nombre de plis espérés
	 */
	private int mise;

	// FIXME est ce utile (Vs variable locale autre part ?)
	/**
	 * Attribut mettant en valeur la carte posée lors d'un pli.
	 */
	private Carte cartePosee;

	/**
	 * Entier représentant le nombre de plis remportés durant une phase.
	 */
	private int pliRemporte;

	/**
	 * Constructeur d'un Joueur Alloue 14 points de vie etc
	 */
	public Joueur() {

		// FIXME définir la valeur par défaut via une constante
		this.pointDeVie = 14;
		this.pliRemporte = 0;

		// FIXME tous les attributs doivent être initialisés
	}

	// FIXME compléter le commentaire
	/**
	 * Mise définie par le joueur en fonction des cartes qu'il possède dans sa
	 * main
	 * 
	 * @param nbCarte
	 * @return int La mise
	 */
	abstract int mise(int nbCarte);

	// FIXME compléter le commentaire
	/**
	 * @return une carte
	 */
	abstract Carte poserCarte();

	// FIXME compléter le commentaire
	/**
	 * @return int
	 */
	public int getPointDeVie() {

		return this.pointDeVie;
	}

	// FIXME compléter le commentaire
	/**
	 * @param distribuer
	 */
	public void setMain(Carte[] distribuer) {
		this.main = distribuer;

	}

	// FIXME compléter le commentaire
	/**
	 * @param misej
	 */
	public void setMise(int misej) {
		this.mise = misej;

	}

	// FIXME compléter le commentaire
	/**
	 * @param poserCarte
	 */
	public void setCartePosee(Carte poserCarte) {
		this.cartePosee = poserCarte;
	}

	// FIXME compléter le commentaire
	/**
	 * @return cartePosee
	 */
	public Carte getCartePosee() {
		return this.cartePosee;
	}

	// FIXME compléter le commentaire
	/**
	 * @param i
	 */
	public void setPliRemporte(int i) {
		this.pliRemporte = i;

	}

}
