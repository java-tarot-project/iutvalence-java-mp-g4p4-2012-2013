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
	 * @param aff Choix de l'affichage
	 * @param joueur sélection du type de joueur
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
		this.affiche.afficheCarte(getMainJoueur(), this.typeDeJ);
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
	 * Méthode simple qui ajoute un plie remporter.
	 */
	public void setPliRemporte()
	{
		this.pliRemporte++;

	}
	/**
	 * Méthode permettant d'initialiser le nombre de plis remportés lors d'un tour de jeu.
	 */
	public void initPliRemporte()
	{
		this.pliRemporte=0;

	}
	
	/**
	 * Méthode simple permettant de désigner la main d'un joueur.
	 * @return renvoie la main d'un joueur, un tableau de cartes.
	 */
	public Carte[] getMainJoueur() {
		
		return this.main;
	}

	/**
	 * methode qui retourne le nombre de pli remporter
	 * @return le nombre de plie remporter
	 */
	public int getPliRemporte()
	{
		return this.pliRemporte;		
	}

	/**
	 * methode qui retourne la mise
	 * @return la mise
	 */
	public int getMise()
	{
		return this.mise;
	}

	/**
	 * methode qui met a jour le nombre de point de vie en fonction du nombre de pli et de la mise
	 * @param a nombre de point de vie a enlever
	 */
	public void setPointDeVie(int a)
	{
		this.pointDeVie=this.pointDeVie - a;
		
	}

	public Carte getCarteposer()
	{
		return this.cartePosee;
	}

	public Carte[] enleverCarteMain(Carte carteposer)
	{
		int i=0;
		int y =0;
		Carte[] res = new Carte[this.main.length-1];
		while  (i < this.main.length - 1) {
			if (this.main[i]!=carteposer)
				{
				res[y] = new Carte(this.main[i].getValeurs());
				y++;
				}
			i++;
		}
		return res;
	}
	
}