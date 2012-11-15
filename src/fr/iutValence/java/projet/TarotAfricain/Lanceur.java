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
		Joueur J1 = new JoueurReel(aff);
		Joueur J2 = new JoueurIA(aff);
		Joueur J3 = new JoueurIA(aff);
		Joueur J4 = new JoueurIA(aff);
		
		Jouer jou = new Jouer(J1,J2,J3,J4,aff);
		jou.jouer();
	}

}
