package fr.iutValence.java.projet.TarotAfricain;

/**
 * Classe définissant un "Jeu de Cartes". Un jeu de Cartes est constitué de plusieurs cartes Un jeu de carte peut être
 * distribué
 * 
 * @author CLUZE - THEODORE
 */
// FIXME renommer la classe (il y a plusieurs cartes dans le jeu : JeuDeCartes
// ?) (fixed)
public class JeuDeCartes
{

	// FIXME définir une constante par carte du paquet (pour n'avoir qu'un seul
	// exemplaire de chaque carte par paquet) (fixed)

	static CarteDePaquet[] cartes = new CarteDePaquet[23];

	static
	{
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

	// FIXME le commentaire ne correspond pas à la définition (fixed)
	/**
	 * Tableau de CarteDePaquet de 1 à 22 à occurence unique.
	 */
	public CarteDePaquet[] paquet = new CarteDePaquet[23];

	// FIXME compléter le commentaire
	/**
	 * 
	 */
	public JeuDeCartes()
	{

		for (int i = 1; i <= 22; i++)
			this.paquet[i] = cartes[i];
	}

	/**
	 * @return
	 */
	// FIXME ajouter une méthode permettant de tirer une carte au hasard dans le
	// paquet
	public CarteDePaquet tirerUneCarte()
	{

		int random;
		while (this.paquet[random = (int) (Math.random() * (VALEURMAX - VALEURMIN) + VALEURMIN)].getValCarteTiree())
			;
		this.paquet[random].setValCarteTiree(true);
		return this.paquet[random];
	}

	// FIXME ajouter une méthode permettant de savoir combien il reste de cartes
	// dans le paquet ( il reste 22 carte dans un paquet)

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

	public String toString()
	{
		String chaineJeuDeCarte = "";
		int i;
		for (i = 1; i <= 22; i++)
		{
			chaineJeuDeCarte = chaineJeuDeCarte + this.paquet[i].getValeurs();
		}
		return chaineJeuDeCarte;
	}
}
