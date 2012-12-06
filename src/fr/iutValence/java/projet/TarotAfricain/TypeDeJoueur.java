package fr.iutValence.java.projet.TarotAfricain;


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
	 * @return renvoie un entier reflétant la valeur de la mise.
	 */
	public abstract int attribueMise(int nbCarte);
	
	
	/**
	 * @return renvoie 0 pour une Intelligence Artificielle\n
	 * renvoie 1 pour un Joueur réel.\n
	 */
	public abstract boolean estReel();

	
	/**
	 * Méthode décrivant les actions nécessaires à la gestion des cartes posées par un joueur.
	 * @param cartes paramètre les cartes parmi lesquelles choisir lors d'un pli.
	 * @return renvoie la carte sélectionnée.
	 */
	public abstract Carte attribueCartePosees(Carte[] cartes);
	
}
