package fr.iutValence.java.projet.TarotAfricain;

public class Lanceur
{

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args)
	{
	
		Joueur J1 = new JoueurReel();
		Joueur J2 = new JoueurIA();
		Joueur J3 = new JoueurIA();
		Joueur J4 = new JoueurIA();
		
		Affichage aff = new AffichageConsole();
		
		Jouer jou = new Jouer(J1,J2,J3,J4,aff);
		
	}

}
