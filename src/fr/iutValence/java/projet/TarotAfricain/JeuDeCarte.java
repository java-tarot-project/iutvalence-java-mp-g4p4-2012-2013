package fr.iutValence.java.projet.TarotAfricain;


/**
 * Classe définissant un "Jeu de Cartes".
 * Un jeu de Cartes est constitué de plusieurs cartes
 * Un jeu de carte peut être distribué
 * 
 * @author CLUZE - THEODORE

 */
// FIXME renommer la classe (il y a plusieurs cartes dans le jeu : JeuDeCartes ?)
public class JeuDeCarte {

	// FIXME définir une constante par carte du paquet (pour n'avoir qu'un seul exemplaire de chaque cart par paquet)
	/**
	 * Valeur minimale que peut prendre une Carte dans un JeuDeCarte
	 */
	// FIXME respecter les conventions d'écriture
	public final static int valeurMin = 1;
	
	/**
	 * Valeur maximale que peut prendre une Carte dans un JeuDeCarte
	 */
	// FIXME respecter les conventions d'écriture
	public final static int valeurMax = 22;

	// FIXME le commentaire ne correspond pas à la définition
	/**
	 * Tableau d'entiers de 1 à 22 à occurence unique.
	 */
	public Carte[] Paquet;
	
	
	// FIXME Définir un seul tableau, dont le type peut être hérité de Carte pour ajouter la notion de distribuée/non distribuée
	/**
	 * 
	 */
	public boolean[] boolPaquet;
	
	
	// FIXME compléter le commentaire
	/**
	 * 
	 */
	public JeuDeCarte() {
		int i;
		for(i = 1; i <= 22;i++) {
			this.Paquet[i].setValeurs(i);
			this.boolPaquet[i]=false;
		}
		
	}

	// FIXME ajouter une méthode permettant de tirer une carte au hasard dans le paquet
	
	// FIXME ajouter une méthode permettant de savoir combien il reste de cartes dans le paquet
	
	// FIXME compléter/corriger le commentaire
	/**
	 * @param nbCarteADistrib représente le nombre de cartes à distribuer.
	 * @return null
	 */
	public Carte[] distribuer(int nbCarteADistrib) {
		int i;
		Carte[] retourn =new Carte[nbCarteADistrib] ;
		for(i=1; i<= nbCarteADistrib;i++) {
			int y=(int)(Math.random() * (valeurMax - valeurMin) + valeurMin);
			if((this.boolPaquet[y]) ) {
				retourn[i]=this.Paquet[y];
			}
			else i--;
		}
		return retourn;
	}
	
	
	public String toString(){
		String chaineJeuDeCarte = "";
		while()      //On a un petit souci ici
		return chaineJeuDeCarte;
	}
}
