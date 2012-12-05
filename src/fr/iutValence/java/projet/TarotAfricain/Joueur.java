package fr.iutValence.java.projet.TarotAfricain;



/**
 * @author CLUZE - THEODORE Classe définissant un "Joueur". Un joueur possède des points de vie une main composée de
 *         cartes d'un choix de mise d'une valeur.
 */
public class Joueur
{

	/**
	 * 
	 */
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
	 * 
	 */
	private Affichage affiche;
	
	/**
	 * 
	 */
	private TypeDeJoueur typeDeJ;
	
	/**
	 * Constructeur d'un Joueur Alloue 14 points de vie etc
	 */
	public Joueur(Affichage aff,TypeDeJoueur joueur)
	{
		this.affiche = aff;
		this.pointDeVie = POINTSDEVIEMAX;
		this.pliRemporte = 0;
		this.mise = 0;
		this.typeDeJ = joueur;
	}

	/**
	 * Méthode permettant de traiter la mise.
	 * Une mise est définie par le choix d'un entier représentatif du nombre de plis\n
	 * que l'on espère remporter au cours d'un tour de jeu.
	 * @param nbCarte entier désignant le nombre de cartes que possède un Joueur\n
	 * Cela permet de définir une borne maximale pour le choix de la mise.
	 * @return int renvoie un entier caractéristique du nombre espéré de plis remportés.
	 */
	public int mise(int nbCarte) 
	{
		this.affiche.afficherMain(getMainJoueur(), this.typeDeJ);
		this.affiche.afficherMise(getMainJoueur(), this.typeDeJ);
		return this.typeDeJ.attribueMise(nbCarte);
	}

	/**
	 * La méthode poserCarte permet à l'utilisateur de poser une carte sur le tapis \n
	 * afin de confronter sa carte à celles des trois autres joueurs.
	 * @return une carte représentant la carte choisie par le joueur.
	 */
	public Carte poserCarte()
	{
		this.affiche.afficherMain(getMainJoueur(), this.typeDeJ);
		return this.typeDeJ.attribueCartePosees(getMainJoueur());
	}

	
	/**
	 * Méthode simple permettant de désigner les points de vie restant d'un joueur.
	 * @return int renvoie un entier correspondant aux points de vie restant.
	 */
	public int getPointDeVie()
	{	
		return this.pointDeVie;
	}

	/**
	 * La méthode setMain permet de remplir la main d'un joueur avec un tableau de cartes tirées aléatoirement.\n
	 * Cette méthode utiliser la fonction distribuerNCartes de l'objet JeuDeCartes, qui renvoie un tableau de cartes tirées aléatoirement.\n
	 * @param distribuer renvoie un tableau de cartes.
	 */
	public void setMain(Carte[] distribuer)
	{
		this.main = distribuer;

	}

	/**
	 * Méthode simple permettant de mémoriser pour un joueur donné la mise qu'il a choisi pour un tour donné.
	 * @param misej un entier représentant la mise
	 */
	public void setMise(int misej)
	{
		this.mise = misej;

	}


	/**
	 * Méthode simple dont le paramètre représente la carte selectionnée par le joueur lors d'un pli.
	 * @param poserCarte carte à mémoriser 
	 */
	public void setCartePosee(Carte poserCarte)
	{
		this.cartePosee = poserCarte;
	}

	/**
	 * Méthode simple permettant de désigner la carte posée lors du pli.
	 * @return renvoie la carte posée
	 */
	public Carte getCartePosee()
	{
		return this.cartePosee;
	}


	/**
	 * Méthode simple dont le paramètre représente le nombre de plis remportés lors d'un tour.
	 * @param i entier à mémoriser	 */
	public void setPliRemporte(int i)
	{
		this.pliRemporte = i;

	}
	
	/**
	 * Méthode simple permettant de désigner la main d'un joueur.
	 * @return renvoie la main d'un joueur, un tableau de cartes.
	 */
	public Carte[] getMainJoueur() {
		
		return this.main;
	}
	
}