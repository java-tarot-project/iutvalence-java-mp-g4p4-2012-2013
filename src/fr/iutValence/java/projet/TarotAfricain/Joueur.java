package fr.iutValence.java.projet.TarotAfricain;



/**
 * @author CLUZE - THEODORE
 * Classe définissant un "Joueur".
 * Un joueur possède des points de vie
 * une main composée de cartes
 * d'un choix de mise d'une valeur.
 */
public abstract class Joueur {


	/**
	 * nombre de vies du joueur
	 */
	private int pointDeVie;


	/**
	 * Main du joueur
	 * -> Ensemble de cartes
	 */
	private Carte[] main;


	/**
	 * Valeur de la mise 
	 * Nombre de plis espérés
	 */
	private int mise;

		/**
	 * Attribut mettant en valeur la carte posée lors d'un pli.
	 */
	private Carte cartePosee;


	/**
	 * Entier représentant le nombre de plis remportés durant une phase.
	 */
	private int pliRemporte;
	

	/**
	 * Constructeur d'un Joueur
	 * Alloue 14 points de vie
	 * etc
	 */
	public Joueur() {
		this.pointDeVie=14;
		this.pliRemporte=0;
	}
	



	/**
	 *  Mise définie par le joueur en fonction des cartes qu'il possède dans sa main
	 * @param nbCarte 
	 * @return int La mise
	 */
	abstract int mise(int nbCarte);


	/**
	 * @return une carte
	 */
	abstract Carte poserCarte();




	/**
	 * @return int
	 */
	public int getPointDeVie() {

		return this.pointDeVie;
	}

	/**
	 * @param distribuer
	 */
	public void setMain(Carte[] distribuer) {
		this.main=distribuer;
		
	}

	/**
	 * @param misej 
	 */
	public void setMise(int misej) {
		this.mise=misej;
		
	}

	/**
	 * @param poserCarte
	 */
	public void setCartePosee(Carte poserCarte) {
		this.cartePosee=poserCarte;
	}

	
	/**
	 * @return cartePosee
	 */
	public Carte getCartePosee() {
		return this.cartePosee;
	}

	/**
	 * @param i
	 */
	public void setPliRemporte(int i) {
		this.pliRemporte=i;
		
	}

}
