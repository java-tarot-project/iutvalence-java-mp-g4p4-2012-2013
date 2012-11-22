package fr.iutValence.java.projet.TarotAfricain;

import java.io.IOException;

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
	 * @param i paramètre pour un joueur d'indice i
	 * 
	 */
	public abstract void afficherMise(int i);




	/**
	 * @param mainJoueur
	 */
	public abstract void afficherMain(Carte[] mainJoueur);




	/**
	 * @throws IOException 
	 * 
	 */
	public abstract void afficheMise(int mise);







	public abstract int demandeMise(Joueur j) throws IOException;

}
