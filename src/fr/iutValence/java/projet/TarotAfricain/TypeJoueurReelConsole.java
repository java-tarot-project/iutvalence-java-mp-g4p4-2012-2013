package fr.iutValence.java.projet.TarotAfricain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe complétant TypeDeJoueur
 * @author theodorc
 *
 */
public class TypeJoueurReelConsole implements TypeDeJoueur
{

	/**
	 * lireClavier est une méthode permettant de créer une chaîne de caractères à partir d'une lecture System.in.
	 * @return renvoie une chaîne de caractères.
	 */
	public static String lireClavier(){
		String ligne = null;
		try{
			InputStreamReader lecteur=new InputStreamReader(System.in);
			BufferedReader entree=new BufferedReader(lecteur);
		ligne = entree.readLine();
		}
		catch(IOException err){
			
		}
	
		return ligne;
		} 
	
	@Override
	public boolean estReel()
	{
		return true;
	}


	@Override
	public int attribueMise(int nbCarte, Carte[] main)
	{
		int mise=0; 
		try{
			String ligne_lue=lireClavier();
			mise = Integer.parseInt(ligne_lue);
		}
		catch(NumberFormatException err){
			System.out.println("il faut un entier");
			mise = attribueMise(nbCarte,main);
		
		}
		if (mise > nbCarte) {
			System.out.println("la mise est pas bonne");
		}
		return mise;
	}

	@Override
	public Carte attribueCartePosees(Carte[] cartes, int mise, int pliRemporte, int aQui)
	{
		int valeurCarte =0;
		try
		{
			String ligne_lue=lireClavier();
			valeurCarte = Integer.parseInt(ligne_lue);
		}
		catch(NumberFormatException err){
			System.out.println("Un entier est nécessaire.");
			attribueCartePosees(cartes,mise,pliRemporte,aQui);
		}
		Carte carteSelectionnee = new Carte(valeurCarte);
		
		int i = 0;
		while(i < cartes.length){
			if(carteSelectionnee.equals(cartes[i]))
				break;
			i++;
		}
		if (i >= cartes.length){
			System.out.println("veuillez selectionnez une carte existante.");
			attribueCartePosees(cartes,mise,pliRemporte,aQui);
		}
			
		return carteSelectionnee;
		
	}



}
