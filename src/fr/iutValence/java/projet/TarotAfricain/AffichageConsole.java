package fr.iutValence.java.projet.TarotAfricain;

/**
 * @author java-tarot-project classe permettant l'affichage en console d'une partie de Tarot et ses batteries de
 *         test.
 */
public class AffichageConsole extends Affichage
{

	@Override
	public void afficherMise(Carte[] cartes, TypeDeJoueur typeDeJ)
	{
		if (typeDeJ.getEstReel()) {
			System.out.println("veuiller entrée votre mise");
		}
		
	}

	@Override
	public void afficherMain(Carte[] mainJoueur, TypeDeJoueur typeDeJ)
	{
		
		if (typeDeJ.getEstReel()) {
			int i = mainJoueur.length;
			while(i >0) {
				System.out.print(mainJoueur[i-1].toString()+" ");
				i--;
			}
			System.out.println();
		}
	}


}
