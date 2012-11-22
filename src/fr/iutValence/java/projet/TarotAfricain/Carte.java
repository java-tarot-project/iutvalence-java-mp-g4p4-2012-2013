package fr.iutValence.java.projet.TarotAfricain;

/**
 * * Classe définissant une "carte". A une carte est attribuée une "valeur"
 * 
 * @author CLUZE - THEODORE
 */
public class Carte
{
	/**
	 * valeurs possibles que peut prendre une carte. Une carte prend une valeur entre 1 et 22.
	 */
	private final int valeur; // {1..22};

	/**
	 * Constructeur d'une carte.
	 * @param i représente la valeur donnée à une carte.
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

	// FIXME remplacer par la méthode compareTo de Comparable<Carte> fixed
	/**
	 * @param carteGagnante Carte en paramètre utilisée pour être comparée à une autre.
	 * @return boolean un booléen à 1 si la carte est supérieure à carteGagnante à 0 si la carte est inférieure à
	 *         carteGagnante.
	 */
	public boolean superieure(Carte carteGagnante)
	{
		if (this.compareTo(carteGagnante)>0)
			return true;
		else
			return false;
	}

	/**
	 * @param carte paramètre comparé.
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
	 * @param carte Carte en paramètre utilisée pour comparer sa valeur.
	 * @return un booléen {0,1} 0 si valeurs différentes, 1 si égales.
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

	// FIXME écrire (dans une autre classe) une application de test basique (deja fait est suprimé)(fixed)
	

}
