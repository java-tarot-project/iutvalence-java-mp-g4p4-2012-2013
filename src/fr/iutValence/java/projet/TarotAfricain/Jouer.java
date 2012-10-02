package fr.iutValence.java.projet.TarotAfricain;

/**
 * @author CLUZE - THEODORE
 * Classe définissant une partie
 */
public class Jouer {
	
	Joueur joueurReel;
	Joueur joueur1;
	Joueur joueur2;
	Joueur joueur3 ;
	JeuDeCarte jeuDeCarte;
	JeuDeCarte main1;
	Joueur table[] = {this.joueurReel,this.joueur1,this.joueur2,this.joueur3};

	/**
	 * Constructeur initialisant les joueurs et le jeu de cartes
	 */
	public Jouer(){
		this.joueurReel = new Joueur();
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
		this.joueur3 = new Joueur();
		this.jeuDeCarte = new JeuDeCarte();
	}
	
	/**
	 * Méthode initialisant une partie de Tarot Africain
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
				if (this.table[i].nbVie==0) break;}
			}
		}
	
	
	private int compareCartes() {
		int joueurGagnant = 0;
		Carte carteGagnante = new Carte();
		carteGagnante = this.table[0].cartePosee;
		for (int i = 1 ; i < 3 ; i++){
			if (this.table[i].cartePosee.superieure(carteGagnante)) joueurGagnant = i;
		}
		return joueurGagnant;
	}

	/*
	 * met les valeur de pli remporter a zero
	 */
	private void initPliRemporte() {
		for (int i=0; i < 3; i++){
			this.table[i].pliRemporte = 0;
		}
		
	}
}
