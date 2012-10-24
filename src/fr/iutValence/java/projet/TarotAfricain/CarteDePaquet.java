package fr.iutValence.java.projet.TarotAfricain;

// FIXME écrire un commentaire
public class CarteDePaquet extends Carte
{
	// FIXME écrire un commentaire
	private boolean carteTiree;

	// FIXME écrire un commentaire
	public CarteDePaquet(int i)
	{
		super(i);
		this.carteTiree = false;
	}

	// FIXME écrire un commentaire
	public boolean estTiree()
	{
		return this.carteTiree;
	}

	// FIXME écrire un commentaire
	public void tirer()
	{
		this.carteTiree = true;

	}

	// FIXME écrire un commentaire
	public void remettre()
	{
		this.carteTiree = false;

	}

}
