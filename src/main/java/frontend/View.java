package frontend;

import java.util.Scanner;

public class View {
	private String userInput;

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public void welcome() {
		System.out.println("[          Sellsite-Converter          ]");
		System.out.println("[      Bitte Dateipfad eingeben:       ]");
		Scanner scanner = new Scanner(System.in);
		String ui = scanner.nextLine();
		if (ui.contains(" ")) {
			System.out.println("Der Dateipfad enthält mindestens ein Leerzeichen. Bitte entfernen!");
			welcome();
		} else if (ui.contains("\\")) {
			System.out.println("Der Dateipfad enthält mindestens ein Backslash. Bitte durch \"/\" entfernen!");
			welcome();
		} else if (!ui.contains(".csv")) {
			System.out.println("Es sind nur CSV-Dateien erlaubt!");
			welcome();
		} else {
			setUserInput(ui);
		}
	}
}
