package fr.iutValence.java.projet.TarotAfricain;


/**
 * @author CLUZE - THEODORE
 * Classe définissant un "Jeu de Cartes".
 * Un jeu de Cartes est constitué de plusieurs cartes
 * Un jeu de carte peut être distribué
 */
public class JeuDeCarte {

	/**
	 * Tableau d'entiers de 1 à 22 à occurence unique.
	 */
	public int Paquet[];
	/**
	 * Valeur minimal que peut prendre une Carte dans un JeuDeCarte
	 */
	public int valeurMin = 1;
	/**
	 * Valeur maximale que peut prendre une Carte dans un JeuDeCarte
	 */
	public int valeurMax = 22;
	
	// FIXME Creer un tableau de 22 cases avec 22 entiers aléatoires de 1 à 22, une seule occurence
	// Tableau à deux dimensions : 22 cases . Chaque case contient [Entier|booléen]
	// (int)(Math.random() * (valeurMax - valeurMin) + valeurMin)
	// Entier : 1 à 22 - booléen : 0 -> carte non utilisée, 1 -> carte utilisée
	// Tant qu'une carte est non utilisée, on génère un nombre aléatoire entre 1 et 22 et on vérifie le booléen.

	/**
	 * @param i représente le nombre de cartes à distribuer.
	 * @return null
	 */
	public Carte[] distribuer(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
