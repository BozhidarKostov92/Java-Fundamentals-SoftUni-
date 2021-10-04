package charactersInRange;

import java.util.Scanner;

public class CharactersInRange {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		char first = keyboard.nextLine().charAt(0);
		char second = keyboard.nextLine().charAt(0);

		printCharactersInRange(first, second);

		keyboard.close();
	}

	private static void printCharactersInRange(char first, char second) {

		if (first < second) {

			for (char i = (char) (first + 1); i < second; i++) {

				System.out.print(i + " ");
			}
		} else {

			for (char i = (char) (second + 1); i < first; i++) {

				System.out.print(i + " ");
			}
		}
	}
}
