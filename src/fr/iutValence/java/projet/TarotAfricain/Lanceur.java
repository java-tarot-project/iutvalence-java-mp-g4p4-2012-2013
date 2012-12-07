package fr.iutValence.java.projet.TarotAfricain;


/**
 * Classe permettant le lancement d'une partie.
 * @author Nyan-PC
 * Cette classe " Lanceur " initialise simplement les paramètres d'une partie et laisse se dérouler le jeu.
 */
public class Lanceur
{

	/**
	 * @param args Un paramètre intrinsèque à main mais inutilisé ici.
	 * @throws MiseException relève des exceptions si le typage de la mise est incorrect.
	 * @throws Exception relève une exception.
	 * 
	 */
	public static void main(String[] args) throws MiseException, Exception
	{
		Affichage aff = new AffichageConsole();
		TypeDeJoueur typReel =new TypeJoueurReelConsole();
		//TypeDeJoueur typIA = new TypeJoueurIA();
		Joueur J1 = new Joueur(aff,typReel);
		Joueur J2 = new Joueur(aff,typReel);
		Joueur J3 = new Joueur(aff,typReel);
		Joueur J4 = new Joueur(aff,typReel);
		
		Jouer jou = new Jouer(J1,J2,J3,J4,aff);

		jou.jouer();
	}

}
