package fr.iutValence.java.projet.TarotAfricain;

/**
 * @author java-tarot-project 
 * Classe émergeant d'Affichage.\n
 * AffichageConsole est une implémentation des méthodes d'Affichage vers la console.\n
 */
public class AffichageConsole implements Affichage
{

	@Override
	public void afficherMise(Carte[] cartes, TypeDeJoueur typeDeJ)
	{
		if (typeDeJ.estReel()) { 							// Vérification du type du joueur
			System.out.println("veuiller entrée votre mise");	// on affiche la demande de mise
		}
		
	}

	@Override
	public void afficherMain(Carte[] mainJoueur, TypeDeJoueur typeDeJ)
	{
		
		if (typeDeJ.estReel()) {								// Vérification du type du joueur
			int i = mainJoueur.length;							// i prend la taille de la main courante
			while(i >0) {										// Tant qu'il y a une carte, on l'affiche
				System.out.print(mainJoueur[i-1].toString()+" ");
				i--;
			}
			System.out.println();
		}
	}

	@Override
	public void afficheCarte(TypeDeJoueur typeDeJ)
	{
		if (typeDeJ.estReel()) {								// Vérification du type du joueur
			System.out.println("Quelle carte voulais vous poser ?");
		}
	}




	@Override
	public void nomJoueur(String nom)
	{
		System.out.print("le joueur qui joue est ");
		System.out.println(nom);
		
		
	}

	@Override
	public void ScoreJoueur(String nomJoueur, int pointDeVie)
	{
		System.out.print("le joueur ");
		System.out.print(nomJoueur);
		System.out.print(" à ");
		System.out.print(pointDeVie);
		System.out.print("point de vie.");
		
	}


}
