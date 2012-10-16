package fr.iutValence.java.projet.TarotAfricain;

// Vérifier les public/private !
/**
 * @author CLUZE - THEODORE
 * Classe définissant une partie
 */
public class Jouer {
	
	/**
	* Joueur joueurReel représente la classe utilisée par le Joueur.
	* Par le biais de cette classe, l'utilisateur va être capable de jouer une partie de Tarot.
	*/
	public Joueur joueurReel;

	/**
	* Joueur joueur simulée avec Intelligence Artificielle.
	* Joueur fictionnel simulant un des 4 joueurs d'une partie.
	* Non accessible par l'utilisateur.
	*/
	private Joueur joueur1;
	
	/**
	* Joueur joueur simulée avec Intelligence Artificielle.
	* Joueur fictionnel simulant un des 4 joueurs d'une partie.
	* Non accessible par l'utilisateur.
	*/
	private Joueur joueur2;
	
	/**
	*Joueur joueur simulée avec Intelligence Artificielle.
	* Joueur fictionnel simulant un des 4 joueurs d'une partie.
	* Non accessible par l'utilisateur.
	*/
	private Joueur joueur3 ;
	
	/**
	* JeudeCarte simulant les différentes cartes
	* auxquelles les joueurs pourront accéder.
	*/
	private JeuDeCarte jeuDeCarte;
	
	

	//  initialiser l'attribut dans le constructeur ?
	/**
	 * Création d'une table de joueurs. Représentation sous forme d'un tableau de 4 joueurs.
	 * ( les quatre joueurs sont censés être autour d'une table)
	 * Permet d'effectuer des actions communes sur les quatre joueurs.
	 */
	private Joueur table[] = {this.joueurReel,this.joueur1,this.joueur2,this.joueur3};

	/**
	 * Constructeur initialisant les joueurs et le jeu de cartes
	 * Création de quatre Joueurs, création d'un JeudeCarte
	 */
	public Jouer(){
		
		this.joueurReel = new JoueurReel();
		this.joueur1 = new JoueurIA();
		this.joueur2 = new JoueurIA();
		this.joueur3 = new JoueurIA();
		this.jeuDeCarte = new JeuDeCarte();
	}
	
	
	/**
	 * Méthode initialisant une partie de Tarot Africain.
	 * Le principe est de distribuer {5,4,3,2,1} carte(s) aux quatre joueurs.
	 * Suite à quoi les joueurs misent le nombre de plis susceptibles d'être remportés.
	 * Après la dernière phase d'un tour (distribution d'une seule carte),
	 * le premier joueur devient son voisin de gauche.
	 */
	public void jouer(){
		
		int nbCarte = 5;
		
		while (true){
			
			// Premier joueur du tour
			int premierJoueur = 0;
			
			initPliRemporte();
			// Distribution des cartes
			for (int joueurCourant = 0;joueurCourant < 3;joueurCourant++) {
				int i = joueurCourant+premierJoueur;
				if (i>3) i=i-4;
				this.table[i].setMain(this.jeuDeCarte.distribuer(nbCarte));
				
			}
			// Mise des joueurs concernant les plis espérés
			for (int joueurCourant = 0;joueurCourant < 3;joueurCourant++) {
				int i = joueurCourant+premierJoueur;
				if (i>3) i=i-4;
				this.table[i].setMise(this.table[joueurCourant].mise(nbCarte));
			}
			
			// Tour de jeu
			for (int tour = 0; tour<nbCarte;tour++) {
				//Pli
				for (int joueurCourant = 1; joueurCourant < 3;joueurCourant++) {
					int i = joueurCourant+premierJoueur;
					if (i>3) i=i-4;
					this.table[i].setCartePosee(this.table[i].poserCarte());
				}
				compareCartes();
			}
			// decrementation de nbCarte
			nbCarte--;
			if (nbCarte == 0) nbCarte=5;
			// condition de fin de jeu
			for (int i = 0;i<3;i++) {
				if (this.table[i].getPointDeVie()==0) break;}
			}
		}
	
	


	/**
	*@return int l'indice dans du joueur ayant gagné un pli.
	**/
	private int compareCartes() {
		int joueurGagnant = 0;
		Carte carteGagnante = new Carte();
		carteGagnante = this.table[0].getCartePosee();
		for (int i = 1 ; i < 3 ; i++){
			if (this.table[i].getCartePosee().superieure(carteGagnante)) joueurGagnant = i;
		}
		return joueurGagnant;
	}

	
	/**
	 * Méthode permettant la réinitialisation des attributs .pliRemporte
	 * représentant les plis qu'un joueur a gagné pendant une phase.
	 */
	private void initPliRemporte() {
		for (int i=0; i < 3; i++){
			this.table[i].setPliRemporte(0);
		}
		
	}
}
