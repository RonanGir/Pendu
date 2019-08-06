package fr.jeux.java.training.ihm;

import java.util.Scanner;

import fr.jeux.java.training.bll.Pendu;
import fr.jeux.java.training.bll.PenduSingle;

public class Demo {
	
	public static void main(String[] args) {
		Pendu partie = PenduSingle.getInstance();
		char letter;
		Boolean win = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle mot vas-tu faire découvrir ?");
		System.out.print("=> "); 
		String wordToFind = sc.next();
		partie.initGame(wordToFind);
		String word = partie.displayWord();
		
		
		
		while (win == false) {
			System.out.println("Mot à trouver : " + partie.displayWord());
			System.out.println("lettres utilisées : " + partie.usedLetters());
			System.out.println("Proposez une lettre");
			System.out.print("=> ");
			String essai = sc.next();
			letter = essai.charAt(0);
			partie.tryLetter(letter);
			win = partie.gagne();
			if ((win == true) || (partie.remainingOpportunities() == 0)) break;
			
		}
		System.out.println("Mot trouvé : " + partie.displayWord());
		if (win == true) {
			System.out.println("c'est gagné");
			
		} else  {
			System.out.println("Pendu !!!");
		}
		
		
		sc.close();
	}
}