package fr.iutValence.java.projet.TarotAfricain;


/**
 * @author theodorc
 * Classe Abstraite Affichage.\n
 * Description des appels des méthodes pour les affichages spécifiques { console, graphique }.\n
 * Affichage implémente des fonctions d'affichage permettant à l'utilisateur d'avoir une trace de l'exécution du jeu.
 */
public abstract class Affichage
{

	/**
	 * Constructeur propre à Affichage.
	 * Permet l'initialisation d'un affichage.
	 */
	//TODO Compléter ici le constructeur
	 public Affichage(){ }
	
		
	
	
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

}
