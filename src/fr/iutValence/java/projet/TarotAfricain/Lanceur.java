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
		TypeDeJoueur typ =new JoueurReel();
		Joueur J1 = new Joueur(aff,);
		Joueur J2 = new Joueur();
		Joueur J3 = new Joueur();
		Joueur J4 = new Joueur();
		
		Jouer jou = new Jouer(J1,J2,J3,J4,aff);
		jou.jouer();
	}

}
