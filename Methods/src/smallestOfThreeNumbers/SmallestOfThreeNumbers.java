package SmallestOfThreeNumbers;

import java.util.Scanner;

public class SmallestOfThreeNumbers {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int number1 = keyboard.nextInt();
		int number2 = keyboard.nextInt();
		int number3 = keyboard.nextInt();

		int smallest = getTheSmallestNumber(number1, number2, number3);
		System.out.print(smallest);

		keyboard.close();

	}

	private static int getTheSmallestNumber(int number1, int number2, int number3) {

		if (number1 < number2 && number1 < number3) {
			return number1;
		}
		if (number2 < number1 && number2 < number3) {
			return number2;
		}
		else {
			return number3;
		}
	}
}
