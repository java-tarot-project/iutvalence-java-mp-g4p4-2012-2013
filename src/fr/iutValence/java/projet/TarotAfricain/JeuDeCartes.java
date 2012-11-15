package fr.iutValence.java.projet.TarotAfricain;

/**
 * Classe définissant un "Jeu de Cartes". Un jeu de Cartes est constitué de plusieurs cartes Un jeu de carte peut être
 * distribué
 * 
 * @author CLUZE - THEODORE
 */
public class JeuDeCartes
{

	// FIXME définir le nombre de cartes du paquet comme une constante

	// FIXME pourquoi 23 cartes ?
	static CarteDePaquet[] cartes = new CarteDePaquet[23];

	static
	{
		// FIXME utiliser la constante
		for (int i = 1; i <= 22; i++)
			cartes[i] = new CarteDePaquet(i);
	}

	/**
	 * Valeur minimale que peut prendre une Carte dans un JeuDeCarte
	 */
	public final static int VALEURMIN = 1;

	/**
	 * Valeur maximale que peut prendre une Carte dans un JeuDeCarte
	 */
	public final static int VALEURMAX = 22;


	// FIXME définir en private
	// FIXME initialiser l'attribut dans le constructeur
	// FIXME il faut différencier l'attribut de la constante
	/**
	 * 
	 * Tableau de CarteDePaquet de 1 à 22 à occurence unique.
	 */
	public CarteDePaquet[] paquet = cartes;

	// FIXME compléter le commentaire
	/**
	 * 
	 */
	public JeuDeCartes()
	{
		// FIXME utiliser la constante
		for (int i = 1; i <= 22; i++)
			this.paquet[i] = cartes[i];
	}

	// FIXME compléter le commentaire
	/**
	 * @return
	 */
	public CarteDePaquet tirerUneCarte()
	{

		int random;
		while (this.paquet[random = (int) (Math.random() * (VALEURMAX - VALEURMIN) + VALEURMIN)].estTiree())
			;
		this.paquet[random].tirer();
		return this.paquet[random];
	}

	// FIXME ajouter une méthode permettant de savoir combien il reste de cartes non tirées dans le paquet

	// FIXME compléter/corriger le commentaire
	/**
	 * @param nbCarteADistrib
	 *            représente le nombre de cartes à distribuer.
	 * @return null
	 */
	public Carte[] distribuerNCartes(int nbCarteADistrib)
	{
		int i;
		Carte[] cartesDistribuees = new Carte[nbCarteADistrib];
		for (i = 1; i <= nbCarteADistrib; i++)
		{
			cartesDistribuees[i] = this.tirerUneCarte();
		}
		return cartesDistribuees;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String chaineJeuDeCarte = "";
		for (int i = VALEURMIN; i <= VALEURMAX; i++)
			chaineJeuDeCarte = chaineJeuDeCarte + this.paquet[i].getValeurs();
		return chaineJeuDeCarte;
	}
}
