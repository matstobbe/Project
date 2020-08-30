import java.util.Scanner;

public class Lösernord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "toyota"; // ett för programmerat lösernord
		System.out.println("skriv in lösenord");
		System.out.print("Hint: Ditt lösenord är ett bil märke:");

		Scanner reader = new Scanner(System.in);
		String carName = reader.nextLine();

		if (password.equals(carName)) {      // om användaren skriver in de för sparade variablen går programmet till if
			System.out.println("Rätt Lösenord");
		} else {
			System.out.print("Fel Lösenord"); // om användaren skriver in något utifrån variablen går den till else
		}

	}

}
