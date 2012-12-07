package interfaceJoueur;

import classesPrincipales.Carte;

/**
 * @author Rcluze
 *
 */
public class TypeJoueurIA implements TypeDeJoueur
{

	

	@Override
	public boolean estReel()
	{
		return false;
	}



	@Override
	public int attribueMise(int nbCarte, Carte[] main)
	{
		int mise =0;
		for(int i= 0;i< nbCarte-1;i++){
			if(main[i].getValeurs()==17||main[i].getValeurs()==18||main[i].getValeurs()==19||main[i].getValeurs()==20||main[i].getValeurs()==21)
				mise++;
		}
		return mise;
	}



	@Override
	public Carte attribueCartePosees(Carte[] cartes, int mise, int pliRemporte, int aQui)
	{
		return cartes[0]; // IA la plus simple retourne la premiers carte du tableau
	}



	@Override
	public String attribuerNom()
	{
		
		return "JoueurIA";
	}







}
