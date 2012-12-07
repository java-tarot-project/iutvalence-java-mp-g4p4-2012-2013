package interfaceAffichage;

import classesPrincipales.Carte;
import interfaceJoueur.TypeDeJoueur;


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
			System.out.println("Veuillez entrer une mise correspondant aux nombres de plis\n" +
					"que vous espérez remporter lors du jeu.");	// on affiche la demande de mise
		}
		
	}

	@Override
	public void demanderMain(Carte[] mainJoueur, TypeDeJoueur typeDeJ)
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
			System.out.println("Veuillez poser une carte.");
		}
	}




	@Override
	public void tourDuJoueur(String nom)
	{
		System.out.printf("Au tour de: %s\n",nom);
		
		
	}




	@Override
	public void demarrerPartie()
	{
		System.out.println("Début de partie.\n____________________________\n");
		
	}

	@Override
	public void pointsDeVieRestants(String joueurCourant, int pointDeVie)
	{
		System.out.printf("%s possède %d points de vie.\n",joueurCourant,pointDeVie);
		
	}

	@Override
	public String demanderNomJoueur(TypeDeJoueur typeJoueur, int joueurCourant)
	{
		System.out.printf("Saisie du nom pour le joueur %d\n",joueurCourant);
		return typeJoueur.attribuerNom();

	}

	@Override
	public void debutPli(int tour)
	{
		System.out.printf("Tour n°%d\n___________\n", tour);
	}

	@Override
	public void finPli(int tour)
	{
		System.out.printf("Fin du pli n°%d\n", tour);
		
	}

	@Override
	public void demanderMise()
	{
		System.out.println("------------------------\nVeuillez saisir les mises.\n------------------------");
		
	}


}
