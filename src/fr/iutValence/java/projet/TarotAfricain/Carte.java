package fr.iutValence.java.projet.TarotAfricain;
	// /!\ Demander à S. Jean d'éclaircir le sujet de la classe de test. /!\
	
/**
 *  * Classe définissant une "carte".
 * A une carte est attribuée une "valeur"
 * @author CLUZE - THEODORE

 */
public class Carte {
	

	// FIXME ici, on représente UNE carte. une carte ne peut prendre qu'une seule valeur.
	/**
	 * valeurs possibles que peut prendre une carte.
	 * Une carte prend une valeur entre 1 et 22.
	 */
	public int valeurs; //{1..22};


	/**
	 * Méthode permettant de convertir la valeur de la carte en une chaîne de caractère.
	 * @return String conversion de valeurs (int) en String.
	 */
	// FIXME remplacer par la redéfinition de toString
	public String afficherValeur(){
		return "" +this.valeurs;
	}
	
	// FIXME remplacer par la maéthode compareTo de Comparable<Carte>
	/**
	 * @param carteGagnante
	 * @return boolean un booléen à 1 si la carte est supérieure à carteGagnante
	 * 							  à 0 si la carte est inférieure à carteGagnante.
	 */
	public boolean superieure(Carte carteGagnante) {
		if (this.valeurs >= carteGagnante.valeurs)return true;
		else return false;
	}
	
	
	

	// S.Jean propose de repasser par compareTo( o object )
	//public boolean superieure(Carte carteGagnante) {
	//	return false;
	//}

}
