package fr.iutValence.java.projet.TarotAfricain;

/**
 * * Classe définissant une "carte". A une carte est attribuée une "valeur"
 * 
 * @author CLUZE - THEODORE
 */
public class Carte
{

	// FIXME faire en sorte qu'une carte ne puisse pas être modifiée une fois
	// créée (fixed)

	// FIXME si cela représente la valeur d'une carte, renommer l'attribut (fixed)
	// FIXME définir les constantes des cartes via une énumération
	/**
	 * valeurs possibles que peut prendre une carte. Une carte prend une valeur entre 1 et 22.
	 */
	private final int valeur; // {1..22};

	// FIXME compléter le commentaire
	/**
	 * @param i
	 */
	public Carte(int i)
	{
		this.valeur = i;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "" + this.valeur;
	}

	// FIXME remplacer par la méthode compareTo de Comparable<Carte>
	/**
	 * @param carteGagnante
	 * @return boolean un booléen à 1 si la carte est supérieure à carteGagnante à 0 si la carte est inférieure à
	 *         carteGagnante.
	 */
	public boolean superieure(Carte carteGagnante)
	{
		if (this.valeur >= carteGagnante.valeur)
			return true;
		else
			return false;
	}

	/**
	 * @param carte
	 * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than
	 *         the specified object.
	 */
	public int compareTo(Carte carte)
	{

		return (this.valeur - carte.valeur);
	}

	/**
	 * @return l'attribut valeurs de la Carte
	 */
	public int getValeurs()
	{
		return this.valeur;
	}

	// FIXME redéfinir equals et hashCode (fixed)
	/**
	 * @param carte
	 * @return
	 */
	public boolean equals(Carte carte)
	{
		return this.valeur == carte.valeur;
	}

	public int hashCode()
	{
		int result = 1;
		final int multiplier = 1;
		result = multiplier * result + this.valeur;
		return result;
	}

	// FIXME écrire (dans une autre classe) une application de test basique

}
