package fr.iutValence.java.projet.TarotAfricain;

import java.io.IOException;

/**
 * @author CLUZE - THEODORE Classe définissant un "Joueur". Un joueur possède des points de vie une main composée de
 *         cartes d'un choix de mise d'une valeur.
 */
public abstract class Joueur
{

	private static final int POINTSDEVIEMAX = 14;

	/**
	 * Les points de vie d'un joueur représentent ses chances de succès. Chaque fois qu'il ne complète pas sa mise, le
	 * joueur perd un point de vie. Lorsqu'un joueur n'a plus de points de vie, il perd la partie de Tarot Africain.
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
	public Joueur()
	{
		this.pointDeVie = POINTSDEVIEMAX;
		this.pliRemporte = 0;

		// FIXME tous les attributs doivent être initialisés
	}

	// FIXME compléter le commentaire
	/**
	 * Mise définie par le joueur en fonction des cartes qu'il possède dans sa main
	 * 
	 * @param nbCarte
	 * @return int La mise
	 * @throws MiseException 
	 */
	abstract int mise(int nbCarte) throws IOException, MiseException;

	// FIXME compléter le commentaire
	/**
	 * @return une carte
	 */
	abstract Carte poserCarte();

	// FIXME compléter le commentaire
	/**
	 * @return int
	 */
	public int getPointDeVie()
	{

		return this.pointDeVie;
	}

	// FIXME compléter le commentaire
	/**
	 * @param distribuer
	 */
	public void setMain(Carte[] distribuer)
	{
		this.main = distribuer;

	}

	// FIXME compléter le commentaire
	/**
	 * @param misej
	 */
	public void setMise(int misej)
	{
		this.mise = misej;

	}

	// FIXME compléter le commentaire
	/**
	 * @param poserCarte
	 */
	public void setCartePosee(Carte poserCarte)
	{
		this.cartePosee = poserCarte;
	}

	// FIXME compléter le commentaire
	/**
	 * @return cartePosee
	 */
	public Carte getCartePosee()
	{
		return this.cartePosee;
	}

	// FIXME compléter le commentaire
	/**
	 * @param i
	 */
	public void setPliRemporte(int i)
	{
		this.pliRemporte = i;

	}
	
	/**
	 * @return
	 */
	public Carte[] getMainJoueur() {
		return this.main;
	}

}
