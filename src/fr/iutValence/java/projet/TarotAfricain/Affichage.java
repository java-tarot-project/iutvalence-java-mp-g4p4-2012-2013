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
	 * @param i 
	 * 
	 */
	public abstract void afficherMise(int i);




	/**
	 * @param mainJoueur
	 */
	public abstract void afficherMain(Carte[] mainJoueur);




	/**
	 * 
	 */
	public abstract void afficheDemandeMise();




	/**
	 * 
	 */
	public abstract void afficheErreurMise();

}
