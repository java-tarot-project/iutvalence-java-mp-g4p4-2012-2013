package fr.iutValence.java.projet.TarotAfricain;

public class CarteDePaquet extends Carte
{

	private boolean carteTiree;

	public CarteDePaquet(int i)
	{
		super(i);
		this.carteTiree = false;
	}

	public boolean getValCarteTiree()
	{
		return this.carteTiree;
	}

	public void setValCarteTiree(boolean b)
	{
		this.carteTiree = b;

	}

}
