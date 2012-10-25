// FIXME déplacer dans un autre paquetage
package fr.iutValence.java.projet.TarotAfricain;

import java.io.IOException;

public class Test
{

	public static void main(String[] args) throws Exception, IOException
	{
		Carte lala = new Carte(5);
		JeuDeCartes lili = new JeuDeCartes();
		Carte lolo = lili.tirerUneCarte();
		JoueurReel moi = new JoueurReel();

		System.out.println(lolo.toString());
		System.out.println(lili.toString());
		System.out.println(lala.toString());
		int i = moi.mise(4);
		System.out.println(i);
		
	}

}
