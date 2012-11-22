package fr.iutValence.java.projet.TarotAfricain;

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


}
