// FIXME déplacer dans un autre paquetage
package fr.iutValence.java.projet.TarotAfricain;

// FIXME respecter les conventions d'écriture (fixed)
public class Test
{

	public static void main(String[] args)
	{
		Carte lala = new Carte(5);
		JeuDeCartes lili = new JeuDeCartes();
		Carte lolo = lili.tirerUneCarte();

		/*
		 * Carte lulu[] = new Carte[5]; lulu = lili.distribuerNCartes(2);
		 */
		System.out.println(lolo.toString());
		System.out.println(lili.toString());
		System.out.println(lala.toString());
		/*
		 * for(int i = 1; i<=5; i++) { System.out.print(lulu[i].toString()); }
		 */
	}

}
