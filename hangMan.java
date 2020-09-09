package packMan;

import java.util.Scanner;

public class hangMan {

	public static String word = hangExample.getWords()[(int) (Math.random() * hangExample.getWords().length)];
	public static String dash = new String(new char[word.length()]).replace("\0", "_");
	public static int count = 0; // public för att dem ska nå alla metoder

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("Välkommen till HängaGubben!");
		
		while (count < 6 && dash.contains("_")) {      // 6 försök på sig
			System.out.println("Gissa en bokstav i ordet");
			System.out.println(dash);
			String guess = reader.next();
			getGuess(guess);	
		
		}
		
		reader.close();

	}

	public static void getGuess(String guess) {
				
		String newdash = "";                          // för att gissa bokstäver
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newdash += guess.charAt(0);
			} else if (dash.charAt(i) != '_') {
				newdash += word.charAt(i);

			} else {
				newdash += "_";
			}
		}
		if (dash.equals(newdash)) {    // inte rätt bokstav går till metodern Image 
			count++;
			Image();
		} else {
			dash = newdash;

		}
		if (dash.equals(word)) {
			System.out.println("Du vann! ordet va:" + word);  // om gissningarna blir samma som ordet vinner man
		}
				
	}

	public static void Image() {

		if (count == 1) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("_|_");
			System.out.println("Fel! Du har 5 försök kvar!");
		}
		if (count == 2) {			
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println("_|_");
			System.out.println("fel! Du har 4 försök kvar!");
		}
		if (count == 3) {			
			System.out.println(" _______ ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println("_|_");
			System.out.println("fel du har 3 försök kvar!");
		}
		if (count == 4) {		
			System.out.println(" _______ ");
			System.out.println(" |     | ");
			System.out.println(" |       ");
			System.out.println(" |       ");
			System.out.println(" |       ");
			System.out.println("_|_      ");
			System.out.println("fel du har 2 försök kvar!");
		}
		if (count == 5) {			
			System.out.println(" _______ ");
			System.out.println(" |     | ");
			System.out.println(" |     O ");
			System.out.println(" |       ");
			System.out.println(" |       ");
			System.out.println("_|_      ");
			System.out.println("fel du har 1 försök kvar!");
		}
		if (count == 6) {			
			System.out.println(" _______  ");
			System.out.println(" |     |  ");
			System.out.println(" |     O  ");
			System.out.println(" |    /|\\ ");
			System.out.println(" |    / \\ ");
			System.out.println("_|_       ");
			System.out.println("Game Over!");
			System.out.println("Du förlorade: order va:" + word);   // 6 fel game over
		}
	}
}