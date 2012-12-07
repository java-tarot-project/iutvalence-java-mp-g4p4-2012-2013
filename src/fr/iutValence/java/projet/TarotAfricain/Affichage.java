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
	
	public abstract void demanderMain(Carte[] mainJoueur, TypeDeJoueur typeDeJ);




	/**
	 * afficheCarte affiche la demande pour poser une carte
	 * @param typeDeJ Paramètre désignant la nature du joueur { Reel, IA }
	 */
	public abstract void afficheCarte(TypeDeJoueur typeDeJ);




	/**
	 * affiche le nom du joueur
	 * @param string nom du joueur
	 */
	public abstract void tourDuJoueur(String string);








	/**
	 * Méthode simple signalant le début de partie.
	 * 
	 */
	public abstract void demarrerPartie();




	/**
	 * Méthode permettant d'afficher les points de vie d'un joueur
	 * @param joueurCourant représente le nom d'un joueur
	 * @param pointDeVie paramètre désignant les points de vie d'un joueur
	 */
	public abstract void pointsDeVieRestants(String joueurCourant, int pointDeVie);




	/**
	 * Méthode permettant de capturer le nom de chaque joueur.
	 * @param type représente le type du Joueur pour l'attribution du nom
	 * @param joueurCourant paramètre correspondant à l'indice du joueur dans la table de joueurs.
	 * @return renvoie chaîne de caractère représentant le nom d'un joueur
	 * 
	 */
	public abstract String demanderNomJoueur(TypeDeJoueur type, int joueurCourant);




	/**
	 * Méthode permettant d'afficher le numéro du pli
	 * @param tour paramètre désignant le numéro du pli
	 */
	public abstract void debutPli(int tour);




	/**
	 * Méthode permettant d'afficher la fin d'un tour
	 * @param tour paramètre désignant le numéro du pli
	 */
	public abstract void finPli(int tour);




	/**
	 * Méthode permettant de demander aux joueurs de miser.
	 */
	public abstract void demanderMise();



}
