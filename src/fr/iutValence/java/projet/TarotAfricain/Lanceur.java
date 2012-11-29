package fr.iutValence.java.projet.TarotAfricain;

/**
 * @author theodorc
 *
 */
public class Lanceur
{

	/**
	 * @param args
	 * @throws Exception 
	 * @throws MiseException 
	 * 
	 */
	public static void main(String[] args) throws MiseException, Exception
	{
	
		Affichage aff = new AffichageConsole();
		TypeDeJoueur typReel =new TypeJoueurReel();
		TypeDeJoueur typIA = new TypeJoueurIA();
		Joueur J1 = new Joueur(aff,typReel);
		Joueur J2 = new Joueur(aff,typIA);
		Joueur J3 = new Joueur(aff,typIA);
		Joueur J4 = new Joueur(aff,typIA);
		
		Jouer jou = new Jouer(J1,J2,J3,J4,aff);

		jou.jouer();
	}

}
