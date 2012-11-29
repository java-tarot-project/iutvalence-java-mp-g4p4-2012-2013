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
	 * @param cartes paramètre pour un joueur d'indice i
	 * @param typeDeJ 
	 * 
	 */
	public abstract void afficherMise(Carte[] cartes, TypeDeJoueur typeDeJ);




	/**
	 * afficherMain est une méthode permettant d'afficher la liste des cartes (main) que possède un joueur.
	 * @param mainJoueur tableau de cartes appartenant à un joueur.
	 */
	
	public abstract void afficherMain(Carte[] mainJoueur, TypeDeJoueur typeDeJ);

}
