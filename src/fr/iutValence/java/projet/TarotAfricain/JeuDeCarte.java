package fr.iutValence.java.projet.TarotAfricain;


/**
 * Classe définissant un "Jeu de Cartes".
 * Un jeu de Cartes est constitué de plusieurs cartes
 * Un jeu de carte peut être distribué
 * 
 * @author CLUZE - THEODORE

 */
// FIXME renommer la classe (JeuDeCartes ?)                    Pourquoi?
public class JeuDeCarte {


	/**
	 * Valeur minimale que peut prendre une Carte dans un JeuDeCarte
	 */
	public final static int valeurMin = 1;
	
	/**
	 * Valeur maximale que peut prendre une Carte dans un JeuDeCarte
	 */
	public final static int valeurMax = 22;

	/**
	 * Tableau d'entiers de 1 à 22 à occurence unique.
	 */
	public Carte[] Paquet;
	
	/**
	 * 
	 */
	public boolean[] boolPaquet;
	
	
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
