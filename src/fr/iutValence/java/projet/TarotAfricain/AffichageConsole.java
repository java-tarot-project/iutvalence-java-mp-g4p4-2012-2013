package fr.iutValence.java.projet.TarotAfricain;

import java.io.*;
// FIXME affichageConsole ne doit pas être une interface (fixed)
/**
 * @author java-tarot-project classe permettant l'affichage en console d'une partie de Tarot et ses batteries de
 *         test.
 */
public class AffichageConsole extends Affichage
{

	
	public void afficherMise(int i)
	{
		System.out.println(i);
	}

	@Override
	public void afficherMain(Carte[] mainJoueur)
	{
		System.out.println("toi");
		int i = mainJoueur.length;
		System.out.println(i);
		while(i >0) {
			System.out.print(mainJoueur[i].toString()+" ");
		}
		
	}

	@Override
	public int demandeMise()  throws IOException
	{

		System.out.println("Veuillez miser sur le nombre de plis que vous gagnerez.");
		int val = 0;
		try {
		      val = System.in.read();
		    } catch (NumberFormatException ex) {
		      System.err.println("Ce n'est pas un entier. ");
		    } catch (IOException e) {
		      System.err.println(" IO ERROR: " + e);
		    }
			return val;
		 }

			
	

	@Override
	public void afficheErreurMise()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficheMise() throws IOException
	{
		this.demandeMise();
		
		
	}


}
