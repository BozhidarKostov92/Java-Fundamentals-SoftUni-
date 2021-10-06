package SpiceMustFlow;

import java.util.Scanner;

public class SpiceMustFlow {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int startingYield = keyboard.nextInt();
		int days = 0;
		int crewConsumes = 26;
		int dayAmount = 0, totalAmount = 0;

		if (startingYield < 100) {

			System.out.println(days);
			System.out.println(totalAmount);

		}

		else {

			while (startingYield >= 100) {

				days++;
				dayAmount = startingYield - crewConsumes;
				totalAmount += dayAmount;
				startingYield -= 10;

			}
			totalAmount -= crewConsumes;

			System.out.println(days);
			System.out.println(totalAmount);

		}

		keyboard.close();
	}
}
