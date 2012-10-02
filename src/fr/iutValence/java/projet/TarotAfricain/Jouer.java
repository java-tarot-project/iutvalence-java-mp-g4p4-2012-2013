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
			// distribution
			for (int i = 0;i<3;i++) {
				this.table[i].main = this.jeuDeCarte.distribuer(nbCarte);
			}
			// mise
			for (int i = 0;i<3;i++) {
				this.table[i].mise = this.table[i].mise(nbCarte);
			}
			
			// decrementation de nbCarte
			nbCarte--;
			if (nbCarte == 0) nbCarte=5;
			// condition de fin de jeu
			for (int i = 0;i<3;i++) {
				if (this.table[i].nbVie==0) break;}
			}
		}
}
