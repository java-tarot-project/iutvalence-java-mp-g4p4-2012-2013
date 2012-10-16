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
	private int pointDeVie;

	// FIXME réfléchir à la visibilité
	/**
	 * Main du joueur
	 * -> Ensemble de cartes
	 */
	private Carte[] main;

	// FIXME réfléchir à la visibilité
	/**
	 * Valeur de la mise 
	 * Nombre de plis espérés
	 */
	private int mise;

	// FIXME réfléchir à la visibilité
	/**
	 * Attribut mettant en valeur la carte posée lors d'un pli.
	 */
	private Carte cartePosee;

	// FIXME réfléchir à la visibilité
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




	public int getPointDeVie() {
		// TODO Auto-generated method stub
		return 0;
	}




	public void setMain(Carte[] distribuer) {
		// TODO Auto-generated method stub
		
	}




	public void setMise(int mise2) {
		// TODO Auto-generated method stub
		
	}




	public void setCartePosee(Carte poserCarte) {
		// TODO Auto-generated method stub
		
	}




	public Carte getCartePosee() {
		// TODO Auto-generated method stub
		return null;
	}




	public void setPliRemporte(int i) {
		// TODO Auto-generated method stub
		
	}

}
