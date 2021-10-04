package passwordValidator;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		String password = keyboard.nextLine();

		if (checkIfIsBetween(password) && checkIfIsConsist(password) && checkIfIsHasTwoDigits(password)) {

			System.out.println("Password is valid");

		}
		if (!checkIfIsBetween(password)) {
			System.out.println("Password must be between 6 and 10 characters");

		}
		if (!checkIfIsConsist(password)) {
			System.out.println("Password must consist only of letters and digits");
		}
		if (!checkIfIsHasTwoDigits(password)) {
			System.out.println("Password must have at least 2 digits");
		}

		keyboard.close();
	}

	private static boolean checkIfIsBetween(String password) {

		return password.length() >= 6 && password.length() <= 10;

	}

	private static boolean checkIfIsConsist(String password) {

		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);
			boolean isLetter = Character.isLetter(ch);
			boolean isDigit = Character.isDigit(ch);

			if (!isDigit && !isLetter) {

				return false;

			}
		}
		return true;

	}

	private static boolean checkIfIsHasTwoDigits(String password) {

		int counter = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (Character.isDigit(ch)) {

				counter++;
			}
		}

		if (counter >= 2) {
			return true;
		}
		return false;
	}

}
