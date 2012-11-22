package fr.iutValence.java.projet.TarotAfricain;

/**
 * Classe définissant un "Jeu de Cartes". Un jeu de Cartes est constitué de plusieurs cartes Un jeu de carte peut être
 * distribué
 * 
 * @author CLUZE - THEODORE
 */
public class JeuDeCartes
{

	// FIXME définir le nombre de cartes du paquet comme une constante (fixed)
	/**
	 * Constante désignant le nombre maximum de cartes dans un paquet.
	 */
	public final static int NBCARTESMAX = 22;
	
	/**
	 * 
	 */
	// FIXME  (fixed)
	static CarteDePaquet[] cartes = new CarteDePaquet[NBCARTESMAX];

	static
	{
		// FIXME (fixed)
		for (int i = 0; i < NBCARTESMAX; i++)
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



	// FIXME il faut différencier l'attribut de la constante (fixed)

	/**
	 * 
	 */
	private CarteDePaquet[] paquet;
	// FIXME fixed
	/**
	 * Constructeur d'un Jeu de Cartes.
	 */
	public JeuDeCartes()
	{
		/**
		 * 
		 * Tableau de CarteDePaquet de 1 à 22 à occurence unique.
		 */
		this.paquet = new CarteDePaquet[NBCARTESMAX];
		// FIXME utiliser la constante (fixed)
		for (int i = 0; i < NBCARTESMAX; i++)
			this.paquet[i] = cartes[i];

	}

	// FIXME compléter le commentaire (fixed)
	/**
	 * Méthode tirerUneCarte permet de sélectionner aléatoirement une carte dans un paquet de Carte.</br>
	 * Si la carte n'a pas déjà été tirée ( méthode CarteDePaquet.estTiree() renvoie un booléen ), </br>
	 * On la place dans le paquet de Cartes à distribuer.
	 * @return une carte tirée.
	 */
	public CarteDePaquet tirerUneCarte()
	{

		int random;
		while (this.paquet[random = (int) (Math.random() * (VALEURMAX - VALEURMIN) + VALEURMIN)].estTiree())
			;
		this.paquet[random].tirer();
		return this.paquet[random];
	}

	/**
	 * @return int désignant le nombre de Cartes disponibles dans le paquet de Cartes.
	 */
	// FIXME fixed
	public int CartesRestantesDansPaquet()
	{
		int res = 0;
		for (int i =0; i<NBCARTESMAX;i++)
			if(this.paquet[i].estTiree()==false) res++;
		return res;
	}
	
	// FIXME compléter/corriger le commentaire (fixed)
	/**
	 * Méthode permettant de générer un tableau de N Cartes à partir d'un paquet.
	 * @param nbCarteADistrib
	 *            représente le nombre de cartes à distribuer.
	 * @return un tableau de N cartes.
	 */
	public Carte[] distribuerNCartes(int nbCarteADistrib)
	{
		int i;
		Carte[] cartesDistribuees = new Carte[nbCarteADistrib];
		for (i = 0; i < nbCarteADistrib; i++)
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
