import java.util.Scanner;

public class L�sernord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "toyota"; // ett f�r programmerat l�sernord
		System.out.println("skriv in l�senord");
		System.out.print("Hint: Ditt l�senord �r ett bil m�rke:");

		Scanner reader = new Scanner(System.in);
		String carName = reader.nextLine();

		if (password.equals(carName)) {      // om anv�ndaren skriver in de f�r sparade variablen g�r programmet till if
			System.out.println("R�tt L�senord");
		} else {
			System.out.print("Fel L�senord"); // om anv�ndaren skriver in n�got utifr�n variablen g�r den till else
		}

	}

}
