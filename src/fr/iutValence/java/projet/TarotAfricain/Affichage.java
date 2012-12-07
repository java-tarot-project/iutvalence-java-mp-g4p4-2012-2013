package fr.iutValence.java.projet.TarotAfricain;


/**
 * @author theodorc
 * Interface Affichage.\n
 * Description des appels des méthodes pour les affichages spécifiques { console, graphique }.\n
 * Affichage est complété par des fonctions d'affichage permettant à l'utilisateur d'avoir une trace de l'exécution du jeu.
 */
public interface Affichage
{

	
	/**
	 * afficherMise est une méthode permettant d'afficher la Mise d'un joueur.
	 * @param cartes paramètre pour un joueur d'indice i
	 * @param typeDeJ Paramètre désignant la nature du joueur { Reel, IA }
	 * 
	 */
	public abstract void afficherMise(Carte[] cartes, TypeDeJoueur typeDeJ);




	/**
	 * afficherMain est une méthode permettant d'afficher la liste des cartes (main) que possède un joueur.
	 * @param mainJoueur tableau de cartes appartenant à un joueur.
	 * @param typeDeJ Paramètre désignant la nature du joueur { Reel, IA }
	 */
	
	public abstract void afficherMain(Carte[] mainJoueur, TypeDeJoueur typeDeJ);




	/**
	 * afficheCarte affiche la demande pour poser une carte
	 * @param typeDeJ Paramètre désignant la nature du joueur { Reel, IA }
	 */
	public abstract void afficheCarte(TypeDeJoueur typeDeJ);




	/**
	 * affiche le nom du joueur
	 * @param string nom du joueur
	 */
	public abstract void nomJoueur(String string);




	/**
	 * affichage du nombre de point de vie
	 * @param nomJoueur nom du joueur
	 * @param pointDeVie nombre de point de vie restant
	 */
	public abstract void ScoreJoueur(String nomJoueur, int pointDeVie);



}
