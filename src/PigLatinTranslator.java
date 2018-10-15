import java.util.*;

public class PigLatinTranslator {

	public static void main(String[] args) {

		String userWord;
		String playAgain = "";
		String ls;
		String rs;
		String fs = "";
		int j;
		char ch;

		do {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter a word: ");

			userWord = scanner.nextLine();

			for (int i = 0; i < userWord.length(); i++) { // Checking userWord for Vowels

				if ((userWord.charAt(0) == 'a')) {
					System.out.println(userWord += "way");
					break;
				}

				else if (userWord.charAt(0) == 'e') {
					System.out.println(userWord += "way");
					break;
				}

				else if (userWord.charAt(0) == 'i') {
					System.out.println(userWord += "way");
					break;
				}

				else if (userWord.charAt(0) == 'o') {
					System.out.println(userWord += "way");
					break;
				}

				else if (userWord.charAt(0) == 'u') { // Last check for Vowels
					System.out.println(userWord += "way");
					break;
				}

				else {

					int l = userWord.length();

					for (j = 0; j < l; j++) {

						ch = userWord.charAt(i);

						if (ch == 'B' || ch == 'C' || ch == 'D' || ch == 'F' || ch == 'G' || ch == 'H' || ch == 'J'
								|| ch == 'K' || ch == 'L' || ch == 'M' || ch == 'N' || ch == 'P' || ch == 'Q'
								|| ch == 'R' || ch == 'S' || ch == 'T' || ch == 'V' || ch == 'X' || ch == 'Y'
								|| ch == 'Z' || ch == 'W') {

							break;
						}

						ls = userWord.substring(0, i);
						rs = userWord.substring(i);
						fs = rs + ls + "ay";
						System.out.println(fs);

						break;

					}

					System.out.println("Play again? Y/N");
					playAgain = scanner.nextLine();

				}
			}

		} while (playAgain.equalsIgnoreCase("Y"));

	}
}
