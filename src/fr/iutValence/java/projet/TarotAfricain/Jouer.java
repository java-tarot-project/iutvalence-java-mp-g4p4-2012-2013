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
	
	// main1 utile ?
	JeuDeCarte main1;
	
	// FIXME écrire un commentaire
	// FIXME définir la visibilité
	// FIXME initialiser l'attribut dans le constructeur
	private Joueur table[] = {this.joueurReel,this.joueur1,this.joueur2,this.joueur3};

	// FIXME détailler le commentaire
	/**
	 * Constructeur initialisant les joueurs et le jeu de cartes
	 */
	public Jouer(){
		
		// FIXME est-ce pertinent de créer des joueurs dans le constructeur ?
		// -> Faire ça dans un " main " ?
		this.joueurReel = new Joueur();
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
		this.joueur3 = new Joueur();
		this.jeuDeCarte = new JeuDeCarte();
	}
	
	// FIXME corriger le commentaire
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
				this.table[i].main = this.jeuDeCarte.distribuer(nbCarte);
			}
			// Mise des joueurs concernant les plis espérés
			for (int joueurCourant = 0;joueurCourant < 3;joueurCourant++) {
				int i = joueurCourant+premierJoueur;
				if (i>3) i=i-4;
				this.table[i].mise = this.table[joueurCourant].mise(nbCarte);
			}
			
			// Tour de jeu
			for (int tour = 0; tour<nbCarte;tour++) {
				//Pli
				for (int joueurCourant = 1; joueurCourant < 3;joueurCourant++) {
					int i = joueurCourant+premierJoueur;
					if (i>3) i=i-4;
					this.table[i].cartePosee = this.table[i].poserCarte();
				}
				compareCartes();
			}
			// decrementation de nbCarte
			nbCarte--;
			if (nbCarte == 0) nbCarte=5;
			// condition de fin de jeu
			for (int i = 0;i<3;i++) {
				if (this.table[i].pointDeVie==0) break;}
			}
		}
	
	
	/**
	*@return int l'indice dans du joueur ayant gagné un pli.
	**/
	private int compareCartes() {
		int joueurGagnant = 0;
		Carte carteGagnante = new Carte();
		carteGagnante = this.table[0].cartePosee;
		for (int i = 1 ; i < 3 ; i++){
			if (this.table[i].cartePosee.superieure(carteGagnante)) joueurGagnant = i;
		}
		return joueurGagnant;
	}

	
	/**
	 * Méthode permettant la réinitialisation des attributs .pliRemporte
	 * représentant les plis qu'un joueur a gagné pendant une phase.
	 */
	private void initPliRemporte() {
		for (int i=0; i < 3; i++){
			this.table[i].pliRemporte = 0;
		}
		
	}
}
