package StrongNumber;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int num, number, lastdigit, sumOfFact = 0;
		number = keyboard.nextInt();
		num = number;

		while (number > 0) {

			lastdigit = number % 10;
			int fact = 1;

			for (int i = 1; i <= lastdigit; i++) {

				fact = fact * i;
			}
			sumOfFact = sumOfFact + fact;
			number = number / 10;
		}

		if (num == sumOfFact) {
			System.out.println("yes");
		}

		else {
			System.out.println("no");
		}

		keyboard.close();
	}
}
