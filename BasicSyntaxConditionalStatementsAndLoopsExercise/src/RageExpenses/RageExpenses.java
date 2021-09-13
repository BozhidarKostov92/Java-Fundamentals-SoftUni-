package RageExpenses;

import java.util.Scanner;

public class RageExpenses {

	public static void main(String argsp[]) {

		Scanner keyboard = new Scanner(System.in);

		double lostGamesCount, headsetPrice, mousePrice, keyboardPrice, displayPrice, rageExpenses;
		int headsetTrashes, mouseTrashes, keyboardTrashes, displayTrashes;

		lostGamesCount = keyboard.nextDouble();
		headsetPrice = keyboard.nextDouble();
		mousePrice = keyboard.nextDouble();
		keyboardPrice = keyboard.nextDouble();
		displayPrice = keyboard.nextDouble();

		headsetTrashes = 0;
		mouseTrashes = 0;
		keyboardTrashes = 0;
		displayTrashes = 0;

		for (int i = 1; i <= lostGamesCount; i++) {

			if (i % 2 == 0) {

				headsetTrashes++;
			}

			if (i % 3 == 0) {

				mouseTrashes++;

			}

			if (i % 6 == 0) {

				keyboardTrashes++;

				if (keyboardTrashes % 2 == 0) {

					displayTrashes++;
				}
			}
		}

		rageExpenses = (headsetPrice * headsetTrashes) + (mousePrice * mouseTrashes) + (keyboardPrice * keyboardTrashes)
				+ (displayPrice * displayTrashes);

		System.out.printf("Rage expenses: %.2f lv.", rageExpenses);

		keyboard.close();

	}

}
