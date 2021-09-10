package Login;

import java.util.Scanner;

public class Login {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		String user = keyboard.nextLine();
		String pass = keyboard.nextLine();

		StringBuilder sB = new StringBuilder(user);
		String reversedUser = sB.reverse().toString();

		int counter = 0;

		while (true) {

			if (!pass.equals(reversedUser)) {
				counter++;

				if (counter == 4) {
					System.out.println("User " + user + " blocked!");
					return;
				}

				System.out.println("Incorrect password. Try again.");
			}

			else {
				System.out.println("User " + user + " logged in.");
				break;
			}

			pass = keyboard.nextLine();
		}
	}
}
