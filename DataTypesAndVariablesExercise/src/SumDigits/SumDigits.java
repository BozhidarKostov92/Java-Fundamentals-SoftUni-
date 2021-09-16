package SumDigits;

import java.util.Scanner;

public class SumDigits {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int number, takeDigit, sum;
		takeDigit = 0;
		sum = 0;
		number = keyboard.nextInt();

		while (number > 0) {
			takeDigit = (number % 10);
			number = number / 10;
			sum += takeDigit;
		}

		System.out.println(sum);

		keyboard.close();
	}
}
