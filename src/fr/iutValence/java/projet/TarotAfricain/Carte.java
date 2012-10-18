package fr.iutValence.java.projet.TarotAfricain;

/**
 * * Classe définissant une "carte". A une carte est attribuée une "valeur"
 * 
 * @author CLUZE - THEODORE
 */
public class Carte {

	// FIXME faire en sorte qu'une carte ne puisse pas être modifiée une fois
	// créée

	// FIXME si cela représente la valeur d'une carte, renommer l'attribut
	// FIXME définir les constantes des cartes via une énumération
	/**
	 * valeurs possibles que peut prendre une carte. Une carte prend une valeur
	 * entre 1 et 22.
	 */
	private int valeurs; // {1..22};

	// FIXME définir un constructeur
	public Carte(int i) {
		this.valeurs = i;
	}

	/**
	 * Méthode permettant de convertir la valeur de la carte en une chaîne de
	 * caractères.
	 * 
	 * @return String conversion de valeurs (int) en String.
	 */
	public String toString() {
		return "" + this.valeurs;
	}

	// FIXME remplacer par la méthode compareTo de Comparable<Carte>
	/**
	 * @param carteGagnante
	 * @return boolean un booléen à 1 si la carte est supérieure à carteGagnante
	 *         à 0 si la carte est inférieure à carteGagnante.
	 */
	public boolean superieure(Carte carteGagnante) {
		if (this.valeurs >= carteGagnante.valeurs) return true;
		else
			return false;
	}

	// FIXME écrire un commentaire
	/**
	 * @param i
	 */
	public void setValeurs(int i) {
		this.valeurs = i;

	}

	public int getValeurs() {
		return this.valeurs;
	}

	// FIXME redéfinir equals et hashCode

	// FIXME écrire (dans une autre classe) une application de test basique

}
