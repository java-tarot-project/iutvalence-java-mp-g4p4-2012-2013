package fr.iutValence.java.projet.TarotAfricain;


// Vérifier les public/private !
/**
 * @author CLUZE - THEODORE Classe définissant une partie
 */
public class Jouer
{
	
	/**
	 * JeudeCarte simulant les différentes cartes auxquelles les joueurs pourront accéder.
	 */
	private JeuDeCartes jeuDeCarte;

	/**
	 * Création d'une table de joueurs. Représentation sous forme d'un tableau de 4 joueurs. ( les quatre joueurs sont
	 * censés être autour d'une table) Permet d'effectuer des actions communes sur les quatre joueurs.
	 */
	private Joueur table[];
	
	/**
	 * 
	 */
	public Affichage affiche;

	/**
	 * Constructeur initialisant les joueurs et le jeu de cartes Création de quatre Joueurs, création d'un JeudeCarte
	 * @param joueur1 Un des joueurs d'une partie. Peut être Réel ou IA.
	 * @param joueur2 Un des joueurs d'une partie. Peut être Réel ou IA.
	 * @param joueur3 Un des joueurs d'une partie. Peut être Réel ou IA.
	 * @param joueur4 Un des joueurs d'une partie. Peut être Réel ou IA.
	 * @param aff Affichage pouvant être console ou Graphique.
	 */
	public Jouer(Joueur joueur1,Joueur joueur2,Joueur joueur3,Joueur joueur4, Affichage aff)
	{

		this.jeuDeCarte = new JeuDeCartes();
		this.table = new Joueur[4];
		this.table[0] = joueur1;
		this.table[1] = joueur2;
		this.table[2] = joueur3;
		this.table[3] = joueur4;
		this.affiche=aff;
		
		
	}

	/**
	 * Méthode initialisant une partie de Tarot Africain. Le principe est de distribuer {5,4,3,2,1} carte(s) aux quatre
	 * joueurs. Suite à quoi les joueurs misent le nombre de plis susceptibles d'être remportés. Après la dernière phase
	 * d'un tour (distribution d'une seule carte), le premier joueur devient son voisin de gauche.
	 * @throws MiseException Exception soulevée selon la donnée entrée en paramètre par l'utilisateur
	 * @throws Exception Exception soulevée
	 */
	public void jouer() throws MiseException, Exception
	{
		int premierJoueur = 0;
		int nbCarte = 5;
		while (true)
		{
			this.affiche.demarrerPartie();
			for (int joueurCourant = 0; joueurCourant <= 3; joueurCourant++)
			{
				this.table[joueurCourant].setNomJoueur(
						this.affiche.demanderNomJoueur(this.table[joueurCourant].getTypeDeJoueur(),joueurCourant+1));
			}
			
			
			// Premier joueur du tour
			
			
			initPliRemporte();
			
			// Distribution des cartes
			for (int joueurCourant = 0; joueurCourant <= 3; joueurCourant++)
			{
				// Le premier joueur n'est pas forcément le premier dans le tableau. 
				int i = joueurCourant + premierJoueur;
				if (i > 3)
					i = i - 4;

				this.table[i].setMain(this.jeuDeCarte.distribuerNCartes(nbCarte));

			}
			this.affiche.demanderMise();
			// Mise des joueurs concernant les plis espérés
			for (int joueurCourant = 0; joueurCourant <= 3; joueurCourant++)
			{
				int i = joueurCourant + premierJoueur;
				if (i > 3)
					i = i - 4;
				this.affiche.tourDuJoueur(this.table[i].getNomJoueur());
				this.table[i].setMise(this.table[i].mise(nbCarte) );
			}
			
			
			
			// Tour de jeu
			for (int tour = 0; tour < nbCarte; tour++)
			{
				// Pli
				this.affiche.debutPli(tour+1);
				
				for (int joueurCourant = 0; joueurCourant <= 3; joueurCourant++)
				{
					int i = joueurCourant + premierJoueur;
					if (i > 3)
						i = i - 4;
					this.affiche.tourDuJoueur(this.table[i].getNomJoueur());
					this.table[i].setCartePosee(this.table[i].poserCarte(i));
					this.table[i].setMain(this.table[i].enleverCarteMain(this.table[i].getCartePosee()));
					
				}
				
				this.table[compareCartes()].setPliRemporte();
				this.affiche.finPli(tour);
				// Phase de décompte des points de vie
				for (int joueurCourant = 0; joueurCourant <= 3; joueurCourant++)
				{
					int a = this.table[joueurCourant].getPliRemporte()- this.table[joueurCourant].getMise();
					a=(int) Math.pow(a,2);
					a=(int) Math.sqrt(a);
					this.table[joueurCourant].setPointDeVie(a);
					this.affiche.pointsDeVieRestants(this.table[joueurCourant].getNomJoueur(), this.table[joueurCourant].getPointDeVie());
				}
				
			}
			

			
			
			// decrementation de nbCarte
			nbCarte--;
			if (nbCarte == 0) nbCarte = 5;
			// condition de fin de jeu
			for (int i = 0; i < 3; i++)
			{
				if (this.table[i].getPointDeVie() == 0)
					break;
			}
			premierJoueur++;
			if(premierJoueur>3) premierJoueur=0;
		}
		
	}
	/**
	 * @return int l'indice dans du joueur ayant gagné un pli.
	 **/
	private int compareCartes()
	{
		int joueurGagnant = 0;
		Carte carteGagnante = new Carte(0);
		carteGagnante = this.table[0].getCartePosee();
		for (int i = 0; i < 3; i++)
		{
			if (this.table[i].getCartePosee().superieure(carteGagnante))
				joueurGagnant = i;
		}
		return joueurGagnant;
	}

	/**
	 * Méthode permettant la réinitialisation des attributs .pliRemporte représentant les plis qu'un joueur a gagné
	 * pendant une phase.
	 */
	private void initPliRemporte()
	{
		for (int i = 0; i < 3; i++)
		{
			this.table[i].initPliRemporte();
		}

	}
}
