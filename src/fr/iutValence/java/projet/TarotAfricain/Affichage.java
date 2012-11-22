package fr.iutValence.java.projet.TarotAfricain;


/**
 * @author theodorc
 *
 */
public abstract class Affichage
{

	/**
	 * 
	 */
	 public Affichage(){ }
	
		
	
	
	/**
	 * afficherMise est une méthode permettant d'afficher la Mise d'un joueur.
	 * @param i paramètre pour un joueur d'indice i
	 * 
	 */
	public abstract void afficherMise(int i);




	/**
	 * afficherMain est une méthode permettant d'afficher la liste des cartes (main) que possède un joueur.
	 * @param mainJoueur tableau de cartes appartenant à un joueur.
	 */
	public abstract void afficherMain(Carte[] mainJoueur);
}
