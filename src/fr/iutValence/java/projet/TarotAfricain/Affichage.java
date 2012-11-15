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
	 * @param i 
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
	public abstract void afficheMise();



	/**
	 * 
	 */
	public abstract void afficheErreurMise();




	/**
	 * @return
	 * @throws IOException
	 */
	public int demandeMise() throws IOException
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
