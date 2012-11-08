/**
 * 
 */
package fr.iutValence.java.projet.TarotAfricain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

// FIXME compléter le commentaire
/**
 * @author theodorc
 * 
 */
public class JoueurReel extends Joueur
{

	
	// FIXME compléter le commentaire
	/**
	 * 
	 */
	public JoueurReel()
	{

	}

	@Override
	int mise(int nbCarte) throws MiseException, IOException
	{
		Affichage.afficheDemandeMise();
		InputStreamReader isr = new InputStreamReader(System.in, "US-ASCII");
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		try
		{
			
			s = br.readLine();
			int i = Integer.parseInt(s);
			isr.close();
			br.close();
			if (i > nbCarte || i < 0) {
				throw new MiseException();
			}
			return i;
		}
		catch (Exception e)
		{
			Affichage.afficheErreurMise();
			return mise(nbCarte);
		}

	}

	@Override
	Carte poserCarte()
	{
		// TODO Auto-generated method stub
		return null;
	}



}
