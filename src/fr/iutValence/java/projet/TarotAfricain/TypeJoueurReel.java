package fr.iutValence.java.projet.TarotAfricain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author theodorc
 *
 */
public class TypeJoueurReel extends TypeDeJoueur
{

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
	public int attribueMise(int nbCarte)
	{
		int mise=0; 
		try{
			String ligne_lue=lireClavier();
			mise = Integer.parseInt(ligne_lue);
		}
		catch(NumberFormatException err){
			System.out.println("il faut un entier");
			mise = attribueMise(nbCarte);
		
		}
		if (mise > nbCarte) {
			System.out.println("la mise est pas bonne");
		}
		return mise;
	} 
	
	

	@Override
	public boolean getEstReel()
	{
		return true;
	}

	
	
	

	public Carte attribueCartePoser(Carte[] cartes)
	{
		return null;
		
		
	}



}
