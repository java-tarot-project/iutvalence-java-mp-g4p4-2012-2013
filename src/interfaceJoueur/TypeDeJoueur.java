package interfaceJoueur;

import classesPrincipales.Carte;


/**
 * @author theodorc
 * Interface TypeDeJoueur.\n
 * Description des appels des méthodes concernant un type de joueur.\n
 * TypeDeJoueur est complété par des fonctions d'affichage/recepetion permettant au joueur d'exécuter ses actions de jeu..
 */
public interface  TypeDeJoueur
{
	
	/**
	 * Méthode définissant les actions nécessaires à la demande d'une mise
	 * @param nbCarte entier reflétant un entier maximum pour la mise
	 * @param main la main du joueur
	 * @return renvoie un entier reflétant la valeur de la mise.
	 */
	public abstract int attribueMise(int nbCarte, Carte[] main);
	
	
	/**
	 * @return renvoie 0 pour une Intelligence Artificielle\n
	 * renvoie 1 pour un Joueur réel.\n
	 */
	public abstract boolean estReel();

	
	/**
	 * Méthode décrivant les actions nécessaires à la gestion des cartes posées par un joueur.
	 * @param cartes paramètre les cartes parmi lesquelles choisir lors d'un pli.
	 * @param aQui a quelle position le joueur joue { en premier en deuxieme, en troisieme, en dernier}
	 * @param pliRemporte nombre de plie deja remporter
	 * @param mise le nombre de pli qu'il doit remporter
	 * @return renvoie la carte sélectionnée.
	 */
	public abstract Carte attribueCartePosees(Carte[] cartes, int mise, int pliRemporte, int aQui);


	/**
	 * Méthode permettant la capture d'un nom pour un joueur.
	 * @return String renvoie le nom
	 */
	public abstract String attribuerNom();
	
}
