package classesPrincipales;

/**
 * La classe CarteDePaquet permet de compléter le comportement de Carte\n
 * par l'ajout d'un attribut décrivant le comportement d'une carte au sein d'un paquet de cartes.
 * @author Jambon
 *
 */
public class CarteDePaquet extends Carte
{
	/**
	 * carteTiree est un booléen traduisant la disponibilité de la carte dans un paquet.
	 * false (0) si la carte est toujours dans le paquet.
	 * true (1)  si la carte a été tirée.
	 */
	private boolean carteTiree;

	/**
	 * Constructeur utilisant le constructeur d'une Carte en complétant l'initialisation de l'attribut carteTiree.
	 * @param i Carte de paquet n°i
	 */
	public CarteDePaquet(int i)
	{
		super(i);
		this.carteTiree = false;
	}

	/**
	 * @return un booléen {0,1} selon si une carte a été tirée ou non.
	 */
	public boolean estTiree()
	{
		return this.carteTiree;
	}

	/**
	 * Méthode simple décrivant l'action de retirer une carte d'un paquet de cartes.
	 * Cette action est modélisée par le booléen carteTiree qui est alors redéfinit par true (1). 
	 */
	public void tirer()
	{
		this.carteTiree = true;

	}

	/**
	 * Méthode simple décrivant l'action de reposer une carte d'un paquet de cartes.
	 * Cette action est modélisée par le booléen carteTiree qui est alors redéfinit par false (0). 
	 */
	public void remettre()
	{
		this.carteTiree = false;

	}

}
