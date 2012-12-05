package fr.iutValence.java.projet.TarotAfricain;


/**
 * @author theodorc
 *
 */
public interface  TypeDeJoueur
{
	
	/**
	 * @param nbCarte
	 * @return
	 */
	public abstract int attribueMise(int nbCarte);
	
	
	/**
	 * @return renvoie 0 pour une Intelligence Artificielle\n
	 * renvoie 1 pour un Joueur réel.\n
	 */
	public abstract boolean estReel();

	
	/**
	 * @param cartes
	 * @return
	 */
	public abstract Carte attribueCartePosees(Carte[] cartes);
	
}
