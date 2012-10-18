package fr.iutValence.java.projet.TarotAfricain;

/**
 * Classe définissant un "Jeu de Cartes". Un jeu de Cartes est constitué de
 * plusieurs cartes Un jeu de carte peut être distribué
 * 
 * @author CLUZE - THEODORE
 */
// FIXME renommer la classe (il y a plusieurs cartes dans le jeu : JeuDeCartes
// ?)
public class JeuDeCartes {

	// FIXME définir une constante par carte du paquet (pour n'avoir qu'un seul
	// exemplaire de chaque carte par paquet)

	private final static Carte carte1 = new Carte(1);
	private final static Carte carte2 = new Carte(2);
	private final static Carte carte3 = new Carte(3);
	private final static Carte carte4 = new Carte(4);
	private final static Carte carte5 = new Carte(5);
	private final static Carte carte6 = new Carte(6);
	private final static Carte carte7 = new Carte(7);
	private final static Carte carte8 = new Carte(8);
	private final static Carte carte9 = new Carte(9);
	private final static Carte carte10 = new Carte(10);
	private final static Carte carte11 = new Carte(11);
	private final static Carte carte12 = new Carte(12);
	private final static Carte carte13 = new Carte(13);
	private final static Carte carte14 = new Carte(14);
	private final static Carte carte15 = new Carte(15);
	private final static Carte carte16 = new Carte(16);
	private final static Carte carte17 = new Carte(17);
	private final static Carte carte18 = new Carte(18);
	private final static Carte carte19 = new Carte(19);
	private final static Carte carte20 = new Carte(20);
	private final static Carte carte21 = new Carte(21);
	private final static Carte carte22 = new Carte(22);

	/**
	 * Valeur minimale que peut prendre une Carte dans un JeuDeCarte
	 */
	public final static int VALEURMIN = 1;

	/**
	 * Valeur maximale que peut prendre une Carte dans un JeuDeCarte
	 */
	public final static int VALEURMAX = 22;

	// FIXME le commentaire ne correspond pas à la définition
	/**
	 * Tableau d'entiers de 1 à 22 à occurence unique.
	 */
	public Carte[] Paquet;

	// FIXME Définir un seul tableau, dont le type peut être hérité de Carte
	// pour ajouter la notion de distribuée/non distribuée
	/**
	 * 
	 */
	public boolean[] boolPaquet;

	// FIXME compléter le commentaire
	/**
	 * 
	 */
	public JeuDeCartes() {

	}

	// FIXME ajouter une méthode permettant de tirer une carte au hasard dans le
	// paquet

	// FIXME ajouter une méthode permettant de savoir combien il reste de cartes
	// dans le paquet

	// FIXME compléter/corriger le commentaire
	/**
	 * @param nbCarteADistrib
	 *            représente le nombre de cartes à distribuer.
	 * @return null
	 */
	public Carte[] distribuer(int nbCarteADistrib) {
		int i;
		Carte[] retourn = new Carte[nbCarteADistrib];
		for (i = 1; i <= nbCarteADistrib; i++) {
			int y = (int) (Math.random() * (VALEURMAX - VALEURMIN) + VALEURMIN);
			if ((this.boolPaquet[y])) {
				retourn[i] = this.Paquet[y];
			}
			else
				i--;
		}
		return retourn;
	}

	public String toString() {
		String chaineJeuDeCarte = "";
		int i;
		for (i = 1; i < 22; i++) {
			chaineJeuDeCarte = chaineJeuDeCarte + this.Paquet[i].getValeurs();
		}
		return chaineJeuDeCarte;
	}
}
