package fr.iutValence.java.projet.TarotAfricain;

//FIXME corriger le commentaire
/**
 * @author CLUZE - THEODORE
 * Classe définissant une "carte".
 * A une carte est attribuée une "valeur"
 */
public class Carte {
	
	// FIXME écrire un commentaire
	private int valeurs; //{1..22};

	
	// FIXME constructeurs ?
	
	// FIXME réfléchir à la visibilité de la méthode (public/private)
	// FIXME valeur Vs valeurs ?
	int getValeur() {
		return this.valeurs;			
	}

	// FIXME écrire un commentaire
	// FIXME redéfinir via compareTo de l'interface Comparable<Carte>
	public boolean superieure(Carte carteGagnante) {
		// TODO Auto-generated method stub
		return false;
	}
	
	// FIXME redéfinir toString et écrire une classe de test
}
