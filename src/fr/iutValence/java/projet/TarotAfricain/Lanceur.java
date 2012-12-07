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
	 * @throws Exception 
	 * 
	 */
	public static void main(String[] args) throws MiseException, Exception
	{
	
		String nom1 = "NORD";
		String nom2 = "EST";
		String nom3 = "SUD";
		String nom4 = "OUEST";
		Affichage aff = new AffichageConsole();
		TypeDeJoueur typReel =new TypeJoueurReelConsole();
		//TypeDeJoueur typIA = new TypeJoueurIA();
		Joueur J1 = new Joueur(aff,typReel,nom1);
		Joueur J2 = new Joueur(aff,typReel,nom2);
		Joueur J3 = new Joueur(aff,typReel,nom3);
		Joueur J4 = new Joueur(aff,typReel,nom4);
		
		Jouer jou = new Jouer(J1,J2,J3,J4,aff);

		jou.jouer();
	}

}
