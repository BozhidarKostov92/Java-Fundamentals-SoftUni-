package middleCharacters;

import java.util.Scanner;

public class MiddleCharacters {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		String input = keyboard.nextLine();

		printTheMiddleCharacter(input);

		keyboard.close();
	}

	private static void printTheMiddleCharacter(String input) {

		if (input.length() % 2 == 0) {
			System.out.println(input.substring(input.length() / 2 - 1, input.length() / 2 + 1));
		} else {

			System.out.println(input.substring(input.length() / 2, input.length() / 2 + 1));

		}
	}
}
