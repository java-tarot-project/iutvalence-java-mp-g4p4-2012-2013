// FIXME déplacer dans un autre paquetage
package fr.iutValence.java.projet.TarotAfricain;

import java.io.IOException;

public class Test
{

	public static void main(String[] args) throws Exception, IOException
	{
		Joueur moi = new JoueurReel();
		
		int i = moi.mise(5);
		System.out.println(i);
		
		
		
	
	}

}
