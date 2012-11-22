package fr.iutValence.java.projet.TarotAfricain;

// FIXME écrire un commentaire
/**
 * @author theodorc
 *
 */
public class CarteDePaquet extends Carte
{
	/**
	 * 
	 */
	private boolean carteTiree;

	/**
	 * @param i Carte de paquet n°i
	 */
	public CarteDePaquet(int i)
	{
		super(i);
		this.carteTiree = false;
	}

	/**
	 * @return un booléen {0,1} selon si une carte a été tirée ou non.
	 */
	public boolean estTiree()
	{
		return this.carteTiree;
	}

	/**
	 * 
	 */
	public void tirer()
	{
		this.carteTiree = true;

	}

	/**
	 * 
	 */
	public void remettre()
	{
		this.carteTiree = false;

	}

}
