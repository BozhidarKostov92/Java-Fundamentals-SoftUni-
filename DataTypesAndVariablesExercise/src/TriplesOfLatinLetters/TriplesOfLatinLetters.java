package TriplesOfLatinLetters;

import java.util.Scanner;

public class TriplesOfLatinLetters {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int number = keyboard.nextInt();

		for (int firstLetter = 0; firstLetter < number; firstLetter++) {

			char firstChar = (char) ('a' + firstLetter);

			for (int secondLetter = 0; secondLetter < number; secondLetter++) {

				char secondChar = (char) ('a' + secondLetter);

				for (int thirdLetter = 0; thirdLetter < number; thirdLetter++) {

					char thirdChar = (char) ('a' + thirdLetter);

					System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);

				}
			}
		}

		keyboard.close();
	}
}
