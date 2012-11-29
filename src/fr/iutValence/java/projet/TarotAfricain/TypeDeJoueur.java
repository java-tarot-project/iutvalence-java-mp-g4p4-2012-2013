package fr.iutValence.java.projet.TarotAfricain;

import java.io.IOException;

/**
 * @author theodorc
 *
 */
public abstract class TypeDeJoueur
{

	private boolean estReel;
	
	public abstract int attribueMise(int nbCarte);
	
	public abstract boolean getEstReel();

	public abstract Carte attribueCartePoser(Carte[] cartes);
	
}
