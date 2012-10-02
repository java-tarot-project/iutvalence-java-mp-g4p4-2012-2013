package fr.iutValence.java.projet.TarotAfricain;

// FIXME corriger le commentaire
/**
 * @author CLUZE - THEODORE
 * Classe définissant une partie
 */
public class Jouer {
	
	// FIXME écrire un commentaire
	// FIXME définir la visibilité
	Joueur joueurReel;

	// FIXME écrire un commentaire
	// FIXME définir la visibilité
	Joueur joueur1;
	
	// FIXME écrire un commentaire
	// FIXME définir la visibilité
	Joueur joueur2;
	
	// FIXME écrire un commentaire
	// FIXME définir la visibilité
	Joueur joueur3 ;
	
	// FIXME écrire un commentaire
	// FIXME définir la visibilité
	JeuDeCarte jeuDeCarte;
	
	// FIXME écrire un commentaire
	// FIXME définir la visibilité
	JeuDeCarte main1;
	
	// FIXME écrire un commentaire
	// FIXME définir la visibilité
	// FIXME initialiser l'attribut dans le constructeur
	Joueur table[] = {this.joueurReel,this.joueur1,this.joueur2,this.joueur3};

	// FIXME détailler le commentaire
	/**
	 * Constructeur initialisant les joueurs et le jeu de cartes
	 */
	public Jouer(){
		
		// FIXME est-ce pertinent de créer des joueurs dans le constructeur ?
		this.joueurReel = new Joueur();
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
		this.joueur3 = new Joueur();
		this.jeuDeCarte = new JeuDeCarte();
	}
	
	// FIXME corriger le commentaire
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
	
	
	// FIXME écrire un commentaire
	private int compareCartes() {
		int joueurGagnant = 0;
		Carte carteGagnante = new Carte();
		carteGagnante = this.table[0].cartePosee;
		for (int i = 1 ; i < 3 ; i++){
			if (this.table[i].cartePosee.superieure(carteGagnante)) joueurGagnant = i;
		}
		return joueurGagnant;
	}

	
	// FIXME corriger le commentaire
	/*
	 * met les valeur de pli remporter a zero
	 */
	private void initPliRemporte() {
		for (int i=0; i < 3; i++){
			this.table[i].pliRemporte = 0;
		}
		
	}
}
