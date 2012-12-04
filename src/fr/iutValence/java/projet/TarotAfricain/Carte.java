package fr.iutValence.java.projet.TarotAfricain;

/**
 * Carte de Tarot Africain.\n
 * Cette classe possède un attribut "valeur".\n
 * Elle implémente des méthodes de chaînage et de comparaison.\n
 * @author CLUZE - THEODORE
 */
public class Carte
{
	/**
	 * Cet attribut unique est initialisé et inchangeant, \n
	 * prenant une valeur comprise strictement entre 1 et 22.\n
	 */
	private final int valeur;

	/**
	 * Constructeur relatif à une carte. \n
	 * Ce constructeur prend un paramètre entier « i » et initialise la valeur de la carte.\n
	 * @param i représente la valeur donnée à la carte.
	 */
	public Carte(int i)
	{
		this.valeur = i;
	}

	/**
	 * Cette méthode toString() permet de renvoyer la valeur de la carte sous forme d'une chaîne de caractères.\n
	 */
	public String toString()
	{
		return "" + this.valeur;
	}

	/**
	 * La méthode superieure compare la carte à un autre objet de type Carte.\n
	 * Cette méthode prend une carte en paramètre, la compare avec la carte ayant appelé la méthode supérieur,\n
	 * et renvoie un booléen selon l'issue de la comparaison.
	 * @param carteGagnante Carte en paramètre utilisée pour être comparée à une autre.
	 * @return boolean un booléen à :\n -1- si la carte est supérieure à carteGagnante
	 * \n -0- si la carte est inférieure à carteGagnante.
	 */
	public boolean superieure(Carte carteGagnante)
	{
		// TODO Vérifier la simplification
		//	if (this.compareTo(carteGagnante)>0)
		//		return true;
		//	else
		//		return false;
		return ( (this.compareTo(carteGagnante)>0) );
	}

	/**
	 * La méthode compareTo prend une Carte en paramètre et renvoie la différence\n
	 * entre la valeur de la carte appelant la méthode et celle de la carte à comparer.\n
	 * @param carte paramètre comparé.
	 * @return * Un entier négatif si la valeur de la carte est inférieure à celle de la valeur de la carte spécifiée.\n
	 * Zero si les valeurs des cartes comparées sont identiques.\n
	 * Un entier positif si la valeur de la carte est supérieure à celle de la valeur de la carte spécifiée.
	 */
	public int compareTo(Carte carte)
	{
		return (this.valeur - carte.valeur);
	}

	/**
	 * Méthode renvoyant la valeur de la carte appelant la méthode.
	 * @return l'attribut valeur de la Carte
	 */
	public int getValeurs()
	{
		return this.valeur;
	}
	// TODO Verifier si le FIXME est corrigé.
	// FIXME ce n'est pas une redéfinition de equals(Object o)
	/**
	 * @param carte Carte en paramètre utilisée pour comparer sa valeur.
	 * @return un booléen {0,1} 0 si valeurs différentes, 1 si égales.
	 */
	public boolean equals(Carte carte)
	{
		return this.valeur == carte.valeur;
	}

	/**
	 * La méthode hashCode est redéfinie pour une carte.\n
	 * Cette méthode permet d'attribuer une valeur de hachage à un objet.\n
	 * Cette valeur est utilisée pour comparer deux objets entre eux.\n
	 * Exemple, si le hashCode est identique, les cartes comparées sont identiques.
	 */
	public int hashCode()
	{
		int result = 1;
		final int multiplier = 1; // Le hashcode correspond ainsi à la valeur de la carte.
		result = multiplier * result + this.valeur;
		return result;
	}

	

}
